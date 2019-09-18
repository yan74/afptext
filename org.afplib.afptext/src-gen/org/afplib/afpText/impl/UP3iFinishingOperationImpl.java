/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.UP3iFinishingOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UP 3i Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.UP3iFinishingOperationImpl#getSeqnum <em>Seqnum</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.UP3iFinishingOperationImpl#getUP3iDat <em>UP 3i Dat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UP3iFinishingOperationImpl extends tripletImpl implements UP3iFinishingOperation
{
  /**
   * The default value of the '{@link #getSeqnum() <em>Seqnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqnum()
   * @generated
   * @ordered
   */
  protected static final int SEQNUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeqnum() <em>Seqnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqnum()
   * @generated
   * @ordered
   */
  protected int seqnum = SEQNUM_EDEFAULT;

  /**
   * The default value of the '{@link #getUP3iDat() <em>UP 3i Dat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUP3iDat()
   * @generated
   * @ordered
   */
  protected static final String UP_3I_DAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUP3iDat() <em>UP 3i Dat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUP3iDat()
   * @generated
   * @ordered
   */
  protected String up3iDat = UP_3I_DAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UP3iFinishingOperationImpl()
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
    return AfpTextPackage.eINSTANCE.getUP3iFinishingOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSeqnum()
  {
    return seqnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSeqnum(int newSeqnum)
  {
    int oldSeqnum = seqnum;
    seqnum = newSeqnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.UP_3I_FINISHING_OPERATION__SEQNUM, oldSeqnum, seqnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUP3iDat()
  {
    return up3iDat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUP3iDat(String newUP3iDat)
  {
    String oldUP3iDat = up3iDat;
    up3iDat = newUP3iDat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT, oldUP3iDat, up3iDat));
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
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
        return getSeqnum();
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
        return getUP3iDat();
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
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
        setSeqnum((Integer)newValue);
        return;
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
        setUP3iDat((String)newValue);
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
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
        setSeqnum(SEQNUM_EDEFAULT);
        return;
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
        setUP3iDat(UP_3I_DAT_EDEFAULT);
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
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
        return seqnum != SEQNUM_EDEFAULT;
      case AfpTextPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
        return UP_3I_DAT_EDEFAULT == null ? up3iDat != null : !UP_3I_DAT_EDEFAULT.equals(up3iDat);
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
    result.append(" (Seqnum: ");
    result.append(seqnum);
    result.append(", UP3iDat: ");
    result.append(up3iDat);
    result.append(')');
    return result.toString();
  }

} //UP3iFinishingOperationImpl