/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.RPS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.RPSImpl#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.RPSImpl#getRPTDATA <em>RPTDATA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPSImpl extends tripletImpl implements RPS
{
  /**
   * The default value of the '{@link #getRLENGTH() <em>RLENGTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRLENGTH()
   * @generated
   * @ordered
   */
  protected static final int RLENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRLENGTH() <em>RLENGTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRLENGTH()
   * @generated
   * @ordered
   */
  protected int rlength = RLENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getRPTDATA() <em>RPTDATA</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPTDATA()
   * @generated
   * @ordered
   */
  protected static final String RPTDATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRPTDATA() <em>RPTDATA</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPTDATA()
   * @generated
   * @ordered
   */
  protected String rptdata = RPTDATA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RPSImpl()
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
    return AfpTextPackage.eINSTANCE.getRPS();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRLENGTH()
  {
    return rlength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRLENGTH(int newRLENGTH)
  {
    int oldRLENGTH = rlength;
    rlength = newRLENGTH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.RPS__RLENGTH, oldRLENGTH, rlength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRPTDATA()
  {
    return rptdata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRPTDATA(String newRPTDATA)
  {
    String oldRPTDATA = rptdata;
    rptdata = newRPTDATA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.RPS__RPTDATA, oldRPTDATA, rptdata));
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
      case AfpTextPackage.RPS__RLENGTH:
        return getRLENGTH();
      case AfpTextPackage.RPS__RPTDATA:
        return getRPTDATA();
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
      case AfpTextPackage.RPS__RLENGTH:
        setRLENGTH((Integer)newValue);
        return;
      case AfpTextPackage.RPS__RPTDATA:
        setRPTDATA((String)newValue);
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
      case AfpTextPackage.RPS__RLENGTH:
        setRLENGTH(RLENGTH_EDEFAULT);
        return;
      case AfpTextPackage.RPS__RPTDATA:
        setRPTDATA(RPTDATA_EDEFAULT);
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
      case AfpTextPackage.RPS__RLENGTH:
        return rlength != RLENGTH_EDEFAULT;
      case AfpTextPackage.RPS__RPTDATA:
        return RPTDATA_EDEFAULT == null ? rptdata != null : !RPTDATA_EDEFAULT.equals(rptdata);
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
    result.append(" (RLENGTH: ");
    result.append(rlength);
    result.append(", RPTDATA: ");
    result.append(rptdata);
    result.append(')');
    return result.toString();
  }

} //RPSImpl