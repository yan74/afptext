/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.GCBEZRG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCBEZRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.GCBEZRGImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.GCBEZRGImpl#getYPOS <em>YPOS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCBEZRGImpl extends MinimalEObjectImpl.Container implements GCBEZRG
{
  /**
   * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPOS()
   * @generated
   * @ordered
   */
  protected static final Integer XPOS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPOS()
   * @generated
   * @ordered
   */
  protected Integer xpos = XPOS_EDEFAULT;

  /**
   * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYPOS()
   * @generated
   * @ordered
   */
  protected static final Integer YPOS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYPOS()
   * @generated
   * @ordered
   */
  protected Integer ypos = YPOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GCBEZRGImpl()
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
    return AfpTextPackage.eINSTANCE.getGCBEZRG();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getXPOS()
  {
    return xpos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXPOS(Integer newXPOS)
  {
    Integer oldXPOS = xpos;
    xpos = newXPOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCBEZRG__XPOS, oldXPOS, xpos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getYPOS()
  {
    return ypos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYPOS(Integer newYPOS)
  {
    Integer oldYPOS = ypos;
    ypos = newYPOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCBEZRG__YPOS, oldYPOS, ypos));
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
      case AfpTextPackage.GCBEZRG__XPOS:
        return getXPOS();
      case AfpTextPackage.GCBEZRG__YPOS:
        return getYPOS();
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
      case AfpTextPackage.GCBEZRG__XPOS:
        setXPOS((Integer)newValue);
        return;
      case AfpTextPackage.GCBEZRG__YPOS:
        setYPOS((Integer)newValue);
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
      case AfpTextPackage.GCBEZRG__XPOS:
        setXPOS(XPOS_EDEFAULT);
        return;
      case AfpTextPackage.GCBEZRG__YPOS:
        setYPOS(YPOS_EDEFAULT);
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
      case AfpTextPackage.GCBEZRG__XPOS:
        return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
      case AfpTextPackage.GCBEZRG__YPOS:
        return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
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
    result.append(" (XPOS: ");
    result.append(xpos);
    result.append(", YPOS: ");
    result.append(ypos);
    result.append(')');
    return result.toString();
  }

} //GCBEZRGImpl
