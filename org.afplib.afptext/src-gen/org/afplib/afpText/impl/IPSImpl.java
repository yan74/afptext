/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.IPS;
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
 * An implementation of the model object '<em><b>IPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.IPSImpl#getPsegName <em>Pseg Name</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.IPSImpl#getXpsOset <em>Xps Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.IPSImpl#getYpsOset <em>Yps Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.IPSImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPSImpl extends structuredFieldImpl implements IPS
{
  /**
   * The default value of the '{@link #getPsegName() <em>Pseg Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPsegName()
   * @generated
   * @ordered
   */
  protected static final String PSEG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPsegName() <em>Pseg Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPsegName()
   * @generated
   * @ordered
   */
  protected String psegName = PSEG_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getXpsOset() <em>Xps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpsOset()
   * @generated
   * @ordered
   */
  protected static final int XPS_OSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXpsOset() <em>Xps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpsOset()
   * @generated
   * @ordered
   */
  protected int xpsOset = XPS_OSET_EDEFAULT;

  /**
   * The default value of the '{@link #getYpsOset() <em>Yps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpsOset()
   * @generated
   * @ordered
   */
  protected static final int YPS_OSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYpsOset() <em>Yps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpsOset()
   * @generated
   * @ordered
   */
  protected int ypsOset = YPS_OSET_EDEFAULT;

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
  protected IPSImpl()
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
    return AfpTextPackage.eINSTANCE.getIPS();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPsegName()
  {
    return psegName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPsegName(String newPsegName)
  {
    String oldPsegName = psegName;
    psegName = newPsegName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IPS__PSEG_NAME, oldPsegName, psegName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXpsOset()
  {
    return xpsOset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXpsOset(int newXpsOset)
  {
    int oldXpsOset = xpsOset;
    xpsOset = newXpsOset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IPS__XPS_OSET, oldXpsOset, xpsOset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYpsOset()
  {
    return ypsOset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYpsOset(int newYpsOset)
  {
    int oldYpsOset = ypsOset;
    ypsOset = newYpsOset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IPS__YPS_OSET, oldYpsOset, ypsOset));
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
      triplets = new EObjectContainmentEList<triplet>(triplet.class, this, AfpTextPackage.IPS__TRIPLETS);
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
      case AfpTextPackage.IPS__TRIPLETS:
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
      case AfpTextPackage.IPS__PSEG_NAME:
        return getPsegName();
      case AfpTextPackage.IPS__XPS_OSET:
        return getXpsOset();
      case AfpTextPackage.IPS__YPS_OSET:
        return getYpsOset();
      case AfpTextPackage.IPS__TRIPLETS:
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
      case AfpTextPackage.IPS__PSEG_NAME:
        setPsegName((String)newValue);
        return;
      case AfpTextPackage.IPS__XPS_OSET:
        setXpsOset((Integer)newValue);
        return;
      case AfpTextPackage.IPS__YPS_OSET:
        setYpsOset((Integer)newValue);
        return;
      case AfpTextPackage.IPS__TRIPLETS:
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
      case AfpTextPackage.IPS__PSEG_NAME:
        setPsegName(PSEG_NAME_EDEFAULT);
        return;
      case AfpTextPackage.IPS__XPS_OSET:
        setXpsOset(XPS_OSET_EDEFAULT);
        return;
      case AfpTextPackage.IPS__YPS_OSET:
        setYpsOset(YPS_OSET_EDEFAULT);
        return;
      case AfpTextPackage.IPS__TRIPLETS:
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
      case AfpTextPackage.IPS__PSEG_NAME:
        return PSEG_NAME_EDEFAULT == null ? psegName != null : !PSEG_NAME_EDEFAULT.equals(psegName);
      case AfpTextPackage.IPS__XPS_OSET:
        return xpsOset != XPS_OSET_EDEFAULT;
      case AfpTextPackage.IPS__YPS_OSET:
        return ypsOset != YPS_OSET_EDEFAULT;
      case AfpTextPackage.IPS__TRIPLETS:
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
    result.append(" (PsegName: ");
    result.append(psegName);
    result.append(", XpsOset: ");
    result.append(xpsOset);
    result.append(", YpsOset: ");
    result.append(ypsOset);
    result.append(')');
    return result.toString();
  }

} //IPSImpl