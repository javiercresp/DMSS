/**
 */
package dataWeb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Social Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebPackage#getSocialType()
 * @model annotation="gmf.node label='name' color='220,220,220'"
 * @generated
 */
public enum SocialType implements Enumerator {
	/**
	 * The '<em><b>Twitter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER_VALUE
	 * @generated
	 * @ordered
	 */
	TWITTER(0, "Twitter", "Twitter"),

	/**
	 * The '<em><b>Facebook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK_VALUE
	 * @generated
	 * @ordered
	 */
	FACEBOOK(1, "Facebook", "Facebook"),

	/**
	 * The '<em><b>RSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSS_VALUE
	 * @generated
	 * @ordered
	 */
	RSS(2, "RSS", "RSS");

	/**
	 * The '<em><b>Twitter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER
	 * @model name="Twitter"
	 * @generated
	 * @ordered
	 */
	public static final int TWITTER_VALUE = 0;

	/**
	 * The '<em><b>Facebook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACEBOOK
	 * @model name="Facebook"
	 * @generated
	 * @ordered
	 */
	public static final int FACEBOOK_VALUE = 1;

	/**
	 * The '<em><b>RSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Social Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SocialType[] VALUES_ARRAY =
		new SocialType[] {
			TWITTER,
			FACEBOOK,
			RSS,
		};

	/**
	 * A public read-only list of all the '<em><b>Social Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SocialType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Social Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocialType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SocialType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Social Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocialType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SocialType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Social Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocialType get(int value) {
		switch (value) {
			case TWITTER_VALUE: return TWITTER;
			case FACEBOOK_VALUE: return FACEBOOK;
			case RSS_VALUE: return RSS;
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
	private SocialType(int value, String name, String literal) {
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
	
} //SocialType
