/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import java.util.Collection;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.PGD;
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
 * An implementation of the model object '<em><b>PGD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getXpgBase <em>Xpg Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getYpgBase <em>Ypg Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getXpgUnits <em>Xpg Units</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getYpgUnits <em>Ypg Units</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getXpgSize <em>Xpg Size</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getYpgSize <em>Ypg Size</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.PGDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGDImpl extends structuredFieldImpl implements PGD
{
  /**
   * The default value of the '{@link #getXpgBase() <em>Xpg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgBase()
   * @generated
   * @ordered
   */
  protected static final int XPG_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXpgBase() <em>Xpg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgBase()
   * @generated
   * @ordered
   */
  protected int xpgBase = XPG_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getYpgBase() <em>Ypg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgBase()
   * @generated
   * @ordered
   */
  protected static final int YPG_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYpgBase() <em>Ypg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgBase()
   * @generated
   * @ordered
   */
  protected int ypgBase = YPG_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getXpgUnits() <em>Xpg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgUnits()
   * @generated
   * @ordered
   */
  protected static final int XPG_UNITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXpgUnits() <em>Xpg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgUnits()
   * @generated
   * @ordered
   */
  protected int xpgUnits = XPG_UNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getYpgUnits() <em>Ypg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgUnits()
   * @generated
   * @ordered
   */
  protected static final int YPG_UNITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYpgUnits() <em>Ypg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgUnits()
   * @generated
   * @ordered
   */
  protected int ypgUnits = YPG_UNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getXpgSize() <em>Xpg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgSize()
   * @generated
   * @ordered
   */
  protected static final int XPG_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXpgSize() <em>Xpg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXpgSize()
   * @generated
   * @ordered
   */
  protected int xpgSize = XPG_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getYpgSize() <em>Ypg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgSize()
   * @generated
   * @ordered
   */
  protected static final int YPG_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYpgSize() <em>Ypg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYpgSize()
   * @generated
   * @ordered
   */
  protected int ypgSize = YPG_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected static final int RESERVED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReserved()
   * @generated
   * @ordered
   */
  protected int reserved = RESERVED_EDEFAULT;

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
  protected PGDImpl()
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
    return AfpTextPackage.eINSTANCE.getPGD();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXpgBase()
  {
    return xpgBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXpgBase(int newXpgBase)
  {
    int oldXpgBase = xpgBase;
    xpgBase = newXpgBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__XPG_BASE, oldXpgBase, xpgBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYpgBase()
  {
    return ypgBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYpgBase(int newYpgBase)
  {
    int oldYpgBase = ypgBase;
    ypgBase = newYpgBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__YPG_BASE, oldYpgBase, ypgBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXpgUnits()
  {
    return xpgUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXpgUnits(int newXpgUnits)
  {
    int oldXpgUnits = xpgUnits;
    xpgUnits = newXpgUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__XPG_UNITS, oldXpgUnits, xpgUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYpgUnits()
  {
    return ypgUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYpgUnits(int newYpgUnits)
  {
    int oldYpgUnits = ypgUnits;
    ypgUnits = newYpgUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__YPG_UNITS, oldYpgUnits, ypgUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXpgSize()
  {
    return xpgSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXpgSize(int newXpgSize)
  {
    int oldXpgSize = xpgSize;
    xpgSize = newXpgSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__XPG_SIZE, oldXpgSize, xpgSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYpgSize()
  {
    return ypgSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYpgSize(int newYpgSize)
  {
    int oldYpgSize = ypgSize;
    ypgSize = newYpgSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__YPG_SIZE, oldYpgSize, ypgSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getReserved()
  {
    return reserved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReserved(int newReserved)
  {
    int oldReserved = reserved;
    reserved = newReserved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.PGD__RESERVED, oldReserved, reserved));
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
      triplets = new EObjectContainmentEList<triplet>(triplet.class, this, AfpTextPackage.PGD__TRIPLETS);
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
      case AfpTextPackage.PGD__TRIPLETS:
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
      case AfpTextPackage.PGD__XPG_BASE:
        return getXpgBase();
      case AfpTextPackage.PGD__YPG_BASE:
        return getYpgBase();
      case AfpTextPackage.PGD__XPG_UNITS:
        return getXpgUnits();
      case AfpTextPackage.PGD__YPG_UNITS:
        return getYpgUnits();
      case AfpTextPackage.PGD__XPG_SIZE:
        return getXpgSize();
      case AfpTextPackage.PGD__YPG_SIZE:
        return getYpgSize();
      case AfpTextPackage.PGD__RESERVED:
        return getReserved();
      case AfpTextPackage.PGD__TRIPLETS:
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
      case AfpTextPackage.PGD__XPG_BASE:
        setXpgBase((Integer)newValue);
        return;
      case AfpTextPackage.PGD__YPG_BASE:
        setYpgBase((Integer)newValue);
        return;
      case AfpTextPackage.PGD__XPG_UNITS:
        setXpgUnits((Integer)newValue);
        return;
      case AfpTextPackage.PGD__YPG_UNITS:
        setYpgUnits((Integer)newValue);
        return;
      case AfpTextPackage.PGD__XPG_SIZE:
        setXpgSize((Integer)newValue);
        return;
      case AfpTextPackage.PGD__YPG_SIZE:
        setYpgSize((Integer)newValue);
        return;
      case AfpTextPackage.PGD__RESERVED:
        setReserved((Integer)newValue);
        return;
      case AfpTextPackage.PGD__TRIPLETS:
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
      case AfpTextPackage.PGD__XPG_BASE:
        setXpgBase(XPG_BASE_EDEFAULT);
        return;
      case AfpTextPackage.PGD__YPG_BASE:
        setYpgBase(YPG_BASE_EDEFAULT);
        return;
      case AfpTextPackage.PGD__XPG_UNITS:
        setXpgUnits(XPG_UNITS_EDEFAULT);
        return;
      case AfpTextPackage.PGD__YPG_UNITS:
        setYpgUnits(YPG_UNITS_EDEFAULT);
        return;
      case AfpTextPackage.PGD__XPG_SIZE:
        setXpgSize(XPG_SIZE_EDEFAULT);
        return;
      case AfpTextPackage.PGD__YPG_SIZE:
        setYpgSize(YPG_SIZE_EDEFAULT);
        return;
      case AfpTextPackage.PGD__RESERVED:
        setReserved(RESERVED_EDEFAULT);
        return;
      case AfpTextPackage.PGD__TRIPLETS:
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
      case AfpTextPackage.PGD__XPG_BASE:
        return xpgBase != XPG_BASE_EDEFAULT;
      case AfpTextPackage.PGD__YPG_BASE:
        return ypgBase != YPG_BASE_EDEFAULT;
      case AfpTextPackage.PGD__XPG_UNITS:
        return xpgUnits != XPG_UNITS_EDEFAULT;
      case AfpTextPackage.PGD__YPG_UNITS:
        return ypgUnits != YPG_UNITS_EDEFAULT;
      case AfpTextPackage.PGD__XPG_SIZE:
        return xpgSize != XPG_SIZE_EDEFAULT;
      case AfpTextPackage.PGD__YPG_SIZE:
        return ypgSize != YPG_SIZE_EDEFAULT;
      case AfpTextPackage.PGD__RESERVED:
        return reserved != RESERVED_EDEFAULT;
      case AfpTextPackage.PGD__TRIPLETS:
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
    result.append(" (XpgBase: ");
    result.append(xpgBase);
    result.append(", YpgBase: ");
    result.append(ypgBase);
    result.append(", XpgUnits: ");
    result.append(xpgUnits);
    result.append(", YpgUnits: ");
    result.append(ypgUnits);
    result.append(", XpgSize: ");
    result.append(xpgSize);
    result.append(", YpgSize: ");
    result.append(ypgSize);
    result.append(", Reserved: ");
    result.append(reserved);
    result.append(')');
    return result.toString();
  }

} //PGDImpl
