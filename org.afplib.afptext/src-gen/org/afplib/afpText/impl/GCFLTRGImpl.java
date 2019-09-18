/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.GCFLTRG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCFLTRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.GCFLTRGImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.GCFLTRGImpl#getYPOS <em>YPOS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCFLTRGImpl extends MinimalEObjectImpl.Container implements GCFLTRG
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
  protected GCFLTRGImpl()
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
    return AfpTextPackage.eINSTANCE.getGCFLTRG();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCFLTRG__XPOS, oldXPOS, xpos));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.GCFLTRG__YPOS, oldYPOS, ypos));
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
      case AfpTextPackage.GCFLTRG__XPOS:
        return getXPOS();
      case AfpTextPackage.GCFLTRG__YPOS:
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
      case AfpTextPackage.GCFLTRG__XPOS:
        setXPOS((Integer)newValue);
        return;
      case AfpTextPackage.GCFLTRG__YPOS:
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
      case AfpTextPackage.GCFLTRG__XPOS:
        setXPOS(XPOS_EDEFAULT);
        return;
      case AfpTextPackage.GCFLTRG__YPOS:
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
      case AfpTextPackage.GCFLTRG__XPOS:
        return xpos != XPOS_EDEFAULT;
      case AfpTextPackage.GCFLTRG__YPOS:
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

} //GCFLTRGImpl