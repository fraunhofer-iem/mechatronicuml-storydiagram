/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.storydiagram.activities.expressions.ActivitiesExpressionsFactory;
import org.muml.storydiagram.calls.expressions.CallsExpressionsFactory;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.expressions.PatternsExpressionsFactory;
import org.muml.storydiagram.provider.StorydiagramsEditPlugin;
import org.muml.storydiagram.provider.VariableItemProvider;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.patterns.AbstractVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractVariableItemProvider extends VariableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addBindingStatePropertyDescriptor(object);
			addIncomingLinksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 CorePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Binding State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractVariable_bindingState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractVariable_bindingState_feature", "_UI_AbstractVariable_type"),
				 PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractVariable_incomingLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractVariable_incomingLinks_feature", "_UI_AbstractVariable_type"),
				 PatternsPackage.Literals.ABSTRACT_VARIABLE__INCOMING_LINKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StorydiagramsEditPlugin.INSTANCE;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION);
			childrenFeatures.add(PatternsPackage.Literals.ABSTRACT_VARIABLE__CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractVariable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractVariable_type") :
			getString("_UI_AbstractVariable_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractVariable.class)) {
			case PatternsPackage.ABSTRACT_VARIABLE__NAME:
			case PatternsPackage.ABSTRACT_VARIABLE__BINDING_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.ABSTRACT_VARIABLE__BINDING_EXPRESSION:
			case PatternsPackage.ABSTRACT_VARIABLE__CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 ActivitiesExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CallsExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createCollectionSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 PatternsExpressionsFactory.eINSTANCE.createPrimitiveVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__BINDING_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ABSTRACT_VARIABLE__CONSTRAINTS,
				 PatternsFactory.eINSTANCE.createConstraint()));
	}

}
