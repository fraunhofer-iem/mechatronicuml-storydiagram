/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.storydiagram.StorydiagramPackage;

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
 * This package contains all classes for modeling calls to activities and EOperations
 * from within an activity.
 * <!-- end-model-doc -->
 * @see org.muml.storydiagram.calls.CallsFactory
 * @model kind="package"
 * @generated
 */
public interface CallsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram/calls/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallsPackage eINSTANCE = org.muml.storydiagram.calls.impl.CallsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.InvocationImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__OWNED_PARAMETER_BINDINGS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__CALLEE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.ParameterBindingImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__VALUE_EXPRESSION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__PARAMETER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__INVOCATION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.CallableImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__IN_PARAMETERS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__OUT_PARAMETERS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__CONTAINED_PARAMETERS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.OpaqueCallableImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getOpaqueCallable()
	 * @generated
	 */
	int OPAQUE_CALLABLE = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__EXTENSIONS = CALLABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__COMMENT = CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__IN_PARAMETERS = CALLABLE__IN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__OUT_PARAMETERS = CALLABLE__OUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CONTAINED_PARAMETERS = CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__NAME = CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE__CALL_EXPRESSION = CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___GET_EXTENSION__ECLASS = CALLABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Number Of Out Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = CALLABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opaque Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_CALLABLE_OPERATION_COUNT = CALLABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.calls.impl.ParameterExtensionImpl
	 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterExtension()
	 * @generated
	 */
	int PARAMETER_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__EXTENSIONS = StorydiagramPackage.VARIABLE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__GENERIC_TYPE = StorydiagramPackage.VARIABLE__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__CLASSIFIER = StorydiagramPackage.VARIABLE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__VARIABLE_NAME = StorydiagramPackage.VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION__PARAMETER = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION_FEATURE_COUNT = StorydiagramPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___GET_EXTENSION__ECLASS = StorydiagramPackage.VARIABLE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Set Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___SET_CLASSIFIER__ECLASSIFIER = StorydiagramPackage.VARIABLE___SET_CLASSIFIER__ECLASSIFIER;

	/**
	 * The operation id for the '<em>Get Model Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___GET_MODEL_BASE = StorydiagramPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Model Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION___SET_MODEL_BASE__EMODELELEMENT = StorydiagramPackage.VARIABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_EXTENSION_OPERATION_COUNT = StorydiagramPackage.VARIABLE_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.muml.storydiagram.calls.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Bindings</em>'.
	 * @see org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_OwnedParameterBindings();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.Invocation#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.muml.storydiagram.calls.Invocation#getCallee()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Callee();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.storydiagram.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getValueExpression()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.ParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.calls.ParameterBinding#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocation</em>'.
	 * @see org.muml.storydiagram.calls.ParameterBinding#getInvocation()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Invocation();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.OpaqueCallable <em>Opaque Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Callable</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable
	 * @generated
	 */
	EClass getOpaqueCallable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.storydiagram.calls.OpaqueCallable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#getName()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EAttribute getOpaqueCallable_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.storydiagram.calls.OpaqueCallable#getCallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Expression</em>'.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#getCallExpression()
	 * @see #getOpaqueCallable()
	 * @generated
	 */
	EReference getOpaqueCallable_CallExpression();

	/**
	 * Returns the meta object for the '{@link org.muml.storydiagram.calls.OpaqueCallable#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Out Params</em>' operation.
	 * @see org.muml.storydiagram.calls.OpaqueCallable#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.ParameterExtension <em>Parameter Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Extension</em>'.
	 * @see org.muml.storydiagram.calls.ParameterExtension
	 * @generated
	 */
	EClass getParameterExtension();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.calls.ParameterExtension#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.storydiagram.calls.ParameterExtension#getParameter()
	 * @see #getParameterExtension()
	 * @generated
	 */
	EReference getParameterExtension_Parameter();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.calls.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.muml.storydiagram.calls.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.calls.Callable#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Parameters</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getInParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_InParameters();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.calls.Callable#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Parameters</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getOutParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_OutParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.calls.Callable#getContainedParameters <em>Contained Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Parameters</em>'.
	 * @see org.muml.storydiagram.calls.Callable#getContainedParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_ContainedParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CallsFactory getCallsFactory();

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
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.InvocationImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__OWNED_PARAMETER_BINDINGS = eINSTANCE.getInvocation_OwnedParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__CALLEE = eINSTANCE.getInvocation_Callee();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.ParameterBindingImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__VALUE_EXPRESSION = eINSTANCE.getParameterBinding_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__PARAMETER = eINSTANCE.getParameterBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__INVOCATION = eINSTANCE.getParameterBinding_Invocation();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.OpaqueCallableImpl <em>Opaque Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.OpaqueCallableImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getOpaqueCallable()
		 * @generated
		 */
		EClass OPAQUE_CALLABLE = eINSTANCE.getOpaqueCallable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_CALLABLE__NAME = eINSTANCE.getOpaqueCallable_Name();

		/**
		 * The meta object literal for the '<em><b>Call Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_CALLABLE__CALL_EXPRESSION = eINSTANCE.getOpaqueCallable_CallExpression();

		/**
		 * The meta object literal for the '<em><b>Number Of Out Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_CALLABLE___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOpaqueCallable__NumberOfOutParams__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl <em>Parameter Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.ParameterExtensionImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getParameterExtension()
		 * @generated
		 */
		EClass PARAMETER_EXTENSION = eINSTANCE.getParameterExtension();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_EXTENSION__PARAMETER = eINSTANCE.getParameterExtension_Parameter();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.calls.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.calls.impl.CallableImpl
		 * @see org.muml.storydiagram.calls.impl.CallsPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>In Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__IN_PARAMETERS = eINSTANCE.getCallable_InParameters();

		/**
		 * The meta object literal for the '<em><b>Out Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__OUT_PARAMETERS = eINSTANCE.getCallable_OutParameters();

		/**
		 * The meta object literal for the '<em><b>Contained Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__CONTAINED_PARAMETERS = eINSTANCE.getCallable_ContainedParameters();

	}

} //CallsPackage
