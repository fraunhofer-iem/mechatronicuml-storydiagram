/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.activities.expressions.ActivitiesExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitiesExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/activities/expressions/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdae";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitiesExpressionsPackage eINSTANCE = org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.activities.expressions.impl.ExceptionVariableExpressionImpl <em>Exception Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.activities.expressions.impl.ExceptionVariableExpressionImpl
	 * @see org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl#getExceptionVariableExpression()
	 * @generated
	 */
	int EXCEPTION_VARIABLE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Exception Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Exception Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_VARIABLE_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.activities.expressions.ExceptionVariableExpression <em>Exception Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Variable Expression</em>'.
	 * @see org.muml.storydiagram.activities.expressions.ExceptionVariableExpression
	 * @generated
	 */
	EClass getExceptionVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.activities.expressions.ExceptionVariableExpression#getExceptionVariable <em>Exception Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Variable</em>'.
	 * @see org.muml.storydiagram.activities.expressions.ExceptionVariableExpression#getExceptionVariable()
	 * @see #getExceptionVariableExpression()
	 * @generated
	 */
	EReference getExceptionVariableExpression_ExceptionVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitiesExpressionsFactory getActivitiesExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.activities.expressions.impl.ExceptionVariableExpressionImpl <em>Exception Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.activities.expressions.impl.ExceptionVariableExpressionImpl
		 * @see org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl#getExceptionVariableExpression()
		 * @generated
		 */
		EClass EXCEPTION_VARIABLE_EXPRESSION = eINSTANCE.getExceptionVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Exception Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE = eINSTANCE.getExceptionVariableExpression_ExceptionVariable();

	}

} //ActivitiesExpressionsPackage
