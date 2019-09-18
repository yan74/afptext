/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.MPS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.MPSImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MPSImpl#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPSImpl extends structuredFieldImpl implements MPS
{
  /**
   * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRGLength()
   * @generated
   * @ordered
   */
  protected static final int RG_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRGLength()
   * @generated
   * @ordered
   */
  protected int rgLength = RG_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected static final String RESERVED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected String reserved = RESERVED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MPSImpl()
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
    return AfpTextPackage.eINSTANCE.getMPS();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRGLength()
  {
    return rgLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRGLength(int newRGLength)
  {
    int oldRGLength = rgLength;
    rgLength = newRGLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MPS__RG_LENGTH, oldRGLength, rgLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReserved()
  {
    return reserved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReserved(String newReserved)
  {
    String oldReserved = reserved;
    reserved = newReserved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MPS__RESERVED, oldReserved, reserved));
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
      case AfpTextPackage.MPS__RG_LENGTH:
        return getRGLength();
      case AfpTextPackage.MPS__RESERVED:
        return getReserved();
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
      case AfpTextPackage.MPS__RG_LENGTH:
        setRGLength((Integer)newValue);
        return;
      case AfpTextPackage.MPS__RESERVED:
        setReserved((String)newValue);
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
      case AfpTextPackage.MPS__RG_LENGTH:
        setRGLength(RG_LENGTH_EDEFAULT);
        return;
      case AfpTextPackage.MPS__RESERVED:
        setReserved(RESERVED_EDEFAULT);
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
      case AfpTextPackage.MPS__RG_LENGTH:
        return rgLength != RG_LENGTH_EDEFAULT;
      case AfpTextPackage.MPS__RESERVED:
        return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
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
    result.append(" (RGLength: ");
    result.append(rgLength);
    result.append(", Reserved: ");
    result.append(reserved);
    result.append(')');
    return result.toString();
  }

} //MPSImpl
