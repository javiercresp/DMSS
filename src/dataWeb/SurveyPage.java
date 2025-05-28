/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.SurveyPage#getSurvey <em>Survey</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getSurveyPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07_ResponsesDefined'"
 *        annotation="gmf.node label='title' color='200,200,255'"
 * @generated
 */
public interface SurveyPage extends Page {
	/**
	 * Returns the value of the '<em><b>Survey</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.Survey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getSurveyPage_Survey()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Survey> getSurvey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='survey.question-&gt;forAll(q |\r\n\t\t\t(q.oclIsKindOf(TrueFalseQuestion) implies q.oclAsType(TrueFalseQuestion).correctAnswer = true or q.oclAsType(TrueFalseQuestion).correctAnswer = false) and (q.oclIsKindOf(MCQuestion) implies q.oclAsType(MCQuestion).option-&gt;size() &gt; 0))'"
	 * @generated
	 */
	boolean R07_ResponsesDefined(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SurveyPage
