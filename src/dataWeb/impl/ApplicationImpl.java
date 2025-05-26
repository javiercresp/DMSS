/**
 */
package dataWeb.impl;

import dataWeb.Application;
import dataWeb.DataWebPackage;
import dataWeb.DataWebTables;
import dataWeb.Entity;
import dataWeb.Page;
import dataWeb.PageConfig;
import dataWeb.PageType;
import dataWeb.Role;
import dataWeb.SocialContent;
import dataWeb.SocialType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataWeb.impl.ApplicationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dataWeb.impl.ApplicationImpl#getPage <em>Page</em>}</li>
 *   <li>{@link dataWeb.impl.ApplicationImpl#getSocialcontent <em>Socialcontent</em>}</li>
 *   <li>{@link dataWeb.impl.ApplicationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The cached value of the '{@link #getSocialcontent() <em>Socialcontent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialcontent()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialContent> socialcontent;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, DataWebPackage.APPLICATION__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, DataWebPackage.APPLICATION__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SocialContent> getSocialcontent() {
		if (socialcontent == null) {
			socialcontent = new EObjectContainmentEList<SocialContent>(SocialContent.class, this, DataWebPackage.APPLICATION__SOCIALCONTENT);
		}
		return socialcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, DataWebPackage.APPLICATION__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R04_SocialRSS(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::R04_SocialRSS";
		try {
			/**
			 *
			 * inv R04_SocialRSS:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = socialcontent->select(sc |
			 *           (sc.type = SocialType::Twitter or sc.type = SocialType::Facebook
			 *           ))
			 *         ->size() >= 1 and
			 *         socialcontent->select(sc | (sc.type = SocialType::RSS))
			 *         ->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.APPLICATION___R04_SOCIAL_RSS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<SocialContent> socialcontent_0 = this.getSocialcontent();
					final /*@NonInvalid*/ OrderedSetValue BOXED_socialcontent_0 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_SocialContent, socialcontent_0);
					/*@Caught*/ Object CAUGHT_ge;
					try {
						/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_SocialContent);
						Iterator<Object> ITERATOR_sc = BOXED_socialcontent_0.iterator();
						/*@Thrown*/ OrderedSetValue select;
						while (true) {
							if (!ITERATOR_sc.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ SocialContent sc = (SocialContent)ITERATOR_sc.next();
							/**
							 * sc.type = SocialType::Twitter or sc.type = SocialType::Facebook
							 */
							final /*@NonInvalid*/ SocialType type_0 = sc.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null : DataWebTables.ENUMid_SocialType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type_0 == DataWebTables.ELITid_Twitter;
							final /*@NonInvalid*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_0 = BOXED_type_0 == DataWebTables.ELITid_Facebook;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == null) {
								throw new InvalidValueException("Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
							}
							//
							if (or == ValueUtil.TRUE_VALUE) {
								accumulator.add(sc);
							}
						}
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, DataWebTables.INT_1).booleanValue();
						CAUGHT_ge = ge;
					}
					catch (Exception e) {
						CAUGHT_ge = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_SocialContent);
						Iterator<Object> ITERATOR_sc_0 = BOXED_socialcontent_0.iterator();
						/*@NonInvalid*/ OrderedSetValue select_0;
						while (true) {
							if (!ITERATOR_sc_0.hasNext()) {
								select_0 = accumulator_0;
								break;
							}
							/*@NonInvalid*/ SocialContent sc_0 = (SocialContent)ITERATOR_sc_0.next();
							/**
							 * sc.type = SocialType::RSS
							 */
							final /*@NonInvalid*/ SocialType type_1 = sc_0.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_1 = type_1 == null ? null : DataWebTables.ENUMid_SocialType.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
							final /*@NonInvalid*/ boolean eq_1 = BOXED_type_1 == DataWebTables.ELITid_RSS;
							//
							if (eq_1) {
								accumulator_0.add(sc_0);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
						final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size_0, DataWebTables.INT_1).booleanValue();
						if (!ge_0) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_ge;
							}
							result = ValueUtil.TRUE_VALUE;
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
	public boolean R06b_MinSurvey(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::R06b_MinSurvey";
		try {
			/**
			 *
			 * inv R06b_MinSurvey:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = page->select(p |
			 *           p.oclIsKindOf(SurveyPage))
			 *         ->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.APPLICATION___R0_6B_MIN_SURVEY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Page> page = this.getPage();
				final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Page, page);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_Page);
				Iterator<Object> ITERATOR_p = BOXED_page.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
					/**
					 * p.oclIsKindOf(SurveyPage)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_SurveyPage = idResolver.getClass(DataWebTables.CLSSid_SurveyPage, null);
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, p, TYP_dataWeb_c_c_SurveyPage).booleanValue();
					//
					if (oclIsKindOf) {
						accumulator.add(p);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, DataWebTables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DataWebTables.INT_0).booleanValue();
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
	public boolean R01_UnicaIndexHome(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Application::R01_UnicaIndexHome";
		try {
			/**
			 *
			 * inv R01_UnicaIndexHome:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = entity.pageconfig->select(pc | pc.pageType = PageType::Index)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.APPLICATION___R01_UNICA_INDEX_HOME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Entity> entity = this.getEntity();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entity = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Entity, entity);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DataWebTables.SEQ_CLSSid_PageConfig);
				Iterator<Object> ITERATOR__1 = BOXED_entity.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Entity _1 = (Entity)ITERATOR__1.next();
					/**
					 * pageconfig
					 */
					final /*@NonInvalid*/ List<PageConfig> pageconfig = _1.getPageconfig();
					final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig);
					//
					for (Object value : BOXED_pageconfig.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DataWebTables.SEQ_CLSSid_PageConfig);
				Iterator<Object> ITERATOR_pc = collect.iterator();
				/*@NonInvalid*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_pc.hasNext()) {
						select = accumulator_0;
						break;
					}
					/*@NonInvalid*/ PageConfig pc = (PageConfig)ITERATOR_pc.next();
					/**
					 * pc.pageType = PageType::Index
					 */
					final /*@NonInvalid*/ PageType pageType = pc.getPageType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType = pageType == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_pageType == DataWebTables.ELITid_Index;
					//
					if (eq) {
						accumulator_0.add(pc);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(DataWebTables.INT_1);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DataWebTables.INT_0).booleanValue();
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
			case DataWebPackage.APPLICATION__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case DataWebPackage.APPLICATION__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case DataWebPackage.APPLICATION__SOCIALCONTENT:
				return ((InternalEList<?>)getSocialcontent()).basicRemove(otherEnd, msgs);
			case DataWebPackage.APPLICATION__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case DataWebPackage.APPLICATION__NAME:
				return getName();
			case DataWebPackage.APPLICATION__ENTITY:
				return getEntity();
			case DataWebPackage.APPLICATION__PAGE:
				return getPage();
			case DataWebPackage.APPLICATION__SOCIALCONTENT:
				return getSocialcontent();
			case DataWebPackage.APPLICATION__ROLE:
				return getRole();
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
			case DataWebPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case DataWebPackage.APPLICATION__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case DataWebPackage.APPLICATION__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
			case DataWebPackage.APPLICATION__SOCIALCONTENT:
				getSocialcontent().clear();
				getSocialcontent().addAll((Collection<? extends SocialContent>)newValue);
				return;
			case DataWebPackage.APPLICATION__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
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
			case DataWebPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWebPackage.APPLICATION__ENTITY:
				getEntity().clear();
				return;
			case DataWebPackage.APPLICATION__PAGE:
				getPage().clear();
				return;
			case DataWebPackage.APPLICATION__SOCIALCONTENT:
				getSocialcontent().clear();
				return;
			case DataWebPackage.APPLICATION__ROLE:
				getRole().clear();
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
			case DataWebPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWebPackage.APPLICATION__ENTITY:
				return entity != null && !entity.isEmpty();
			case DataWebPackage.APPLICATION__PAGE:
				return page != null && !page.isEmpty();
			case DataWebPackage.APPLICATION__SOCIALCONTENT:
				return socialcontent != null && !socialcontent.isEmpty();
			case DataWebPackage.APPLICATION__ROLE:
				return role != null && !role.isEmpty();
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
			case DataWebPackage.APPLICATION___R04_SOCIAL_RSS__DIAGNOSTICCHAIN_MAP:
				return R04_SocialRSS((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DataWebPackage.APPLICATION___R0_6B_MIN_SURVEY__DIAGNOSTICCHAIN_MAP:
				return R06b_MinSurvey((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DataWebPackage.APPLICATION___R01_UNICA_INDEX_HOME__DIAGNOSTICCHAIN_MAP:
				return R01_UnicaIndexHome((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
