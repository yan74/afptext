/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.TextOrientation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Orientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.TextOrientationImpl#getIAxis <em>IAxis</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TextOrientationImpl#getBAxis <em>BAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextOrientationImpl extends tripletImpl implements TextOrientation
{
  /**
   * The default value of the '{@link #getIAxis() <em>IAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIAxis()
   * @generated
   * @ordered
   */
  protected static final int IAXIS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIAxis() <em>IAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIAxis()
   * @generated
   * @ordered
   */
  protected int iAxis = IAXIS_EDEFAULT;

  /**
   * The default value of the '{@link #getBAxis() <em>BAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBAxis()
   * @generated
   * @ordered
   */
  protected static final int BAXIS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBAxis() <em>BAxis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBAxis()
   * @generated
   * @ordered
   */
  protected int bAxis = BAXIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextOrientationImpl()
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
    return AfpTextPackage.eINSTANCE.getTextOrientation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIAxis()
  {
    return iAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIAxis(int newIAxis)
  {
    int oldIAxis = iAxis;
    iAxis = newIAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TEXT_ORIENTATION__IAXIS, oldIAxis, iAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBAxis()
  {
    return bAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBAxis(int newBAxis)
  {
    int oldBAxis = bAxis;
    bAxis = newBAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TEXT_ORIENTATION__BAXIS, oldBAxis, bAxis));
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
      case AfpTextPackage.TEXT_ORIENTATION__IAXIS:
        return getIAxis();
      case AfpTextPackage.TEXT_ORIENTATION__BAXIS:
        return getBAxis();
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
      case AfpTextPackage.TEXT_ORIENTATION__IAXIS:
        setIAxis((Integer)newValue);
        return;
      case AfpTextPackage.TEXT_ORIENTATION__BAXIS:
        setBAxis((Integer)newValue);
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
      case AfpTextPackage.TEXT_ORIENTATION__IAXIS:
        setIAxis(IAXIS_EDEFAULT);
        return;
      case AfpTextPackage.TEXT_ORIENTATION__BAXIS:
        setBAxis(BAXIS_EDEFAULT);
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
      case AfpTextPackage.TEXT_ORIENTATION__IAXIS:
        return iAxis != IAXIS_EDEFAULT;
      case AfpTextPackage.TEXT_ORIENTATION__BAXIS:
        return bAxis != BAXIS_EDEFAULT;
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
    result.append(" (IAxis: ");
    result.append(iAxis);
    result.append(", BAxis: ");
    result.append(bAxis);
    result.append(')');
    return result.toString();
  }

} //TextOrientationImpl