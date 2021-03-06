package org.muml.storydiagram.interpreter.core.debug.breakpoints;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.interpreter.core.debug.SDDebugger;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

public class StepOverBreakpoint<StoryDiagramElement extends EObject> extends StepBreakpoint<StoryDiagramElement>
{
	private final int	targetStackSize;

	/**
	 * 
	 * @param debuggingInterpreter
	 * @param stackSize
	 *            The breakpoint will be triggered when the debugger stack has
	 *            this size.
	 * @throws Exception
	 */
	public StepOverBreakpoint(SDDebugger<StoryDiagramElement, ?, ?, ?, ?> debuggingInterpreter)
	{
		super(debuggingInterpreter);

		this.targetStackSize = debuggingInterpreter.getExecutionStack().size();
	}

	@Override
	public boolean evaluate(StoryDiagramElement currentlyExecutedElement, VariablesScope<?, ?, ?, ?, ?, ?, EClassifier, ?, ?> variablesScope)
	{
		if (this.getDebugger().getExecutionStack().size() == this.targetStackSize)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
