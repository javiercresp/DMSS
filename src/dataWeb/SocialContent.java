/**
 */
package dataWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.SocialContent#getType <em>Type</em>}</li>
 *   <li>{@link dataWeb.SocialContent#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getSocialContent()
 * @model annotation="gmf.node label='uri' color='230,230,230'"
 * @generated
 */
public interface SocialContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWeb.SocialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dataWeb.SocialType
	 * @see #setType(SocialType)
	 * @see dataWeb.DataWebPackage#getSocialContent_Type()
	 * @model
	 * @generated
	 */
	SocialType getType();

	/**
	 * Sets the value of the '{@link dataWeb.SocialContent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dataWeb.SocialType
	 * @see #getType()
	 * @generated
	 */
	void setType(SocialType value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see dataWeb.DataWebPackage#getSocialContent_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link dataWeb.SocialContent#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // SocialContent
