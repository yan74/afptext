/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.BDA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.BDAImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BDAImpl#getXoffset <em>Xoffset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BDAImpl#getYoffset <em>Yoffset</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BDAImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDAImpl extends structuredFieldImpl implements BDA
{
  /**
   * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected static final Integer FLAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected Integer flags = FLAGS_EDEFAULT;

  /**
   * The default value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoffset()
   * @generated
   * @ordered
   */
  protected static final Integer XOFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXoffset()
   * @generated
   * @ordered
   */
  protected Integer xoffset = XOFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoffset()
   * @generated
   * @ordered
   */
  protected static final Integer YOFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYoffset()
   * @generated
   * @ordered
   */
  protected Integer yoffset = YOFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected static final String DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected String data = DATA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BDAImpl()
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
    return AfpTextPackage.eINSTANCE.getBDA();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFlags(Integer newFlags)
  {
    Integer oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDA__FLAGS, oldFlags, flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getXoffset()
  {
    return xoffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXoffset(Integer newXoffset)
  {
    Integer oldXoffset = xoffset;
    xoffset = newXoffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDA__XOFFSET, oldXoffset, xoffset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getYoffset()
  {
    return yoffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYoffset(Integer newYoffset)
  {
    Integer oldYoffset = yoffset;
    yoffset = newYoffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDA__YOFFSET, oldYoffset, yoffset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setData(String newData)
  {
    String oldData = data;
    data = newData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BDA__DATA, oldData, data));
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
      case AfpTextPackage.BDA__FLAGS:
        return getFlags();
      case AfpTextPackage.BDA__XOFFSET:
        return getXoffset();
      case AfpTextPackage.BDA__YOFFSET:
        return getYoffset();
      case AfpTextPackage.BDA__DATA:
        return getData();
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
      case AfpTextPackage.BDA__FLAGS:
        setFlags((Integer)newValue);
        return;
      case AfpTextPackage.BDA__XOFFSET:
        setXoffset((Integer)newValue);
        return;
      case AfpTextPackage.BDA__YOFFSET:
        setYoffset((Integer)newValue);
        return;
      case AfpTextPackage.BDA__DATA:
        setData((String)newValue);
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
      case AfpTextPackage.BDA__FLAGS:
        setFlags(FLAGS_EDEFAULT);
        return;
      case AfpTextPackage.BDA__XOFFSET:
        setXoffset(XOFFSET_EDEFAULT);
        return;
      case AfpTextPackage.BDA__YOFFSET:
        setYoffset(YOFFSET_EDEFAULT);
        return;
      case AfpTextPackage.BDA__DATA:
        setData(DATA_EDEFAULT);
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
      case AfpTextPackage.BDA__FLAGS:
        return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
      case AfpTextPackage.BDA__XOFFSET:
        return XOFFSET_EDEFAULT == null ? xoffset != null : !XOFFSET_EDEFAULT.equals(xoffset);
      case AfpTextPackage.BDA__YOFFSET:
        return YOFFSET_EDEFAULT == null ? yoffset != null : !YOFFSET_EDEFAULT.equals(yoffset);
      case AfpTextPackage.BDA__DATA:
        return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
    result.append(" (Flags: ");
    result.append(flags);
    result.append(", Xoffset: ");
    result.append(xoffset);
    result.append(", Yoffset: ");
    result.append(yoffset);
    result.append(", Data: ");
    result.append(data);
    result.append(')');
    return result.toString();
  }

} //BDAImpl
