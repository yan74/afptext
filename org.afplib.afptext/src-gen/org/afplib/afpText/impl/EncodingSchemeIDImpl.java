/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.EncodingSchemeID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding Scheme ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.EncodingSchemeIDImpl#getESidCP <em>ESid CP</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.EncodingSchemeIDImpl#getESidUD <em>ESid UD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncodingSchemeIDImpl extends tripletImpl implements EncodingSchemeID
{
  /**
   * The default value of the '{@link #getESidCP() <em>ESid CP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getESidCP()
   * @generated
   * @ordered
   */
  protected static final int ESID_CP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getESidCP() <em>ESid CP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getESidCP()
   * @generated
   * @ordered
   */
  protected int eSidCP = ESID_CP_EDEFAULT;

  /**
   * The default value of the '{@link #getESidUD() <em>ESid UD</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getESidUD()
   * @generated
   * @ordered
   */
  protected static final int ESID_UD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getESidUD() <em>ESid UD</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getESidUD()
   * @generated
   * @ordered
   */
  protected int eSidUD = ESID_UD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EncodingSchemeIDImpl()
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
    return AfpTextPackage.eINSTANCE.getEncodingSchemeID();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getESidCP()
  {
    return eSidCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setESidCP(int newESidCP)
  {
    int oldESidCP = eSidCP;
    eSidCP = newESidCP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ENCODING_SCHEME_ID__ESID_CP, oldESidCP, eSidCP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getESidUD()
  {
    return eSidUD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setESidUD(int newESidUD)
  {
    int oldESidUD = eSidUD;
    eSidUD = newESidUD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ENCODING_SCHEME_ID__ESID_UD, oldESidUD, eSidUD));
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
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_CP:
        return getESidCP();
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_UD:
        return getESidUD();
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
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_CP:
        setESidCP((Integer)newValue);
        return;
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_UD:
        setESidUD((Integer)newValue);
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
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_CP:
        setESidCP(ESID_CP_EDEFAULT);
        return;
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_UD:
        setESidUD(ESID_UD_EDEFAULT);
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
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_CP:
        return eSidCP != ESID_CP_EDEFAULT;
      case AfpTextPackage.ENCODING_SCHEME_ID__ESID_UD:
        return eSidUD != ESID_UD_EDEFAULT;
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
    result.append(" (ESidCP: ");
    result.append(eSidCP);
    result.append(", ESidUD: ");
    result.append(eSidUD);
    result.append(')');
    return result.toString();
  }

} //EncodingSchemeIDImpl
