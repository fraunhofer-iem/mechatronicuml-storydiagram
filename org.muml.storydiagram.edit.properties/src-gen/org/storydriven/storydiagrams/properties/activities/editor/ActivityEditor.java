
package org.storydriven.storydiagrams.properties.activities.editor;

/**
 * @generated
 */
public class ActivityEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ActivityEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorInParameter_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorOutParameter_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPrecondition_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorInParameter_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorOutParameter_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPrecondition_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPrecondition_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPrecondition_property_tab_generalTab_Editor() {
		if (this.editorPrecondition_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
					.getActivity_Precondition();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"References a story node which represents the precondition for the execution of the activity. I.e., the activity is executed, iff the object structure in the story node can be matched. Obviously the referenced story node may only contain black (i.e., non-create and non-destroy) objects and links.");

			this.editorPrecondition_property_tab_generalTab = editor;
		}
		return this.editorPrecondition_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInParameter_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInParameter_property_tab_generalTab_Editor() {
		if (this.editorInParameter_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.calls.CallsPackage.eINSTANCE
					.getCallable_InParameter();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The ordered set of in parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference.");

			this.editorInParameter_property_tab_generalTab = editor;
		}
		return this.editorInParameter_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutParameter_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutParameter_property_tab_generalTab_Editor() {
		if (this.editorOutParameter_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.calls.CallsPackage.eINSTANCE
					.getCallable_OutParameter();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The ordered set of out parameters of this Callable. The parameters will not be contained in this reference, if parameters have to be contained in the callable, they also have to be added to the containedParameters reference.");

			this.editorOutParameter_property_tab_generalTab = editor;
		}
		return this.editorOutParameter_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ActivityEditor(String tab) {
		this(tab, org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE.getActivity());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ActivityEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
