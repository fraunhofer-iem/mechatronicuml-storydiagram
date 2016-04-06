/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.util.StorydiagramsResourceImpl
 * @generated
 */
public class StorydiagramResourceFactoryImpl extends ResourceFactoryImpl
		implements StorydiagramsResource.Factory {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorydiagramResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		StorydiagramsResource result = new StorydiagramsResourceImpl(uri);
		result.setEncoding(StorydiagramsResource.DEFAULT_ENCODING);
		return result;
	}

} //StorydiagramsResourceFactoryImpl