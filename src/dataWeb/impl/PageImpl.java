/**
 */
package dataWeb.impl;

import dataWeb.DataWebPackage;
import dataWeb.Link;
import dataWeb.Page;
import dataWeb.SocialContent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataWeb.impl.PageImpl#getLink <em>Link</em>}</li>
 *   <li>{@link dataWeb.impl.PageImpl#getId <em>Id</em>}</li>
 *   <li>{@link dataWeb.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dataWeb.impl.PageImpl#getSocialcontent <em>Socialcontent</em>}</li>
 *   <li>{@link dataWeb.impl.PageImpl#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link dataWeb.impl.PageImpl#getMetaKeywords <em>Meta Keywords</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PageImpl extends EObjectImpl implements Page {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSocialcontent() <em>Socialcontent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialcontent()
	 * @generated
	 * @ordered
	 */
	protected SocialContent socialcontent;

	/**
	 * The default value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected String metaDescription = META_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaKeywords() <em>Meta Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String META_KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaKeywords() <em>Meta Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaKeywords()
	 * @generated
	 * @ordered
	 */
	protected String metaKeywords = META_KEYWORDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, DataWebPackage.PAGE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.PAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialContent getSocialcontent() {
		if (socialcontent != null && socialcontent.eIsProxy()) {
			InternalEObject oldSocialcontent = (InternalEObject)socialcontent;
			socialcontent = (SocialContent)eResolveProxy(oldSocialcontent);
			if (socialcontent != oldSocialcontent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebPackage.PAGE__SOCIALCONTENT, oldSocialcontent, socialcontent));
			}
		}
		return socialcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialContent basicGetSocialcontent() {
		return socialcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialcontent(SocialContent newSocialcontent) {
		SocialContent oldSocialcontent = socialcontent;
		socialcontent = newSocialcontent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.PAGE__SOCIALCONTENT, oldSocialcontent, socialcontent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaDescription() {
		return metaDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDescription(String newMetaDescription) {
		String oldMetaDescription = metaDescription;
		metaDescription = newMetaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.PAGE__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaKeywords() {
		return metaKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaKeywords(String newMetaKeywords) {
		String oldMetaKeywords = metaKeywords;
		metaKeywords = newMetaKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebPackage.PAGE__META_KEYWORDS, oldMetaKeywords, metaKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebPackage.PAGE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebPackage.PAGE__LINK:
				return getLink();
			case DataWebPackage.PAGE__ID:
				return getId();
			case DataWebPackage.PAGE__TITLE:
				return getTitle();
			case DataWebPackage.PAGE__SOCIALCONTENT:
				if (resolve) return getSocialcontent();
				return basicGetSocialcontent();
			case DataWebPackage.PAGE__META_DESCRIPTION:
				return getMetaDescription();
			case DataWebPackage.PAGE__META_KEYWORDS:
				return getMetaKeywords();
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
			case DataWebPackage.PAGE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case DataWebPackage.PAGE__ID:
				setId((String)newValue);
				return;
			case DataWebPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case DataWebPackage.PAGE__SOCIALCONTENT:
				setSocialcontent((SocialContent)newValue);
				return;
			case DataWebPackage.PAGE__META_DESCRIPTION:
				setMetaDescription((String)newValue);
				return;
			case DataWebPackage.PAGE__META_KEYWORDS:
				setMetaKeywords((String)newValue);
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
			case DataWebPackage.PAGE__LINK:
				getLink().clear();
				return;
			case DataWebPackage.PAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case DataWebPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DataWebPackage.PAGE__SOCIALCONTENT:
				setSocialcontent((SocialContent)null);
				return;
			case DataWebPackage.PAGE__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
				return;
			case DataWebPackage.PAGE__META_KEYWORDS:
				setMetaKeywords(META_KEYWORDS_EDEFAULT);
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
			case DataWebPackage.PAGE__LINK:
				return link != null && !link.isEmpty();
			case DataWebPackage.PAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DataWebPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DataWebPackage.PAGE__SOCIALCONTENT:
				return socialcontent != null;
			case DataWebPackage.PAGE__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
			case DataWebPackage.PAGE__META_KEYWORDS:
				return META_KEYWORDS_EDEFAULT == null ? metaKeywords != null : !META_KEYWORDS_EDEFAULT.equals(metaKeywords);
		}
		return super.eIsSet(featureID);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(", metaKeywords: ");
		result.append(metaKeywords);
		result.append(')');
		return result.toString();
	}

} //PageImpl
