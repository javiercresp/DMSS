/**
 */
package dataWeb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.EntityPage#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getEntityPage()
 * @model abstract="true"
 *        annotation="gmf.node label='title' color='200,230,255'"
 * @generated
 */
public interface EntityPage extends Page {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see dataWeb.DataWebPackage#getEntityPage_Entity()
	 * @model annotation="gmf.link source='EntityPage' target='Entity' target.decoration='arrow' color='0,128,0' width='2'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link dataWeb.EntityPage#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // EntityPage
