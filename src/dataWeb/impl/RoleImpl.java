/**
 */
package dataWeb.impl;

import dataWeb.Application;
import dataWeb.DataWebPackage;
import dataWeb.DataWebTables;
import dataWeb.Entity;
import dataWeb.EntityPage;
import dataWeb.Page;
import dataWeb.PermissionType;
import dataWeb.Role;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
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

import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataWeb.impl.RoleImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link dataWeb.impl.RoleImpl#getAccessiblePages <em>Accessible Pages</em>}</li>
 *   <li>{@link dataWeb.impl.RoleImpl#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}</li>
 *   <li>{@link dataWeb.impl.RoleImpl#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
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
	 * The default value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionType PERMISSIONS_EDEFAULT = PermissionType.READ;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected PermissionType permissions = PERMISSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessiblePages() <em>Accessible Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessiblePages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> accessiblePages;

	/**
	 * The default value of the '{@link #getNumeroEntidadesAccesibles() <em>Numero Entidades Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEntidadesAccesibles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_ENTIDADES_ACCESIBLES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPaginasMediasAccesibles() <em>Paginas Medias Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginasMediasAccesibles()
	 * @generated
	 * @ordered
	 */
	protected static final double PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionType getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissions(PermissionType newPermissions) {
		PermissionType oldPermissions = permissions;
		permissions = newPermissions == null ? PERMISSIONS_EDEFAULT : newPermissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.ROLE__PERMISSIONS, oldPermissions, permissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getAccessiblePages() {
		if (accessiblePages == null) {
			accessiblePages = new EObjectResolvingEList<Page>(Page.class, this, DataWebPackage.ROLE__ACCESSIBLE_PAGES);
		}
		return accessiblePages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumeroEntidadesAccesibles() {
		/**
		 *
		 * self.accessiblePages->select(p | p.oclIsKindOf(EntityPage))
		 * ->collect(p | p.oclAsType(EntityPage).entity)
		 * ->asSet()
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Page> accessiblePages = this.getAccessiblePages();
		final /*@NonInvalid*/ OrderedSetValue BOXED_accessiblePages = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Page, accessiblePages);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DataWebTables.ORD_CLSSid_Page);
		Iterator<Object> ITERATOR_p = BOXED_accessiblePages.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_p.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
			/**
			 * p.oclIsKindOf(EntityPage)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_EntityPage_0 = idResolver.getClass(DataWebTables.CLSSid_EntityPage, null);
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, p, TYP_dataWeb_c_c_EntityPage_0).booleanValue();
			//
			if (oclIsKindOf) {
				accumulator.add(p);
			}
		}
		/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DataWebTables.SEQ_CLSSid_Entity);
		Iterator<Object> ITERATOR_p_0 = select.iterator();
		/*@Thrown*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_p_0.hasNext()) {
				collect = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Page p_0 = (Page)ITERATOR_p_0.next();
			/**
			 * p.oclAsType(EntityPage).entity
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_EntityPage_1 = idResolver.getClass(DataWebTables.CLSSid_EntityPage, null);
			final /*@Thrown*/ EntityPage oclAsType = (EntityPage)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, p_0, TYP_dataWeb_c_c_EntityPage_1);
			final /*@Thrown*/ Entity entity = oclAsType.getEntity();
			//
			accumulator_0.add(entity);
		}
		final /*@Thrown*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
		final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(asSet);
		final /*@Thrown*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumeroEntidadesAccesibles(int newNumeroEntidadesAccesibles) {
		// TODO: implement this method to set the 'Numero Entidades Accesibles' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPaginasMediasAccesibles() {
		/**
		 *
		 * let totalPaginas : Integer[1] = self.accessiblePages->size()
		 * in
		 *   let
		 *     app : Application[1] = Application.allInstances()
		 *     ->any(a | a.role->includes(self))
		 *   in
		 *     let totalRoles : Integer[1] = app.role->size()
		 *     in totalPaginas / totalRoles
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Page> accessiblePages = this.getAccessiblePages();
		final /*@NonInvalid*/ OrderedSetValue BOXED_accessiblePages = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Page, accessiblePages);
		final /*@NonInvalid*/ IntegerValue totalPaginas = CollectionSizeOperation.INSTANCE.evaluate(BOXED_accessiblePages);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_Application_0 = idResolver.getClass(DataWebTables.CLSSid_Application, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, DataWebTables.SET_CLSSid_Application, TYP_dataWeb_c_c_Application_0);
		Iterator<Object> ITERATOR_a = allInstances.iterator();
		/*@NonInvalid*/ Application app;
		while (true) {
			if (!ITERATOR_a.hasNext()) {
				throw new InvalidValueException("Nothing to return for ''any''");
			}
			/*@NonInvalid*/ Application a = (Application)ITERATOR_a.next();
			/**
			 * a.role->includes(self)
			 */
			final /*@NonInvalid*/ List<Role> role = a.getRole();
			final /*@NonInvalid*/ OrderedSetValue BOXED_role = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Role, role);
			final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_role, this).booleanValue();
			//
			if (includes) {			// Carry on till something found
				app = a;
				break;
			}
		}
		final /*@NonInvalid*/ List<Role> role_0 = app.getRole();
		final /*@NonInvalid*/ OrderedSetValue BOXED_role_0 = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Role, role_0);
		final /*@NonInvalid*/ IntegerValue totalRoles = CollectionSizeOperation.INSTANCE.evaluate(BOXED_role_0);
		final /*@Thrown*/ RealValue quot = NumericDivideOperation.INSTANCE.evaluate(totalPaginas, totalRoles);
		final /*@Thrown*/ double ECORE_quot = ValueUtil.doubleValueOf(quot);
		return ECORE_quot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginasMediasAccesibles(double newPaginasMediasAccesibles) {
		// TODO: implement this method to set the 'Paginas Medias Accesibles' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R12_AdminMustSeeSurvey(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Role::R12_AdminMustSeeSurvey";
		try {
			/**
			 *
			 * inv R12_AdminMustSeeSurvey:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.permissions = PermissionType::ADMIN implies
			 *         self.accessiblePages->exists(p | p.oclIsKindOf(SurveyPage))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DataWebPackage.Literals.ROLE___R12_ADMIN_MUST_SEE_SURVEY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DataWebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ PermissionType permissions = this.getPermissions();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_permissions = permissions == null ? null : DataWebTables.ENUMid_PermissionType.getEnumerationLiteralId(ClassUtil.nonNullState(permissions.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_permissions == DataWebTables.ELITid_ADMIN;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Page> accessiblePages = this.getAccessiblePages();
						final /*@NonInvalid*/ OrderedSetValue BOXED_accessiblePages = idResolver.createOrderedSetOfAll(DataWebTables.ORD_CLSSid_Page, accessiblePages);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_p = BOXED_accessiblePages.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_p.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
							/**
							 * p.oclIsKindOf(SurveyPage)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_dataWeb_c_c_SurveyPage_0 = idResolver.getClass(DataWebTables.CLSSid_SurveyPage, null);
							final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, p, TYP_dataWeb_c_c_SurveyPage_0).booleanValue();
							//
							if (oclIsKindOf) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (!oclIsKindOf) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (exists == null) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebPackage.ROLE__NAME:
				return getName();
			case DataWebPackage.ROLE__PERMISSIONS:
				return getPermissions();
			case DataWebPackage.ROLE__ACCESSIBLE_PAGES:
				return getAccessiblePages();
			case DataWebPackage.ROLE__NUMERO_ENTIDADES_ACCESIBLES:
				return getNumeroEntidadesAccesibles();
			case DataWebPackage.ROLE__PAGINAS_MEDIAS_ACCESIBLES:
				return getPaginasMediasAccesibles();
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
			case DataWebPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case DataWebPackage.ROLE__PERMISSIONS:
				setPermissions((PermissionType)newValue);
				return;
			case DataWebPackage.ROLE__ACCESSIBLE_PAGES:
				getAccessiblePages().clear();
				getAccessiblePages().addAll((Collection<? extends Page>)newValue);
				return;
			case DataWebPackage.ROLE__NUMERO_ENTIDADES_ACCESIBLES:
				setNumeroEntidadesAccesibles((Integer)newValue);
				return;
			case DataWebPackage.ROLE__PAGINAS_MEDIAS_ACCESIBLES:
				setPaginasMediasAccesibles((Double)newValue);
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
			case DataWebPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataWebPackage.ROLE__PERMISSIONS:
				setPermissions(PERMISSIONS_EDEFAULT);
				return;
			case DataWebPackage.ROLE__ACCESSIBLE_PAGES:
				getAccessiblePages().clear();
				return;
			case DataWebPackage.ROLE__NUMERO_ENTIDADES_ACCESIBLES:
				setNumeroEntidadesAccesibles(NUMERO_ENTIDADES_ACCESIBLES_EDEFAULT);
				return;
			case DataWebPackage.ROLE__PAGINAS_MEDIAS_ACCESIBLES:
				setPaginasMediasAccesibles(PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT);
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
			case DataWebPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataWebPackage.ROLE__PERMISSIONS:
				return permissions != PERMISSIONS_EDEFAULT;
			case DataWebPackage.ROLE__ACCESSIBLE_PAGES:
				return accessiblePages != null && !accessiblePages.isEmpty();
			case DataWebPackage.ROLE__NUMERO_ENTIDADES_ACCESIBLES:
				return getNumeroEntidadesAccesibles() != NUMERO_ENTIDADES_ACCESIBLES_EDEFAULT;
			case DataWebPackage.ROLE__PAGINAS_MEDIAS_ACCESIBLES:
				return getPaginasMediasAccesibles() != PAGINAS_MEDIAS_ACCESIBLES_EDEFAULT;
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
			case DataWebPackage.ROLE___R12_ADMIN_MUST_SEE_SURVEY__DIAGNOSTICCHAIN_MAP:
				return R12_AdminMustSeeSurvey((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", permissions: ");
		result.append(permissions);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
