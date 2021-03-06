/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The storydiagram package is the root package for the story diagram meta-model. It defines the type Variable and otherwise is only used to contain more specific sub-packages.
 * <!-- end-model-doc -->
 * @see org.muml.storydiagram.StorydiagramFactory
 * @model kind="package"
 * @generated
 */
public interface StorydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorydiagramPackage eINSTANCE = org.muml.storydiagram.impl.StorydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.impl.VariableImpl
	 * @see org.muml.storydiagram.impl.StorydiagramPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXTENSIONS = CorePackage.TYPED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__GENERIC_TYPE = CorePackage.TYPED_ELEMENT__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CLASSIFIER = CorePackage.TYPED_ELEMENT__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_NAME = CorePackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CorePackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_EXTENSION__ECLASS = CorePackage.TYPED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___SET_CLASSIFIER__ECLASSIFIER = CorePackage.TYPED_ELEMENT___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = CorePackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.impl.SDMExtensionImpl <em>SDM Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.impl.SDMExtensionImpl
	 * @see org.muml.storydiagram.impl.StorydiagramPackageImpl#getSDMExtension()
	 * @generated
	 */
	int SDM_EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>SDM Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Model Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_EXTENSION___GET_MODEL_BASE = 0;

	/**
	 * The operation id for the '<em>Set Model Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_EXTENSION___SET_MODEL_BASE__EMODELELEMENT = 1;

	/**
	 * The number of operations of the '<em>SDM Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_EXTENSION_OPERATION_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.impl.VariableImpl
		 * @see org.muml.storydiagram.impl.StorydiagramPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VARIABLE_NAME = eINSTANCE.getVariable_VariableName();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.impl.SDMExtensionImpl <em>SDM Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.impl.SDMExtensionImpl
		 * @see org.muml.storydiagram.impl.StorydiagramPackageImpl#getSDMExtension()
		 * @generated
		 */
		EClass SDM_EXTENSION = eINSTANCE.getSDMExtension();

		/**
		 * The meta object literal for the '<em><b>Get Model Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDM_EXTENSION___GET_MODEL_BASE = eINSTANCE.getSDMExtension__GetModelBase();

		/**
		 * The meta object literal for the '<em><b>Set Model Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDM_EXTENSION___SET_MODEL_BASE__EMODELELEMENT = eINSTANCE.getSDMExtension__SetModelBase__EModelElement();

	}

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.muml.storydiagram.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.Variable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.muml.storydiagram.Variable#getVariableName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VariableName();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.SDMExtension <em>SDM Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDM Extension</em>'.
	 * @see org.muml.storydiagram.SDMExtension
	 * @generated
	 */
	EClass getSDMExtension();

	/**
	 * Returns the meta object for the '{@link org.muml.storydiagram.SDMExtension#getModelBase() <em>Get Model Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Base</em>' operation.
	 * @see org.muml.storydiagram.SDMExtension#getModelBase()
	 * @generated
	 */
	EOperation getSDMExtension__GetModelBase();

	/**
	 * Returns the meta object for the '{@link org.muml.storydiagram.SDMExtension#setModelBase(org.eclipse.emf.ecore.EModelElement) <em>Set Model Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Model Base</em>' operation.
	 * @see org.muml.storydiagram.SDMExtension#setModelBase(org.eclipse.emf.ecore.EModelElement)
	 * @generated
	 */
	EOperation getSDMExtension__SetModelBase__EModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorydiagramFactory getStorydiagramFactory();

} //StorydiagramsPackage
