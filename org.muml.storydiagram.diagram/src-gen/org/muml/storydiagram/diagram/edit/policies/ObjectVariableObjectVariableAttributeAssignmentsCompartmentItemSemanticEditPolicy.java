package org.muml.storydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.storydiagram.diagram.edit.commands.AttributeAssignmentCreateCommand;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class ObjectVariableObjectVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy
		extends StorydiagramsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectVariableObjectVariableAttributeAssignmentsCompartmentItemSemanticEditPolicy() {
		super(StorydiagramsElementTypes.ObjectVariable_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StorydiagramsElementTypes.AttributeAssignment_3003 == req.getElementType()) {
			return getGEFWrapper(new AttributeAssignmentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
