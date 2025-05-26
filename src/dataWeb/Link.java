/**
 */
package dataWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Link#getDescription <em>Description</em>}</li>
 *   <li>{@link dataWeb.Link#getExternalURL <em>External URL</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getLink()
 * @model annotation="gmf.node label='description' color='255,255,255'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dataWeb.DataWebPackage#getLink_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dataWeb.Link#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>External URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External URL</em>' attribute.
	 * @see #setExternalURL(String)
	 * @see dataWeb.DataWebPackage#getLink_ExternalURL()
	 * @model
	 * @generated
	 */
	String getExternalURL();

	/**
	 * Sets the value of the '{@link dataWeb.Link#getExternalURL <em>External URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External URL</em>' attribute.
	 * @see #getExternalURL()
	 * @generated
	 */
	void setExternalURL(String value);

} // Link
