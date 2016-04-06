
package org.muml.storydiagram.verification.sdd.basicsdd.properties.basicsdd.editor;

/**
 * @generated
 */
public class StoryPatternNodeEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public StoryPatternNodeEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorOutgoingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorType_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorOutgoingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorType_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorType_property_tab_generalTab_Editor() {
		if (this.editorType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getPatternNode_Type();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			this.editorType_property_tab_generalTab = editor;
		}
		return this.editorType_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingEdges_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingEdges_property_tab_generalTab_Editor() {
		if (this.editorOutgoingEdges_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getNode_OutgoingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorOutgoingEdges_property_tab_generalTab = editor;
		}
		return this.editorOutgoingEdges_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingEdges_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingEdges_property_tab_generalTab_Editor() {
		if (this.editorIncomingEdges_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage.eINSTANCE
					.getNode_IncomingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingEdges_property_tab_generalTab = editor;
		}
		return this.editorIncomingEdges_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StoryPatternNodeEditor(String tab) {
		this(tab,
				org.muml.storydiagram.verification.sdd.basicsdd.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage.eINSTANCE.getStoryPatternNode());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new StoryPatternNodeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
