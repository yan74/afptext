/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.LocalDateAndTimeStamp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Date And Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getStampType <em>Stamp Type</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getTHunYear <em>THun Year</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getTenYear <em>Ten Year</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.LocalDateAndTimeStampImpl#getHundSec <em>Hund Sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalDateAndTimeStampImpl extends tripletImpl implements LocalDateAndTimeStamp
{
  /**
   * The default value of the '{@link #getStampType() <em>Stamp Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStampType()
   * @generated
   * @ordered
   */
  protected static final int STAMP_TYPE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStampType() <em>Stamp Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStampType()
   * @generated
   * @ordered
   */
  protected int stampType = STAMP_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTHunYear() <em>THun Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHunYear()
   * @generated
   * @ordered
   */
  protected static final int THUN_YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTHunYear() <em>THun Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHunYear()
   * @generated
   * @ordered
   */
  protected int tHunYear = THUN_YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getTenYear() <em>Ten Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTenYear()
   * @generated
   * @ordered
   */
  protected static final int TEN_YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTenYear() <em>Ten Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTenYear()
   * @generated
   * @ordered
   */
  protected int tenYear = TEN_YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final int DAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected int day = DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected static final int HOUR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHour()
   * @generated
   * @ordered
   */
  protected int hour = HOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected static final int MINUTE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinute()
   * @generated
   * @ordered
   */
  protected int minute = MINUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected static final int SECOND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected int second = SECOND_EDEFAULT;

  /**
   * The default value of the '{@link #getHundSec() <em>Hund Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHundSec()
   * @generated
   * @ordered
   */
  protected static final int HUND_SEC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHundSec() <em>Hund Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHundSec()
   * @generated
   * @ordered
   */
  protected int hundSec = HUND_SEC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalDateAndTimeStampImpl()
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
    return AfpTextPackage.eINSTANCE.getLocalDateAndTimeStamp();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getStampType()
  {
    return stampType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStampType(int newStampType)
  {
    int oldStampType = stampType;
    stampType = newStampType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE, oldStampType, stampType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTHunYear()
  {
    return tHunYear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTHunYear(int newTHunYear)
  {
    int oldTHunYear = tHunYear;
    tHunYear = newTHunYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR, oldTHunYear, tHunYear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTenYear()
  {
    return tenYear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTenYear(int newTenYear)
  {
    int oldTenYear = tenYear;
    tenYear = newTenYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR, oldTenYear, tenYear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDay(int newDay)
  {
    int oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHour()
  {
    return hour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHour(int newHour)
  {
    int oldHour = hour;
    hour = newHour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR, oldHour, hour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinute()
  {
    return minute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinute(int newMinute)
  {
    int oldMinute = minute;
    minute = newMinute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE, oldMinute, minute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecond(int newSecond)
  {
    int oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHundSec()
  {
    return hundSec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHundSec(int newHundSec)
  {
    int oldHundSec = hundSec;
    hundSec = newHundSec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC, oldHundSec, hundSec));
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
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
        return getStampType();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
        return getTHunYear();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
        return getTenYear();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
        return getDay();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
        return getHour();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
        return getMinute();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
        return getSecond();
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
        return getHundSec();
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
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
        setStampType((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
        setTHunYear((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
        setTenYear((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
        setDay((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
        setHour((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
        setMinute((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
        setSecond((Integer)newValue);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
        setHundSec((Integer)newValue);
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
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
        setStampType(STAMP_TYPE_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
        setTHunYear(THUN_YEAR_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
        setTenYear(TEN_YEAR_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
        setHour(HOUR_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
        setMinute(MINUTE_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
        setSecond(SECOND_EDEFAULT);
        return;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
        setHundSec(HUND_SEC_EDEFAULT);
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
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__STAMP_TYPE:
        return stampType != STAMP_TYPE_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__THUN_YEAR:
        return tHunYear != THUN_YEAR_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__TEN_YEAR:
        return tenYear != TEN_YEAR_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__DAY:
        return day != DAY_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HOUR:
        return hour != HOUR_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__MINUTE:
        return minute != MINUTE_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__SECOND:
        return second != SECOND_EDEFAULT;
      case AfpTextPackage.LOCAL_DATE_AND_TIME_STAMP__HUND_SEC:
        return hundSec != HUND_SEC_EDEFAULT;
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
    result.append(" (StampType: ");
    result.append(stampType);
    result.append(", THunYear: ");
    result.append(tHunYear);
    result.append(", TenYear: ");
    result.append(tenYear);
    result.append(", Day: ");
    result.append(day);
    result.append(", Hour: ");
    result.append(hour);
    result.append(", Minute: ");
    result.append(minute);
    result.append(", Second: ");
    result.append(second);
    result.append(", HundSec: ");
    result.append(hundSec);
    result.append(')');
    return result.toString();
  }

} //LocalDateAndTimeStampImpl