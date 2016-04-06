/**
 */
package org.muml.storydiagram.patterns.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.muml.core.CorePackage;

import org.muml.core.expressions.provider.ExpressionItemProvider;

import org.muml.storydiagram.activities.ActivitiesFactory;

import org.muml.storydiagram.calls.CallsFactory;

import org.muml.storydiagram.patterns.expressions.ExpressionsPackage;
import org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression;

import org.muml.storydiagram.provider.StorydiagramsEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveVariableExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveVariableExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addPrimitiveVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Primitive Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimitiveVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrimitiveVariableExpression_primitiveVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrimitiveVariableExpression_primitiveVariable_feature", "_UI_PrimitiveVariableExpression_type"),
				 ExpressionsPackage.Literals.PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PrimitiveVariableExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimitiveVariableExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PrimitiveVariableExpression)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_PrimitiveVariableExpression_type") :
			getString("_UI_PrimitiveVariableExpression_type") + " " + label;
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
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 CallsFactory.eINSTANCE.createParameterExtension()));
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

}