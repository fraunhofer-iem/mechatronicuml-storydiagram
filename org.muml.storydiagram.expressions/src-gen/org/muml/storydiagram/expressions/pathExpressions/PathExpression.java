/**
 */
package org.muml.storydiagram.expressions.pathExpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.expressions.pathExpressions.PathExpression#getPathAlternatives <em>Path Alternatives</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPathExpression()
 * @model
 * @generated
 */
public interface PathExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Path Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.storydiagram.expressions.pathExpressions.Path}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Alternatives</em>' containment reference list.
   * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPathExpression_PathAlternatives()
   * @model containment="true"
   * @generated
   */
  EList<Path> getPathAlternatives();

} // PathExpression
