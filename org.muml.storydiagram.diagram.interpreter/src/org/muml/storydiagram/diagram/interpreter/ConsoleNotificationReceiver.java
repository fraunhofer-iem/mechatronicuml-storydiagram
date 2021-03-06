package org.muml.storydiagram.diagram.interpreter;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.diagram.interpreter.util.InterpreterConsole;
import org.muml.storydiagram.diagram.interpreter.util.Texts;
import org.muml.storydiagram.diagram.interpreter.util.InterpreterConsole.StreamType;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityExecutionFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityExecutionStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityNodeExecutionFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.ActivityNodeExecutionStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.AttributeValueSetNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.EvaluatedExpressionNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.EvaluatingExpressionNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceLinkCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceLinkDestroyedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceObjectCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InstanceObjectDestroyedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InterpreterNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.LinkCheckFailedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.LinkCheckSuccessfulNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternApplicationFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternApplicationStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternConstraintHoldsNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternConstraintViolatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternInitializationFinishedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternInitializationStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingFailedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingStartedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternMatchingSuccessfulNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectBindingRevokedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectBoundNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectConstraintHoldsNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectConstraintViolatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.StoryPatternObjectNotBoundNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.TraversingActivityEdgeNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.TraversingLinkNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableCreatedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableDeletedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.VariableValueChangedNotification;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenNotificationReceiver;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * This notification receiver appends received notifications to the provided StyledText.
 */
public class ConsoleNotificationReceiver implements StoryDrivenNotificationReceiver {

	private InterpreterConsole console;

	private int indent;

	public ConsoleNotificationReceiver(InterpreterConsole text) {
		console = text;
		indent = 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(InterpreterNotification<EClassifier> notification) {
		switch (notification.getNotificationType()) {
		case ACTIVITY_EXECUTION_STARTED:
			startActivity((ActivityExecutionStartedNotification<Activity, EClassifier>) notification);
			indent++;
			break;
		case ACTIVITY_EXECUTION_FINISHED:
			indent--;
			finishActivity((ActivityExecutionFinishedNotification<Activity, EClassifier>) notification);
			break;

		case ACTIVITY_NODE_EXECUTION_STARTED:
			startActivityNode((ActivityNodeExecutionStartedNotification<ActivityNode, EClassifier>) notification);
			indent++;
			break;
		case ACTIVITY_NODE_EXECUTION_FINISHED:
			indent--;
			finishActivityNode((ActivityNodeExecutionFinishedNotification<ActivityNode, EClassifier>) notification);
			break;

		case TRAVERSING_ACTIVITY_EDGE:
			traverseActivityEdge((TraversingActivityEdgeNotification<ActivityEdge, EClassifier>) notification);
			break;

		case STORY_PATTERN_INITIALIZATION_STARTED:
			storyPatternInitializationStarted((StoryPatternInitializationStartedNotification<StoryPattern, EClassifier>) notification);
			indent++;
			break;
		case STORY_PATTERN_INITIALIZATION_FINISHED:
			indent--;
			storyPatternInitializationFinished((StoryPatternInitializationFinishedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_MATCHING_STARTED:
			storyPatternMatchingStarted((StoryPatternMatchingStartedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_MATCHING_SUCCESSFUL:
			storyPatternMatchingSuccessful((StoryPatternMatchingSuccessfulNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_MATCHING_FAILED:
			storyPatternMatchingFailed((StoryPatternMatchingFailedNotification<StoryPattern, EClassifier>) notification);
			break;
		case STORY_PATTERN_APPLICATION_STARTED:
			storyPatternApplicationStarted((StoryPatternApplicationStartedNotification<StoryPattern, EClassifier>) notification);
			indent++;
			break;
		case STORY_PATTERN_APPLICATION_FINISHED:
			indent--;
			storyPatternApplicationFinished((StoryPatternApplicationFinishedNotification<StoryPattern, EClassifier>) notification);
			break;

		case ATTRIBUTE_VALUE_SET:
			attributeValueSet((AttributeValueSetNotification<AbstractVariable, EClassifier, EStructuralFeature>) notification);
			break;

		case INSTANCE_OBJECT_CREATED:
			createdInstance((InstanceObjectCreatedNotification<AbstractVariable, EClassifier>) notification);
			break;
		case INSTANCE_OBJECT_DESTROYED:
			destroyedInstance((InstanceObjectDestroyedNotification<AbstractVariable, EClassifier>) notification);
			break;

		case INSTANCE_LINK_CREATED:
			createdInstance((InstanceLinkCreatedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case INSTANCE_LINK_DESTROYED:
			destroyedInstance((InstanceLinkDestroyedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;

		case LINK_CHECK_SUCCESSFUL:
			linkChecked((LinkCheckSuccessfulNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;
		case LINK_CHECK_FAILED:
			linkFailed((LinkCheckFailedNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;

		case STORY_PATTERN_OBJECT_BINDING_REVOKED:
			boundRevoked((StoryPatternObjectBindingRevokedNotification<AbstractVariable, EClassifier>) notification);
			break;
		case STORY_PATTERN_OBJECT_BOUND:
			bound((StoryPatternObjectBoundNotification<AbstractVariable, EClassifier>) notification);
			break;
		case STORY_PATTERN_OBJECT_NOT_BOUND:
			boundNot((StoryPatternObjectNotBoundNotification<AbstractVariable, EClassifier>) notification);
			break;

		case TRAVERSING_LINK:
			traverseLink((TraversingLinkNotification<AbstractVariable, AbstractLinkVariable, EClassifier>) notification);
			break;

		case VARIABLE_CREATED:
			variableCreated((VariableCreatedNotification<EClassifier>) notification);
			break;
		case VARIABLE_VALUE_CHANGED:
			variableChanged((VariableValueChangedNotification<EClassifier>) notification);
			break;
		case VARIABLE_DELETED:
			variableDeleted((VariableDeletedNotification<EClassifier>) notification);
			break;

		case EVALUATING_EXPRESSION:
			startExpression((EvaluatingExpressionNotification<EClassifier, Expression>) notification);
			indent++;
			break;
		case EVALUATED_EXPRESSION:
			indent--;
			finishExpression((EvaluatedExpressionNotification<EClassifier, Expression>) notification);
			break;

		case STORY_PATTERN_CONSTRAINT_HOLDS:
			constraintHolds((StoryPatternConstraintHoldsNotification<StoryPattern, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_CONSTRAINT_VIOLATED:
			constraintViolated((StoryPatternConstraintViolatedNotification<StoryPattern, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS:
			constraintHolds((StoryPatternObjectConstraintHoldsNotification<AbstractVariable, EClassifier, Expression>) notification);
			break;
		case STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED:
			constraintViolated((StoryPatternObjectConstraintViolatedNotification<AbstractVariable, EClassifier, Expression>) notification);
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	private void startActivity(ActivityExecutionStartedNotification<Activity, EClassifier> notification) {
		debug("Starting execution of %1s...", notification.getActivity());
	}

	private void startActivityNode(ActivityNodeExecutionStartedNotification<ActivityNode, EClassifier> notification) {
		wrap();
		debug("Starting execution of %1s...", notification.getActivityNode());
	}

	private void storyPatternInitializationStarted(
			StoryPatternInitializationStartedNotification<StoryPattern, EClassifier> notification) {
		debug("Starting initialization of %1s...", notification.getStoryPattern());
	}

	private void storyPatternMatchingStarted(
			StoryPatternMatchingStartedNotification<StoryPattern, EClassifier> notification) {
		wrap();
		debug("Starting matching of %1s...", notification.getStoryPattern());
	}

	private void storyPatternApplicationStarted(
			StoryPatternApplicationStartedNotification<StoryPattern, EClassifier> notification) {
		wrap();
		debug("Starting application of %1s...", notification.getStoryPattern());
	}

	private void variableChanged(VariableValueChangedNotification<EClassifier> notification) {
		debug("Variable value changed: %1s: %2s -> %3s", notification.getVariable().getName(),
				notification.getOldValue(), notification.getVariable().getValue());
	}

	private void startExpression(EvaluatingExpressionNotification<EClassifier, Expression> notification) {
		debug("Starting evaluation of expression '%1s'...", notification.getExpression());
	}

	private void finishActivity(ActivityExecutionFinishedNotification<Activity, EClassifier> notification) {
		info("Finished execution of %1s.", notification.getActivity());
	};

	private void finishActivityNode(ActivityNodeExecutionFinishedNotification<ActivityNode, EClassifier> notification) {
		info("Finished execution of %1s.", notification.getActivityNode());
	}

	private void traverseActivityEdge(TraversingActivityEdgeNotification<ActivityEdge, EClassifier> notification) {
		ActivityEdge edge = notification.getActivityEdge();
		wrap();
		info("Traversing %1s...", edge);
	}

	private void storyPatternInitializationFinished(
			StoryPatternInitializationFinishedNotification<StoryPattern, EClassifier> notification) {
		info("Finished initialization of %1s.", notification.getStoryPattern());
	}

	private void storyPatternMatchingSuccessful(
			StoryPatternMatchingSuccessfulNotification<StoryPattern, EClassifier> notification) {
		info("Finished matching of %1s successfully.", notification.getStoryPattern());
	};

	private void storyPatternApplicationFinished(
			StoryPatternApplicationFinishedNotification<StoryPattern, EClassifier> notification) {
		info("Finished application of %1s.", notification.getStoryPattern());

	};

	private void linkChecked(
			LinkCheckSuccessfulNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		info("Link check successful: '%1s' from '%2s' to '%3s' (source: '%4s', target: '%5s').",
				notification.getLink(), notification.getSourceStoryPatternObject(),
				notification.getTargetStoryPatternObject(), notification.getSourceObject(),
				notification.getTargetObject());
	}

	private void boundNot(StoryPatternObjectNotBoundNotification<AbstractVariable, EClassifier> notification) {
		info("Could not bind %1s.", notification.getStoryPatternObject());
	}

	private void traverseLink(
			TraversingLinkNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		wrap();
		info("Traversing link %1s...", notification.getLink());
		wrap();
	}

	private void finishExpression(EvaluatedExpressionNotification<EClassifier, Expression> notification) {
		info("Finished evaluation of expression '%1s' := %2s.", notification.getExpression(), notification.getResult());
	}

	private void constraintHolds(
			StoryPatternConstraintHoldsNotification<StoryPattern, EClassifier, Expression> notification) {
		info("Constraint '%1s' holds on %2s.", notification.getConstraint(), notification.getStoryPattern());
	}

	private void wrap() {
		console.wrap();
	}

	private void storyPatternMatchingFailed(
			StoryPatternMatchingFailedNotification<StoryPattern, EClassifier> notification) {
		fail("Matching of %1s failed.", notification.getStoryPattern());
	}

	private void destroyedInstance(InstanceObjectDestroyedNotification<AbstractVariable, EClassifier> notification) {
		fail("Destroyed instance of %1s := %2s.", notification.getStoryPatternObject(),
				notification.getInstanceObject());
	}

	private void destroyedInstance(
			InstanceLinkDestroyedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		fail("Destroyed instance link %1s (%2s to %3s).", notification.getLink(), notification.getSourceObject(),
				notification.getTargetObject());
	}

	private void linkFailed(
			LinkCheckFailedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		fail("Link check failed: '%1s' from '%2s' to '%3s' (source: '%4s', target: '%5s').", notification.getLink(),
				notification.getSourceStoryPatternObject(), notification.getTargetStoryPatternObject(),
				notification.getSourceObject(), notification.getTargetObject());
	}

	private void boundRevoked(StoryPatternObjectBindingRevokedNotification<AbstractVariable, EClassifier> notification) {
		fail("Binding revoked for %1s. Was bound to '%2s'.", notification.getStoryPatternObject(),
				notification.getInstanceObject());
	}

	private void variableDeleted(VariableDeletedNotification<EClassifier> notification) {
		fail("Deleted variable '%1s'.", notification.getVariable().getName());
	}

	private void constraintViolated(
			StoryPatternConstraintViolatedNotification<StoryPattern, EClassifier, Expression> notification) {
		fail("Constraint '%1s' is violated on %2s.", notification.getConstraint(), notification.getStoryPattern());
	}

	private void constraintViolated(
			StoryPatternObjectConstraintViolatedNotification<AbstractVariable, EClassifier, Expression> notification) {
		fail("Constraint '%1s' is violated on %2s.", notification.getConstraint(), notification.getStoryPatternObject());
	}

	private void attributeValueSet(
			AttributeValueSetNotification<AbstractVariable, EClassifier, EStructuralFeature> notification) {
		success("Set attribute %1s.%2s := %3s", notification.getStoryPatternObject().getName(), notification
				.getFeature().getName(), notification.getFeatureValue());
	}

	private void createdInstance(InstanceObjectCreatedNotification<AbstractVariable, EClassifier> notification) {
		success("Created instance for %1s := %2s.", notification.getStoryPatternObject(),
				notification.getInstanceObject());
	}

	private void createdInstance(
			InstanceLinkCreatedNotification<AbstractVariable, AbstractLinkVariable, EClassifier> notification) {
		success("Created instance link %1s (%2s to %3s).", notification.getLink(), notification.getSourceObject(),
				notification.getTargetObject());
	}

	private void bound(StoryPatternObjectBoundNotification<AbstractVariable, EClassifier> notification) {
		success("Bound %1s to %2s.", notification.getStoryPatternObject(), notification.getInstanceObject());
	}

	private void variableCreated(VariableCreatedNotification<EClassifier> notification) {
		Variable<EClassifier> variable = notification.getVariable();
		success("Created variable '%1s' := %2s.", variable.getName(), variable.getValue());
	}

	private void constraintHolds(
			StoryPatternObjectConstraintHoldsNotification<AbstractVariable, EClassifier, Expression> notification) {
		success("Constraint '%1s' holds on %2s.", notification.getConstraint(), notification.getStoryPatternObject());
	}

	private void debug(String format, Object... args) {
		append(StreamType.DEBUG, format, args);
	}

	private void fail(String format, Object... args) {
		append(StreamType.FAILURE, format, args);
	}

	private void info(String format, Object... args) {
		append(StreamType.INFO, format, args);
	}

	private void success(String format, Object... args) {
		append(StreamType.SUCCESS, format, args);
	}

	private void append(StreamType type, String format, Object[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < indent; i++) {
			builder.append("  "); //$NON-NLS-1$
		}
		builder.append(format);

		if (args == null) {
			console.append(type, builder.toString());
		} else {
			Object[] translated = new Object[args.length];
			for (int i = 0; i < translated.length; i++) {
				translated[i] = Texts.get(args[i]);
			}
			console.append(type, String.format(builder.toString(), translated));
		}
	}
}
