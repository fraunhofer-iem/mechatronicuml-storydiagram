package org.muml.storydiagram.diagram.custom.util;

import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;

public class ValidationUtil {

	public static boolean isValid(ActivityEdge edge, EdgeGuard guard) {
		ActivityNode source = edge.getSource();

		// only allow [none] for start node
		if (source instanceof InitialNode) {
			return EdgeGuard.NONE.equals(guard);
		}

		// allow [each_time] and [end] only on adequate story nodes
		if (EdgeGuard.EACH_TIME.equals(guard) || EdgeGuard.END.equals(guard)) {
			return source instanceof StoryNode && ((StoryNode) source).isForEach();
		}

		// allow [success] and [failure] only on adequate story nodes
		if (EdgeGuard.SUCCESS.equals(guard) || EdgeGuard.FAILURE.equals(guard)) {
			return source instanceof StoryNode && !((StoryNode) source).isForEach();
		}

		return true;
	}

	public static boolean isValid(BindingState state, BindingSemantics semantics, BindingOperator operator) {
		switch (state) {
		case UNBOUND:
			switch (semantics) {
			case NEGATIVE:
				switch (operator) {
				case CREATE:
				case DESTROY:
					return false;
				case CHECK_ONLY:
				default:
					return true;
				}
			case MANDATORY:
			case OPTIONAL:
			default:
				return true;
			}
		case BOUND:
			switch (semantics) {
			case MANDATORY:
				switch (operator) {
				case CREATE:
					return false;
				case CHECK_ONLY:
				case DESTROY:
				default:
					return true;
				}
			case NEGATIVE:
			case OPTIONAL:
				return false;
			default:
				return true;
			}
		case MAYBE_BOUND:
			switch (semantics) {
			case MANDATORY:
				switch (operator) {
				case CREATE:
					return false;
				case CHECK_ONLY:
				case DESTROY:
				default:
					return true;
				}
			case NEGATIVE:
			case OPTIONAL:
				return false;
			default:
				return true;
			}
		default:
			return true;
		}
	}

	public static boolean isValidLink(BindingSemantics semantics, BindingOperator operator) {
		switch (semantics) {
		case NEGATIVE:
			switch (operator) {
			case CREATE:
			case DESTROY:
				return false;
			case CHECK_ONLY:
			default:
				return true;
			}
		case MANDATORY:
		case OPTIONAL:
		default:
			return true;
		}
	}
}
