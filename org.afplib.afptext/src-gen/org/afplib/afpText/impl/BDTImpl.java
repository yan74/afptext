/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.BDT;
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
 * An implementation of the model object '<em><b>BDT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.BDTImpl#getDocName <em>Doc Name</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BDTImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BDTImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDTImpl extends structuredFieldImpl implements BDT
{
  /**
   * The default value of the '{@link #getDocName() <em>Doc Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocName()
   * @generated
   * @ordered
   */
  protected static final String DOC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocName() <em>Doc Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocName()
   * @generated
   * @ordered
   */
  protected String docName = DOC_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected static final Integer RESERVED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected Integer reserved = RESERVED_EDEFAULT;

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
  protected BDTImpl()
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
    return AfpTextPackage.eINSTANCE.getBDT();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocName()
  {
    return docName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocName(String newDocName)
  {
    String oldDocName = docName;
    docName = newDocName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDT__DOC_NAME, oldDocName, docName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getReserved()
  {
    return reserved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReserved(Integer newReserved)
  {
    Integer oldReserved = reserved;
    reserved = newReserved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDT__RESERVED, oldReserved, reserved));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<triplet> getTriplets()
  {
    if (triplets == null)
    {
      triplets = new EObjectContainmentEList<triplet>(triplet.class, this, AfpTextPackage.BDT__TRIPLETS);
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
      case AfpTextPackage.BDT__TRIPLETS:
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
      case AfpTextPackage.BDT__DOC_NAME:
        return getDocName();
      case AfpTextPackage.BDT__RESERVED:
        return getReserved();
      case AfpTextPackage.BDT__TRIPLETS:
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
      case AfpTextPackage.BDT__DOC_NAME:
        setDocName((String)newValue);
        return;
      case AfpTextPackage.BDT__RESERVED:
        setReserved((Integer)newValue);
        return;
      case AfpTextPackage.BDT__TRIPLETS:
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
      case AfpTextPackage.BDT__DOC_NAME:
        setDocName(DOC_NAME_EDEFAULT);
        return;
      case AfpTextPackage.BDT__RESERVED:
        setReserved(RESERVED_EDEFAULT);
        return;
      case AfpTextPackage.BDT__TRIPLETS:
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
      case AfpTextPackage.BDT__DOC_NAME:
        return DOC_NAME_EDEFAULT == null ? docName != null : !DOC_NAME_EDEFAULT.equals(docName);
      case AfpTextPackage.BDT__RESERVED:
        return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
      case AfpTextPackage.BDT__TRIPLETS:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (DocName: ");
    result.append(docName);
    result.append(", Reserved: ");
    result.append(reserved);
    result.append(')');
    return result.toString();
  }

} //BDTImpl
