/**
 */
package dataWeb;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.MCQuestion#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see dataWeb.DataWebPackage#getMCQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R10_MandatoryMCQuestionsHaveOptions'"
 *        annotation="gmf.node label='text' color='255,230,230'"
 * @generated
 */
public interface MCQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link dataWeb.AnswerOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see dataWeb.DataWebPackage#getMCQuestion_Option()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<AnswerOption> getOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.isMandatory implies self.option-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean R10_MandatoryMCQuestionsHaveOptions(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MCQuestion
