/**
 */
package dataWeb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Basic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dataWeb.DataWebPackage#getComponentBasic()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R02_CRUDIncompatible R03_IndiceDetalle R05_NoSelfReference R08_UniqueIndexPerEntity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R02_CRUDIncompatible='pageconfig-&gt;exists(pc | pc.pageType = PageType::CRUD) implies pageconfig-&gt;forAll(pc | pc.pageType = PageType::CRUD)' R03_IndiceDetalle='(pageconfig-&gt;exists(pc | pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex) implies pageconfig-&gt;exists(pc | pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail)) and (pageconfig-&gt;exists(pc | pc.pageType = PageType::Detail or pc.pageType = PageType::IndexDetail) implies pageconfig-&gt;exists(pc | pc.pageType = PageType::Index or pc.pageType = PageType::ExtendedIndex))' R05_NoSelfReference='reference-&gt;forAll(ref | ref.name &lt;&gt; name)' R08_UniqueIndexPerEntity='pageconfig-&gt;select(pc | pc.pageType = PageType::Index)-&gt;size() &lt;= 1'"
 *        annotation="gmf.node label='name' color='200,200,255'"
 * @generated
 */
public enum ComponentBasic implements Enumerator {
	;

	/**
	 * An array of all the '<em><b>Component Basic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentBasic[] VALUES_ARRAY =
		new ComponentBasic[] {
		};

	/**
	 * A public read-only list of all the '<em><b>Component Basic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentBasic> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Basic</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentBasic get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentBasic result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Basic</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentBasic getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentBasic result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Basic</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentBasic get(int value) {
		switch (value) {
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
	private ComponentBasic(int value, String name, String literal) {
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
	
} //ComponentBasic
