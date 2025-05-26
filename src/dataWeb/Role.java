/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Role#getName <em>Name</em>}</li>
 *   <li>{@link dataWeb.Role#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link dataWeb.Role#getAccessiblePages <em>Accessible Pages</em>}</li>
 *   <li>{@link dataWeb.Role#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}</li>
 *   <li>{@link dataWeb.Role#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R12_AdminMustSeeSurvey'"
 *        annotation="gmf.node label='name' color='255,240,200'"
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataWeb.DataWebPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWeb.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWeb.PermissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see dataWeb.PermissionType
	 * @see #setPermissions(PermissionType)
	 * @see dataWeb.DataWebPackage#getRole_Permissions()
	 * @model
	 * @generated
	 */
	PermissionType getPermissions();

	/**
	 * Sets the value of the '{@link dataWeb.Role#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see dataWeb.PermissionType
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(PermissionType value);

	/**
	 * Returns the value of the '<em><b>Accessible Pages</b></em>' reference list.
	 * The list contents are of type {@link dataWeb.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Pages</em>' reference list.
	 * @see dataWeb.DataWebPackage#getRole_AccessiblePages()
	 * @model annotation="gmf.link source='Role' target='Page' target.decoration='arrow' color='128,0,128' width='1'"
	 * @generated
	 */
	EList<Page> getAccessiblePages();

	/**
	 * Returns the value of the '<em><b>Numero Entidades Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #setNumeroEntidadesAccesibles(int)
	 * @see dataWeb.DataWebPackage#getRole_NumeroEntidadesAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNumeroEntidadesAccesibles();

	/**
	 * Sets the value of the '{@link dataWeb.Role#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #getNumeroEntidadesAccesibles()
	 * @generated
	 */
	void setNumeroEntidadesAccesibles(int value);

	/**
	 * Returns the value of the '<em><b>Paginas Medias Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas Medias Accesibles</em>' attribute.
	 * @see #setPaginasMediasAccesibles(double)
	 * @see dataWeb.DataWebPackage#getRole_PaginasMediasAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	double getPaginasMediasAccesibles();

	/**
	 * Sets the value of the '{@link dataWeb.Role#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paginas Medias Accesibles</em>' attribute.
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 */
	void setPaginasMediasAccesibles(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.permissions = dataWeb::PermissionType::ADMIN implies self.accessiblePages-&gt;exists(p :\n\t\t\tPage | p.oclIsKindOf(dataWeb::SurveyPage))'"
	 * @generated
	 */
	boolean R12_AdminMustSeeSurvey(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Role
