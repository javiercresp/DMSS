/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.PageConfig#getPagination <em>Pagination</em>}</li>
 *   <li>{@link dataWeb.PageConfig#getPageType <em>Page Type</em>}</li>
 *   <li>{@link dataWeb.PageConfig#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getPageConfig()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R09_ValidIndexAttributes'"
 *        annotation="gmf.node label='pageType' color='240,240,240'"
 * @generated
 */
public interface PageConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Pagination</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Pagination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getPageConfig_Pagination()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Pagination> getPagination();

	/**
	 * Returns the value of the '<em><b>Page Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWeb.PageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Type</em>' attribute.
	 * @see dataWeb.PageType
	 * @see #setPageType(PageType)
	 * @see dataWeb.DataWebPackage#getPageConfig_PageType()
	 * @model
	 * @generated
	 */
	PageType getPageType();

	/**
	 * Sets the value of the '{@link dataWeb.PageConfig#getPageType <em>Page Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Type</em>' attribute.
	 * @see dataWeb.PageType
	 * @see #getPageType()
	 * @generated
	 */
	void setPageType(PageType value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see dataWeb.DataWebPackage#getPageConfig_Attribute()
	 * @model annotation="gmf.link source='PageConfig' target='Attribute' target.decoration='arrow' color='128,128,128' width='1'"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link dataWeb.PageConfig#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='attribute &lt;&gt; null implies let parent : dataWeb::Entity =\r\n\t\t\tself.oclContainer().oclAsType(dataWeb::Entity)\r\n\tin parent.attribute-&gt;includes(self.attribute)'"
	 * @generated
	 */
	boolean R09_ValidIndexAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PageConfig
