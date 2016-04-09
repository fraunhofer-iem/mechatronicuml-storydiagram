package org.muml.storydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.diagram.edit.commands.MatchingPatternCreateCommand;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class MatchingStoryNodeStoryNodePatternCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchingStoryNodeStoryNodePatternCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.MatchingStoryNode_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.MatchingPattern_3007 == req.getElementType()) {
			return getGEFWrapper(new MatchingPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
