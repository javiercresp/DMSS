/**
 */
package dataWeb.util;

import dataWeb.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebPackage
 * @generated
 */
public class DataWebValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DataWebValidator INSTANCE = new DataWebValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dataWeb";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R04 Social RSS' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__R04_SOCIAL_RSS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R0 6b Min Survey' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__R0_6B_MIN_SURVEY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R01 Unica Index Home' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__R01_UNICA_INDEX_HOME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R08 Unique Index Per Entity' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__R08_UNIQUE_INDEX_PER_ENTITY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R03 Indice Detalle' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__R03_INDICE_DETALLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R02 CRUD Incompatible' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__R02_CRUD_INCOMPATIBLE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R05 No Self Reference' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__R05_NO_SELF_REFERENCE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R09 Valid Index Attributes' of 'Page Config'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE_CONFIG__R09_VALID_INDEX_ATTRIBUTES = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R07 Responses Defined' of 'Survey Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURVEY_PAGE__R07_RESPONSES_DEFINED = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R12 Admin Must See Survey' of 'Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE__R12_ADMIN_MUST_SEE_SURVEY = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R10 Mandatory MC Questions Have Options' of 'MC Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MC_QUESTION__R10_MANDATORY_MC_QUESTIONS_HAVE_OPTIONS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R11 Mandatory TF Questions Have Answer' of 'True False Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRUE_FALSE_QUESTION__R11_MANDATORY_TF_QUESTIONS_HAVE_ANSWER = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DataWebPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DataWebPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case DataWebPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case DataWebPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case DataWebPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case DataWebPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case DataWebPackage.PAGE_CONFIG:
				return validatePageConfig((PageConfig)value, diagnostics, context);
			case DataWebPackage.ENTITY_PAGE:
				return validateEntityPage((EntityPage)value, diagnostics, context);
			case DataWebPackage.SURVEY_PAGE:
				return validateSurveyPage((SurveyPage)value, diagnostics, context);
			case DataWebPackage.SOCIAL_CONTENT:
				return validateSocialContent((SocialContent)value, diagnostics, context);
			case DataWebPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case DataWebPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case DataWebPackage.PAGINATION:
				return validatePagination((Pagination)value, diagnostics, context);
			case DataWebPackage.SURVEY:
				return validateSurvey((Survey)value, diagnostics, context);
			case DataWebPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case DataWebPackage.MC_QUESTION:
				return validateMCQuestion((MCQuestion)value, diagnostics, context);
			case DataWebPackage.TRUE_FALSE_QUESTION:
				return validateTrueFalseQuestion((TrueFalseQuestion)value, diagnostics, context);
			case DataWebPackage.SHORT_QUESTION:
				return validateShortQuestion((ShortQuestion)value, diagnostics, context);
			case DataWebPackage.ANSWER_OPTION:
				return validateAnswerOption((AnswerOption)value, diagnostics, context);
			case DataWebPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case DataWebPackage.PAGE_TYPE:
				return validatePageType((PageType)value, diagnostics, context);
			case DataWebPackage.SOCIAL_TYPE:
				return validateSocialType((SocialType)value, diagnostics, context);
			case DataWebPackage.CHART_TYPE:
				return validateChartType((ChartType)value, diagnostics, context);
			case DataWebPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			case DataWebPackage.PERMISSION_TYPE:
				return validatePermissionType((PermissionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_R01_UnicaIndexHome(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_R04_SocialRSS(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_R06b_MinSurvey(application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R01_UnicaIndexHome constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_R01_UnicaIndexHome(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.R01_UnicaIndexHome(diagnostics, context);
	}

	/**
	 * Validates the R04_SocialRSS constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_R04_SocialRSS(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.R04_SocialRSS(diagnostics, context);
	}

	/**
	 * Validates the R06b_MinSurvey constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_R06b_MinSurvey(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.R06b_MinSurvey(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_R05_NoSelfReference(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_R08_UniqueIndexPerEntity(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_R03_IndiceDetalle(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_R02_CRUDIncompatible(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R05_NoSelfReference constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_R05_NoSelfReference(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.R05_NoSelfReference(diagnostics, context);
	}

	/**
	 * Validates the R08_UniqueIndexPerEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_R08_UniqueIndexPerEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.R08_UniqueIndexPerEntity(diagnostics, context);
	}

	/**
	 * Validates the R03_IndiceDetalle constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_R03_IndiceDetalle(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.R03_IndiceDetalle(diagnostics, context);
	}

	/**
	 * Validates the R02_CRUDIncompatible constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_R02_CRUDIncompatible(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.R02_CRUDIncompatible(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageConfig(PageConfig pageConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageConfig, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageConfig, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageConfig_R09_ValidIndexAttributes(pageConfig, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R09_ValidIndexAttributes constraint of '<em>Page Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageConfig_R09_ValidIndexAttributes(PageConfig pageConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pageConfig.R09_ValidIndexAttributes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityPage(EntityPage entityPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurveyPage(SurveyPage surveyPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(surveyPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(surveyPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurveyPage_R07_ResponsesDefined(surveyPage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R07_ResponsesDefined constraint of '<em>Survey Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurveyPage_R07_ResponsesDefined(SurveyPage surveyPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surveyPage.R07_ResponsesDefined(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialContent(SocialContent socialContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(socialContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateRole_R12_AdminMustSeeSurvey(role, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R12_AdminMustSeeSurvey constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_R12_AdminMustSeeSurvey(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return role.R12_AdminMustSeeSurvey(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagination(Pagination pagination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurvey(Survey survey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(survey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(question, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCQuestion(MCQuestion mcQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mcQuestion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mcQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateMCQuestion_R10_MandatoryMCQuestionsHaveOptions(mcQuestion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R10_MandatoryMCQuestionsHaveOptions constraint of '<em>MC Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCQuestion_R10_MandatoryMCQuestionsHaveOptions(MCQuestion mcQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mcQuestion.R10_MandatoryMCQuestionsHaveOptions(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseQuestion(TrueFalseQuestion trueFalseQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trueFalseQuestion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trueFalseQuestion, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrueFalseQuestion_R11_MandatoryTFQuestionsHaveAnswer(trueFalseQuestion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R11_MandatoryTFQuestionsHaveAnswer constraint of '<em>True False Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueFalseQuestion_R11_MandatoryTFQuestionsHaveAnswer(TrueFalseQuestion trueFalseQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trueFalseQuestion.R11_MandatoryTFQuestionsHaveAnswer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortQuestion(ShortQuestion shortQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerOption(AnswerOption answerOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(answerOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageType(PageType pageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialType(SocialType socialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChartType(ChartType chartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionType(PermissionType permissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DataWebValidator
