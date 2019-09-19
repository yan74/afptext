/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.MMO;
import org.afplib.afpText.MMORG;

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
 * An implementation of the model object '<em><b>MMO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.MMOImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MMOImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMOImpl extends structuredFieldImpl implements MMO
{
  /**
   * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRGLength()
   * @generated
   * @ordered
   */
  protected static final Integer RG_LENGTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRGLength()
   * @generated
   * @ordered
   */
  protected Integer rgLength = RG_LENGTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRg()
   * @generated
   * @ordered
   */
  protected EList<MMORG> rg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MMOImpl()
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
    return AfpTextPackage.eINSTANCE.getMMO();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getRGLength()
  {
    return rgLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRGLength(Integer newRGLength)
  {
    Integer oldRGLength = rgLength;
    rgLength = newRGLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.MMO__RG_LENGTH, oldRGLength, rgLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MMORG> getRg()
  {
    if (rg == null)
    {
      rg = new EObjectContainmentEList<MMORG>(MMORG.class, this, AfpTextPackage.MMO__RG);
    }
    return rg;
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
      case AfpTextPackage.MMO__RG:
        return ((InternalEList<?>)getRg()).basicRemove(otherEnd, msgs);
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
      case AfpTextPackage.MMO__RG_LENGTH:
        return getRGLength();
      case AfpTextPackage.MMO__RG:
        return getRg();
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
      case AfpTextPackage.MMO__RG_LENGTH:
        setRGLength((Integer)newValue);
        return;
      case AfpTextPackage.MMO__RG:
        getRg().clear();
        getRg().addAll((Collection<? extends MMORG>)newValue);
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
      case AfpTextPackage.MMO__RG_LENGTH:
        setRGLength(RG_LENGTH_EDEFAULT);
        return;
      case AfpTextPackage.MMO__RG:
        getRg().clear();
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
      case AfpTextPackage.MMO__RG_LENGTH:
        return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
      case AfpTextPackage.MMO__RG:
        return rg != null && !rg.isEmpty();
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
    result.append(" (RGLength: ");
    result.append(rgLength);
    result.append(')');
    return result.toString();
  }

} //MMOImpl
