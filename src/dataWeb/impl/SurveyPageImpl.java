/**
 */
package dataWeb.impl;

import dataWeb.AnswerOption;
import dataWeb.DataWebPackage;
import dataWeb.DataWebTables;
import dataWeb.MCQuestion;
import dataWeb.Question;
import dataWeb.Survey;
import dataWeb.SurveyPage;
import dataWeb.TrueFalseQuestion;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.SurveyPageImpl#getSurvey <em>Survey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyPageImpl extends PageImpl implements SurveyPage {
	/**
	 * The cached value of the '{@link #getSurvey() <em>Survey</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurvey()
	 * @generated
	 * @ordered
	 */
	protected EList<Survey> survey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.SURVEY_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Survey> getSurvey() {
		if (survey == null) {
			survey = new EObjectContainmentEList<Survey>(Survey.class, this, DataWebPackage.SURVEY_PAGE__SURVEY);
		}
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R07_ResponsesDefined(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SurveyPage::R07_ResponsesDefined";
		try {
			/**
			 *
			 * inv R07_ResponsesDefined:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = survey.question->forAll(q |
			 *           (
			 *             q.oclIsKindOf(TrueFalseQuestion) implies
			 *             q.oclAsType(TrueFalseQuestion).correctAnswer = true or
			 *             q.oclAsType(TrueFalseQuestion).correctAnswer = false
			 *           ) and
			 *           (
			 *             q.oclIsKindOf(MCQuestion) implies
			 *             q.oclAsType(MCQuestion)
			 *             .option->size() > 0
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.SURVEY_PAGE___R07_RESPONSES_DEFINED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Survey> survey = this.getSurvey();
					final /*@NonInvalid*/ OrderedSetValue BOXED_survey = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Survey, survey);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DataWebTables.SEQ_CLSSid_Question);
					Iterator<Object> ITERATOR__1 = BOXED_survey.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Survey _1 = (Survey)ITERATOR__1.next();
						/**
						 * question
						 */
						final /*@NonInvalid*/ List<Question> question = _1.getQuestion();
						final /*@NonInvalid*/ OrderedSetValue BOXED_question = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Question, question);
						//
						for (Object value : BOXED_question.flatten().getElements()) {
							accumulator.add(value);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_q = collect.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_q.hasNext()) {
							if (accumulator_0 == null) {
								result = null;
							}
							else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Question q = (Question)ITERATOR_q.next();
						/**
						 *
						 * (
						 *   q.oclIsKindOf(TrueFalseQuestion) implies
						 *   q.oclAsType(TrueFalseQuestion).correctAnswer = true or
						 *   q.oclAsType(TrueFalseQuestion).correctAnswer = false
						 * ) and
						 * (
						 *   q.oclIsKindOf(MCQuestion) implies
						 *   q.oclAsType(MCQuestion)
						 *   .option->size() > 0
						 * )
						 */
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_TrueFalseQuestion = idResolver.getClass(DataWebTables.CLSSid_TrueFalseQuestion, null);
								final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_TrueFalseQuestion).booleanValue();
								final /*@Thrown*/ Boolean implies;
								if (!oclIsKindOf) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_or;
									try {
										/*@Caught*/ Object CAUGHT_correctAnswer;
										try {
											final /*@Thrown*/ TrueFalseQuestion oclAsType = (TrueFalseQuestion)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_TrueFalseQuestion);
											final /*@Thrown*/ boolean correctAnswer = oclAsType.isCorrectAnswer();
											CAUGHT_correctAnswer = correctAnswer;
										}
										catch (Exception e) {
											CAUGHT_correctAnswer = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or;
										if (CAUGHT_correctAnswer == ValueUtil.TRUE_VALUE) {
											or = ValueUtil.TRUE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_eq;
											try {
												final /*@Thrown*/ TrueFalseQuestion oclAsType_0 = (TrueFalseQuestion)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_TrueFalseQuestion);
												final /*@Thrown*/ boolean correctAnswer_0 = oclAsType_0.isCorrectAnswer();
												final /*@Thrown*/ boolean eq = !correctAnswer_0;
												CAUGHT_eq = eq;
											}
											catch (Exception e) {
												CAUGHT_eq = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
												or = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_correctAnswer instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_correctAnswer;
												}
												if (CAUGHT_eq instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_eq;
												}
												or = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_or = or;
									}
									catch (Exception e) {
										CAUGHT_or = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_or instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_or;
										}
										if (CAUGHT_or == null) {
											implies = null;
										}
										else {
											implies = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_implies_0;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_MCQuestion = idResolver.getClass(DataWebTables.CLSSid_MCQuestion, null);
									final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_MCQuestion).booleanValue();
									final /*@Thrown*/ Boolean implies_0;
									if (!oclIsKindOf_0) {
										implies_0 = ValueUtil.TRUE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_gt;
										try {
											final /*@Thrown*/ MCQuestion oclAsType_1 = (MCQuestion)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_MCQuestion);
											final /*@Thrown*/ List<AnswerOption> option = oclAsType_1.getOption();
											final /*@Thrown*/ OrderedSetValue BOXED_option = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_AnswerOption, option);
											final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_option);
											final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, DataWebTables.INT_0).booleanValue();
											CAUGHT_gt = gt;
										}
										catch (Exception e) {
											CAUGHT_gt = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
											implies_0 = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_gt instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_gt;
											}
											implies_0 = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_implies_0 = implies_0;
								}
								catch (Exception e) {
									CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_implies instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_implies;
									}
									if (CAUGHT_implies_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_implies_0;
									}
									if ((CAUGHT_implies == null) || (CAUGHT_implies_0 == null)) {
										and = null;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_and == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_and == null) {								// Abnormal null body evaluation result
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								accumulator_0 = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_and instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_0 = CAUGHT_and;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DataWebTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebPackage.SURVEY_PAGE__SURVEY:
				return ((InternalEList<?>)getSurvey()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebPackage.SURVEY_PAGE__SURVEY:
				return getSurvey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataWebPackage.SURVEY_PAGE__SURVEY:
				getSurvey().clear();
				getSurvey().addAll((Collection<? extends Survey>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataWebPackage.SURVEY_PAGE__SURVEY:
				getSurvey().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataWebPackage.SURVEY_PAGE__SURVEY:
				return survey != null && !survey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataWebPackage.SURVEY_PAGE___R07_RESPONSES_DEFINED__DIAGNOSTICCHAIN_MAP:
				return R07_ResponsesDefined((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SurveyPageImpl
