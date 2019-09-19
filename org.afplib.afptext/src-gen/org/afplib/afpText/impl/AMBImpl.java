/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AMB;
import org.afplib.afpText.AfpTextPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.AMBImpl#getDSPLCMNT <em>DSPLCMNT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMBImpl extends tripletImpl implements AMB
{
  /**
   * The default value of the '{@link #getDSPLCMNT() <em>DSPLCMNT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDSPLCMNT()
   * @generated
   * @ordered
   */
  protected static final Integer DSPLCMNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDSPLCMNT() <em>DSPLCMNT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDSPLCMNT()
   * @generated
   * @ordered
   */
  protected Integer dsplcmnt = DSPLCMNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AMBImpl()
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
    return AfpTextPackage.eINSTANCE.getAMB();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getDSPLCMNT()
  {
    return dsplcmnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDSPLCMNT(Integer newDSPLCMNT)
  {
    Integer oldDSPLCMNT = dsplcmnt;
    dsplcmnt = newDSPLCMNT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.AMB__DSPLCMNT, oldDSPLCMNT, dsplcmnt));
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
      case AfpTextPackage.AMB__DSPLCMNT:
        return getDSPLCMNT();
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
      case AfpTextPackage.AMB__DSPLCMNT:
        setDSPLCMNT((Integer)newValue);
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
      case AfpTextPackage.AMB__DSPLCMNT:
        setDSPLCMNT(DSPLCMNT_EDEFAULT);
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
      case AfpTextPackage.AMB__DSPLCMNT:
        return DSPLCMNT_EDEFAULT == null ? dsplcmnt != null : !DSPLCMNT_EDEFAULT.equals(dsplcmnt);
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
    result.append(" (DSPLCMNT: ");
    result.append(dsplcmnt);
    result.append(')');
    return result.toString();
  }

} //AMBImpl
