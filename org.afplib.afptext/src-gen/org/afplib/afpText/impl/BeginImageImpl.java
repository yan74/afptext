/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.BeginImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Begin Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.BeginImageImpl#getOBJTYPE <em>OBJTYPE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeginImageImpl extends tripletImpl implements BeginImage
{
  /**
   * The default value of the '{@link #getOBJTYPE() <em>OBJTYPE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOBJTYPE()
   * @generated
   * @ordered
   */
  protected static final Integer OBJTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOBJTYPE() <em>OBJTYPE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOBJTYPE()
   * @generated
   * @ordered
   */
  protected Integer objtype = OBJTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeginImageImpl()
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
    return AfpTextPackage.eINSTANCE.getBeginImage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getOBJTYPE()
  {
    return objtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOBJTYPE(Integer newOBJTYPE)
  {
    Integer oldOBJTYPE = objtype;
    objtype = newOBJTYPE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BEGIN_IMAGE__OBJTYPE, oldOBJTYPE, objtype));
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
      case AfpTextPackage.BEGIN_IMAGE__OBJTYPE:
        return getOBJTYPE();
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
      case AfpTextPackage.BEGIN_IMAGE__OBJTYPE:
        setOBJTYPE((Integer)newValue);
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
      case AfpTextPackage.BEGIN_IMAGE__OBJTYPE:
        setOBJTYPE(OBJTYPE_EDEFAULT);
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
      case AfpTextPackage.BEGIN_IMAGE__OBJTYPE:
        return OBJTYPE_EDEFAULT == null ? objtype != null : !OBJTYPE_EDEFAULT.equals(objtype);
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
    result.append(" (OBJTYPE: ");
    result.append(objtype);
    result.append(')');
    return result.toString();
  }

} //BeginImageImpl
