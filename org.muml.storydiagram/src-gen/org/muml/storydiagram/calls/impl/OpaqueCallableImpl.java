/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.OpaqueCallable;
import org.muml.storydiagram.calls.expressions.CallsExpressionsPackage;
import org.muml.storydiagram.calls.expressions.MethodCallExpression;
import org.muml.storydiagram.calls.util.CallsValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Opaque Callable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl#getCallExpression <em>Call Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueCallableImpl extends CallableImpl implements OpaqueCallable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueCallableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.OPAQUE_CALLABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.OPAQUE_CALLABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallExpression getCallExpression() {
		if (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION) return null;
		return (MethodCallExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallExpression(
			MethodCallExpression newCallExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCallExpression, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallExpression(MethodCallExpression newCallExpression) {
		if (newCallExpression != eInternalContainer() || (eContainerFeatureID() != CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION && newCallExpression != null)) {
			if (EcoreUtil.isAncestor(this, newCallExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCallExpression != null)
				msgs = ((InternalEObject)newCallExpression).eInverseAdd(this, CallsExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, MethodCallExpression.class, msgs);
			msgs = basicSetCallExpression(newCallExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION, newCallExpression, newCallExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NumberOfOutParams(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CallsValidator.DIAGNOSTIC_SOURCE,
						 CallsValidator.OPAQUE_CALLABLE__NUMBER_OF_OUT_PARAMS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NumberOfOutParams", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCallExpression((MethodCallExpression)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				return basicSetCallExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, CallsExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, MethodCallExpression.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallsPackage.OPAQUE_CALLABLE__NAME:
				return getName();
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				return getCallExpression();
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
			case CallsPackage.OPAQUE_CALLABLE__NAME:
				setName((String)newValue);
				return;
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				setCallExpression((MethodCallExpression)newValue);
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
			case CallsPackage.OPAQUE_CALLABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				setCallExpression((MethodCallExpression)null);
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
			case CallsPackage.OPAQUE_CALLABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION:
				return getCallExpression() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CallsPackage.OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP:
				return NumberOfOutParams((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // OpaqueCallableImpl
