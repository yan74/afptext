/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.OVS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.OVSImpl#getBYPSIDEN <em>BYPSIDEN</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.OVSImpl#getOVERCHAR <em>OVERCHAR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OVSImpl extends tripletImpl implements OVS
{
  /**
   * The default value of the '{@link #getBYPSIDEN() <em>BYPSIDEN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBYPSIDEN()
   * @generated
   * @ordered
   */
  protected static final Integer BYPSIDEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBYPSIDEN() <em>BYPSIDEN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBYPSIDEN()
   * @generated
   * @ordered
   */
  protected Integer bypsiden = BYPSIDEN_EDEFAULT;

  /**
   * The default value of the '{@link #getOVERCHAR() <em>OVERCHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOVERCHAR()
   * @generated
   * @ordered
   */
  protected static final Integer OVERCHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOVERCHAR() <em>OVERCHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOVERCHAR()
   * @generated
   * @ordered
   */
  protected Integer overchar = OVERCHAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OVSImpl()
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
    return AfpTextPackage.eINSTANCE.getOVS();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getBYPSIDEN()
  {
    return bypsiden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBYPSIDEN(Integer newBYPSIDEN)
  {
    Integer oldBYPSIDEN = bypsiden;
    bypsiden = newBYPSIDEN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.OVS__BYPSIDEN, oldBYPSIDEN, bypsiden));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getOVERCHAR()
  {
    return overchar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOVERCHAR(Integer newOVERCHAR)
  {
    Integer oldOVERCHAR = overchar;
    overchar = newOVERCHAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.OVS__OVERCHAR, oldOVERCHAR, overchar));
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
      case AfpTextPackage.OVS__BYPSIDEN:
        return getBYPSIDEN();
      case AfpTextPackage.OVS__OVERCHAR:
        return getOVERCHAR();
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
      case AfpTextPackage.OVS__BYPSIDEN:
        setBYPSIDEN((Integer)newValue);
        return;
      case AfpTextPackage.OVS__OVERCHAR:
        setOVERCHAR((Integer)newValue);
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
      case AfpTextPackage.OVS__BYPSIDEN:
        setBYPSIDEN(BYPSIDEN_EDEFAULT);
        return;
      case AfpTextPackage.OVS__OVERCHAR:
        setOVERCHAR(OVERCHAR_EDEFAULT);
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
      case AfpTextPackage.OVS__BYPSIDEN:
        return BYPSIDEN_EDEFAULT == null ? bypsiden != null : !BYPSIDEN_EDEFAULT.equals(bypsiden);
      case AfpTextPackage.OVS__OVERCHAR:
        return OVERCHAR_EDEFAULT == null ? overchar != null : !OVERCHAR_EDEFAULT.equals(overchar);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (BYPSIDEN: ");
    result.append(bypsiden);
    result.append(", OVERCHAR: ");
    result.append(overchar);
    result.append(')');
    return result.toString();
  }

} //OVSImpl
