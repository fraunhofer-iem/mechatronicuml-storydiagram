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
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.provider.StorydiagramsEditPlugin;
import org.muml.storydiagram.templates.TemplatesFactory;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.patterns.StoryPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryPatternItemProvider extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPatternItemProvider(AdapterFactory adapterFactory) {
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

			addBindingSemanticsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Binding Semantics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingSemanticsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StoryPattern_bindingSemantics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StoryPattern_bindingSemantics_feature", "_UI_StoryPattern_type"),
				 PatternsPackage.Literals.STORY_PATTERN__BINDING_SEMANTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns StoryPattern.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"elements/patterns/StoryPattern.png"));
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
			childrenFeatures.add(PatternsPackage.Literals.STORY_PATTERN__VARIABLES);
			childrenFeatures.add(PatternsPackage.Literals.STORY_PATTERN__CONSTRAINTS);
			childrenFeatures.add(PatternsPackage.Literals.STORY_PATTERN__LINK_VARIABLES);
			childrenFeatures.add(PatternsPackage.Literals.STORY_PATTERN__CONTAINED_PATTERNS);
			childrenFeatures.add(PatternsPackage.Literals.STORY_PATTERN__TEMPLATE_SIGNATURE);
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
		String label = ((StoryPattern)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_StoryPattern_type") :
			getString("_UI_StoryPattern_type") + " " + label;
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

		switch (notification.getFeatureID(StoryPattern.class)) {
			case PatternsPackage.STORY_PATTERN__BINDING_SEMANTICS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.STORY_PATTERN__VARIABLES:
			case PatternsPackage.STORY_PATTERN__CONSTRAINTS:
			case PatternsPackage.STORY_PATTERN__LINK_VARIABLES:
			case PatternsPackage.STORY_PATTERN__CONTAINED_PATTERNS:
			case PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE:
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
				(PatternsPackage.Literals.STORY_PATTERN__VARIABLES,
				 PatternsFactory.eINSTANCE.createObjectVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__VARIABLES,
				 PatternsFactory.eINSTANCE.createCollectionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__VARIABLES,
				 PatternsFactory.eINSTANCE.createPrimitiveVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__CONSTRAINTS,
				 PatternsFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__LINK_VARIABLES,
				 PatternsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__LINK_VARIABLES,
				 PatternsFactory.eINSTANCE.createLinkVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__LINK_VARIABLES,
				 PatternsFactory.eINSTANCE.createInclusionLink()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__LINK_VARIABLES,
				 PatternsFactory.eINSTANCE.createMaybeLink()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__CONTAINED_PATTERNS,
				 PatternsFactory.eINSTANCE.createStoryPattern()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__CONTAINED_PATTERNS,
				 PatternsFactory.eINSTANCE.createMatchingPattern()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.STORY_PATTERN__TEMPLATE_SIGNATURE,
				 TemplatesFactory.eINSTANCE.createTemplateSignature()));
	}

}
