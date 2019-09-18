/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.BandImageData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Band Image Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.BandImageDataImpl#getBANDNUM <em>BANDNUM</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BandImageDataImpl#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.BandImageDataImpl#getDATA <em>DATA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandImageDataImpl extends tripletImpl implements BandImageData
{
  /**
   * The default value of the '{@link #getBANDNUM() <em>BANDNUM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBANDNUM()
   * @generated
   * @ordered
   */
  protected static final int BANDNUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBANDNUM() <em>BANDNUM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBANDNUM()
   * @generated
   * @ordered
   */
  protected int bandnum = BANDNUM_EDEFAULT;

  /**
   * The default value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRESERVED()
   * @generated
   * @ordered
   */
  protected static final int RESERVED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRESERVED()
   * @generated
   * @ordered
   */
  protected int reserved = RESERVED_EDEFAULT;

  /**
   * The default value of the '{@link #getDATA() <em>DATA</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATA()
   * @generated
   * @ordered
   */
  protected static final String DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDATA() <em>DATA</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATA()
   * @generated
   * @ordered
   */
  protected String data = DATA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BandImageDataImpl()
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
    return AfpTextPackage.eINSTANCE.getBandImageData();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getBANDNUM()
  {
    return bandnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBANDNUM(int newBANDNUM)
  {
    int oldBANDNUM = bandnum;
    bandnum = newBANDNUM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BAND_IMAGE_DATA__BANDNUM, oldBANDNUM, bandnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRESERVED()
  {
    return reserved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRESERVED(int newRESERVED)
  {
    int oldRESERVED = reserved;
    reserved = newRESERVED;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BAND_IMAGE_DATA__RESERVED, oldRESERVED, reserved));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDATA()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDATA(String newDATA)
  {
    String oldDATA = data;
    data = newDATA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.BAND_IMAGE_DATA__DATA, oldDATA, data));
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
      case AfpTextPackage.BAND_IMAGE_DATA__BANDNUM:
        return getBANDNUM();
      case AfpTextPackage.BAND_IMAGE_DATA__RESERVED:
        return getRESERVED();
      case AfpTextPackage.BAND_IMAGE_DATA__DATA:
        return getDATA();
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
      case AfpTextPackage.BAND_IMAGE_DATA__BANDNUM:
        setBANDNUM((Integer)newValue);
        return;
      case AfpTextPackage.BAND_IMAGE_DATA__RESERVED:
        setRESERVED((Integer)newValue);
        return;
      case AfpTextPackage.BAND_IMAGE_DATA__DATA:
        setDATA((String)newValue);
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
      case AfpTextPackage.BAND_IMAGE_DATA__BANDNUM:
        setBANDNUM(BANDNUM_EDEFAULT);
        return;
      case AfpTextPackage.BAND_IMAGE_DATA__RESERVED:
        setRESERVED(RESERVED_EDEFAULT);
        return;
      case AfpTextPackage.BAND_IMAGE_DATA__DATA:
        setDATA(DATA_EDEFAULT);
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
      case AfpTextPackage.BAND_IMAGE_DATA__BANDNUM:
        return bandnum != BANDNUM_EDEFAULT;
      case AfpTextPackage.BAND_IMAGE_DATA__RESERVED:
        return reserved != RESERVED_EDEFAULT;
      case AfpTextPackage.BAND_IMAGE_DATA__DATA:
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
    result.append(" (BANDNUM: ");
    result.append(bandnum);
    result.append(", RESERVED: ");
    result.append(reserved);
    result.append(", DATA: ");
    result.append(data);
    result.append(')');
    return result.toString();
  }

} //BandImageDataImpl