package org.muml.storydiagram.interpreter.core.debug.protocol.indications;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.interpreter.core.debug.EDebuggerState;
import org.muml.storydiagram.interpreter.core.debug.SDDebugger;
import org.muml.storydiagram.interpreter.core.debug.StackFrame;
import org.muml.storydiagram.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.ObjectDeserializer;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.SerializedObject;

public class SetVariableCommandIndication<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandIndicationWithResponse<StoryDiagramElement>
{

	private Exception	exception;

	public SetVariableCommandIndication(SignalProtocol<?> protocol, SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.SET_VARIABLE, debuggingInterpreter);
	}

	@Override
	protected void indicating(ExtendedDataInputStream in) throws Exception
	{
		try
		{
			assert this.getDebugger().getDebuggerState() != EDebuggerState.RUNNING;

			/*
			 * receive stack frame index
			 */
			int stackFrameIndex = in.readInt();

			assert this.getDebugger().getExecutionStack().size() > stackFrameIndex;

			/*
			 * Get the stack frame
			 */
			StackFrame<StoryDiagramElement> stackFrame = this.getDebugger().getExecutionStack().get(stackFrameIndex);

			/*
			 * receive variable name
			 */
			String variableName = in.readString();

			/*
			 * Get variable
			 */
			Variable<EClassifier> variable = stackFrame.getVariablesScope().getVariable(variableName);

			/*
			 * Read the new value
			 */
			SerializedObject serializedObject = (SerializedObject) in.readObject(this.getClass().getClassLoader());

			Object value = null;

			if (serializedObject != null)
			{
				assert !this.getDebugger().getSynchronizerAdapter().getRemoteAdapterAddresses().isEmpty();

				ObjectDeserializer deserializer = new ObjectDeserializer(this.getDebugger().getSynchronizerAdapter(), this.getDebugger()
						.getSynchronizerAdapter().getRemoteAdapterAddresses().keySet().iterator().next());

				value = deserializer.deserializeObject(serializedObject);
			}

			stackFrame.getVariablesScope().changeVariableValue(variable.getName(), value);
		}
		catch (Exception ex)
		{
			this.exception = ex;
		}
	}

	@Override
	protected void responding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(this.exception);
	}

}
