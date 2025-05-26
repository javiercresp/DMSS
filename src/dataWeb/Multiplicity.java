/**
 */
package dataWeb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebPackage#getMultiplicity()
 * @model annotation="gmf.node label='name' color='220,220,220'"
 * @generated
 */
public enum Multiplicity implements Enumerator {
	/**
	 * The '<em><b>ZERO ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_ONE(0, "ZERO_ONE", "ZERO_ONE"),

	/**
	 * The '<em><b>ONE ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_ONE(1, "ONE_ONE", "ONE_ONE"),

	/**
	 * The '<em><b>ZERO MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_MANY(2, "ZERO_MANY", "ZERO_MANY"),

	/**
	 * The '<em><b>ONE MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_MANY(3, "ONE_MANY", "ONE_MANY"),

	/**
	 * The '<em><b>MANY MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_MANY(4, "MANY_MANY", "MANY_MANY");

	/**
	 * The '<em><b>ZERO ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_ONE_VALUE = 0;

	/**
	 * The '<em><b>ONE ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_ONE_VALUE = 1;

	/**
	 * The '<em><b>ZERO MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_MANY_VALUE = 2;

	/**
	 * The '<em><b>ONE MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_MANY_VALUE = 3;

	/**
	 * The '<em><b>MANY MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY_MANY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicity[] VALUES_ARRAY =
		new Multiplicity[] {
			ZERO_ONE,
			ONE_ONE,
			ZERO_MANY,
			ONE_MANY,
			MANY_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicity get(int value) {
		switch (value) {
			case ZERO_ONE_VALUE: return ZERO_ONE;
			case ONE_ONE_VALUE: return ONE_ONE;
			case ZERO_MANY_VALUE: return ZERO_MANY;
			case ONE_MANY_VALUE: return ONE_MANY;
			case MANY_MANY_VALUE: return MANY_MANY;
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
	private Multiplicity(int value, String name, String literal) {
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
	
} //Multiplicity
