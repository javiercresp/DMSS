/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>True False Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.TrueFalseQuestion#isCorrectAnswer <em>Correct Answer</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getTrueFalseQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R11_MandatoryTFQuestionsHaveAnswer'"
 *        annotation="gmf.node label='text' color='230,255,230'"
 * @generated
 */
public interface TrueFalseQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Correct Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Answer</em>' attribute.
	 * @see #setCorrectAnswer(boolean)
	 * @see dataWeb.DataWebPackage#getTrueFalseQuestion_CorrectAnswer()
	 * @model required="true"
	 * @generated
	 */
	boolean isCorrectAnswer();

	/**
	 * Sets the value of the '{@link dataWeb.TrueFalseQuestion#isCorrectAnswer <em>Correct Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Answer</em>' attribute.
	 * @see #isCorrectAnswer()
	 * @generated
	 */
	void setCorrectAnswer(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.isMandatory implies (self.correctAnswer = true or self.correctAnswer = false)'"
	 * @generated
	 */
	boolean R11_MandatoryTFQuestionsHaveAnswer(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TrueFalseQuestion
