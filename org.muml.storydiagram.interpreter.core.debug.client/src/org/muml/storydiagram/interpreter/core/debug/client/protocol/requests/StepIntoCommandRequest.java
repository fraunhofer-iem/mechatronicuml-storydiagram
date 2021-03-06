package org.muml.storydiagram.interpreter.core.debug.client.protocol.requests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.interpreter.core.debug.client.SDDebugClient;
import org.muml.storydiagram.interpreter.core.debug.protocol.SDDebugProtocolCommandMessagesEnum;

public class StepIntoCommandRequest<StoryDiagramElement extends EObject> extends
		SDDebugProtocolCommandRequestWithConfirmation<StoryDiagramElement, Exception>
{

	public StepIntoCommandRequest(SignalProtocol<?> protocol, SDDebugClient<StoryDiagramElement, ?> debugClient)
	{
		super(protocol, SDDebugProtocolCommandMessagesEnum.STEP_INTO, debugClient);
	}

	@Override
	protected void requesting(ExtendedDataOutputStream out) throws Exception
	{
		// Do nothing
	}

	@Override
	protected Exception confirming(ExtendedDataInputStream in) throws Exception
	{
		return (Exception) in.readObject(this.getClass().getClassLoader());
	}

}
