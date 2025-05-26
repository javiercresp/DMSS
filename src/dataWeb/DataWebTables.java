/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /DataWeb/metamodel/dataWeb.ecore
 * using:
 *   /DataWeb/metamodel/dataWeb.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package dataWeb;

// import dataWeb.DataWebPackage;
// import dataWeb.DataWebTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DataWebTables provides the dispatch tables for the dataWeb for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DataWebTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DataWebPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_dataWeb = IdManager.getNsURIPackageId("http://www.example.org/dataWeb", null, DataWebPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AnswerOption = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("AnswerOption", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Application = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Application", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = DataWebTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EntityPage = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("EntityPage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Link", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MCQuestion = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("MCQuestion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = DataWebTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PageConfig = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("PageConfig", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Pagination = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Pagination", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Question = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Question", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reference = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Reference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Role = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Role", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SocialContent = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("SocialContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Survey = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("Survey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SurveyPage = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("SurveyPage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TrueFalseQuestion = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getClassId("TrueFalseQuestion", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = DataWebTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DataWebTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ChartType = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("ChartType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Multiplicity = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("Multiplicity");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PageType = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("PageType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PermissionType = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("PermissionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SocialType = DataWebTables.PACKid_http_c_s_s_www_example_org_s_dataWeb.getEnumerationId("SocialType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EntityPage = TypeId.BAG.getSpecializedId(DataWebTables.CLSSid_EntityPage);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Page = TypeId.BAG.getSpecializedId(DataWebTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PageConfig = TypeId.BAG.getSpecializedId(DataWebTables.CLSSid_PageConfig);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Role = TypeId.BAG.getSpecializedId(DataWebTables.CLSSid_Role);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ADMIN = DataWebTables.ENUMid_PermissionType.getEnumerationLiteralId("ADMIN");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_CRUD = DataWebTables.ENUMid_PageType.getEnumerationLiteralId("CRUD");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Detail = DataWebTables.ENUMid_PageType.getEnumerationLiteralId("Detail");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ExtendedIndex = DataWebTables.ENUMid_PageType.getEnumerationLiteralId("ExtendedIndex");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Facebook = DataWebTables.ENUMid_SocialType.getEnumerationLiteralId("Facebook");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Index = DataWebTables.ENUMid_PageType.getEnumerationLiteralId("Index");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_IndexDetail = DataWebTables.ENUMid_PageType.getEnumerationLiteralId("IndexDetail");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_RSS = DataWebTables.ENUMid_SocialType.getEnumerationLiteralId("RSS");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Twitter = DataWebTables.ENUMid_SocialType.getEnumerationLiteralId("Twitter");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AnswerOption = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_AnswerOption);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Link);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PageConfig = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_PageConfig);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Pagination = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Pagination);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Question = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Question);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Reference = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Reference);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Role = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Role);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SocialContent = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_SocialContent);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Survey = TypeId.ORDERED_SET.getSpecializedId(DataWebTables.CLSSid_Survey);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Entity = TypeId.SEQUENCE.getSpecializedId(DataWebTables.CLSSid_Entity);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_PageConfig = TypeId.SEQUENCE.getSpecializedId(DataWebTables.CLSSid_PageConfig);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Question = TypeId.SEQUENCE.getSpecializedId(DataWebTables.CLSSid_Question);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Application = TypeId.SET.getSpecializedId(DataWebTables.CLSSid_Application);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Entity = TypeId.SET.getSpecializedId(DataWebTables.CLSSid_Entity);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DataWebTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AnswerOption = new EcoreExecutorType(DataWebPackage.Literals.ANSWER_OPTION, PACKAGE, 0);
		public static final EcoreExecutorType _Application = new EcoreExecutorType(DataWebPackage.Literals.APPLICATION, PACKAGE, 0);
		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(DataWebPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ChartType = new EcoreExecutorEnumeration(DataWebPackage.Literals.CHART_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(DataWebPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(DataWebPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _EntityPage = new EcoreExecutorType(DataWebPackage.Literals.ENTITY_PAGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Link = new EcoreExecutorType(DataWebPackage.Literals.LINK, PACKAGE, 0);
		public static final EcoreExecutorType _MCQuestion = new EcoreExecutorType(DataWebPackage.Literals.MC_QUESTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Multiplicity = new EcoreExecutorEnumeration(DataWebPackage.Literals.MULTIPLICITY, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(DataWebPackage.Literals.PAGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PageConfig = new EcoreExecutorType(DataWebPackage.Literals.PAGE_CONFIG, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PageType = new EcoreExecutorEnumeration(DataWebPackage.Literals.PAGE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Pagination = new EcoreExecutorType(DataWebPackage.Literals.PAGINATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PermissionType = new EcoreExecutorEnumeration(DataWebPackage.Literals.PERMISSION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Question = new EcoreExecutorType(DataWebPackage.Literals.QUESTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Reference = new EcoreExecutorType(DataWebPackage.Literals.REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _Role = new EcoreExecutorType(DataWebPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _ShortQuestion = new EcoreExecutorType(DataWebPackage.Literals.SHORT_QUESTION, PACKAGE, 0);
		public static final EcoreExecutorType _SocialContent = new EcoreExecutorType(DataWebPackage.Literals.SOCIAL_CONTENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SocialType = new EcoreExecutorEnumeration(DataWebPackage.Literals.SOCIAL_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Survey = new EcoreExecutorType(DataWebPackage.Literals.SURVEY, PACKAGE, 0);
		public static final EcoreExecutorType _SurveyPage = new EcoreExecutorType(DataWebPackage.Literals.SURVEY_PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _TrueFalseQuestion = new EcoreExecutorType(DataWebPackage.Literals.TRUE_FALSE_QUESTION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AnswerOption,
			_Application,
			_Attribute,
			_ChartType,
			_DataType,
			_Entity,
			_EntityPage,
			_Link,
			_MCQuestion,
			_Multiplicity,
			_Page,
			_PageConfig,
			_PageType,
			_Pagination,
			_PermissionType,
			_Question,
			_Reference,
			_Role,
			_ShortQuestion,
			_SocialContent,
			_SocialType,
			_Survey,
			_SurveyPage,
			_TrueFalseQuestion
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AnswerOption__AnswerOption = new ExecutorFragment(Types._AnswerOption, DataWebTables.Types._AnswerOption);
		private static final ExecutorFragment _AnswerOption__OclAny = new ExecutorFragment(Types._AnswerOption, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnswerOption__OclElement = new ExecutorFragment(Types._AnswerOption, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Application__Application = new ExecutorFragment(Types._Application, DataWebTables.Types._Application);
		private static final ExecutorFragment _Application__OclAny = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Application__OclElement = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, DataWebTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ChartType__ChartType = new ExecutorFragment(Types._ChartType, DataWebTables.Types._ChartType);
		private static final ExecutorFragment _ChartType__OclAny = new ExecutorFragment(Types._ChartType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ChartType__OclElement = new ExecutorFragment(Types._ChartType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ChartType__OclEnumeration = new ExecutorFragment(Types._ChartType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ChartType__OclType = new ExecutorFragment(Types._ChartType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, DataWebTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, DataWebTables.Types._Entity);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EntityPage__EntityPage = new ExecutorFragment(Types._EntityPage, DataWebTables.Types._EntityPage);
		private static final ExecutorFragment _EntityPage__OclAny = new ExecutorFragment(Types._EntityPage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EntityPage__OclElement = new ExecutorFragment(Types._EntityPage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EntityPage__Page = new ExecutorFragment(Types._EntityPage, DataWebTables.Types._Page);

		private static final ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, DataWebTables.Types._Link);
		private static final ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MCQuestion__MCQuestion = new ExecutorFragment(Types._MCQuestion, DataWebTables.Types._MCQuestion);
		private static final ExecutorFragment _MCQuestion__OclAny = new ExecutorFragment(Types._MCQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MCQuestion__OclElement = new ExecutorFragment(Types._MCQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MCQuestion__Question = new ExecutorFragment(Types._MCQuestion, DataWebTables.Types._Question);

		private static final ExecutorFragment _Multiplicity__Multiplicity = new ExecutorFragment(Types._Multiplicity, DataWebTables.Types._Multiplicity);
		private static final ExecutorFragment _Multiplicity__OclAny = new ExecutorFragment(Types._Multiplicity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Multiplicity__OclElement = new ExecutorFragment(Types._Multiplicity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Multiplicity__OclEnumeration = new ExecutorFragment(Types._Multiplicity, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Multiplicity__OclType = new ExecutorFragment(Types._Multiplicity, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, DataWebTables.Types._Page);

		private static final ExecutorFragment _PageConfig__OclAny = new ExecutorFragment(Types._PageConfig, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PageConfig__OclElement = new ExecutorFragment(Types._PageConfig, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PageConfig__PageConfig = new ExecutorFragment(Types._PageConfig, DataWebTables.Types._PageConfig);

		private static final ExecutorFragment _PageType__OclAny = new ExecutorFragment(Types._PageType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PageType__OclElement = new ExecutorFragment(Types._PageType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PageType__OclEnumeration = new ExecutorFragment(Types._PageType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PageType__OclType = new ExecutorFragment(Types._PageType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PageType__PageType = new ExecutorFragment(Types._PageType, DataWebTables.Types._PageType);

		private static final ExecutorFragment _Pagination__OclAny = new ExecutorFragment(Types._Pagination, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pagination__OclElement = new ExecutorFragment(Types._Pagination, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pagination__Pagination = new ExecutorFragment(Types._Pagination, DataWebTables.Types._Pagination);

		private static final ExecutorFragment _PermissionType__OclAny = new ExecutorFragment(Types._PermissionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PermissionType__OclElement = new ExecutorFragment(Types._PermissionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PermissionType__OclEnumeration = new ExecutorFragment(Types._PermissionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PermissionType__OclType = new ExecutorFragment(Types._PermissionType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PermissionType__PermissionType = new ExecutorFragment(Types._PermissionType, DataWebTables.Types._PermissionType);

		private static final ExecutorFragment _Question__OclAny = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Question__OclElement = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Question__Question = new ExecutorFragment(Types._Question, DataWebTables.Types._Question);

		private static final ExecutorFragment _Reference__OclAny = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reference__OclElement = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reference__Reference = new ExecutorFragment(Types._Reference, DataWebTables.Types._Reference);

		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, DataWebTables.Types._Role);

		private static final ExecutorFragment _ShortQuestion__OclAny = new ExecutorFragment(Types._ShortQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ShortQuestion__OclElement = new ExecutorFragment(Types._ShortQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ShortQuestion__Question = new ExecutorFragment(Types._ShortQuestion, DataWebTables.Types._Question);
		private static final ExecutorFragment _ShortQuestion__ShortQuestion = new ExecutorFragment(Types._ShortQuestion, DataWebTables.Types._ShortQuestion);

		private static final ExecutorFragment _SocialContent__OclAny = new ExecutorFragment(Types._SocialContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SocialContent__OclElement = new ExecutorFragment(Types._SocialContent, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SocialContent__SocialContent = new ExecutorFragment(Types._SocialContent, DataWebTables.Types._SocialContent);

		private static final ExecutorFragment _SocialType__OclAny = new ExecutorFragment(Types._SocialType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SocialType__OclElement = new ExecutorFragment(Types._SocialType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SocialType__OclEnumeration = new ExecutorFragment(Types._SocialType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SocialType__OclType = new ExecutorFragment(Types._SocialType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SocialType__SocialType = new ExecutorFragment(Types._SocialType, DataWebTables.Types._SocialType);

		private static final ExecutorFragment _Survey__OclAny = new ExecutorFragment(Types._Survey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Survey__OclElement = new ExecutorFragment(Types._Survey, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Survey__Survey = new ExecutorFragment(Types._Survey, DataWebTables.Types._Survey);

		private static final ExecutorFragment _SurveyPage__OclAny = new ExecutorFragment(Types._SurveyPage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SurveyPage__OclElement = new ExecutorFragment(Types._SurveyPage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SurveyPage__Page = new ExecutorFragment(Types._SurveyPage, DataWebTables.Types._Page);
		private static final ExecutorFragment _SurveyPage__SurveyPage = new ExecutorFragment(Types._SurveyPage, DataWebTables.Types._SurveyPage);

		private static final ExecutorFragment _TrueFalseQuestion__OclAny = new ExecutorFragment(Types._TrueFalseQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TrueFalseQuestion__OclElement = new ExecutorFragment(Types._TrueFalseQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TrueFalseQuestion__Question = new ExecutorFragment(Types._TrueFalseQuestion, DataWebTables.Types._Question);
		private static final ExecutorFragment _TrueFalseQuestion__TrueFalseQuestion = new ExecutorFragment(Types._TrueFalseQuestion, DataWebTables.Types._TrueFalseQuestion);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AnswerOption__text = new EcoreExecutorProperty(DataWebPackage.Literals.ANSWER_OPTION__TEXT, Types._AnswerOption, 0);
		public static final ExecutorProperty _AnswerOption__MCQuestion__option = new ExecutorPropertyWithImplementation("MCQuestion", Types._AnswerOption, 1, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.MC_QUESTION__OPTION));

		public static final ExecutorProperty _Application__entity = new EcoreExecutorProperty(DataWebPackage.Literals.APPLICATION__ENTITY, Types._Application, 0);
		public static final ExecutorProperty _Application__name = new EcoreExecutorProperty(DataWebPackage.Literals.APPLICATION__NAME, Types._Application, 1);
		public static final ExecutorProperty _Application__page = new EcoreExecutorProperty(DataWebPackage.Literals.APPLICATION__PAGE, Types._Application, 2);
		public static final ExecutorProperty _Application__role = new EcoreExecutorProperty(DataWebPackage.Literals.APPLICATION__ROLE, Types._Application, 3);
		public static final ExecutorProperty _Application__socialcontent = new EcoreExecutorProperty(DataWebPackage.Literals.APPLICATION__SOCIALCONTENT, Types._Application, 4);

		public static final ExecutorProperty _Attribute__name = new EcoreExecutorProperty(DataWebPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(DataWebPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__Entity__attribute = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 2, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.ENTITY__ATTRIBUTE));
		public static final ExecutorProperty _Attribute__PageConfig__attribute = new ExecutorPropertyWithImplementation("PageConfig", Types._Attribute, 3, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.PAGE_CONFIG__ATTRIBUTE));

		public static final ExecutorProperty _Entity__attribute = new EcoreExecutorProperty(DataWebPackage.Literals.ENTITY__ATTRIBUTE, Types._Entity, 0);
		public static final ExecutorProperty _Entity__name = new EcoreExecutorProperty(DataWebPackage.Literals.ENTITY__NAME, Types._Entity, 1);
		public static final ExecutorProperty _Entity__pageconfig = new EcoreExecutorProperty(DataWebPackage.Literals.ENTITY__PAGECONFIG, Types._Entity, 2);
		public static final ExecutorProperty _Entity__reference = new EcoreExecutorProperty(DataWebPackage.Literals.ENTITY__REFERENCE, Types._Entity, 3);
		public static final ExecutorProperty _Entity__Application__entity = new ExecutorPropertyWithImplementation("Application", Types._Entity, 4, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.APPLICATION__ENTITY));
		public static final ExecutorProperty _Entity__EntityPage__entity = new ExecutorPropertyWithImplementation("EntityPage", Types._Entity, 5, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.ENTITY_PAGE__ENTITY));

		public static final ExecutorProperty _EntityPage__entity = new EcoreExecutorProperty(DataWebPackage.Literals.ENTITY_PAGE__ENTITY, Types._EntityPage, 0);

		public static final ExecutorProperty _Link__description = new EcoreExecutorProperty(DataWebPackage.Literals.LINK__DESCRIPTION, Types._Link, 0);
		public static final ExecutorProperty _Link__externalURL = new EcoreExecutorProperty(DataWebPackage.Literals.LINK__EXTERNAL_URL, Types._Link, 1);
		public static final ExecutorProperty _Link__Page__link = new ExecutorPropertyWithImplementation("Page", Types._Link, 2, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.PAGE__LINK));

		public static final ExecutorProperty _MCQuestion__option = new EcoreExecutorProperty(DataWebPackage.Literals.MC_QUESTION__OPTION, Types._MCQuestion, 0);

		public static final ExecutorProperty _Page__id = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__ID, Types._Page, 0);
		public static final ExecutorProperty _Page__link = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__LINK, Types._Page, 1);
		public static final ExecutorProperty _Page__metaDescription = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__META_DESCRIPTION, Types._Page, 2);
		public static final ExecutorProperty _Page__metaKeywords = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__META_KEYWORDS, Types._Page, 3);
		public static final ExecutorProperty _Page__socialcontent = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__SOCIALCONTENT, Types._Page, 4);
		public static final ExecutorProperty _Page__title = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE__TITLE, Types._Page, 5);
		public static final ExecutorProperty _Page__Application__page = new ExecutorPropertyWithImplementation("Application", Types._Page, 6, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.APPLICATION__PAGE));
		public static final ExecutorProperty _Page__Role__accessiblePages = new ExecutorPropertyWithImplementation("Role", Types._Page, 7, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.ROLE__ACCESSIBLE_PAGES));

		public static final ExecutorProperty _PageConfig__attribute = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE_CONFIG__ATTRIBUTE, Types._PageConfig, 0);
		public static final ExecutorProperty _PageConfig__pageType = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE_CONFIG__PAGE_TYPE, Types._PageConfig, 1);
		public static final ExecutorProperty _PageConfig__pagination = new EcoreExecutorProperty(DataWebPackage.Literals.PAGE_CONFIG__PAGINATION, Types._PageConfig, 2);
		public static final ExecutorProperty _PageConfig__Entity__pageconfig = new ExecutorPropertyWithImplementation("Entity", Types._PageConfig, 3, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.ENTITY__PAGECONFIG));

		public static final ExecutorProperty _Pagination__pageSize = new EcoreExecutorProperty(DataWebPackage.Literals.PAGINATION__PAGE_SIZE, Types._Pagination, 0);
		public static final ExecutorProperty _Pagination__PageConfig__pagination = new ExecutorPropertyWithImplementation("PageConfig", Types._Pagination, 1, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.PAGE_CONFIG__PAGINATION));

		public static final ExecutorProperty _Question__id = new EcoreExecutorProperty(DataWebPackage.Literals.QUESTION__ID, Types._Question, 0);
		public static final ExecutorProperty _Question__isMandatory = new EcoreExecutorProperty(DataWebPackage.Literals.QUESTION__IS_MANDATORY, Types._Question, 1);
		public static final ExecutorProperty _Question__text = new EcoreExecutorProperty(DataWebPackage.Literals.QUESTION__TEXT, Types._Question, 2);
		public static final ExecutorProperty _Question__Survey__question = new ExecutorPropertyWithImplementation("Survey", Types._Question, 3, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.SURVEY__QUESTION));

		public static final ExecutorProperty _Reference__multiplicity = new EcoreExecutorProperty(DataWebPackage.Literals.REFERENCE__MULTIPLICITY, Types._Reference, 0);
		public static final ExecutorProperty _Reference__name = new EcoreExecutorProperty(DataWebPackage.Literals.REFERENCE__NAME, Types._Reference, 1);
		public static final ExecutorProperty _Reference__Entity__reference = new ExecutorPropertyWithImplementation("Entity", Types._Reference, 2, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.ENTITY__REFERENCE));

		public static final ExecutorProperty _Role__accessiblePages = new EcoreExecutorProperty(DataWebPackage.Literals.ROLE__ACCESSIBLE_PAGES, Types._Role, 0);
		public static final ExecutorProperty _Role__name = new EcoreExecutorProperty(DataWebPackage.Literals.ROLE__NAME, Types._Role, 1);
		public static final ExecutorProperty _Role__numeroEntidadesAccesibles = new EcoreExecutorProperty(DataWebPackage.Literals.ROLE__NUMERO_ENTIDADES_ACCESIBLES, Types._Role, 2);
		public static final ExecutorProperty _Role__paginasMediasAccesibles = new EcoreExecutorProperty(DataWebPackage.Literals.ROLE__PAGINAS_MEDIAS_ACCESIBLES, Types._Role, 3);
		public static final ExecutorProperty _Role__permissions = new EcoreExecutorProperty(DataWebPackage.Literals.ROLE__PERMISSIONS, Types._Role, 4);
		public static final ExecutorProperty _Role__Application__role = new ExecutorPropertyWithImplementation("Application", Types._Role, 5, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.APPLICATION__ROLE));

		public static final ExecutorProperty _SocialContent__type = new EcoreExecutorProperty(DataWebPackage.Literals.SOCIAL_CONTENT__TYPE, Types._SocialContent, 0);
		public static final ExecutorProperty _SocialContent__uri = new EcoreExecutorProperty(DataWebPackage.Literals.SOCIAL_CONTENT__URI, Types._SocialContent, 1);
		public static final ExecutorProperty _SocialContent__Application__socialcontent = new ExecutorPropertyWithImplementation("Application", Types._SocialContent, 2, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.APPLICATION__SOCIALCONTENT));
		public static final ExecutorProperty _SocialContent__Page__socialcontent = new ExecutorPropertyWithImplementation("Page", Types._SocialContent, 3, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.PAGE__SOCIALCONTENT));

		public static final ExecutorProperty _Survey__numeroPregSelect = new EcoreExecutorProperty(DataWebPackage.Literals.SURVEY__NUMERO_PREG_SELECT, Types._Survey, 0);
		public static final ExecutorProperty _Survey__numeroPregVF = new EcoreExecutorProperty(DataWebPackage.Literals.SURVEY__NUMERO_PREG_VF, Types._Survey, 1);
		public static final ExecutorProperty _Survey__question = new EcoreExecutorProperty(DataWebPackage.Literals.SURVEY__QUESTION, Types._Survey, 2);
		public static final ExecutorProperty _Survey__representation = new EcoreExecutorProperty(DataWebPackage.Literals.SURVEY__REPRESENTATION, Types._Survey, 3);
		public static final ExecutorProperty _Survey__SurveyPage__survey = new ExecutorPropertyWithImplementation("SurveyPage", Types._Survey, 4, new EcoreLibraryOppositeProperty(DataWebPackage.Literals.SURVEY_PAGE__SURVEY));

		public static final ExecutorProperty _SurveyPage__survey = new EcoreExecutorProperty(DataWebPackage.Literals.SURVEY_PAGE__SURVEY, Types._SurveyPage, 0);

		public static final ExecutorProperty _TrueFalseQuestion__correctAnswer = new EcoreExecutorProperty(DataWebPackage.Literals.TRUE_FALSE_QUESTION__CORRECT_ANSWER, Types._TrueFalseQuestion, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AnswerOption =
			{
				Fragments._AnswerOption__OclAny /* 0 */,
				Fragments._AnswerOption__OclElement /* 1 */,
				Fragments._AnswerOption__AnswerOption /* 2 */
			};
		private static final int /*@NonNull*/ [] __AnswerOption = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Application =
			{
				Fragments._Application__OclAny /* 0 */,
				Fragments._Application__OclElement /* 1 */,
				Fragments._Application__Application /* 2 */
			};
		private static final int /*@NonNull*/ [] __Application = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__Attribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ChartType =
			{
				Fragments._ChartType__OclAny /* 0 */,
				Fragments._ChartType__OclElement /* 1 */,
				Fragments._ChartType__OclType /* 2 */,
				Fragments._ChartType__OclEnumeration /* 3 */,
				Fragments._ChartType__ChartType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ChartType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EntityPage =
			{
				Fragments._EntityPage__OclAny /* 0 */,
				Fragments._EntityPage__OclElement /* 1 */,
				Fragments._EntityPage__Page /* 2 */,
				Fragments._EntityPage__EntityPage /* 3 */
			};
		private static final int /*@NonNull*/ [] __EntityPage = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__Link /* 2 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MCQuestion =
			{
				Fragments._MCQuestion__OclAny /* 0 */,
				Fragments._MCQuestion__OclElement /* 1 */,
				Fragments._MCQuestion__Question /* 2 */,
				Fragments._MCQuestion__MCQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __MCQuestion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Multiplicity =
			{
				Fragments._Multiplicity__OclAny /* 0 */,
				Fragments._Multiplicity__OclElement /* 1 */,
				Fragments._Multiplicity__OclType /* 2 */,
				Fragments._Multiplicity__OclEnumeration /* 3 */,
				Fragments._Multiplicity__Multiplicity /* 4 */
			};
		private static final int /*@NonNull*/ [] __Multiplicity = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PageConfig =
			{
				Fragments._PageConfig__OclAny /* 0 */,
				Fragments._PageConfig__OclElement /* 1 */,
				Fragments._PageConfig__PageConfig /* 2 */
			};
		private static final int /*@NonNull*/ [] __PageConfig = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PageType =
			{
				Fragments._PageType__OclAny /* 0 */,
				Fragments._PageType__OclElement /* 1 */,
				Fragments._PageType__OclType /* 2 */,
				Fragments._PageType__OclEnumeration /* 3 */,
				Fragments._PageType__PageType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PageType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pagination =
			{
				Fragments._Pagination__OclAny /* 0 */,
				Fragments._Pagination__OclElement /* 1 */,
				Fragments._Pagination__Pagination /* 2 */
			};
		private static final int /*@NonNull*/ [] __Pagination = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PermissionType =
			{
				Fragments._PermissionType__OclAny /* 0 */,
				Fragments._PermissionType__OclElement /* 1 */,
				Fragments._PermissionType__OclType /* 2 */,
				Fragments._PermissionType__OclEnumeration /* 3 */,
				Fragments._PermissionType__PermissionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PermissionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Question =
			{
				Fragments._Question__OclAny /* 0 */,
				Fragments._Question__OclElement /* 1 */,
				Fragments._Question__Question /* 2 */
			};
		private static final int /*@NonNull*/ [] __Question = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reference =
			{
				Fragments._Reference__OclAny /* 0 */,
				Fragments._Reference__OclElement /* 1 */,
				Fragments._Reference__Reference /* 2 */
			};
		private static final int /*@NonNull*/ [] __Reference = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__Role /* 2 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ShortQuestion =
			{
				Fragments._ShortQuestion__OclAny /* 0 */,
				Fragments._ShortQuestion__OclElement /* 1 */,
				Fragments._ShortQuestion__Question /* 2 */,
				Fragments._ShortQuestion__ShortQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __ShortQuestion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SocialContent =
			{
				Fragments._SocialContent__OclAny /* 0 */,
				Fragments._SocialContent__OclElement /* 1 */,
				Fragments._SocialContent__SocialContent /* 2 */
			};
		private static final int /*@NonNull*/ [] __SocialContent = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SocialType =
			{
				Fragments._SocialType__OclAny /* 0 */,
				Fragments._SocialType__OclElement /* 1 */,
				Fragments._SocialType__OclType /* 2 */,
				Fragments._SocialType__OclEnumeration /* 3 */,
				Fragments._SocialType__SocialType /* 4 */
			};
		private static final int /*@NonNull*/ [] __SocialType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Survey =
			{
				Fragments._Survey__OclAny /* 0 */,
				Fragments._Survey__OclElement /* 1 */,
				Fragments._Survey__Survey /* 2 */
			};
		private static final int /*@NonNull*/ [] __Survey = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SurveyPage =
			{
				Fragments._SurveyPage__OclAny /* 0 */,
				Fragments._SurveyPage__OclElement /* 1 */,
				Fragments._SurveyPage__Page /* 2 */,
				Fragments._SurveyPage__SurveyPage /* 3 */
			};
		private static final int /*@NonNull*/ [] __SurveyPage = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TrueFalseQuestion =
			{
				Fragments._TrueFalseQuestion__OclAny /* 0 */,
				Fragments._TrueFalseQuestion__OclElement /* 1 */,
				Fragments._TrueFalseQuestion__Question /* 2 */,
				Fragments._TrueFalseQuestion__TrueFalseQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __TrueFalseQuestion = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AnswerOption.initFragments(_AnswerOption, __AnswerOption);
			Types._Application.initFragments(_Application, __Application);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._ChartType.initFragments(_ChartType, __ChartType);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._EntityPage.initFragments(_EntityPage, __EntityPage);
			Types._Link.initFragments(_Link, __Link);
			Types._MCQuestion.initFragments(_MCQuestion, __MCQuestion);
			Types._Multiplicity.initFragments(_Multiplicity, __Multiplicity);
			Types._Page.initFragments(_Page, __Page);
			Types._PageConfig.initFragments(_PageConfig, __PageConfig);
			Types._PageType.initFragments(_PageType, __PageType);
			Types._Pagination.initFragments(_Pagination, __Pagination);
			Types._PermissionType.initFragments(_PermissionType, __PermissionType);
			Types._Question.initFragments(_Question, __Question);
			Types._Reference.initFragments(_Reference, __Reference);
			Types._Role.initFragments(_Role, __Role);
			Types._ShortQuestion.initFragments(_ShortQuestion, __ShortQuestion);
			Types._SocialContent.initFragments(_SocialContent, __SocialContent);
			Types._SocialType.initFragments(_SocialType, __SocialType);
			Types._Survey.initFragments(_Survey, __Survey);
			Types._SurveyPage.initFragments(_SurveyPage, __SurveyPage);
			Types._TrueFalseQuestion.initFragments(_TrueFalseQuestion, __TrueFalseQuestion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__AnswerOption = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Application__Application = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Application__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ChartType__ChartType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ChartType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ChartType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ChartType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ChartType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EntityPage__EntityPage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EntityPage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EntityPage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EntityPage__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Link__Link = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MCQuestion__MCQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MCQuestion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MCQuestion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MCQuestion__Question = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Multiplicity__Multiplicity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiplicity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiplicity__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiplicity__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiplicity__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PageConfig__PageConfig = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageConfig__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageConfig__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PageType__PageType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PageType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PageType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Pagination__Pagination = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pagination__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pagination__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PermissionType__PermissionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PermissionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PermissionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PermissionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PermissionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Question__Question = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Reference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ShortQuestion__ShortQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ShortQuestion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ShortQuestion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ShortQuestion__Question = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SocialContent__SocialContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SocialType__SocialType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SocialType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Survey__Survey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Survey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Survey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SurveyPage__SurveyPage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SurveyPage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SurveyPage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SurveyPage__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _TrueFalseQuestion__TrueFalseQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TrueFalseQuestion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrueFalseQuestion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TrueFalseQuestion__Question = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnswerOption__AnswerOption.initOperations(_AnswerOption__AnswerOption);
			Fragments._AnswerOption__OclAny.initOperations(_AnswerOption__OclAny);
			Fragments._AnswerOption__OclElement.initOperations(_AnswerOption__OclElement);

			Fragments._Application__Application.initOperations(_Application__Application);
			Fragments._Application__OclAny.initOperations(_Application__OclAny);
			Fragments._Application__OclElement.initOperations(_Application__OclElement);

			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._ChartType__ChartType.initOperations(_ChartType__ChartType);
			Fragments._ChartType__OclAny.initOperations(_ChartType__OclAny);
			Fragments._ChartType__OclElement.initOperations(_ChartType__OclElement);
			Fragments._ChartType__OclEnumeration.initOperations(_ChartType__OclEnumeration);
			Fragments._ChartType__OclType.initOperations(_ChartType__OclType);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._EntityPage__EntityPage.initOperations(_EntityPage__EntityPage);
			Fragments._EntityPage__OclAny.initOperations(_EntityPage__OclAny);
			Fragments._EntityPage__OclElement.initOperations(_EntityPage__OclElement);
			Fragments._EntityPage__Page.initOperations(_EntityPage__Page);

			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._MCQuestion__MCQuestion.initOperations(_MCQuestion__MCQuestion);
			Fragments._MCQuestion__OclAny.initOperations(_MCQuestion__OclAny);
			Fragments._MCQuestion__OclElement.initOperations(_MCQuestion__OclElement);
			Fragments._MCQuestion__Question.initOperations(_MCQuestion__Question);

			Fragments._Multiplicity__Multiplicity.initOperations(_Multiplicity__Multiplicity);
			Fragments._Multiplicity__OclAny.initOperations(_Multiplicity__OclAny);
			Fragments._Multiplicity__OclElement.initOperations(_Multiplicity__OclElement);
			Fragments._Multiplicity__OclEnumeration.initOperations(_Multiplicity__OclEnumeration);
			Fragments._Multiplicity__OclType.initOperations(_Multiplicity__OclType);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._PageConfig__OclAny.initOperations(_PageConfig__OclAny);
			Fragments._PageConfig__OclElement.initOperations(_PageConfig__OclElement);
			Fragments._PageConfig__PageConfig.initOperations(_PageConfig__PageConfig);

			Fragments._PageType__OclAny.initOperations(_PageType__OclAny);
			Fragments._PageType__OclElement.initOperations(_PageType__OclElement);
			Fragments._PageType__OclEnumeration.initOperations(_PageType__OclEnumeration);
			Fragments._PageType__OclType.initOperations(_PageType__OclType);
			Fragments._PageType__PageType.initOperations(_PageType__PageType);

			Fragments._Pagination__OclAny.initOperations(_Pagination__OclAny);
			Fragments._Pagination__OclElement.initOperations(_Pagination__OclElement);
			Fragments._Pagination__Pagination.initOperations(_Pagination__Pagination);

			Fragments._PermissionType__OclAny.initOperations(_PermissionType__OclAny);
			Fragments._PermissionType__OclElement.initOperations(_PermissionType__OclElement);
			Fragments._PermissionType__OclEnumeration.initOperations(_PermissionType__OclEnumeration);
			Fragments._PermissionType__OclType.initOperations(_PermissionType__OclType);
			Fragments._PermissionType__PermissionType.initOperations(_PermissionType__PermissionType);

			Fragments._Question__OclAny.initOperations(_Question__OclAny);
			Fragments._Question__OclElement.initOperations(_Question__OclElement);
			Fragments._Question__Question.initOperations(_Question__Question);

			Fragments._Reference__OclAny.initOperations(_Reference__OclAny);
			Fragments._Reference__OclElement.initOperations(_Reference__OclElement);
			Fragments._Reference__Reference.initOperations(_Reference__Reference);

			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._ShortQuestion__OclAny.initOperations(_ShortQuestion__OclAny);
			Fragments._ShortQuestion__OclElement.initOperations(_ShortQuestion__OclElement);
			Fragments._ShortQuestion__Question.initOperations(_ShortQuestion__Question);
			Fragments._ShortQuestion__ShortQuestion.initOperations(_ShortQuestion__ShortQuestion);

			Fragments._SocialContent__OclAny.initOperations(_SocialContent__OclAny);
			Fragments._SocialContent__OclElement.initOperations(_SocialContent__OclElement);
			Fragments._SocialContent__SocialContent.initOperations(_SocialContent__SocialContent);

			Fragments._SocialType__OclAny.initOperations(_SocialType__OclAny);
			Fragments._SocialType__OclElement.initOperations(_SocialType__OclElement);
			Fragments._SocialType__OclEnumeration.initOperations(_SocialType__OclEnumeration);
			Fragments._SocialType__OclType.initOperations(_SocialType__OclType);
			Fragments._SocialType__SocialType.initOperations(_SocialType__SocialType);

			Fragments._Survey__OclAny.initOperations(_Survey__OclAny);
			Fragments._Survey__OclElement.initOperations(_Survey__OclElement);
			Fragments._Survey__Survey.initOperations(_Survey__Survey);

			Fragments._SurveyPage__OclAny.initOperations(_SurveyPage__OclAny);
			Fragments._SurveyPage__OclElement.initOperations(_SurveyPage__OclElement);
			Fragments._SurveyPage__Page.initOperations(_SurveyPage__Page);
			Fragments._SurveyPage__SurveyPage.initOperations(_SurveyPage__SurveyPage);

			Fragments._TrueFalseQuestion__OclAny.initOperations(_TrueFalseQuestion__OclAny);
			Fragments._TrueFalseQuestion__OclElement.initOperations(_TrueFalseQuestion__OclElement);
			Fragments._TrueFalseQuestion__Question.initOperations(_TrueFalseQuestion__Question);
			Fragments._TrueFalseQuestion__TrueFalseQuestion.initOperations(_TrueFalseQuestion__TrueFalseQuestion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AnswerOption = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._AnswerOption__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Application = {
			DataWebTables.Properties._Application__entity,
			DataWebTables.Properties._Application__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Application__page,
			DataWebTables.Properties._Application__role,
			DataWebTables.Properties._Application__socialcontent
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			DataWebTables.Properties._Attribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ChartType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			DataWebTables.Properties._Entity__attribute,
			DataWebTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Entity__pageconfig,
			DataWebTables.Properties._Entity__reference
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EntityPage = {
			DataWebTables.Properties._EntityPage__entity,
			DataWebTables.Properties._Page__id,
			DataWebTables.Properties._Page__link,
			DataWebTables.Properties._Page__metaDescription,
			DataWebTables.Properties._Page__metaKeywords,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Page__socialcontent,
			DataWebTables.Properties._Page__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Link = {
			DataWebTables.Properties._Link__description,
			DataWebTables.Properties._Link__externalURL,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MCQuestion = {
			DataWebTables.Properties._Question__id,
			DataWebTables.Properties._Question__isMandatory,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._MCQuestion__option,
			DataWebTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Multiplicity = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			DataWebTables.Properties._Page__id,
			DataWebTables.Properties._Page__link,
			DataWebTables.Properties._Page__metaDescription,
			DataWebTables.Properties._Page__metaKeywords,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Page__socialcontent,
			DataWebTables.Properties._Page__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PageConfig = {
			DataWebTables.Properties._PageConfig__attribute,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._PageConfig__pageType,
			DataWebTables.Properties._PageConfig__pagination
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PageType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pagination = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Pagination__pageSize
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PermissionType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Question = {
			DataWebTables.Properties._Question__id,
			DataWebTables.Properties._Question__isMandatory,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reference = {
			DataWebTables.Properties._Reference__multiplicity,
			DataWebTables.Properties._Reference__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			DataWebTables.Properties._Role__accessiblePages,
			DataWebTables.Properties._Role__name,
			DataWebTables.Properties._Role__numeroEntidadesAccesibles,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Role__paginasMediasAccesibles,
			DataWebTables.Properties._Role__permissions
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ShortQuestion = {
			DataWebTables.Properties._Question__id,
			DataWebTables.Properties._Question__isMandatory,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SocialContent = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._SocialContent__type,
			DataWebTables.Properties._SocialContent__uri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SocialType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Survey = {
			DataWebTables.Properties._Survey__numeroPregSelect,
			DataWebTables.Properties._Survey__numeroPregVF,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Survey__question,
			DataWebTables.Properties._Survey__representation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SurveyPage = {
			DataWebTables.Properties._Page__id,
			DataWebTables.Properties._Page__link,
			DataWebTables.Properties._Page__metaDescription,
			DataWebTables.Properties._Page__metaKeywords,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Page__socialcontent,
			DataWebTables.Properties._SurveyPage__survey,
			DataWebTables.Properties._Page__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TrueFalseQuestion = {
			DataWebTables.Properties._TrueFalseQuestion__correctAnswer,
			DataWebTables.Properties._Question__id,
			DataWebTables.Properties._Question__isMandatory,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataWebTables.Properties._Question__text
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnswerOption__AnswerOption.initProperties(_AnswerOption);
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._ChartType__ChartType.initProperties(_ChartType);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._EntityPage__EntityPage.initProperties(_EntityPage);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._MCQuestion__MCQuestion.initProperties(_MCQuestion);
			Fragments._Multiplicity__Multiplicity.initProperties(_Multiplicity);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._PageConfig__PageConfig.initProperties(_PageConfig);
			Fragments._PageType__PageType.initProperties(_PageType);
			Fragments._Pagination__Pagination.initProperties(_Pagination);
			Fragments._PermissionType__PermissionType.initProperties(_PermissionType);
			Fragments._Question__Question.initProperties(_Question);
			Fragments._Reference__Reference.initProperties(_Reference);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._ShortQuestion__ShortQuestion.initProperties(_ShortQuestion);
			Fragments._SocialContent__SocialContent.initProperties(_SocialContent);
			Fragments._SocialType__SocialType.initProperties(_SocialType);
			Fragments._Survey__Survey.initProperties(_Survey);
			Fragments._SurveyPage__SurveyPage.initProperties(_SurveyPage);
			Fragments._TrueFalseQuestion__TrueFalseQuestion.initProperties(_TrueFalseQuestion);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ChartType__Text = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.CHART_TYPE.getEEnumLiteral("Text"), Types._ChartType, 0);
		public static final EcoreExecutorEnumerationLiteral _ChartType__Bar = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.CHART_TYPE.getEEnumLiteral("Bar"), Types._ChartType, 1);
		public static final EcoreExecutorEnumerationLiteral _ChartType__Pie = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.CHART_TYPE.getEEnumLiteral("Pie"), Types._ChartType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ChartType = {
			_ChartType__Text,
			_ChartType__Bar,
			_ChartType__Pie
		};

		public static final EcoreExecutorEnumerationLiteral _DataType__Integer = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.DATA_TYPE.getEEnumLiteral("Integer"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__Boolean = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.DATA_TYPE.getEEnumLiteral("Boolean"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__String = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.DATA_TYPE.getEEnumLiteral("String"), Types._DataType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__Integer,
			_DataType__Boolean,
			_DataType__String
		};

		public static final EcoreExecutorEnumerationLiteral _Multiplicity__ZERO_ONE = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.MULTIPLICITY.getEEnumLiteral("ZERO_ONE"), Types._Multiplicity, 0);
		public static final EcoreExecutorEnumerationLiteral _Multiplicity__ONE_ONE = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.MULTIPLICITY.getEEnumLiteral("ONE_ONE"), Types._Multiplicity, 1);
		public static final EcoreExecutorEnumerationLiteral _Multiplicity__ZERO_MANY = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.MULTIPLICITY.getEEnumLiteral("ZERO_MANY"), Types._Multiplicity, 2);
		public static final EcoreExecutorEnumerationLiteral _Multiplicity__ONE_MANY = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.MULTIPLICITY.getEEnumLiteral("ONE_MANY"), Types._Multiplicity, 3);
		public static final EcoreExecutorEnumerationLiteral _Multiplicity__MANY_MANY = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.MULTIPLICITY.getEEnumLiteral("MANY_MANY"), Types._Multiplicity, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Multiplicity = {
			_Multiplicity__ZERO_ONE,
			_Multiplicity__ONE_ONE,
			_Multiplicity__ZERO_MANY,
			_Multiplicity__ONE_MANY,
			_Multiplicity__MANY_MANY
		};

		public static final EcoreExecutorEnumerationLiteral _PageType__Create = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("Create"), Types._PageType, 0);
		public static final EcoreExecutorEnumerationLiteral _PageType__Index = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("Index"), Types._PageType, 1);
		public static final EcoreExecutorEnumerationLiteral _PageType__ExtendedIndex = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("ExtendedIndex"), Types._PageType, 2);
		public static final EcoreExecutorEnumerationLiteral _PageType__IndexDetail = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("IndexDetail"), Types._PageType, 3);
		public static final EcoreExecutorEnumerationLiteral _PageType__Detail = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("Detail"), Types._PageType, 4);
		public static final EcoreExecutorEnumerationLiteral _PageType__Update = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("Update"), Types._PageType, 5);
		public static final EcoreExecutorEnumerationLiteral _PageType__Delete = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("Delete"), Types._PageType, 6);
		public static final EcoreExecutorEnumerationLiteral _PageType__CRUD = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PAGE_TYPE.getEEnumLiteral("CRUD"), Types._PageType, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PageType = {
			_PageType__Create,
			_PageType__Index,
			_PageType__ExtendedIndex,
			_PageType__IndexDetail,
			_PageType__Detail,
			_PageType__Update,
			_PageType__Delete,
			_PageType__CRUD
		};

		public static final EcoreExecutorEnumerationLiteral _PermissionType__READ = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PERMISSION_TYPE.getEEnumLiteral("READ"), Types._PermissionType, 0);
		public static final EcoreExecutorEnumerationLiteral _PermissionType__WRITE = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PERMISSION_TYPE.getEEnumLiteral("WRITE"), Types._PermissionType, 1);
		public static final EcoreExecutorEnumerationLiteral _PermissionType__ADMIN = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.PERMISSION_TYPE.getEEnumLiteral("ADMIN"), Types._PermissionType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PermissionType = {
			_PermissionType__READ,
			_PermissionType__WRITE,
			_PermissionType__ADMIN
		};

		public static final EcoreExecutorEnumerationLiteral _SocialType__Twitter = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.SOCIAL_TYPE.getEEnumLiteral("Twitter"), Types._SocialType, 0);
		public static final EcoreExecutorEnumerationLiteral _SocialType__Facebook = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.SOCIAL_TYPE.getEEnumLiteral("Facebook"), Types._SocialType, 1);
		public static final EcoreExecutorEnumerationLiteral _SocialType__RSS = new EcoreExecutorEnumerationLiteral(DataWebPackage.Literals.SOCIAL_TYPE.getEEnumLiteral("RSS"), Types._SocialType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SocialType = {
			_SocialType__Twitter,
			_SocialType__Facebook,
			_SocialType__RSS
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ChartType.initLiterals(_ChartType);
			Types._DataType.initLiterals(_DataType);
			Types._Multiplicity.initLiterals(_Multiplicity);
			Types._PageType.initLiterals(_PageType);
			Types._PermissionType.initLiterals(_PermissionType);
			Types._SocialType.initLiterals(_SocialType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataWebTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DataWebTables();
	}

	private DataWebTables() {
		super(DataWebPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		DataWebPackage.Literals.APPLICATION
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
