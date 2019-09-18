/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.GCMRKRG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCMRKRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.GCMRKRGImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.GCMRKRGImpl#getYPOS <em>YPOS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCMRKRGImpl extends MinimalEObjectImpl.Container implements GCMRKRG
{
  /**
   * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPOS()
   * @generated
   * @ordered
   */
  protected static final int XPOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPOS()
   * @generated
   * @ordered
   */
  protected int xpos = XPOS_EDEFAULT;

  /**
   * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYPOS()
   * @generated
   * @ordered
   */
  protected static final int YPOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYPOS()
   * @generated
   * @ordered
   */
  protected int ypos = YPOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GCMRKRGImpl()
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
    return AfpTextPackage.eINSTANCE.getGCMRKRG();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXPOS()
  {
    return xpos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXPOS(int newXPOS)
  {
    int oldXPOS = xpos;
    xpos = newXPOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCMRKRG__XPOS, oldXPOS, xpos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYPOS()
  {
    return ypos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYPOS(int newYPOS)
  {
    int oldYPOS = ypos;
    ypos = newYPOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCMRKRG__YPOS, oldYPOS, ypos));
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
      case AfpTextPackage.GCMRKRG__XPOS:
        return getXPOS();
      case AfpTextPackage.GCMRKRG__YPOS:
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
      case AfpTextPackage.GCMRKRG__XPOS:
        setXPOS((Integer)newValue);
        return;
      case AfpTextPackage.GCMRKRG__YPOS:
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
      case AfpTextPackage.GCMRKRG__XPOS:
        setXPOS(XPOS_EDEFAULT);
        return;
      case AfpTextPackage.GCMRKRG__YPOS:
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
      case AfpTextPackage.GCMRKRG__XPOS:
        return xpos != XPOS_EDEFAULT;
      case AfpTextPackage.GCMRKRG__YPOS:
        return ypos != YPOS_EDEFAULT;
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

} //GCMRKRGImpl
