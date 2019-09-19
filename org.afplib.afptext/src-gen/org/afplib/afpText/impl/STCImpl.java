/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.STC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.STCImpl#getFRGCOLOR <em>FRGCOLOR</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.STCImpl#getPRECSION <em>PRECSION</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STCImpl extends tripletImpl implements STC
{
  /**
   * The default value of the '{@link #getFRGCOLOR() <em>FRGCOLOR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFRGCOLOR()
   * @generated
   * @ordered
   */
  protected static final Integer FRGCOLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFRGCOLOR() <em>FRGCOLOR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFRGCOLOR()
   * @generated
   * @ordered
   */
  protected Integer frgcolor = FRGCOLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getPRECSION() <em>PRECSION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPRECSION()
   * @generated
   * @ordered
   */
  protected static final Integer PRECSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPRECSION() <em>PRECSION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPRECSION()
   * @generated
   * @ordered
   */
  protected Integer precsion = PRECSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected STCImpl()
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
    return AfpTextPackage.eINSTANCE.getSTC();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getFRGCOLOR()
  {
    return frgcolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFRGCOLOR(Integer newFRGCOLOR)
  {
    Integer oldFRGCOLOR = frgcolor;
    frgcolor = newFRGCOLOR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.STC__FRGCOLOR, oldFRGCOLOR, frgcolor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getPRECSION()
  {
    return precsion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPRECSION(Integer newPRECSION)
  {
    Integer oldPRECSION = precsion;
    precsion = newPRECSION;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.STC__PRECSION, oldPRECSION, precsion));
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
      case AfpTextPackage.STC__FRGCOLOR:
        return getFRGCOLOR();
      case AfpTextPackage.STC__PRECSION:
        return getPRECSION();
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
      case AfpTextPackage.STC__FRGCOLOR:
        setFRGCOLOR((Integer)newValue);
        return;
      case AfpTextPackage.STC__PRECSION:
        setPRECSION((Integer)newValue);
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
      case AfpTextPackage.STC__FRGCOLOR:
        setFRGCOLOR(FRGCOLOR_EDEFAULT);
        return;
      case AfpTextPackage.STC__PRECSION:
        setPRECSION(PRECSION_EDEFAULT);
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
      case AfpTextPackage.STC__FRGCOLOR:
        return FRGCOLOR_EDEFAULT == null ? frgcolor != null : !FRGCOLOR_EDEFAULT.equals(frgcolor);
      case AfpTextPackage.STC__PRECSION:
        return PRECSION_EDEFAULT == null ? precsion != null : !PRECSION_EDEFAULT.equals(precsion);
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
    result.append(" (FRGCOLOR: ");
    result.append(frgcolor);
    result.append(", PRECSION: ");
    result.append(precsion);
    result.append(')');
    return result.toString();
  }

} //STCImpl
