/**
 */
package dataWeb.impl;

import dataWeb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebFactoryImpl extends EFactoryImpl implements DataWebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataWebFactory init() {
		try {
			DataWebFactory theDataWebFactory = (DataWebFactory)EPackage.Registry.INSTANCE.getEFactory(DataWebPackage.eNS_URI);
			if (theDataWebFactory != null) {
				return theDataWebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataWebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataWebPackage.APPLICATION: return createApplication();
			case DataWebPackage.ENTITY: return createEntity();
			case DataWebPackage.REFERENCE: return createReference();
			case DataWebPackage.ATTRIBUTE: return createAttribute();
			case DataWebPackage.PAGE_CONFIG: return createPageConfig();
			case DataWebPackage.SURVEY_PAGE: return createSurveyPage();
			case DataWebPackage.SOCIAL_CONTENT: return createSocialContent();
			case DataWebPackage.ROLE: return createRole();
			case DataWebPackage.LINK: return createLink();
			case DataWebPackage.PAGINATION: return createPagination();
			case DataWebPackage.SURVEY: return createSurvey();
			case DataWebPackage.MC_QUESTION: return createMCQuestion();
			case DataWebPackage.TRUE_FALSE_QUESTION: return createTrueFalseQuestion();
			case DataWebPackage.SHORT_QUESTION: return createShortQuestion();
			case DataWebPackage.ANSWER_OPTION: return createAnswerOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case DataWebPackage.PAGE_TYPE:
				return createPageTypeFromString(eDataType, initialValue);
			case DataWebPackage.SOCIAL_TYPE:
				return createSocialTypeFromString(eDataType, initialValue);
			case DataWebPackage.CHART_TYPE:
				return createChartTypeFromString(eDataType, initialValue);
			case DataWebPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case DataWebPackage.PERMISSION_TYPE:
				return createPermissionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case DataWebPackage.PAGE_TYPE:
				return convertPageTypeToString(eDataType, instanceValue);
			case DataWebPackage.SOCIAL_TYPE:
				return convertSocialTypeToString(eDataType, instanceValue);
			case DataWebPackage.CHART_TYPE:
				return convertChartTypeToString(eDataType, instanceValue);
			case DataWebPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case DataWebPackage.PERMISSION_TYPE:
				return convertPermissionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageConfig createPageConfig() {
		PageConfigImpl pageConfig = new PageConfigImpl();
		return pageConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyPage createSurveyPage() {
		SurveyPageImpl surveyPage = new SurveyPageImpl();
		return surveyPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialContent createSocialContent() {
		SocialContentImpl socialContent = new SocialContentImpl();
		return socialContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pagination createPagination() {
		PaginationImpl pagination = new PaginationImpl();
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCQuestion createMCQuestion() {
		MCQuestionImpl mcQuestion = new MCQuestionImpl();
		return mcQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrueFalseQuestion createTrueFalseQuestion() {
		TrueFalseQuestionImpl trueFalseQuestion = new TrueFalseQuestionImpl();
		return trueFalseQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShortQuestion createShortQuestion() {
		ShortQuestionImpl shortQuestion = new ShortQuestionImpl();
		return shortQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnswerOption createAnswerOption() {
		AnswerOptionImpl answerOption = new AnswerOptionImpl();
		return answerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType createPageTypeFromString(EDataType eDataType, String initialValue) {
		PageType result = PageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialType createSocialTypeFromString(EDataType eDataType, String initialValue) {
		SocialType result = SocialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartTypeFromString(EDataType eDataType, String initialValue) {
		ChartType result = ChartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType createPermissionTypeFromString(EDataType eDataType, String initialValue) {
		PermissionType result = PermissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataWebPackage getDataWebPackage() {
		return (DataWebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataWebPackage getPackage() {
		return DataWebPackage.eINSTANCE;
	}

} //DataWebFactoryImpl
