/**
 */
package org.muml.storydiagram.expressions.pathExpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.expressions.pathExpressions.PathSegment#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.muml.storydiagram.expressions.pathExpressions.PathSegment#getRepeatOperator <em>Repeat Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPathSegment()
 * @model
 * @generated
 */
public interface PathSegment extends EObject
{
  /**
   * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.storydiagram.expressions.pathExpressions.PathSegmentDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternatives</em>' containment reference list.
   * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPathSegment_Alternatives()
   * @model containment="true"
   * @generated
   */
  EList<PathSegmentDescription> getAlternatives();

  /**
   * Returns the value of the '<em><b>Repeat Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.muml.storydiagram.expressions.pathExpressions.RepeatOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat Operator</em>' attribute.
   * @see org.muml.storydiagram.expressions.pathExpressions.RepeatOperator
   * @see #setRepeatOperator(RepeatOperator)
   * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPathSegment_RepeatOperator()
   * @model
   * @generated
   */
  RepeatOperator getRepeatOperator();

  /**
   * Sets the value of the '{@link org.muml.storydiagram.expressions.pathExpressions.PathSegment#getRepeatOperator <em>Repeat Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat Operator</em>' attribute.
   * @see org.muml.storydiagram.expressions.pathExpressions.RepeatOperator
   * @see #getRepeatOperator()
   * @generated
   */
  void setRepeatOperator(RepeatOperator value);

} // PathSegment
