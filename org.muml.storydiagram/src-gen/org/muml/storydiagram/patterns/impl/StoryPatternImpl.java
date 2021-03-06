/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.templates.TemplateSignature;
import org.muml.storydiagram.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Story Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getLinkVariables <em>Link Variables</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getParentPattern <em>Parent Pattern</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getContainedPatterns <em>Contained Patterns</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.impl.StoryPatternImpl#getTemplateSignature <em>Template Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryPatternImpl extends CommentableElementImpl implements
		StoryPattern {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariable> variables;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getLinkVariables() <em>Link Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractLinkVariable> linkVariables;

	/**
	 * The cached value of the '{@link #getContainedPatterns() <em>Contained Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<StoryPattern> containedPatterns;

	/**
	 * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;

	/**
	 * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateSignature() <em>Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature templateSignature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.STORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<AbstractVariable>(AbstractVariable.class, this, PatternsPackage.STORY_PATTERN__VARIABLES, PatternsPackage.ABSTRACT_VARIABLE__PATTERN);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, PatternsPackage.STORY_PATTERN__CONSTRAINTS, PatternsPackage.CONSTRAINT__PATTERN);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractLinkVariable> getLinkVariables() {
		if (linkVariables == null) {
			linkVariables = new EObjectContainmentWithInverseEList<AbstractLinkVariable>(AbstractLinkVariable.class, this, PatternsPackage.STORY_PATTERN__LINK_VARIABLES, PatternsPackage.ABSTRACT_LINK_VARIABLE__PATTERN);
		}
		return linkVariables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getParentPattern() {
		if (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN) return null;
		return (StoryPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPattern(
			StoryPattern newParentPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPattern, PatternsPackage.STORY_PATTERN__PARENT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPattern(StoryPattern newParentPattern) {
		if (newParentPattern != eInternalContainer() || (eContainerFeatureID() != PatternsPackage.STORY_PATTERN__PARENT_PATTERN && newParentPattern != null)) {
			if (EcoreUtil.isAncestor(this, newParentPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPattern != null)
				msgs = ((InternalEObject)newParentPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS, StoryPattern.class, msgs);
			msgs = basicSetParentPattern(newParentPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__PARENT_PATTERN, newParentPattern, newParentPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoryPattern> getContainedPatterns() {
		if (containedPatterns == null) {
			containedPatterns = new EObjectContainmentWithInverseEList<StoryPattern>(StoryPattern.class, this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS, PatternsPackage.STORY_PATTERN__PARENT_PATTERN);
		}
		return containedPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSemantics getBindingSemantics() {
		return bindingSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSemantics(BindingSemantics newBindingSemantics) {
		BindingSemantics oldBindingSemantics = bindingSemantics;
		bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS, oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getTemplateSignature() {
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateSignature(
			TemplateSignature newTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldTemplateSignature = templateSignature;
		templateSignature = newTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, oldTemplateSignature, newTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateSignature(TemplateSignature newTemplateSignature) {
		if (newTemplateSignature != templateSignature) {
			NotificationChain msgs = null;
			if (templateSignature != null)
				msgs = ((InternalEObject)templateSignature).eInverseRemove(this, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
			if (newTemplateSignature != null)
				msgs = ((InternalEObject)newTemplateSignature).eInverseAdd(this, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, TemplateSignature.class, msgs);
			msgs = basicSetTemplateSignature(newTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, newTemplateSignature, newTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkVariables()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPattern((StoryPattern)otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedPatterns()).basicAdd(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				if (templateSignature != null)
					msgs = ((InternalEObject)templateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, null, msgs);
				return basicSetTemplateSignature((TemplateSignature)otherEnd, msgs);
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
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				return ((InternalEList<?>)getLinkVariables()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return basicSetParentPattern(null, msgs);
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				return ((InternalEList<?>)getContainedPatterns()).basicRemove(otherEnd, msgs);
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return basicSetTemplateSignature(null, msgs);
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
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS, StoryPattern.class, msgs);
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
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				return getVariables();
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				return getConstraints();
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				return getLinkVariables();
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return getParentPattern();
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				return getContainedPatterns();
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				return getBindingSemantics();
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return getTemplateSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends AbstractVariable>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				getLinkVariables().clear();
				getLinkVariables().addAll((Collection<? extends AbstractLinkVariable>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				setParentPattern((StoryPattern)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				getContainedPatterns().clear();
				getContainedPatterns().addAll((Collection<? extends StoryPattern>)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				setBindingSemantics((BindingSemantics)newValue);
				return;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)newValue);
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
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				getVariables().clear();
				return;
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				getConstraints().clear();
				return;
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				getLinkVariables().clear();
				return;
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				setParentPattern((StoryPattern)null);
				return;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				getContainedPatterns().clear();
				return;
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
				return;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				setTemplateSignature((TemplateSignature)null);
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
			case PatternsPackage.STORY_PATTERN__VARIABLES:
				return variables != null && !variables.isEmpty();
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
				return linkVariables != null && !linkVariables.isEmpty();
			case PatternsPackage.STORY_PATTERN__PARENT_PATTERN:
				return getParentPattern() != null;
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
				return containedPatterns != null && !containedPatterns.isEmpty();
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
				return templateSignature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(')');
		return result.toString();
	}

} // StoryPatternImpl
