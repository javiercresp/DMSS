/**
 */
package dataWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Pagination#getPageSize <em>Page Size</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getPagination()
 * @model annotation="gmf.node label='pageSize' color='255,255,255'"
 * @generated
 */
public interface Pagination extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see dataWeb.DataWebPackage#getPagination_PageSize()
	 * @model required="true"
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link dataWeb.Pagination#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

} // Pagination
