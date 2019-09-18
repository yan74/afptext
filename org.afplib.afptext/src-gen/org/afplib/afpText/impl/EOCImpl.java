/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.EOC;
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
 * An implementation of the model object '<em><b>EOC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.EOCImpl#getObjCName <em>Obj CName</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.EOCImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOCImpl extends structuredFieldImpl implements EOC
{
  /**
   * The default value of the '{@link #getObjCName() <em>Obj CName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjCName()
   * @generated
   * @ordered
   */
  protected static final String OBJ_CNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjCName() <em>Obj CName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjCName()
   * @generated
   * @ordered
   */
  protected String objCName = OBJ_CNAME_EDEFAULT;

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
  protected EOCImpl()
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
    return AfpTextPackage.eINSTANCE.getEOC();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjCName()
  {
    return objCName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjCName(String newObjCName)
  {
    String oldObjCName = objCName;
    objCName = newObjCName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.EOC__OBJ_CNAME, oldObjCName, objCName));
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
      triplets = new EObjectContainmentEList<triplet>(triplet.class, this, AfpTextPackage.EOC__TRIPLETS);
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
      case AfpTextPackage.EOC__TRIPLETS:
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
      case AfpTextPackage.EOC__OBJ_CNAME:
        return getObjCName();
      case AfpTextPackage.EOC__TRIPLETS:
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
      case AfpTextPackage.EOC__OBJ_CNAME:
        setObjCName((String)newValue);
        return;
      case AfpTextPackage.EOC__TRIPLETS:
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
      case AfpTextPackage.EOC__OBJ_CNAME:
        setObjCName(OBJ_CNAME_EDEFAULT);
        return;
      case AfpTextPackage.EOC__TRIPLETS:
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
      case AfpTextPackage.EOC__OBJ_CNAME:
        return OBJ_CNAME_EDEFAULT == null ? objCName != null : !OBJ_CNAME_EDEFAULT.equals(objCName);
      case AfpTextPackage.EOC__TRIPLETS:
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
    result.append(" (ObjCName: ");
    result.append(objCName);
    result.append(')');
    return result.toString();
  }

} //EOCImpl