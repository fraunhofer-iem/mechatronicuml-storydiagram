package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityEdge>
 * @param <Classifier>
 */
public class TraversingActivityEdgeNotification<ActivityEdge, Classifier> extends InterpreterNotification<Classifier>
{
	private final ActivityEdge	activityEdge;

	public TraversingActivityEdgeNotification(VariablesScope<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ActivityEdge, ?, ?, ?, Classifier, ?, ?> notifier, ActivityEdge activityEdge)
	{
		super(NotificationTypeEnum.TRAVERSING_ACTIVITY_EDGE, variablesScope, notifier);

		assert activityEdge != null;

		this.activityEdge = activityEdge;
	}

	public ActivityEdge getActivityEdge()
	{
		return this.activityEdge;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getActivityEdge();
	}
}
