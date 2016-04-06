/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.ecore.EParameter;
import org.muml.core.Extension;
import org.muml.storydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an EParameter and adds functionality to it, especially beiing subtype of Variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.CallsPackage#getParameterExtension()
 * @model
 * @generated
 */
public interface ParameterExtension extends Variable, Extension {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #isSetParameter()
	 * @see #unsetParameter()
	 * @see #setParameter(EParameter)
	 * @see org.muml.storydiagram.calls.CallsPackage#getParameterExtension_Parameter()
	 * @model resolveProxies="false" unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EParameter getParameter();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #isSetParameter()
	 * @see #unsetParameter()
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(EParameter value);

	/**
	 * Unsets the value of the '{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParameter()
	 * @see #getParameter()
	 * @see #setParameter(EParameter)
	 * @generated
	 */
	void unsetParameter();

	/**
	 * Returns whether the value of the '{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parameter</em>' reference is set.
	 * @see #unsetParameter()
	 * @see #getParameter()
	 * @see #setParameter(EParameter)
	 * @generated
	 */
	boolean isSetParameter();

} // ParameterExtension