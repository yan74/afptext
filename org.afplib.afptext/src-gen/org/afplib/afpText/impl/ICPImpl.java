/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.ICP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getXCOset <em>XC Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getYCOset <em>YC Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getXCSize <em>XC Size</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getYCSize <em>YC Size</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getXFilSize <em>XFil Size</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ICPImpl#getYFilSize <em>YFil Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICPImpl extends structuredFieldImpl implements ICP
{
  /**
   * The default value of the '{@link #getXCOset() <em>XC Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXCOset()
   * @generated
   * @ordered
   */
  protected static final Integer XC_OSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXCOset() <em>XC Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXCOset()
   * @generated
   * @ordered
   */
  protected Integer xcOset = XC_OSET_EDEFAULT;

  /**
   * The default value of the '{@link #getYCOset() <em>YC Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYCOset()
   * @generated
   * @ordered
   */
  protected static final Integer YC_OSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYCOset() <em>YC Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYCOset()
   * @generated
   * @ordered
   */
  protected Integer ycOset = YC_OSET_EDEFAULT;

  /**
   * The default value of the '{@link #getXCSize() <em>XC Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXCSize()
   * @generated
   * @ordered
   */
  protected static final Integer XC_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXCSize() <em>XC Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXCSize()
   * @generated
   * @ordered
   */
  protected Integer xcSize = XC_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getYCSize() <em>YC Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYCSize()
   * @generated
   * @ordered
   */
  protected static final Integer YC_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYCSize() <em>YC Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYCSize()
   * @generated
   * @ordered
   */
  protected Integer ycSize = YC_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getXFilSize() <em>XFil Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXFilSize()
   * @generated
   * @ordered
   */
  protected static final Integer XFIL_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXFilSize() <em>XFil Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXFilSize()
   * @generated
   * @ordered
   */
  protected Integer xFilSize = XFIL_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getYFilSize() <em>YFil Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYFilSize()
   * @generated
   * @ordered
   */
  protected static final Integer YFIL_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYFilSize() <em>YFil Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYFilSize()
   * @generated
   * @ordered
   */
  protected Integer yFilSize = YFIL_SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ICPImpl()
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
    return AfpTextPackage.eINSTANCE.getICP();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getXCOset()
  {
    return xcOset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXCOset(Integer newXCOset)
  {
    Integer oldXCOset = xcOset;
    xcOset = newXCOset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__XC_OSET, oldXCOset, xcOset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getYCOset()
  {
    return ycOset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYCOset(Integer newYCOset)
  {
    Integer oldYCOset = ycOset;
    ycOset = newYCOset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__YC_OSET, oldYCOset, ycOset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getXCSize()
  {
    return xcSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXCSize(Integer newXCSize)
  {
    Integer oldXCSize = xcSize;
    xcSize = newXCSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__XC_SIZE, oldXCSize, xcSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getYCSize()
  {
    return ycSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYCSize(Integer newYCSize)
  {
    Integer oldYCSize = ycSize;
    ycSize = newYCSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__YC_SIZE, oldYCSize, ycSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getXFilSize()
  {
    return xFilSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXFilSize(Integer newXFilSize)
  {
    Integer oldXFilSize = xFilSize;
    xFilSize = newXFilSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__XFIL_SIZE, oldXFilSize, xFilSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getYFilSize()
  {
    return yFilSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYFilSize(Integer newYFilSize)
  {
    Integer oldYFilSize = yFilSize;
    yFilSize = newYFilSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.ICP__YFIL_SIZE, oldYFilSize, yFilSize));
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
      case AfpTextPackage.ICP__XC_OSET:
        return getXCOset();
      case AfpTextPackage.ICP__YC_OSET:
        return getYCOset();
      case AfpTextPackage.ICP__XC_SIZE:
        return getXCSize();
      case AfpTextPackage.ICP__YC_SIZE:
        return getYCSize();
      case AfpTextPackage.ICP__XFIL_SIZE:
        return getXFilSize();
      case AfpTextPackage.ICP__YFIL_SIZE:
        return getYFilSize();
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
      case AfpTextPackage.ICP__XC_OSET:
        setXCOset((Integer)newValue);
        return;
      case AfpTextPackage.ICP__YC_OSET:
        setYCOset((Integer)newValue);
        return;
      case AfpTextPackage.ICP__XC_SIZE:
        setXCSize((Integer)newValue);
        return;
      case AfpTextPackage.ICP__YC_SIZE:
        setYCSize((Integer)newValue);
        return;
      case AfpTextPackage.ICP__XFIL_SIZE:
        setXFilSize((Integer)newValue);
        return;
      case AfpTextPackage.ICP__YFIL_SIZE:
        setYFilSize((Integer)newValue);
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
      case AfpTextPackage.ICP__XC_OSET:
        setXCOset(XC_OSET_EDEFAULT);
        return;
      case AfpTextPackage.ICP__YC_OSET:
        setYCOset(YC_OSET_EDEFAULT);
        return;
      case AfpTextPackage.ICP__XC_SIZE:
        setXCSize(XC_SIZE_EDEFAULT);
        return;
      case AfpTextPackage.ICP__YC_SIZE:
        setYCSize(YC_SIZE_EDEFAULT);
        return;
      case AfpTextPackage.ICP__XFIL_SIZE:
        setXFilSize(XFIL_SIZE_EDEFAULT);
        return;
      case AfpTextPackage.ICP__YFIL_SIZE:
        setYFilSize(YFIL_SIZE_EDEFAULT);
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
      case AfpTextPackage.ICP__XC_OSET:
        return XC_OSET_EDEFAULT == null ? xcOset != null : !XC_OSET_EDEFAULT.equals(xcOset);
      case AfpTextPackage.ICP__YC_OSET:
        return YC_OSET_EDEFAULT == null ? ycOset != null : !YC_OSET_EDEFAULT.equals(ycOset);
      case AfpTextPackage.ICP__XC_SIZE:
        return XC_SIZE_EDEFAULT == null ? xcSize != null : !XC_SIZE_EDEFAULT.equals(xcSize);
      case AfpTextPackage.ICP__YC_SIZE:
        return YC_SIZE_EDEFAULT == null ? ycSize != null : !YC_SIZE_EDEFAULT.equals(ycSize);
      case AfpTextPackage.ICP__XFIL_SIZE:
        return XFIL_SIZE_EDEFAULT == null ? xFilSize != null : !XFIL_SIZE_EDEFAULT.equals(xFilSize);
      case AfpTextPackage.ICP__YFIL_SIZE:
        return YFIL_SIZE_EDEFAULT == null ? yFilSize != null : !YFIL_SIZE_EDEFAULT.equals(yFilSize);
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
    result.append(" (XCOset: ");
    result.append(xcOset);
    result.append(", YCOset: ");
    result.append(ycOset);
    result.append(", XCSize: ");
    result.append(xcSize);
    result.append(", YCSize: ");
    result.append(ycSize);
    result.append(", XFilSize: ");
    result.append(xFilSize);
    result.append(", YFilSize: ");
    result.append(yFilSize);
    result.append(')');
    return result.toString();
  }

} //ICPImpl
