/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.PGP;
import org.afplib.afpText.PGPRG;

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
 * An implementation of the model object '<em><b>PGP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.PGPImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGPImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGPImpl extends structuredFieldImpl implements PGP
{
  /**
   * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected static final int CONSTANT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected int constant = CONSTANT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRg()
   * @generated
   * @ordered
   */
  protected EList<PGPRG> rg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PGPImpl()
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
    return AfpTextPackage.eINSTANCE.getPGP();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstant(int newConstant)
  {
    int oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGP__CONSTANT, oldConstant, constant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PGPRG> getRg()
  {
    if (rg == null)
    {
      rg = new EObjectContainmentEList<PGPRG>(PGPRG.class, this, AfpTextPackage.PGP__RG);
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
      case AfpTextPackage.PGP__RG:
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
      case AfpTextPackage.PGP__CONSTANT:
        return getConstant();
      case AfpTextPackage.PGP__RG:
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
      case AfpTextPackage.PGP__CONSTANT:
        setConstant((Integer)newValue);
        return;
      case AfpTextPackage.PGP__RG:
        getRg().clear();
        getRg().addAll((Collection<? extends PGPRG>)newValue);
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
      case AfpTextPackage.PGP__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case AfpTextPackage.PGP__RG:
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
      case AfpTextPackage.PGP__CONSTANT:
        return constant != CONSTANT_EDEFAULT;
      case AfpTextPackage.PGP__RG:
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
    result.append(" (Constant: ");
    result.append(constant);
    result.append(')');
    return result.toString();
  }

} //PGPImpl
