/**
 */
package dataWeb.impl;

import dataWeb.AnswerOption;
import dataWeb.Application;
import dataWeb.Attribute;
import dataWeb.ChartType;
import dataWeb.DataType;
import dataWeb.DataWebFactory;
import dataWeb.DataWebPackage;
import dataWeb.Entity;
import dataWeb.EntityPage;
import dataWeb.Link;
import dataWeb.MCQuestion;
import dataWeb.Multiplicity;
import dataWeb.Page;
import dataWeb.PageConfig;
import dataWeb.PageType;
import dataWeb.Pagination;
import dataWeb.PermissionType;
import dataWeb.Question;
import dataWeb.Reference;
import dataWeb.Role;
import dataWeb.ShortQuestion;
import dataWeb.SocialContent;
import dataWeb.SocialType;
import dataWeb.Survey;
import dataWeb.SurveyPage;
import dataWeb.TrueFalseQuestion;

import dataWeb.util.DataWebValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebPackageImpl extends EPackageImpl implements DataWebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueFalseQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum socialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dataWeb.DataWebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataWebPackageImpl() {
		super(eNS_URI, DataWebFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataWebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataWebPackage init() {
		if (isInited) return (DataWebPackage)EPackage.Registry.INSTANCE.getEPackage(DataWebPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataWebPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataWebPackageImpl theDataWebPackage = registeredDataWebPackage instanceof DataWebPackageImpl ? (DataWebPackageImpl)registeredDataWebPackage : new DataWebPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataWebPackage.createPackageContents();

		// Initialize created meta-data
		theDataWebPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDataWebPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DataWebValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDataWebPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataWebPackage.eNS_URI, theDataWebPackage);
		return theDataWebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Entity() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Page() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Socialcontent() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Role() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__R04_SocialRSS__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__R06b_MinSurvey__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__R01_UnicaIndexHome__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Attribute() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Reference() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Pageconfig() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntity__R08_UniqueIndexPerEntity__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntity__R03_IndiceDetalle__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntity__R02_CRUDIncompatible__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntity__R05_NoSelfReference__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Name() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Multiplicity() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Link() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Id() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Socialcontent() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_MetaDescription() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_MetaKeywords() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageConfig() {
		return pageConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageConfig_Pagination() {
		return (EReference)pageConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPageConfig_PageType() {
		return (EAttribute)pageConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageConfig_Attribute() {
		return (EReference)pageConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPageConfig__R09_ValidIndexAttributes__DiagnosticChain_Map() {
		return pageConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityPage() {
		return entityPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityPage_Entity() {
		return (EReference)entityPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyPage() {
		return surveyPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyPage_Survey() {
		return (EReference)surveyPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSurveyPage__R07_ResponsesDefined__DiagnosticChain_Map() {
		return surveyPageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialContent() {
		return socialContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSocialContent_Type() {
		return (EAttribute)socialContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSocialContent_Uri() {
		return (EAttribute)socialContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Permissions() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_AccessiblePages() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_NumeroEntidadesAccesibles() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_PaginasMediasAccesibles() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRole__R12_AdminMustSeeSurvey__DiagnosticChain_Map() {
		return roleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Description() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_ExternalURL() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPagination() {
		return paginationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagination_PageSize() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurvey_Question() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_Representation() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_NumeroPregVF() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_NumeroPregSelect() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Id() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Text() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_IsMandatory() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMCQuestion() {
		return mcQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMCQuestion_Option() {
		return (EReference)mcQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMCQuestion__R10_MandatoryMCQuestionsHaveOptions__DiagnosticChain_Map() {
		return mcQuestionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrueFalseQuestion() {
		return trueFalseQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrueFalseQuestion_CorrectAnswer() {
		return (EAttribute)trueFalseQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTrueFalseQuestion__R11_MandatoryTFQuestionsHaveAnswer__DiagnosticChain_Map() {
		return trueFalseQuestionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShortQuestion() {
		return shortQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswerOption() {
		return answerOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswerOption_Text() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPageType() {
		return pageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSocialType() {
		return socialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChartType() {
		return chartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPermissionType() {
		return permissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataWebFactory getDataWebFactory() {
		return (DataWebFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEReference(applicationEClass, APPLICATION__ENTITY);
		createEReference(applicationEClass, APPLICATION__PAGE);
		createEReference(applicationEClass, APPLICATION__SOCIALCONTENT);
		createEReference(applicationEClass, APPLICATION__ROLE);
		createEOperation(applicationEClass, APPLICATION___R04_SOCIAL_RSS__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___R0_6B_MIN_SURVEY__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___R01_UNICA_INDEX_HOME__DIAGNOSTICCHAIN_MAP);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTE);
		createEReference(entityEClass, ENTITY__REFERENCE);
		createEReference(entityEClass, ENTITY__PAGECONFIG);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEOperation(entityEClass, ENTITY___R08_UNIQUE_INDEX_PER_ENTITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___R03_INDICE_DETALLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___R02_CRUD_INCOMPATIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___R05_NO_SELF_REFERENCE__DIAGNOSTICCHAIN_MAP);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);
		createEAttribute(referenceEClass, REFERENCE__MULTIPLICITY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__LINK);
		createEAttribute(pageEClass, PAGE__ID);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__SOCIALCONTENT);
		createEAttribute(pageEClass, PAGE__META_DESCRIPTION);
		createEAttribute(pageEClass, PAGE__META_KEYWORDS);

		pageConfigEClass = createEClass(PAGE_CONFIG);
		createEReference(pageConfigEClass, PAGE_CONFIG__PAGINATION);
		createEAttribute(pageConfigEClass, PAGE_CONFIG__PAGE_TYPE);
		createEReference(pageConfigEClass, PAGE_CONFIG__ATTRIBUTE);
		createEOperation(pageConfigEClass, PAGE_CONFIG___R09_VALID_INDEX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);

		entityPageEClass = createEClass(ENTITY_PAGE);
		createEReference(entityPageEClass, ENTITY_PAGE__ENTITY);

		surveyPageEClass = createEClass(SURVEY_PAGE);
		createEReference(surveyPageEClass, SURVEY_PAGE__SURVEY);
		createEOperation(surveyPageEClass, SURVEY_PAGE___R07_RESPONSES_DEFINED__DIAGNOSTICCHAIN_MAP);

		socialContentEClass = createEClass(SOCIAL_CONTENT);
		createEAttribute(socialContentEClass, SOCIAL_CONTENT__TYPE);
		createEAttribute(socialContentEClass, SOCIAL_CONTENT__URI);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__PERMISSIONS);
		createEReference(roleEClass, ROLE__ACCESSIBLE_PAGES);
		createEAttribute(roleEClass, ROLE__NUMERO_ENTIDADES_ACCESIBLES);
		createEAttribute(roleEClass, ROLE__PAGINAS_MEDIAS_ACCESIBLES);
		createEOperation(roleEClass, ROLE___R12_ADMIN_MUST_SEE_SURVEY__DIAGNOSTICCHAIN_MAP);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__DESCRIPTION);
		createEAttribute(linkEClass, LINK__EXTERNAL_URL);

		paginationEClass = createEClass(PAGINATION);
		createEAttribute(paginationEClass, PAGINATION__PAGE_SIZE);

		surveyEClass = createEClass(SURVEY);
		createEReference(surveyEClass, SURVEY__QUESTION);
		createEAttribute(surveyEClass, SURVEY__REPRESENTATION);
		createEAttribute(surveyEClass, SURVEY__NUMERO_PREG_VF);
		createEAttribute(surveyEClass, SURVEY__NUMERO_PREG_SELECT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__ID);
		createEAttribute(questionEClass, QUESTION__TEXT);
		createEAttribute(questionEClass, QUESTION__IS_MANDATORY);

		mcQuestionEClass = createEClass(MC_QUESTION);
		createEReference(mcQuestionEClass, MC_QUESTION__OPTION);
		createEOperation(mcQuestionEClass, MC_QUESTION___R10_MANDATORY_MC_QUESTIONS_HAVE_OPTIONS__DIAGNOSTICCHAIN_MAP);

		trueFalseQuestionEClass = createEClass(TRUE_FALSE_QUESTION);
		createEAttribute(trueFalseQuestionEClass, TRUE_FALSE_QUESTION__CORRECT_ANSWER);
		createEOperation(trueFalseQuestionEClass, TRUE_FALSE_QUESTION___R11_MANDATORY_TF_QUESTIONS_HAVE_ANSWER__DIAGNOSTICCHAIN_MAP);

		shortQuestionEClass = createEClass(SHORT_QUESTION);

		answerOptionEClass = createEClass(ANSWER_OPTION);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__TEXT);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		pageTypeEEnum = createEEnum(PAGE_TYPE);
		socialTypeEEnum = createEEnum(SOCIAL_TYPE);
		chartTypeEEnum = createEEnum(CHART_TYPE);
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		permissionTypeEEnum = createEEnum(PERMISSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityPageEClass.getESuperTypes().add(this.getPage());
		surveyPageEClass.getESuperTypes().add(this.getPage());
		mcQuestionEClass.getESuperTypes().add(this.getQuestion());
		trueFalseQuestionEClass.getESuperTypes().add(this.getQuestion());
		shortQuestionEClass.getESuperTypes().add(this.getQuestion());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Entity(), this.getEntity(), null, "entity", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Page(), this.getPage(), null, "page", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Socialcontent(), this.getSocialContent(), null, "socialcontent", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Role(), this.getRole(), null, "role", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApplication__R04_SocialRSS__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R04_SocialRSS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__R06b_MinSurvey__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R06b_MinSurvey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__R01_UnicaIndexHome__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R01_UnicaIndexHome", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Reference(), this.getReference(), null, "reference", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Pageconfig(), this.getPageConfig(), null, "pageconfig", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntity__R08_UniqueIndexPerEntity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R08_UniqueIndexPerEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__R03_IndiceDetalle__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R03_IndiceDetalle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__R02_CRUDIncompatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R02_CRUDIncompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__R05_NoSelfReference__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R05_NoSelfReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Multiplicity(), this.getMultiplicity(), "multiplicity", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getDataType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Link(), this.getLink(), null, "link", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Id(), ecorePackage.getEString(), "id", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Socialcontent(), this.getSocialContent(), null, "socialcontent", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_MetaKeywords(), ecorePackage.getEString(), "metaKeywords", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageConfigEClass, PageConfig.class, "PageConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageConfig_Pagination(), this.getPagination(), null, "pagination", null, 0, -1, PageConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageConfig_PageType(), this.getPageType(), "pageType", null, 0, 1, PageConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageConfig_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, PageConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPageConfig__R09_ValidIndexAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R09_ValidIndexAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityPageEClass, EntityPage.class, "EntityPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityPage_Entity(), this.getEntity(), null, "entity", null, 0, 1, EntityPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyPageEClass, SurveyPage.class, "SurveyPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyPage_Survey(), this.getSurvey(), null, "survey", null, 1, -1, SurveyPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSurveyPage__R07_ResponsesDefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R07_ResponsesDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(socialContentEClass, SocialContent.class, "SocialContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialContent_Type(), this.getSocialType(), "type", null, 0, 1, SocialContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialContent_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, SocialContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Permissions(), this.getPermissionType(), "permissions", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_AccessiblePages(), this.getPage(), null, "accessiblePages", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_NumeroEntidadesAccesibles(), ecorePackage.getEInt(), "numeroEntidadesAccesibles", null, 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_PaginasMediasAccesibles(), ecorePackage.getEDouble(), "paginasMediasAccesibles", null, 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRole__R12_AdminMustSeeSurvey__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R12_AdminMustSeeSurvey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_ExternalURL(), ecorePackage.getEString(), "externalURL", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationEClass, Pagination.class, "Pagination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagination_PageSize(), ecorePackage.getEInt(), "pageSize", null, 1, 1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurvey_Question(), this.getQuestion(), null, "question", null, 1, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Representation(), this.getChartType(), "representation", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_NumeroPregVF(), ecorePackage.getEInt(), "numeroPregVF", null, 1, 1, Survey.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_NumeroPregSelect(), ecorePackage.getEInt(), "numeroPregSelect", null, 1, 1, Survey.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Text(), ecorePackage.getEString(), "text", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mcQuestionEClass, MCQuestion.class, "MCQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCQuestion_Option(), this.getAnswerOption(), null, "option", null, 1, -1, MCQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMCQuestion__R10_MandatoryMCQuestionsHaveOptions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R10_MandatoryMCQuestionsHaveOptions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trueFalseQuestionEClass, TrueFalseQuestion.class, "TrueFalseQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrueFalseQuestion_CorrectAnswer(), ecorePackage.getEBoolean(), "correctAnswer", null, 1, 1, TrueFalseQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTrueFalseQuestion__R11_MandatoryTFQuestionsHaveAnswer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R11_MandatoryTFQuestionsHaveAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shortQuestionEClass, ShortQuestion.class, "ShortQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerOptionEClass, AnswerOption.class, "AnswerOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswerOption_Text(), ecorePackage.getEString(), "text", null, 0, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);

		initEEnum(pageTypeEEnum, PageType.class, "PageType");
		addEEnumLiteral(pageTypeEEnum, PageType.CREATE);
		addEEnumLiteral(pageTypeEEnum, PageType.INDEX);
		addEEnumLiteral(pageTypeEEnum, PageType.EXTENDED_INDEX);
		addEEnumLiteral(pageTypeEEnum, PageType.INDEX_DETAIL);
		addEEnumLiteral(pageTypeEEnum, PageType.DETAIL);
		addEEnumLiteral(pageTypeEEnum, PageType.UPDATE);
		addEEnumLiteral(pageTypeEEnum, PageType.DELETE);
		addEEnumLiteral(pageTypeEEnum, PageType.CRUD);

		initEEnum(socialTypeEEnum, SocialType.class, "SocialType");
		addEEnumLiteral(socialTypeEEnum, SocialType.TWITTER);
		addEEnumLiteral(socialTypeEEnum, SocialType.FACEBOOK);
		addEEnumLiteral(socialTypeEEnum, SocialType.RSS);

		initEEnum(chartTypeEEnum, ChartType.class, "ChartType");
		addEEnumLiteral(chartTypeEEnum, ChartType.TEXT);
		addEEnumLiteral(chartTypeEEnum, ChartType.BAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.PIE);

		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY_MANY);

		initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.ADMIN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (applicationEClass,
		   source,
		   new String[] {
			   "constraints", "R01_UnicaIndexHome"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "constraints", "R05_NoSelfReference"
		   });
		addAnnotation
		  (pageConfigEClass,
		   source,
		   new String[] {
			   "constraints", "R09_ValidIndexAttributes"
		   });
		addAnnotation
		  (surveyPageEClass,
		   source,
		   new String[] {
			   "constraints", "R07_ResponsesDefined"
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "constraints", "R12_AdminMustSeeSurvey"
		   });
		addAnnotation
		  (mcQuestionEClass,
		   source,
		   new String[] {
			   "constraints", "R10_MandatoryMCQuestionsHaveOptions"
		   });
		addAnnotation
		  (trueFalseQuestionEClass,
		   source,
		   new String[] {
			   "constraints", "R11_MandatoryTFQuestionsHaveAnswer"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (applicationEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getApplication__R04_SocialRSS__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "socialcontent->select(sc |\n\t\t\t\tsc.type = SocialType::Twitter or sc.type = SocialType::Facebook)->size() >= 1 and socialcontent->select(sc |\n\t\t\t\tsc.type = SocialType::RSS)->size() >= 1"
		   });
		addAnnotation
		  (getApplication__R06b_MinSurvey__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "page->select(p | p.oclIsKindOf(SurveyPage))->size() >= 1"
		   });
		addAnnotation
		  (getApplication__R01_UnicaIndexHome__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "entity.pageconfig->select(pc | pc.pageType = PageType::Index)->size() = 1"
		   });
		addAnnotation
		  (getEntity__R08_UniqueIndexPerEntity__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "pageconfig->select(pc | pc.pageType = PageType::Index)->size() <= 1"
		   });
		addAnnotation
		  (getEntity__R03_IndiceDetalle__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(pageconfig->exists(pc |\n\t\t\t\tpc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex) implies pageconfig->exists(pc |\n\t\t\t\tpc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail)) and (pageconfig->exists(pc |\n\t\t\t\tpc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail) implies pageconfig->exists(pc |\n\t\t\t\tpc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex))"
		   });
		addAnnotation
		  (getEntity__R02_CRUDIncompatible__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "pageconfig->exists(pc | pc.pageType = PageType::CRUD) implies pageconfig->forAll(pc\n\t\t\t\t| pc.pageType = PageType::CRUD)"
		   });
		addAnnotation
		  (getEntity__R05_NoSelfReference__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "reference->forAll(ref | ref.name <> name)"
		   });
		addAnnotation
		  (getPageConfig__R09_ValidIndexAttributes__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "attribute <> null implies let parent : dataWeb::Entity =\n\t\t\tself.oclContainer().oclAsType(dataWeb::Entity)\n\tin parent.attribute->includes(self.attribute)"
		   });
		addAnnotation
		  (getSurveyPage__R07_ResponsesDefined__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "survey.question->forAll(q |\n\t\t\t(q.oclIsKindOf(TrueFalseQuestion) implies q.oclAsType(TrueFalseQuestion).correctAnswer = true or q.oclAsType(TrueFalseQuestion).correctAnswer = false) and (q.oclIsKindOf(MCQuestion) implies q.oclAsType(MCQuestion).option->size() > 0))"
		   });
		addAnnotation
		  (getRole__R12_AdminMustSeeSurvey__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.permissions = dataWeb::PermissionType::ADMIN implies self.accessiblePages->exists(p :\n\t\t\tPage | p.oclIsKindOf(dataWeb::SurveyPage))"
		   });
		addAnnotation
		  (getMCQuestion__R10_MandatoryMCQuestionsHaveOptions__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.isMandatory implies self.option->size() > 0"
		   });
		addAnnotation
		  (getTrueFalseQuestion__R11_MandatoryTFQuestionsHaveAnswer__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.isMandatory implies (self.correctAnswer = true or self.correctAnswer = false)"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getApplication_Entity(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getApplication_Page(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getApplication_Socialcontent(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getApplication_Role(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntity_Attribute(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntity_Reference(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntity_Pageconfig(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPage_Link(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPageConfig_Pagination(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSurveyPage_Survey(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSurvey_Question(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMCQuestion_Option(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "200,200,255"
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "255,230,200"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "255,230,200"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "255,230,200"
		   });
		addAnnotation
		  (pageConfigEClass,
		   source,
		   new String[] {
			   "label", "pageType",
			   "color", "240,240,240"
		   });
		addAnnotation
		  (entityPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "color", "200,230,255"
		   });
		addAnnotation
		  (surveyPageEClass,
		   source,
		   new String[] {
			   "label", "title",
			   "color", "200,200,255"
		   });
		addAnnotation
		  (socialContentEClass,
		   source,
		   new String[] {
			   "label", "uri",
			   "color", "230,230,230"
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "255,240,200"
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "label", "description",
			   "color", "255,255,255"
		   });
		addAnnotation
		  (paginationEClass,
		   source,
		   new String[] {
			   "label", "pageSize",
			   "color", "255,255,255"
		   });
		addAnnotation
		  (surveyEClass,
		   source,
		   new String[] {
			   "label", "representation",
			   "color", "200,255,200"
		   });
		addAnnotation
		  (questionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "color", "255,255,230"
		   });
		addAnnotation
		  (mcQuestionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "color", "255,230,230"
		   });
		addAnnotation
		  (trueFalseQuestionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "color", "230,255,230"
		   });
		addAnnotation
		  (shortQuestionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "color", "240,240,240"
		   });
		addAnnotation
		  (answerOptionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "color", "255,255,255"
		   });
		addAnnotation
		  (dataTypeEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
		addAnnotation
		  (pageTypeEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
		addAnnotation
		  (socialTypeEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
		addAnnotation
		  (chartTypeEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
		addAnnotation
		  (multiplicityEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
		addAnnotation
		  (permissionTypeEEnum,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "220,220,220"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getPage_Socialcontent(),
		   source,
		   new String[] {
			   "source", "Page",
			   "target", "SocialContent",
			   "target.decoration", "arrow",
			   "color", "128,128,0",
			   "width", "1"
		   });
		addAnnotation
		  (getPageConfig_Attribute(),
		   source,
		   new String[] {
			   "source", "PageConfig",
			   "target", "Attribute",
			   "target.decoration", "arrow",
			   "color", "128,128,128",
			   "width", "1"
		   });
		addAnnotation
		  (getEntityPage_Entity(),
		   source,
		   new String[] {
			   "source", "EntityPage",
			   "target", "Entity",
			   "target.decoration", "arrow",
			   "color", "0,128,0",
			   "width", "2"
		   });
		addAnnotation
		  (getRole_AccessiblePages(),
		   source,
		   new String[] {
			   "source", "Role",
			   "target", "Page",
			   "target.decoration", "arrow",
			   "color", "128,0,128",
			   "width", "1"
		   });
	}

} //DataWebPackageImpl
