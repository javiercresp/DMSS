/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Application#getName <em>Name</em>}</li>
 *   <li>{@link dataWeb.Application#getEntity <em>Entity</em>}</li>
 *   <li>{@link dataWeb.Application#getPage <em>Page</em>}</li>
 *   <li>{@link dataWeb.Application#getSocialcontent <em>Socialcontent</em>}</li>
 *   <li>{@link dataWeb.Application#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R01_UnicaIndexHome'"
 *        annotation="gmf.diagram"
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataWeb.DataWebPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataWeb.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getApplication_Entity()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getApplication_Page()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Page> getPage();

	/**
	 * Returns the value of the '<em><b>Socialcontent</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.SocialContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialcontent</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getApplication_Socialcontent()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<SocialContent> getSocialcontent();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getApplication_Role()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='socialcontent-&gt;select(sc |\n\t\t\t\tsc.type = SocialType::Twitter or sc.type = SocialType::Facebook)-&gt;size() &gt;= 1 and socialcontent-&gt;select(sc |\n\t\t\t\tsc.type = SocialType::RSS)-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean R04_SocialRSS(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='page-&gt;select(p | p.oclIsKindOf(SurveyPage))-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean R06b_MinSurvey(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='entity.pageconfig-&gt;select(pc | pc.pageType = PageType::Index)-&gt;size() = 1'"
	 * @generated
	 */
	boolean R01_UnicaIndexHome(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Application
