/**
 */
package dataWeb.impl;

import dataWeb.Attribute;
import dataWeb.DataWebPackage;
import dataWeb.DataWebTables;
import dataWeb.Entity;
import dataWeb.PageConfig;
import dataWeb.PageType;
import dataWeb.Reference;

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

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.EntityImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dataWeb.impl.EntityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link dataWeb.impl.EntityImpl#getPageconfig <em>Pageconfig</em>}</li>
 *   <li>{@link dataWeb.impl.EntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getPageconfig() <em>Pageconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<PageConfig> pageconfig;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, DataWebPackage.ENTITY__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, DataWebPackage.ENTITY__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PageConfig> getPageconfig() {
		if (pageconfig == null) {
			pageconfig = new EObjectContainmentEList<PageConfig>(PageConfig.class, this, DataWebPackage.ENTITY__PAGECONFIG);
		}
		return pageconfig;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R08_UniqueIndexPerEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::R08_UniqueIndexPerEntity";
		try {
			/**
			 *
			 * inv R08_UniqueIndexPerEntity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = pageconfig->select(pc |
			 *           (pc.pageType = PageType::Index
			 *           ))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.ENTITY___R08_UNIQUE_INDEX_PER_ENTITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<PageConfig> pageconfig = this.getPageconfig();
				final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_PageConfig);
				Iterator<Object> ITERATOR_pc = BOXED_pageconfig.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_pc.hasNext()) {
						select = accumulator;
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
						accumulator.add(pc);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, DataWebTables.INT_1).booleanValue();
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
	public boolean R03_IndiceDetalle(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::R03_IndiceDetalle";
		try {
			/**
			 *
			 * inv R03_IndiceDetalle:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = (
			 *           pageconfig->exists(pc | pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex) implies
			 *           pageconfig->exists(pc | pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail)
			 *         ) and
			 *         (
			 *           pageconfig->exists(pc | pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail) implies
			 *           pageconfig->exists(pc | pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex)
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.ENTITY___R03_INDICE_DETALLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_implies;
					try {
						/*@Caught*/ Object CAUGHT_exists;
						try {
							final /*@NonInvalid*/ List<PageConfig> pageconfig = this.getPageconfig();
							final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_pc = BOXED_pageconfig.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_pc.hasNext()) {
									if (accumulator == null) {
										exists = null;
									}
									else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ PageConfig pc = (PageConfig)ITERATOR_pc.next();
								/**
								 * pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex
								 */
								final /*@NonInvalid*/ PageType pageType_0 = pc.getPageType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType_0 = pageType_0 == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType_0.getName()));
								final /*@NonInvalid*/ boolean eq = BOXED_pageType_0 == DataWebTables.ELITid_Index;
								final /*@NonInvalid*/ Boolean or;
								if (eq) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean eq_0 = BOXED_pageType_0 == DataWebTables.ELITid_ExtendedIndex;
									if (eq_0) {
										or = ValueUtil.TRUE_VALUE;
									}
									else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
								//
								if (or == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break;														// Stop immediately
								}
								else if (or == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
									;															// Carry on
								}
								else if (or == null) {								// Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null;										// Cache a null failure
									}
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						}
						catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean implies;
						if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
							implies = ValueUtil.TRUE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_exists_0;
							try {
								final /*@NonInvalid*/ List<PageConfig> pageconfig_0 = this.getPageconfig();
								final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig_0 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig_0);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_pc_0 = BOXED_pageconfig_0.iterator();
								/*@Thrown*/ Boolean exists_0;
								while (true) {
									if (!ITERATOR_pc_0.hasNext()) {
										if (accumulator_0 == null) {
											exists_0 = null;
										}
										else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											exists_0 = ValueUtil.FALSE_VALUE;
										}
										else {
											throw (InvalidValueException)accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ PageConfig pc_0 = (PageConfig)ITERATOR_pc_0.next();
									/**
									 * pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail
									 */
									final /*@NonInvalid*/ PageType pageType_2 = pc_0.getPageType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType_2 = pageType_2 == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType_2.getName()));
									final /*@NonInvalid*/ boolean eq_1 = BOXED_pageType_2 == DataWebTables.ELITid_Detail;
									final /*@NonInvalid*/ Boolean or_0;
									if (eq_1) {
										or_0 = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean eq_2 = BOXED_pageType_2 == DataWebTables.ELITid_IndexDetail;
										if (eq_2) {
											or_0 = ValueUtil.TRUE_VALUE;
										}
										else {
											or_0 = ValueUtil.FALSE_VALUE;
										}
									}
									//
									if (or_0 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
										exists_0 = ValueUtil.TRUE_VALUE;
										break;														// Stop immediately
									}
									else if (or_0 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
										;															// Carry on
									}
									else if (or_0 == null) {								// Abnormal null body evaluation result
										if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											accumulator_0 = null;										// Cache a null failure
										}
									}
									else {															// Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
									}
								}
								CAUGHT_exists_0 = exists_0;
							}
							catch (Exception e) {
								CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_exists_0 == ValueUtil.TRUE_VALUE) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_exists instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_exists;
								}
								if (CAUGHT_exists_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_exists_0;
								}
								if ((CAUGHT_exists == null) || (CAUGHT_exists_0 == null)) {
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
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_implies_0;
						try {
							/*@Caught*/ Object CAUGHT_exists_1;
							try {
								final /*@NonInvalid*/ List<PageConfig> pageconfig_1 = this.getPageconfig();
								final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig_1 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig_1);
								/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_pc_1 = BOXED_pageconfig_1.iterator();
								/*@Thrown*/ Boolean exists_1;
								while (true) {
									if (!ITERATOR_pc_1.hasNext()) {
										if (accumulator_1 == null) {
											exists_1 = null;
										}
										else if (accumulator_1 == ValueUtil.FALSE_VALUE) {
											exists_1 = ValueUtil.FALSE_VALUE;
										}
										else {
											throw (InvalidValueException)accumulator_1;
										}
										break;
									}
									/*@NonInvalid*/ PageConfig pc_1 = (PageConfig)ITERATOR_pc_1.next();
									/**
									 * pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail
									 */
									final /*@NonInvalid*/ PageType pageType_4 = pc_1.getPageType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType_4 = pageType_4 == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType_4.getName()));
									final /*@NonInvalid*/ boolean eq_3 = BOXED_pageType_4 == DataWebTables.ELITid_Detail;
									final /*@NonInvalid*/ Boolean or_1;
									if (eq_3) {
										or_1 = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean eq_4 = BOXED_pageType_4 == DataWebTables.ELITid_IndexDetail;
										if (eq_4) {
											or_1 = ValueUtil.TRUE_VALUE;
										}
										else {
											or_1 = ValueUtil.FALSE_VALUE;
										}
									}
									//
									if (or_1 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
										exists_1 = ValueUtil.TRUE_VALUE;
										break;														// Stop immediately
									}
									else if (or_1 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
										;															// Carry on
									}
									else if (or_1 == null) {								// Abnormal null body evaluation result
										if (accumulator_1 == ValueUtil.FALSE_VALUE) {
											accumulator_1 = null;										// Cache a null failure
										}
									}
									else {															// Impossible badly typed result
										accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
									}
								}
								CAUGHT_exists_1 = exists_1;
							}
							catch (Exception e) {
								CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean implies_0;
							if (CAUGHT_exists_1 == ValueUtil.FALSE_VALUE) {
								implies_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_exists_2;
								try {
									final /*@NonInvalid*/ List<PageConfig> pageconfig_2 = this.getPageconfig();
									final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig_2 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig_2);
									/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_pc_2 = BOXED_pageconfig_2.iterator();
									/*@Thrown*/ Boolean exists_2;
									while (true) {
										if (!ITERATOR_pc_2.hasNext()) {
											if (accumulator_2 == null) {
												exists_2 = null;
											}
											else if (accumulator_2 == ValueUtil.FALSE_VALUE) {
												exists_2 = ValueUtil.FALSE_VALUE;
											}
											else {
												throw (InvalidValueException)accumulator_2;
											}
											break;
										}
										/*@NonInvalid*/ PageConfig pc_2 = (PageConfig)ITERATOR_pc_2.next();
										/**
										 * pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex
										 */
										final /*@NonInvalid*/ PageType pageType_6 = pc_2.getPageType();
										final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType_6 = pageType_6 == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType_6.getName()));
										final /*@NonInvalid*/ boolean eq_5 = BOXED_pageType_6 == DataWebTables.ELITid_Index;
										final /*@NonInvalid*/ Boolean or_2;
										if (eq_5) {
											or_2 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean eq_6 = BOXED_pageType_6 == DataWebTables.ELITid_ExtendedIndex;
											if (eq_6) {
												or_2 = ValueUtil.TRUE_VALUE;
											}
											else {
												or_2 = ValueUtil.FALSE_VALUE;
											}
										}
										//
										if (or_2 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
											exists_2 = ValueUtil.TRUE_VALUE;
											break;														// Stop immediately
										}
										else if (or_2 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
											;															// Carry on
										}
										else if (or_2 == null) {								// Abnormal null body evaluation result
											if (accumulator_2 == ValueUtil.FALSE_VALUE) {
												accumulator_2 = null;										// Cache a null failure
											}
										}
										else {															// Impossible badly typed result
											accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
										}
									}
									CAUGHT_exists_2 = exists_2;
								}
								catch (Exception e) {
									CAUGHT_exists_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists_2 == ValueUtil.TRUE_VALUE) {
									implies_0 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_exists_1 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_exists_1;
									}
									if (CAUGHT_exists_2 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_exists_2;
									}
									if ((CAUGHT_exists_1 == null) || (CAUGHT_exists_2 == null)) {
										implies_0 = null;
									}
									else {
										implies_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies_0 = implies_0;
						}
						catch (Exception e) {
							CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_implies instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_implies;
							}
							if (CAUGHT_implies_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_implies_0;
							}
							if ((CAUGHT_implies == null) || (CAUGHT_implies_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public boolean R02_CRUDIncompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::R02_CRUDIncompatible";
		try {
			/**
			 *
			 * inv R02_CRUDIncompatible:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = pageconfig->exists(pc | pc.pageType = PageType::CRUD) implies
			 *         pageconfig->forAll(pc | pc.pageType = PageType::CRUD)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.ENTITY___R02_CRUD_INCOMPATIBLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<PageConfig> pageconfig_0 = this.getPageconfig();
					final /*@NonInvalid*/ OrderedSetValue BOXED_pageconfig_0 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_PageConfig, pageconfig_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_pc = BOXED_pageconfig_0.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_pc.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ PageConfig pc = (PageConfig)ITERATOR_pc.next();
						/**
						 * pc.pageType = PageType::CRUD
						 */
						final /*@NonInvalid*/ PageType pageType = pc.getPageType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType = pageType == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_pageType == DataWebTables.ELITid_CRUD;
						//
						if (eq) {					// Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (!eq) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_pc_0 = BOXED_pageconfig_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_pc_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ PageConfig pc_0 = (PageConfig)ITERATOR_pc_0.next();
							/**
							 * pc.pageType = PageType::CRUD
							 */
							final /*@NonInvalid*/ PageType pageType_0 = pc_0.getPageType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_pageType_0 = pageType_0 == null ? null : DataWebTables.ENUMid_PageType.getEnumerationLiteralId(ClassUtil.nonNullState(pageType_0.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_pageType_0 == DataWebTables.ELITid_CRUD;
							//
							if (!eq_0) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (eq_0) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if ((exists == null) || (forAll == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
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
	public boolean R05_NoSelfReference(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::R05_NoSelfReference";
		try {
			/**
			 *
			 * inv R05_NoSelfReference:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = reference->forAll(ref | ref.name <> name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.ENTITY___R05_NO_SELF_REFERENCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Reference> reference = this.getReference();
				final /*@NonInvalid*/ OrderedSetValue BOXED_reference = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Reference, reference);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_ref = BOXED_reference.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ref.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Reference ref = (Reference)ITERATOR_ref.next();
					/**
					 * ref.name <> name
					 */
					final /*@NonInvalid*/ String name = ref.getName();
					final /*@NonInvalid*/ String name_0 = this.getName();
					final /*@NonInvalid*/ boolean ne = (name != null) ? !name.equals(name_0) : (name_0 != null);
					//
					if (!ne) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (ne) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
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
			case DataWebPackage.ENTITY__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case DataWebPackage.ENTITY__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case DataWebPackage.ENTITY__PAGECONFIG:
				return ((InternalEList<?>)getPageconfig()).basicRemove(otherEnd, msgs);
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
			case DataWebPackage.ENTITY__ATTRIBUTE:
				return getAttribute();
			case DataWebPackage.ENTITY__REFERENCE:
				return getReference();
			case DataWebPackage.ENTITY__PAGECONFIG:
				return getPageconfig();
			case DataWebPackage.ENTITY__NAME:
				return getName();
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
			case DataWebPackage.ENTITY__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DataWebPackage.ENTITY__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case DataWebPackage.ENTITY__PAGECONFIG:
				getPageconfig().clear();
				getPageconfig().addAll((Collection<? extends PageConfig>)newValue);
				return;
			case DataWebPackage.ENTITY__NAME:
				setName((String)newValue);
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
			case DataWebPackage.ENTITY__ATTRIBUTE:
				getAttribute().clear();
				return;
			case DataWebPackage.ENTITY__REFERENCE:
				getReference().clear();
				return;
			case DataWebPackage.ENTITY__PAGECONFIG:
				getPageconfig().clear();
				return;
			case DataWebPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
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
			case DataWebPackage.ENTITY__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case DataWebPackage.ENTITY__REFERENCE:
				return reference != null && !reference.isEmpty();
			case DataWebPackage.ENTITY__PAGECONFIG:
				return pageconfig != null && !pageconfig.isEmpty();
			case DataWebPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case DataWebPackage.ENTITY___R08_UNIQUE_INDEX_PER_ENTITY__DIAGNOSTICCHAIN_MAP:
				return R08_UniqueIndexPerEntity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DataWebPackage.ENTITY___R03_INDICE_DETALLE__DIAGNOSTICCHAIN_MAP:
				return R03_IndiceDetalle((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DataWebPackage.ENTITY___R02_CRUD_INCOMPATIBLE__DIAGNOSTICCHAIN_MAP:
				return R02_CRUDIncompatible((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DataWebPackage.ENTITY___R05_NO_SELF_REFERENCE__DIAGNOSTICCHAIN_MAP:
				return R05_NoSelfReference((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //EntityImpl
