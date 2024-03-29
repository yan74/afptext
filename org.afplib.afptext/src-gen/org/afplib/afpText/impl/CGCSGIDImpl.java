/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.CGCSGID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CGCSGID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.CGCSGIDImpl#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CGCSGIDImpl#getCPGID <em>CPGID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CGCSGIDImpl extends tripletImpl implements CGCSGID
{
  /**
   * The default value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCSGID()
   * @generated
   * @ordered
   */
  protected static final Integer GCSGID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCSGID()
   * @generated
   * @ordered
   */
  protected Integer gcsgid = GCSGID_EDEFAULT;

  /**
   * The default value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPGID()
   * @generated
   * @ordered
   */
  protected static final Integer CPGID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPGID()
   * @generated
   * @ordered
   */
  protected Integer cpgid = CPGID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CGCSGIDImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AfpTextPackage.eINSTANCE.getCGCSGID();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getGCSGID()
  {
    return gcsgid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGCSGID(Integer newGCSGID)
  {
    Integer oldGCSGID = gcsgid;
    gcsgid = newGCSGID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CGCSGID__GCSGID, oldGCSGID, gcsgid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getCPGID()
  {
    return cpgid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCPGID(Integer newCPGID)
  {
    Integer oldCPGID = cpgid;
    cpgid = newCPGID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CGCSGID__CPGID, oldCPGID, cpgid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AfpTextPackage.CGCSGID__GCSGID:
        return getGCSGID();
      case AfpTextPackage.CGCSGID__CPGID:
        return getCPGID();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AfpTextPackage.CGCSGID__GCSGID:
        setGCSGID((Integer)newValue);
        return;
      case AfpTextPackage.CGCSGID__CPGID:
        setCPGID((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AfpTextPackage.CGCSGID__GCSGID:
        setGCSGID(GCSGID_EDEFAULT);
        return;
      case AfpTextPackage.CGCSGID__CPGID:
        setCPGID(CPGID_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AfpTextPackage.CGCSGID__GCSGID:
        return GCSGID_EDEFAULT == null ? gcsgid != null : !GCSGID_EDEFAULT.equals(gcsgid);
      case AfpTextPackage.CGCSGID__CPGID:
        return CPGID_EDEFAULT == null ? cpgid != null : !CPGID_EDEFAULT.equals(cpgid);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (GCSGID: ");
    result.append(gcsgid);
    result.append(", CPGID: ");
    result.append(cpgid);
    result.append(')');
    return result.toString();
  }

} //CGCSGIDImpl
