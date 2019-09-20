/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.FontHorizontalScaleFactor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Horizontal Scale Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.FontHorizontalScaleFactorImpl#getHscale <em>Hscale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontHorizontalScaleFactorImpl extends tripletImpl implements FontHorizontalScaleFactor
{
  /**
   * The default value of the '{@link #getHscale() <em>Hscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHscale()
   * @generated
   * @ordered
   */
  protected static final Integer HSCALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHscale() <em>Hscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHscale()
   * @generated
   * @ordered
   */
  protected Integer hscale = HSCALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontHorizontalScaleFactorImpl()
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
    return AfpTextPackage.eINSTANCE.getFontHorizontalScaleFactor();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getHscale()
  {
    return hscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHscale(Integer newHscale)
  {
    Integer oldHscale = hscale;
    hscale = newHscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE, oldHscale, hscale));
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
      case AfpTextPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
        return getHscale();
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
      case AfpTextPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
        setHscale((Integer)newValue);
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
      case AfpTextPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
        setHscale(HSCALE_EDEFAULT);
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
      case AfpTextPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
        return HSCALE_EDEFAULT == null ? hscale != null : !HSCALE_EDEFAULT.equals(hscale);
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
    result.append(" (Hscale: ");
    result.append(hscale);
    result.append(')');
    return result.toString();
  }

} //FontHorizontalScaleFactorImpl
