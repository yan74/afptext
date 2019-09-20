/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.FNN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.FNNImpl#getFNNData <em>FNN Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNNImpl extends structuredFieldImpl implements FNN
{
  /**
   * The default value of the '{@link #getFNNData() <em>FNN Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFNNData()
   * @generated
   * @ordered
   */
  protected static final String FNN_DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFNNData() <em>FNN Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFNNData()
   * @generated
   * @ordered
   */
  protected String fnnData = FNN_DATA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FNNImpl()
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
    return AfpTextPackage.eINSTANCE.getFNN();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFNNData()
  {
    return fnnData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFNNData(String newFNNData)
  {
    String oldFNNData = fnnData;
    fnnData = newFNNData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.FNN__FNN_DATA, oldFNNData, fnnData));
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
      case AfpTextPackage.FNN__FNN_DATA:
        return getFNNData();
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
      case AfpTextPackage.FNN__FNN_DATA:
        setFNNData((String)newValue);
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
      case AfpTextPackage.FNN__FNN_DATA:
        setFNNData(FNN_DATA_EDEFAULT);
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
      case AfpTextPackage.FNN__FNN_DATA:
        return FNN_DATA_EDEFAULT == null ? fnnData != null : !FNN_DATA_EDEFAULT.equals(fnnData);
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
    result.append(" (FNNData: ");
    result.append(fnnData);
    result.append(')');
    return result.toString();
  }

} //FNNImpl
