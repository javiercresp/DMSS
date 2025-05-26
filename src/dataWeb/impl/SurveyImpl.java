/**
 */
package dataWeb.impl;

import dataWeb.ChartType;
import dataWeb.DataWebPackage;
import dataWeb.DataWebTables;
import dataWeb.Question;
import dataWeb.Survey;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.SurveyImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link dataWeb.impl.SurveyImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link dataWeb.impl.SurveyImpl#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataWeb.impl.SurveyImpl#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyImpl extends EObjectImpl implements Survey {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final ChartType REPRESENTATION_EDEFAULT = ChartType.TEXT;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ChartType representation = REPRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroPregVF() <em>Numero Preg VF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregVF()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_PREG_VF_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumeroPregSelect() <em>Numero Preg Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPregSelect()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_PREG_SELECT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, DataWebPackage.SURVEY__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartType getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentation(ChartType newRepresentation) {
		ChartType oldRepresentation = representation;
		representation = newRepresentation == null ? REPRESENTATION_EDEFAULT : newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.SURVEY__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumeroPregVF() {
		/**
		 *
		 * self.question->select(q | q.oclIsKindOf(TrueFalseQuestion))
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Question> question = this.getQuestion();
		final /*@NonInvalid*/ OrderedSetValue BOXED_question = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Question, question);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_Question);
		Iterator<Object> ITERATOR_q = BOXED_question.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_q.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Question q = (Question)ITERATOR_q.next();
			/**
			 * q.oclIsKindOf(TrueFalseQuestion)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_TrueFalseQuestion_0 = idResolver.getClass(DataWebTables.CLSSid_TrueFalseQuestion, null);
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_TrueFalseQuestion_0).booleanValue();
			//
			if (oclIsKindOf) {
				accumulator.add(q);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumeroPregVF(int newNumeroPregVF) {
		// TODO: implement this method to set the 'Numero Preg VF' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumeroPregSelect() {
		/**
		 *
		 * self.question->select(q | q.oclIsKindOf(MCQuestion))
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Question> question = this.getQuestion();
		final /*@NonInvalid*/ OrderedSetValue BOXED_question = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Question, question);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_Question);
		Iterator<Object> ITERATOR_q = BOXED_question.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_q.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Question q = (Question)ITERATOR_q.next();
			/**
			 * q.oclIsKindOf(MCQuestion)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_MCQuestion_0 = idResolver.getClass(DataWebTables.CLSSid_MCQuestion, null);
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, q, TYP_dataWeb_c_c_MCQuestion_0).booleanValue();
			//
			if (oclIsKindOf) {
				accumulator.add(q);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumeroPregSelect(int newNumeroPregSelect) {
		// TODO: implement this method to set the 'Numero Preg Select' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebPackage.SURVEY__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
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
			case DataWebPackage.SURVEY__QUESTION:
				return getQuestion();
			case DataWebPackage.SURVEY__REPRESENTATION:
				return getRepresentation();
			case DataWebPackage.SURVEY__NUMERO_PREG_VF:
				return getNumeroPregVF();
			case DataWebPackage.SURVEY__NUMERO_PREG_SELECT:
				return getNumeroPregSelect();
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
			case DataWebPackage.SURVEY__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends Question>)newValue);
				return;
			case DataWebPackage.SURVEY__REPRESENTATION:
				setRepresentation((ChartType)newValue);
				return;
			case DataWebPackage.SURVEY__NUMERO_PREG_VF:
				setNumeroPregVF((Integer)newValue);
				return;
			case DataWebPackage.SURVEY__NUMERO_PREG_SELECT:
				setNumeroPregSelect((Integer)newValue);
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
			case DataWebPackage.SURVEY__QUESTION:
				getQuestion().clear();
				return;
			case DataWebPackage.SURVEY__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
				return;
			case DataWebPackage.SURVEY__NUMERO_PREG_VF:
				setNumeroPregVF(NUMERO_PREG_VF_EDEFAULT);
				return;
			case DataWebPackage.SURVEY__NUMERO_PREG_SELECT:
				setNumeroPregSelect(NUMERO_PREG_SELECT_EDEFAULT);
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
			case DataWebPackage.SURVEY__QUESTION:
				return question != null && !question.isEmpty();
			case DataWebPackage.SURVEY__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
			case DataWebPackage.SURVEY__NUMERO_PREG_VF:
				return getNumeroPregVF() != NUMERO_PREG_VF_EDEFAULT;
			case DataWebPackage.SURVEY__NUMERO_PREG_SELECT:
				return getNumeroPregSelect() != NUMERO_PREG_SELECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (representation: ");
		result.append(representation);
		result.append(')');
		return result.toString();
	}

} //SurveyImpl
