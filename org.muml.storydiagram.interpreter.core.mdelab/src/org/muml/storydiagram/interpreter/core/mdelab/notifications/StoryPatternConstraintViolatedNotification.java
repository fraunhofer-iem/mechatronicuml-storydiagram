package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

public class StoryPatternConstraintViolatedNotification<StoryPattern, Classifier, Expression> extends InterpreterNotification<Classifier>
{
	private final Expression	constraint;
	private final StoryPattern	storyPattern;

	public StoryPatternConstraintViolatedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, Expression constraint, StoryPattern storyPattern)
	{
		super(NotificationTypeEnum.STORY_PATTERN_CONSTRAINT_VIOLATED, variablesScope, notifier);

		this.constraint = constraint;
		this.storyPattern = storyPattern;
	}

	public Expression getConstraint()
	{
		return this.constraint;
	}

	public StoryPattern getStoryPattern()
	{
		return this.storyPattern;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.constraint;
	}
}
