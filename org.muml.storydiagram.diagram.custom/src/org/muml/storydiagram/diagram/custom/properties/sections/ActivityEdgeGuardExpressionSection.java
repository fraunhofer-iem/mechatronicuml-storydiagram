package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.ui.properties.AbstractExtendedExpressionSection;

public class ActivityEdgeGuardExpressionSection extends AbstractExtendedExpressionSection {
	@Override
	protected Expression getExpression() {
		return getElement().getGuardExpression();
	}

	@Override
	protected ActivityEdge getElement() {
		return (ActivityEdge) super.getElement();
	}

	@Override
	protected EClassifier getContextClassifier() {
		return EcorePackage.Literals.EBOOLEAN;
	}

	@Override
	protected void setExpression(Expression expression) {
		getElement().setGuardExpression(expression);
	}
}
