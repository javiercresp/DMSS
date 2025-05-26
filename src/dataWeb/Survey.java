/**
 */
package dataWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.Survey#getQuestion <em>Question</em>}</li>
 *   <li>{@link dataWeb.Survey#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link dataWeb.Survey#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataWeb.Survey#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getSurvey()
 * @model annotation="gmf.node label='representation' color='200,255,200'"
 * @generated
 */
public interface Survey extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getSurvey_Question()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Question> getQuestion();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link dataWeb.ChartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see dataWeb.ChartType
	 * @see #setRepresentation(ChartType)
	 * @see dataWeb.DataWebPackage#getSurvey_Representation()
	 * @model
	 * @generated
	 */
	ChartType getRepresentation();

	/**
	 * Sets the value of the '{@link dataWeb.Survey#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see dataWeb.ChartType
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(ChartType value);

	/**
	 * Returns the value of the '<em><b>Numero Preg VF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D03: nï¿½mero de preguntas Verdadero/Falso
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numero Preg VF</em>' attribute.
	 * @see #setNumeroPregVF(int)
	 * @see dataWeb.DataWebPackage#getSurvey_NumeroPregVF()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNumeroPregVF();

	/**
	 * Sets the value of the '{@link dataWeb.Survey#getNumeroPregVF <em>Numero Preg VF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Preg VF</em>' attribute.
	 * @see #getNumeroPregVF()
	 * @generated
	 */
	void setNumeroPregVF(int value);

	/**
	 * Returns the value of the '<em><b>Numero Preg Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D04: nï¿½mero de preguntas de selecciï¿½n mï¿½ltiple
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numero Preg Select</em>' attribute.
	 * @see #setNumeroPregSelect(int)
	 * @see dataWeb.DataWebPackage#getSurvey_NumeroPregSelect()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNumeroPregSelect();

	/**
	 * Sets the value of the '{@link dataWeb.Survey#getNumeroPregSelect <em>Numero Preg Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Preg Select</em>' attribute.
	 * @see #getNumeroPregSelect()
	 * @generated
	 */
	void setNumeroPregSelect(int value);

} // Survey
