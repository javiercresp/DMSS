/**
 */
package dataWeb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Page Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebPackage#getPageType()
 * @model annotation="gmf.node label='name' color='220,220,220'"
 * @generated
 */
public enum PageType implements Enumerator {
	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "Create", "Create"),

	/**
	 * The '<em><b>Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX(1, "Index", "Index"),

	/**
	 * The '<em><b>Extended Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDED_INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDED_INDEX(2, "ExtendedIndex", "ExtendedIndex"),

	/**
	 * The '<em><b>Index Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX_DETAIL(3, "IndexDetail", "IndexDetail"),

	/**
	 * The '<em><b>Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	DETAIL(4, "Detail", "Detail"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(5, "Update", "Update"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(6, "Delete", "Delete"),

	/**
	 * The '<em><b>CRUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUD_VALUE
	 * @generated
	 * @ordered
	 */
	CRUD(7, "CRUD", "CRUD");

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="Create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX
	 * @model name="Index"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_VALUE = 1;

	/**
	 * The '<em><b>Extended Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDED_INDEX
	 * @model name="ExtendedIndex"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDED_INDEX_VALUE = 2;

	/**
	 * The '<em><b>Index Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEX_DETAIL
	 * @model name="IndexDetail"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_DETAIL_VALUE = 3;

	/**
	 * The '<em><b>Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETAIL
	 * @model name="Detail"
	 * @generated
	 * @ordered
	 */
	public static final int DETAIL_VALUE = 4;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="Update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 5;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="Delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 6;

	/**
	 * The '<em><b>CRUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRUD_VALUE = 7;

	/**
	 * An array of all the '<em><b>Page Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PageType[] VALUES_ARRAY =
		new PageType[] {
			CREATE,
			INDEX,
			EXTENDED_INDEX,
			INDEX_DETAIL,
			DETAIL,
			UPDATE,
			DELETE,
			CRUD,
		};

	/**
	 * A public read-only list of all the '<em><b>Page Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Page Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PageType get(int value) {
		switch (value) {
			case CREATE_VALUE: return CREATE;
			case INDEX_VALUE: return INDEX;
			case EXTENDED_INDEX_VALUE: return EXTENDED_INDEX;
			case INDEX_DETAIL_VALUE: return INDEX_DETAIL;
			case DETAIL_VALUE: return DETAIL;
			case UPDATE_VALUE: return UPDATE;
			case DELETE_VALUE: return DELETE;
			case CRUD_VALUE: return CRUD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PageType
