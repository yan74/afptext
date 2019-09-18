/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.MeasurementUnits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.MeasurementUnitsImpl#getXoaBase <em>Xoa Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MeasurementUnitsImpl#getYoaBase <em>Yoa Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MeasurementUnitsImpl#getXoaUnits <em>Xoa Units</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MeasurementUnitsImpl#getYoaUnits <em>Yoa Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementUnitsImpl extends tripletImpl implements MeasurementUnits
{
  /**
   * The default value of the '{@link #getXoaBase() <em>Xoa Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoaBase()
   * @generated
   * @ordered
   */
  protected static final int XOA_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXoaBase() <em>Xoa Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoaBase()
   * @generated
   * @ordered
   */
  protected int xoaBase = XOA_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getYoaBase() <em>Yoa Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoaBase()
   * @generated
   * @ordered
   */
  protected static final int YOA_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYoaBase() <em>Yoa Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoaBase()
   * @generated
   * @ordered
   */
  protected int yoaBase = YOA_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getXoaUnits() <em>Xoa Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoaUnits()
   * @generated
   * @ordered
   */
  protected static final int XOA_UNITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXoaUnits() <em>Xoa Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoaUnits()
   * @generated
   * @ordered
   */
  protected int xoaUnits = XOA_UNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getYoaUnits() <em>Yoa Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoaUnits()
   * @generated
   * @ordered
   */
  protected static final int YOA_UNITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYoaUnits() <em>Yoa Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoaUnits()
   * @generated
   * @ordered
   */
  protected int yoaUnits = YOA_UNITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementUnitsImpl()
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
    return AfpTextPackage.eINSTANCE.getMeasurementUnits();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXoaBase()
  {
    return xoaBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXoaBase(int newXoaBase)
  {
    int oldXoaBase = xoaBase;
    xoaBase = newXoaBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MEASUREMENT_UNITS__XOA_BASE, oldXoaBase, xoaBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYoaBase()
  {
    return yoaBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYoaBase(int newYoaBase)
  {
    int oldYoaBase = yoaBase;
    yoaBase = newYoaBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MEASUREMENT_UNITS__YOA_BASE, oldYoaBase, yoaBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXoaUnits()
  {
    return xoaUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXoaUnits(int newXoaUnits)
  {
    int oldXoaUnits = xoaUnits;
    xoaUnits = newXoaUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MEASUREMENT_UNITS__XOA_UNITS, oldXoaUnits, xoaUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYoaUnits()
  {
    return yoaUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYoaUnits(int newYoaUnits)
  {
    int oldYoaUnits = yoaUnits;
    yoaUnits = newYoaUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MEASUREMENT_UNITS__YOA_UNITS, oldYoaUnits, yoaUnits));
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
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_BASE:
        return getXoaBase();
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_BASE:
        return getYoaBase();
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_UNITS:
        return getXoaUnits();
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_UNITS:
        return getYoaUnits();
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
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_BASE:
        setXoaBase((Integer)newValue);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_BASE:
        setYoaBase((Integer)newValue);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_UNITS:
        setXoaUnits((Integer)newValue);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_UNITS:
        setYoaUnits((Integer)newValue);
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
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_BASE:
        setXoaBase(XOA_BASE_EDEFAULT);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_BASE:
        setYoaBase(YOA_BASE_EDEFAULT);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_UNITS:
        setXoaUnits(XOA_UNITS_EDEFAULT);
        return;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_UNITS:
        setYoaUnits(YOA_UNITS_EDEFAULT);
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
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_BASE:
        return xoaBase != XOA_BASE_EDEFAULT;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_BASE:
        return yoaBase != YOA_BASE_EDEFAULT;
      case AfpTextPackage.MEASUREMENT_UNITS__XOA_UNITS:
        return xoaUnits != XOA_UNITS_EDEFAULT;
      case AfpTextPackage.MEASUREMENT_UNITS__YOA_UNITS:
        return yoaUnits != YOA_UNITS_EDEFAULT;
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
    result.append(" (XoaBase: ");
    result.append(xoaBase);
    result.append(", YoaBase: ");
    result.append(yoaBase);
    result.append(", XoaUnits: ");
    result.append(xoaUnits);
    result.append(", YoaUnits: ");
    result.append(yoaUnits);
    result.append(')');
    return result.toString();
  }

} //MeasurementUnitsImpl
