/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.patterns.Path;
import org.muml.storydiagram.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Path</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.impl.PathImpl#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends AbstractLinkVariableImpl implements Path {
	/**
	 * The cached value of the '{@link #getPathExpression() <em>Path Expression</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPathExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression pathExpression;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPathExpression() {
		return pathExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathExpression(
			Expression newPathExpression, NotificationChain msgs) {
		Expression oldPathExpression = pathExpression;
		pathExpression = newPathExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.PATH__PATH_EXPRESSION, oldPathExpression, newPathExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathExpression(Expression newPathExpression) {
		if (newPathExpression != pathExpression) {
			NotificationChain msgs = null;
			if (pathExpression != null)
				msgs = ((InternalEObject)pathExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PATH__PATH_EXPRESSION, null, msgs);
			if (newPathExpression != null)
				msgs = ((InternalEObject)newPathExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.PATH__PATH_EXPRESSION, null, msgs);
			msgs = basicSetPathExpression(newPathExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATH__PATH_EXPRESSION, newPathExpression, newPathExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.PATH__PATH_EXPRESSION:
				return basicSetPathExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternsPackage.PATH__PATH_EXPRESSION:
				return getPathExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.PATH__PATH_EXPRESSION:
				setPathExpression((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternsPackage.PATH__PATH_EXPRESSION:
				setPathExpression((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternsPackage.PATH__PATH_EXPRESSION:
				return pathExpression != null;
		}
		return super.eIsSet(featureID);
	}

} // PathImpl
