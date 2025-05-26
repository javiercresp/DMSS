/**
 */
package dataWeb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 *        annotation="gmf"
 * @generated
 */
public interface DataWebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataWeb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dataWeb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataWeb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWebPackage eINSTANCE = dataWeb.impl.DataWebPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataWeb.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.ApplicationImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PAGE = 2;

	/**
	 * The feature id for the '<em><b>Socialcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SOCIALCONTENT = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROLE = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>R04 Social RSS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___R04_SOCIAL_RSS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>R0 6b Min Survey</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___R0_6B_MIN_SURVEY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>R01 Unica Index Home</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___R01_UNICA_INDEX_HOME__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link dataWeb.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.EntityImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Pageconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PAGECONFIG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>R08 Unique Index Per Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___R08_UNIQUE_INDEX_PER_ENTITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>R03 Indice Detalle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___R03_INDICE_DETALLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>R02 CRUD Incompatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___R02_CRUD_INCOMPATIBLE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>R05 No Self Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___R05_NO_SELF_REFERENCE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link dataWeb.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.ReferenceImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MULTIPLICITY = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.AttributeImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.PageImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Socialcontent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SOCIALCONTENT = 3;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__META_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Meta Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__META_KEYWORDS = 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.PageConfigImpl <em>Page Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.PageConfigImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getPageConfig()
	 * @generated
	 */
	int PAGE_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG__PAGINATION = 0;

	/**
	 * The feature id for the '<em><b>Page Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG__PAGE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Page Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>R09 Valid Index Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG___R09_VALID_INDEX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Page Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONFIG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dataWeb.impl.EntityPageImpl <em>Entity Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.EntityPageImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getEntityPage()
	 * @generated
	 */
	int ENTITY_PAGE = 6;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__LINK = PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__ID = PAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Socialcontent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__SOCIALCONTENT = PAGE__SOCIALCONTENT;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__META_DESCRIPTION = PAGE__META_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Meta Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__META_KEYWORDS = PAGE__META_KEYWORDS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE__ENTITY = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.SurveyPageImpl <em>Survey Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.SurveyPageImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getSurveyPage()
	 * @generated
	 */
	int SURVEY_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__LINK = PAGE__LINK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__ID = PAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Socialcontent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__SOCIALCONTENT = PAGE__SOCIALCONTENT;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__META_DESCRIPTION = PAGE__META_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Meta Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__META_KEYWORDS = PAGE__META_KEYWORDS;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__SURVEY = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Survey Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R07 Responses Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE___R07_RESPONSES_DEFINED__DIAGNOSTICCHAIN_MAP = PAGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Survey Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWeb.impl.SocialContentImpl <em>Social Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.SocialContentImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getSocialContent()
	 * @generated
	 */
	int SOCIAL_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTENT__URI = 1;

	/**
	 * The number of structural features of the '<em>Social Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Social Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.RoleImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Accessible Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACCESSIBLE_PAGES = 2;

	/**
	 * The feature id for the '<em><b>Numero Entidades Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NUMERO_ENTIDADES_ACCESIBLES = 3;

	/**
	 * The feature id for the '<em><b>Paginas Medias Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PAGINAS_MEDIAS_ACCESIBLES = 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>R12 Admin Must See Survey</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___R12_ADMIN_MUST_SEE_SURVEY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dataWeb.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.LinkImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>External URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EXTERNAL_URL = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.PaginationImpl <em>Pagination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.PaginationImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getPagination()
	 * @generated
	 */
	int PAGINATION = 11;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__PAGE_SIZE = 0;

	/**
	 * The number of structural features of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.SurveyImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 12;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__REPRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Numero Preg VF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NUMERO_PREG_VF = 2;

	/**
	 * The feature id for the '<em><b>Numero Preg Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NUMERO_PREG_SELECT = 3;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.QuestionImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_MANDATORY = 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.MCQuestionImpl <em>MC Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.MCQuestionImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getMCQuestion()
	 * @generated
	 */
	int MC_QUESTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION__OPTION = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MC Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R10 Mandatory MC Questions Have Options</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION___R10_MANDATORY_MC_QUESTIONS_HAVE_OPTIONS__DIAGNOSTICCHAIN_MAP = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>MC Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWeb.impl.TrueFalseQuestionImpl <em>True False Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.TrueFalseQuestionImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getTrueFalseQuestion()
	 * @generated
	 */
	int TRUE_FALSE_QUESTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Correct Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION__CORRECT_ANSWER = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>True False Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R11 Mandatory TF Questions Have Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION___R11_MANDATORY_TF_QUESTIONS_HAVE_ANSWER__DIAGNOSTICCHAIN_MAP = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>True False Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FALSE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dataWeb.impl.ShortQuestionImpl <em>Short Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.ShortQuestionImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getShortQuestion()
	 * @generated
	 */
	int SHORT_QUESTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_QUESTION__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The number of structural features of the '<em>Short Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Short Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dataWeb.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.impl.AnswerOptionImpl
	 * @see dataWeb.impl.DataWebPackageImpl#getAnswerOption()
	 * @generated
	 */
	int ANSWER_OPTION = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataWeb.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.DataType
	 * @see dataWeb.impl.DataWebPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 18;

	/**
	 * The meta object id for the '{@link dataWeb.PageType <em>Page Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.PageType
	 * @see dataWeb.impl.DataWebPackageImpl#getPageType()
	 * @generated
	 */
	int PAGE_TYPE = 19;

	/**
	 * The meta object id for the '{@link dataWeb.SocialType <em>Social Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.SocialType
	 * @see dataWeb.impl.DataWebPackageImpl#getSocialType()
	 * @generated
	 */
	int SOCIAL_TYPE = 20;

	/**
	 * The meta object id for the '{@link dataWeb.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.ChartType
	 * @see dataWeb.impl.DataWebPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 21;

	/**
	 * The meta object id for the '{@link dataWeb.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.Multiplicity
	 * @see dataWeb.impl.DataWebPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 22;

	/**
	 * The meta object id for the '{@link dataWeb.PermissionType <em>Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataWeb.PermissionType
	 * @see dataWeb.impl.DataWebPackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link dataWeb.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see dataWeb.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWeb.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Application#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see dataWeb.Application#getEntity()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Application#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see dataWeb.Application#getPage()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Application#getSocialcontent <em>Socialcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Socialcontent</em>'.
	 * @see dataWeb.Application#getSocialcontent()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Socialcontent();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Application#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see dataWeb.Application#getRole()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Role();

	/**
	 * Returns the meta object for the '{@link dataWeb.Application#R04_SocialRSS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R04 Social RSS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R04 Social RSS</em>' operation.
	 * @see dataWeb.Application#R04_SocialRSS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__R04_SocialRSS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dataWeb.Application#R06b_MinSurvey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R0 6b Min Survey</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R0 6b Min Survey</em>' operation.
	 * @see dataWeb.Application#R06b_MinSurvey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__R06b_MinSurvey__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dataWeb.Application#R01_UnicaIndexHome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R01 Unica Index Home</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R01 Unica Index Home</em>' operation.
	 * @see dataWeb.Application#R01_UnicaIndexHome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__R01_UnicaIndexHome__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see dataWeb.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Entity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see dataWeb.Entity#getAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Entity#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see dataWeb.Entity#getReference()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Entity#getPageconfig <em>Pageconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pageconfig</em>'.
	 * @see dataWeb.Entity#getPageconfig()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Pageconfig();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWeb.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the '{@link dataWeb.Entity#R08_UniqueIndexPerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R08 Unique Index Per Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R08 Unique Index Per Entity</em>' operation.
	 * @see dataWeb.Entity#R08_UniqueIndexPerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__R08_UniqueIndexPerEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dataWeb.Entity#R03_IndiceDetalle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R03 Indice Detalle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R03 Indice Detalle</em>' operation.
	 * @see dataWeb.Entity#R03_IndiceDetalle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__R03_IndiceDetalle__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dataWeb.Entity#R02_CRUDIncompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R02 CRUD Incompatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R02 CRUD Incompatible</em>' operation.
	 * @see dataWeb.Entity#R02_CRUDIncompatible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__R02_CRUDIncompatible__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dataWeb.Entity#R05_NoSelfReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R05 No Self Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R05 No Self Reference</em>' operation.
	 * @see dataWeb.Entity#R05_NoSelfReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__R05_NoSelfReference__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see dataWeb.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWeb.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Reference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see dataWeb.Reference#getMultiplicity()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Multiplicity();

	/**
	 * Returns the meta object for class '{@link dataWeb.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dataWeb.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWeb.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dataWeb.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link dataWeb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see dataWeb.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Page#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see dataWeb.Page#getLink()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Link();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Page#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dataWeb.Page#getId()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Id();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dataWeb.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the reference '{@link dataWeb.Page#getSocialcontent <em>Socialcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Socialcontent</em>'.
	 * @see dataWeb.Page#getSocialcontent()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Socialcontent();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Page#getMetaDescription <em>Meta Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Description</em>'.
	 * @see dataWeb.Page#getMetaDescription()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_MetaDescription();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Page#getMetaKeywords <em>Meta Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Keywords</em>'.
	 * @see dataWeb.Page#getMetaKeywords()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_MetaKeywords();

	/**
	 * Returns the meta object for class '{@link dataWeb.PageConfig <em>Page Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Config</em>'.
	 * @see dataWeb.PageConfig
	 * @generated
	 */
	EClass getPageConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.PageConfig#getPagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagination</em>'.
	 * @see dataWeb.PageConfig#getPagination()
	 * @see #getPageConfig()
	 * @generated
	 */
	EReference getPageConfig_Pagination();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.PageConfig#getPageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Type</em>'.
	 * @see dataWeb.PageConfig#getPageType()
	 * @see #getPageConfig()
	 * @generated
	 */
	EAttribute getPageConfig_PageType();

	/**
	 * Returns the meta object for the reference '{@link dataWeb.PageConfig#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see dataWeb.PageConfig#getAttribute()
	 * @see #getPageConfig()
	 * @generated
	 */
	EReference getPageConfig_Attribute();

	/**
	 * Returns the meta object for the '{@link dataWeb.PageConfig#R09_ValidIndexAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R09 Valid Index Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R09 Valid Index Attributes</em>' operation.
	 * @see dataWeb.PageConfig#R09_ValidIndexAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPageConfig__R09_ValidIndexAttributes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.EntityPage <em>Entity Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Page</em>'.
	 * @see dataWeb.EntityPage
	 * @generated
	 */
	EClass getEntityPage();

	/**
	 * Returns the meta object for the reference '{@link dataWeb.EntityPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dataWeb.EntityPage#getEntity()
	 * @see #getEntityPage()
	 * @generated
	 */
	EReference getEntityPage_Entity();

	/**
	 * Returns the meta object for class '{@link dataWeb.SurveyPage <em>Survey Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey Page</em>'.
	 * @see dataWeb.SurveyPage
	 * @generated
	 */
	EClass getSurveyPage();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.SurveyPage#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Survey</em>'.
	 * @see dataWeb.SurveyPage#getSurvey()
	 * @see #getSurveyPage()
	 * @generated
	 */
	EReference getSurveyPage_Survey();

	/**
	 * Returns the meta object for the '{@link dataWeb.SurveyPage#R07_ResponsesDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R07 Responses Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R07 Responses Defined</em>' operation.
	 * @see dataWeb.SurveyPage#R07_ResponsesDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSurveyPage__R07_ResponsesDefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.SocialContent <em>Social Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Content</em>'.
	 * @see dataWeb.SocialContent
	 * @generated
	 */
	EClass getSocialContent();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.SocialContent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dataWeb.SocialContent#getType()
	 * @see #getSocialContent()
	 * @generated
	 */
	EAttribute getSocialContent_Type();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.SocialContent#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see dataWeb.SocialContent#getUri()
	 * @see #getSocialContent()
	 * @generated
	 */
	EAttribute getSocialContent_Uri();

	/**
	 * Returns the meta object for class '{@link dataWeb.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see dataWeb.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataWeb.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see dataWeb.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link dataWeb.Role#getAccessiblePages <em>Accessible Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Pages</em>'.
	 * @see dataWeb.Role#getAccessiblePages()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AccessiblePages();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Role#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Entidades Accesibles</em>'.
	 * @see dataWeb.Role#getNumeroEntidadesAccesibles()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_NumeroEntidadesAccesibles();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Role#getPaginasMediasAccesibles <em>Paginas Medias Accesibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paginas Medias Accesibles</em>'.
	 * @see dataWeb.Role#getPaginasMediasAccesibles()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_PaginasMediasAccesibles();

	/**
	 * Returns the meta object for the '{@link dataWeb.Role#R12_AdminMustSeeSurvey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R12 Admin Must See Survey</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R12 Admin Must See Survey</em>' operation.
	 * @see dataWeb.Role#R12_AdminMustSeeSurvey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRole__R12_AdminMustSeeSurvey__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dataWeb.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Link#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dataWeb.Link#getDescription()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Description();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Link#getExternalURL <em>External URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External URL</em>'.
	 * @see dataWeb.Link#getExternalURL()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ExternalURL();

	/**
	 * Returns the meta object for class '{@link dataWeb.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination</em>'.
	 * @see dataWeb.Pagination
	 * @generated
	 */
	EClass getPagination();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Pagination#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Size</em>'.
	 * @see dataWeb.Pagination#getPageSize()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_PageSize();

	/**
	 * Returns the meta object for class '{@link dataWeb.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see dataWeb.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.Survey#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see dataWeb.Survey#getQuestion()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Question();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Survey#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see dataWeb.Survey#getRepresentation()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Representation();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Survey#getNumeroPregVF <em>Numero Preg VF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Preg VF</em>'.
	 * @see dataWeb.Survey#getNumeroPregVF()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_NumeroPregVF();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Survey#getNumeroPregSelect <em>Numero Preg Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Preg Select</em>'.
	 * @see dataWeb.Survey#getNumeroPregSelect()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_NumeroPregSelect();

	/**
	 * Returns the meta object for class '{@link dataWeb.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see dataWeb.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dataWeb.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dataWeb.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.Question#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see dataWeb.Question#isIsMandatory()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsMandatory();

	/**
	 * Returns the meta object for class '{@link dataWeb.MCQuestion <em>MC Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MC Question</em>'.
	 * @see dataWeb.MCQuestion
	 * @generated
	 */
	EClass getMCQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link dataWeb.MCQuestion#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see dataWeb.MCQuestion#getOption()
	 * @see #getMCQuestion()
	 * @generated
	 */
	EReference getMCQuestion_Option();

	/**
	 * Returns the meta object for the '{@link dataWeb.MCQuestion#R10_MandatoryMCQuestionsHaveOptions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R10 Mandatory MC Questions Have Options</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R10 Mandatory MC Questions Have Options</em>' operation.
	 * @see dataWeb.MCQuestion#R10_MandatoryMCQuestionsHaveOptions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMCQuestion__R10_MandatoryMCQuestionsHaveOptions__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.TrueFalseQuestion <em>True False Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True False Question</em>'.
	 * @see dataWeb.TrueFalseQuestion
	 * @generated
	 */
	EClass getTrueFalseQuestion();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.TrueFalseQuestion#isCorrectAnswer <em>Correct Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Answer</em>'.
	 * @see dataWeb.TrueFalseQuestion#isCorrectAnswer()
	 * @see #getTrueFalseQuestion()
	 * @generated
	 */
	EAttribute getTrueFalseQuestion_CorrectAnswer();

	/**
	 * Returns the meta object for the '{@link dataWeb.TrueFalseQuestion#R11_MandatoryTFQuestionsHaveAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R11 Mandatory TF Questions Have Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R11 Mandatory TF Questions Have Answer</em>' operation.
	 * @see dataWeb.TrueFalseQuestion#R11_MandatoryTFQuestionsHaveAnswer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrueFalseQuestion__R11_MandatoryTFQuestionsHaveAnswer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dataWeb.ShortQuestion <em>Short Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Question</em>'.
	 * @see dataWeb.ShortQuestion
	 * @generated
	 */
	EClass getShortQuestion();

	/**
	 * Returns the meta object for class '{@link dataWeb.AnswerOption <em>Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Option</em>'.
	 * @see dataWeb.AnswerOption
	 * @generated
	 */
	EClass getAnswerOption();

	/**
	 * Returns the meta object for the attribute '{@link dataWeb.AnswerOption#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dataWeb.AnswerOption#getText()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_Text();

	/**
	 * Returns the meta object for enum '{@link dataWeb.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see dataWeb.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link dataWeb.PageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Type</em>'.
	 * @see dataWeb.PageType
	 * @generated
	 */
	EEnum getPageType();

	/**
	 * Returns the meta object for enum '{@link dataWeb.SocialType <em>Social Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Social Type</em>'.
	 * @see dataWeb.SocialType
	 * @generated
	 */
	EEnum getSocialType();

	/**
	 * Returns the meta object for enum '{@link dataWeb.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see dataWeb.ChartType
	 * @generated
	 */
	EEnum getChartType();

	/**
	 * Returns the meta object for enum '{@link dataWeb.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see dataWeb.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link dataWeb.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Type</em>'.
	 * @see dataWeb.PermissionType
	 * @generated
	 */
	EEnum getPermissionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataWebFactory getDataWebFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dataWeb.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.ApplicationImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ENTITY = eINSTANCE.getApplication_Entity();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PAGE = eINSTANCE.getApplication_Page();

		/**
		 * The meta object literal for the '<em><b>Socialcontent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SOCIALCONTENT = eINSTANCE.getApplication_Socialcontent();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ROLE = eINSTANCE.getApplication_Role();

		/**
		 * The meta object literal for the '<em><b>R04 Social RSS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___R04_SOCIAL_RSS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__R04_SocialRSS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R0 6b Min Survey</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___R0_6B_MIN_SURVEY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__R06b_MinSurvey__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R01 Unica Index Home</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___R01_UNICA_INDEX_HOME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__R01_UnicaIndexHome__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.EntityImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTE = eINSTANCE.getEntity_Attribute();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCE = eINSTANCE.getEntity_Reference();

		/**
		 * The meta object literal for the '<em><b>Pageconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PAGECONFIG = eINSTANCE.getEntity_Pageconfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>R08 Unique Index Per Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___R08_UNIQUE_INDEX_PER_ENTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__R08_UniqueIndexPerEntity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R03 Indice Detalle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___R03_INDICE_DETALLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__R03_IndiceDetalle__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R02 CRUD Incompatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___R02_CRUD_INCOMPATIBLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__R02_CRUDIncompatible__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R05 No Self Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___R05_NO_SELF_REFERENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__R05_NoSelfReference__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.ReferenceImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MULTIPLICITY = eINSTANCE.getReference_Multiplicity();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.AttributeImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.PageImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LINK = eINSTANCE.getPage_Link();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__ID = eINSTANCE.getPage_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Socialcontent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SOCIALCONTENT = eINSTANCE.getPage_Socialcontent();

		/**
		 * The meta object literal for the '<em><b>Meta Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__META_DESCRIPTION = eINSTANCE.getPage_MetaDescription();

		/**
		 * The meta object literal for the '<em><b>Meta Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__META_KEYWORDS = eINSTANCE.getPage_MetaKeywords();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.PageConfigImpl <em>Page Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.PageConfigImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getPageConfig()
		 * @generated
		 */
		EClass PAGE_CONFIG = eINSTANCE.getPageConfig();

		/**
		 * The meta object literal for the '<em><b>Pagination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONFIG__PAGINATION = eINSTANCE.getPageConfig_Pagination();

		/**
		 * The meta object literal for the '<em><b>Page Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_CONFIG__PAGE_TYPE = eINSTANCE.getPageConfig_PageType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONFIG__ATTRIBUTE = eINSTANCE.getPageConfig_Attribute();

		/**
		 * The meta object literal for the '<em><b>R09 Valid Index Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE_CONFIG___R09_VALID_INDEX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPageConfig__R09_ValidIndexAttributes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.EntityPageImpl <em>Entity Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.EntityPageImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getEntityPage()
		 * @generated
		 */
		EClass ENTITY_PAGE = eINSTANCE.getEntityPage();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_PAGE__ENTITY = eINSTANCE.getEntityPage_Entity();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.SurveyPageImpl <em>Survey Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.SurveyPageImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getSurveyPage()
		 * @generated
		 */
		EClass SURVEY_PAGE = eINSTANCE.getSurveyPage();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_PAGE__SURVEY = eINSTANCE.getSurveyPage_Survey();

		/**
		 * The meta object literal for the '<em><b>R07 Responses Defined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SURVEY_PAGE___R07_RESPONSES_DEFINED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSurveyPage__R07_ResponsesDefined__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.SocialContentImpl <em>Social Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.SocialContentImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getSocialContent()
		 * @generated
		 */
		EClass SOCIAL_CONTENT = eINSTANCE.getSocialContent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_CONTENT__TYPE = eINSTANCE.getSocialContent_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_CONTENT__URI = eINSTANCE.getSocialContent_Uri();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.RoleImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '<em><b>Accessible Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACCESSIBLE_PAGES = eINSTANCE.getRole_AccessiblePages();

		/**
		 * The meta object literal for the '<em><b>Numero Entidades Accesibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NUMERO_ENTIDADES_ACCESIBLES = eINSTANCE.getRole_NumeroEntidadesAccesibles();

		/**
		 * The meta object literal for the '<em><b>Paginas Medias Accesibles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PAGINAS_MEDIAS_ACCESIBLES = eINSTANCE.getRole_PaginasMediasAccesibles();

		/**
		 * The meta object literal for the '<em><b>R12 Admin Must See Survey</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___R12_ADMIN_MUST_SEE_SURVEY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRole__R12_AdminMustSeeSurvey__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.LinkImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__DESCRIPTION = eINSTANCE.getLink_Description();

		/**
		 * The meta object literal for the '<em><b>External URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__EXTERNAL_URL = eINSTANCE.getLink_ExternalURL();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.PaginationImpl <em>Pagination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.PaginationImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getPagination()
		 * @generated
		 */
		EClass PAGINATION = eINSTANCE.getPagination();

		/**
		 * The meta object literal for the '<em><b>Page Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__PAGE_SIZE = eINSTANCE.getPagination_PageSize();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.SurveyImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTION = eINSTANCE.getSurvey_Question();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__REPRESENTATION = eINSTANCE.getSurvey_Representation();

		/**
		 * The meta object literal for the '<em><b>Numero Preg VF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NUMERO_PREG_VF = eINSTANCE.getSurvey_NumeroPregVF();

		/**
		 * The meta object literal for the '<em><b>Numero Preg Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NUMERO_PREG_SELECT = eINSTANCE.getSurvey_NumeroPregSelect();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.QuestionImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_MANDATORY = eINSTANCE.getQuestion_IsMandatory();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.MCQuestionImpl <em>MC Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.MCQuestionImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getMCQuestion()
		 * @generated
		 */
		EClass MC_QUESTION = eINSTANCE.getMCQuestion();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_QUESTION__OPTION = eINSTANCE.getMCQuestion_Option();

		/**
		 * The meta object literal for the '<em><b>R10 Mandatory MC Questions Have Options</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MC_QUESTION___R10_MANDATORY_MC_QUESTIONS_HAVE_OPTIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMCQuestion__R10_MandatoryMCQuestionsHaveOptions__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.TrueFalseQuestionImpl <em>True False Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.TrueFalseQuestionImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getTrueFalseQuestion()
		 * @generated
		 */
		EClass TRUE_FALSE_QUESTION = eINSTANCE.getTrueFalseQuestion();

		/**
		 * The meta object literal for the '<em><b>Correct Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUE_FALSE_QUESTION__CORRECT_ANSWER = eINSTANCE.getTrueFalseQuestion_CorrectAnswer();

		/**
		 * The meta object literal for the '<em><b>R11 Mandatory TF Questions Have Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRUE_FALSE_QUESTION___R11_MANDATORY_TF_QUESTIONS_HAVE_ANSWER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrueFalseQuestion__R11_MandatoryTFQuestionsHaveAnswer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.ShortQuestionImpl <em>Short Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.ShortQuestionImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getShortQuestion()
		 * @generated
		 */
		EClass SHORT_QUESTION = eINSTANCE.getShortQuestion();

		/**
		 * The meta object literal for the '{@link dataWeb.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.impl.AnswerOptionImpl
		 * @see dataWeb.impl.DataWebPackageImpl#getAnswerOption()
		 * @generated
		 */
		EClass ANSWER_OPTION = eINSTANCE.getAnswerOption();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__TEXT = eINSTANCE.getAnswerOption_Text();

		/**
		 * The meta object literal for the '{@link dataWeb.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.DataType
		 * @see dataWeb.impl.DataWebPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link dataWeb.PageType <em>Page Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.PageType
		 * @see dataWeb.impl.DataWebPackageImpl#getPageType()
		 * @generated
		 */
		EEnum PAGE_TYPE = eINSTANCE.getPageType();

		/**
		 * The meta object literal for the '{@link dataWeb.SocialType <em>Social Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.SocialType
		 * @see dataWeb.impl.DataWebPackageImpl#getSocialType()
		 * @generated
		 */
		EEnum SOCIAL_TYPE = eINSTANCE.getSocialType();

		/**
		 * The meta object literal for the '{@link dataWeb.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.ChartType
		 * @see dataWeb.impl.DataWebPackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link dataWeb.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.Multiplicity
		 * @see dataWeb.impl.DataWebPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link dataWeb.PermissionType <em>Permission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataWeb.PermissionType
		 * @see dataWeb.impl.DataWebPackageImpl#getPermissionType()
		 * @generated
		 */
		EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

	}

} //DataWebPackage
