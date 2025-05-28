/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Entity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dataWeb.Entity#getReference <em>Reference</em>}</li>
 *   <li>{@link dataWeb.Entity#getPageconfig <em>Pageconfig</em>}</li>
 *   <li>{@link dataWeb.Entity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R05_NoSelfReference'"
 *        annotation="gmf.node label='name' color='200,200,255'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getEntity_Attribute()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getEntity_Reference()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Pageconfig</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.PageConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pageconfig</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getEntity_Pageconfig()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<PageConfig> getPageconfig();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataWeb.DataWebPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWeb.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='pageconfig-&gt;select(pc | pc.pageType = PageType::Index)-&gt;size() &lt;= 1'"
	 * @generated
	 */
	boolean R08_UniqueIndexPerEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(pageconfig-&gt;exists(pc |\r\n\t\t\t\tpc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex) implies pageconfig-&gt;exists(pc |\r\n\t\t\t\tpc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail)) and (pageconfig-&gt;exists(pc |\r\n\t\t\t\tpc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail) implies pageconfig-&gt;exists(pc |\r\n\t\t\t\tpc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex))'"
	 * @generated
	 */
	boolean R03_IndiceDetalle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='pageconfig-&gt;exists(pc | pc.pageType = PageType::CRUD) implies pageconfig-&gt;forAll(pc\r\n\t\t\t\t| pc.pageType = PageType::CRUD)'"
	 * @generated
	 */
	boolean R02_CRUDIncompatible(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='reference-&gt;forAll(ref | ref.name &lt;&gt; name)'"
	 * @generated
	 */
	boolean R05_NoSelfReference(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
