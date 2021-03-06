/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Superclass for invocations of behavior which is specified elsewhere, e.g. in methods (MethodCallExpression) or activities (ActivityCallNode). An invocation has one parameter binding for each parameter (in or out) of the called method/activity. For Callables which are contained in the model (i.e. Activities and OperationExtensions) the Invocation directly points to the callee. OpaqueCallables are directly referenced by (and contained in) the MethodCallExpressions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.Invocation#getCallee <em>Callee</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.CallsPackage#getInvocation()
 * @model abstract="true"
 * @generated
 */
public interface Invocation extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.calls.ParameterBinding}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.calls.ParameterBinding#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Bindings</em>' containment reference list.
	 * @see org.muml.storydiagram.calls.CallsPackage#getInvocation_OwnedParameterBindings()
	 * @see org.muml.storydiagram.calls.ParameterBinding#getInvocation
	 * @model opposite="invocation" containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getOwnedParameterBindings();

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(Callable)
	 * @see org.muml.storydiagram.calls.CallsPackage#getInvocation_Callee()
	 * @model ordered="false"
	 * @generated
	 */
	Callable getCallee();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.Invocation#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(Callable value);

} // Invocation
