/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.CFC;
import org.afplib.afpText.triplet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.CFCImpl#getCFIRGLen <em>CFIRG Len</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CFCImpl#getRetired1 <em>Retired1</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CFCImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFCImpl extends structuredFieldImpl implements CFC
{
  /**
   * The default value of the '{@link #getCFIRGLen() <em>CFIRG Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCFIRGLen()
   * @generated
   * @ordered
   */
  protected static final int CFIRG_LEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCFIRGLen() <em>CFIRG Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCFIRGLen()
   * @generated
   * @ordered
   */
  protected int cfirgLen = CFIRG_LEN_EDEFAULT;

  /**
   * The default value of the '{@link #getRetired1() <em>Retired1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetired1()
   * @generated
   * @ordered
   */
  protected static final int RETIRED1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRetired1() <em>Retired1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetired1()
   * @generated
   * @ordered
   */
  protected int retired1 = RETIRED1_EDEFAULT;

  /**
   * The cached value of the '{@link #getTriplets() <em>Triplets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriplets()
   * @generated
   * @ordered
   */
  protected EList<triplet> triplets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CFCImpl()
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
    return AfpTextPackage.eINSTANCE.getCFC();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCFIRGLen()
  {
    return cfirgLen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCFIRGLen(int newCFIRGLen)
  {
    int oldCFIRGLen = cfirgLen;
    cfirgLen = newCFIRGLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CFC__CFIRG_LEN, oldCFIRGLen, cfirgLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRetired1()
  {
    return retired1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRetired1(int newRetired1)
  {
    int oldRetired1 = retired1;
    retired1 = newRetired1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CFC__RETIRED1, oldRetired1, retired1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<triplet> getTriplets()
  {
    if (triplets == null)
    {
      triplets = new EObjectContainmentEList<triplet>(triplet.class, this, AfpTextPackage.CFC__TRIPLETS);
    }
    return triplets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AfpTextPackage.CFC__TRIPLETS:
        return ((InternalEList<?>)getTriplets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AfpTextPackage.CFC__CFIRG_LEN:
        return getCFIRGLen();
      case AfpTextPackage.CFC__RETIRED1:
        return getRetired1();
      case AfpTextPackage.CFC__TRIPLETS:
        return getTriplets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AfpTextPackage.CFC__CFIRG_LEN:
        setCFIRGLen((Integer)newValue);
        return;
      case AfpTextPackage.CFC__RETIRED1:
        setRetired1((Integer)newValue);
        return;
      case AfpTextPackage.CFC__TRIPLETS:
        getTriplets().clear();
        getTriplets().addAll((Collection<? extends triplet>)newValue);
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
      case AfpTextPackage.CFC__CFIRG_LEN:
        setCFIRGLen(CFIRG_LEN_EDEFAULT);
        return;
      case AfpTextPackage.CFC__RETIRED1:
        setRetired1(RETIRED1_EDEFAULT);
        return;
      case AfpTextPackage.CFC__TRIPLETS:
        getTriplets().clear();
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
      case AfpTextPackage.CFC__CFIRG_LEN:
        return cfirgLen != CFIRG_LEN_EDEFAULT;
      case AfpTextPackage.CFC__RETIRED1:
        return retired1 != RETIRED1_EDEFAULT;
      case AfpTextPackage.CFC__TRIPLETS:
        return triplets != null && !triplets.isEmpty();
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
    result.append(" (CFIRGLen: ");
    result.append(cfirgLen);
    result.append(", Retired1: ");
    result.append(retired1);
    result.append(')');
    return result.toString();
  }

} //CFCImpl
