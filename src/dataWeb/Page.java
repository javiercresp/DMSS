/**
 */
package dataWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Page#getLink <em>Link</em>}</li>
 *   <li>{@link dataWeb.Page#getId <em>Id</em>}</li>
 *   <li>{@link dataWeb.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link dataWeb.Page#getSocialcontent <em>Socialcontent</em>}</li>
 *   <li>{@link dataWeb.Page#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link dataWeb.Page#getMetaKeywords <em>Meta Keywords</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getPage()
 * @model abstract="true"
 *        annotation="gmf.node label='name' color='255,230,200'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getPage_Link()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dataWeb.DataWebPackage#getPage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dataWeb.Page#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dataWeb.DataWebPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dataWeb.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Socialcontent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialcontent</em>' reference.
	 * @see #setSocialcontent(SocialContent)
	 * @see dataWeb.DataWebPackage#getPage_Socialcontent()
	 * @model annotation="gmf.link source='Page' target='SocialContent' target.decoration='arrow' color='128,128,0' width='1'"
	 * @generated
	 */
	SocialContent getSocialcontent();

	/**
	 * Sets the value of the '{@link dataWeb.Page#getSocialcontent <em>Socialcontent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socialcontent</em>' reference.
	 * @see #getSocialcontent()
	 * @generated
	 */
	void setSocialcontent(SocialContent value);

	/**
	 * Returns the value of the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Description</em>' attribute.
	 * @see #setMetaDescription(String)
	 * @see dataWeb.DataWebPackage#getPage_MetaDescription()
	 * @model
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link dataWeb.Page#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Meta Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Keywords</em>' attribute.
	 * @see #setMetaKeywords(String)
	 * @see dataWeb.DataWebPackage#getPage_MetaKeywords()
	 * @model
	 * @generated
	 */
	String getMetaKeywords();

	/**
	 * Sets the value of the '{@link dataWeb.Page#getMetaKeywords <em>Meta Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Keywords</em>' attribute.
	 * @see #getMetaKeywords()
	 * @generated
	 */
	void setMetaKeywords(String value);

} // Page
