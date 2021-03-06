package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.TextualExpression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.diagram.custom.properties.AbstractExpressionSection;
import org.muml.storydiagram.diagram.custom.util.ActivityUtil;

public class ActivityFinalNodeExpressionSection extends AbstractExpressionSection {

	@Override
	protected Expression getExpression() {
		if (getElement().getReturnValue() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().getReturnValues().add(expression);
				}
			};
			execute(command);
		}
		return getElement().getReturnValue();
	}

	@Override
	protected EClassifier getContextClassifier() {
		Activity activity = ActivityUtil.getActivity(getElement());

		if (activity != null && activity.getOutParameters().size() == 1) {
			return activity.getOutParameters().get(0).getEType();
		}

		return super.getContextClassifier();
	}

	@Override
	protected void postUpdate() {
		Expression expression = getElement().getReturnValue();

		// TODO: ugly
		// TODO: IMHO, the code below produces infinite loop exceptions because setting the expression should trigger the postUpdate, again! After removing that lines, the editor works more stable. (ChrisH)
		//getElement().getReturnValues().remove(expression);
		//getElement().getReturnValues().add(expression);
	}

	@Override
	protected ActivityFinalNode getElement() {
		return (ActivityFinalNode) super.getElement();
	}
}
