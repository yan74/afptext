/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.TextFidelity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.TextFidelityImpl#getStpTxtEx <em>Stp Txt Ex</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TextFidelityImpl#getRepTxtEx <em>Rep Txt Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFidelityImpl extends tripletImpl implements TextFidelity
{
  /**
   * The default value of the '{@link #getStpTxtEx() <em>Stp Txt Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStpTxtEx()
   * @generated
   * @ordered
   */
  protected static final int STP_TXT_EX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStpTxtEx() <em>Stp Txt Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStpTxtEx()
   * @generated
   * @ordered
   */
  protected int stpTxtEx = STP_TXT_EX_EDEFAULT;

  /**
   * The default value of the '{@link #getRepTxtEx() <em>Rep Txt Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepTxtEx()
   * @generated
   * @ordered
   */
  protected static final int REP_TXT_EX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRepTxtEx() <em>Rep Txt Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepTxtEx()
   * @generated
   * @ordered
   */
  protected int repTxtEx = REP_TXT_EX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextFidelityImpl()
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
    return AfpTextPackage.eINSTANCE.getTextFidelity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getStpTxtEx()
  {
    return stpTxtEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStpTxtEx(int newStpTxtEx)
  {
    int oldStpTxtEx = stpTxtEx;
    stpTxtEx = newStpTxtEx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TEXT_FIDELITY__STP_TXT_EX, oldStpTxtEx, stpTxtEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRepTxtEx()
  {
    return repTxtEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepTxtEx(int newRepTxtEx)
  {
    int oldRepTxtEx = repTxtEx;
    repTxtEx = newRepTxtEx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TEXT_FIDELITY__REP_TXT_EX, oldRepTxtEx, repTxtEx));
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
      case AfpTextPackage.TEXT_FIDELITY__STP_TXT_EX:
        return getStpTxtEx();
      case AfpTextPackage.TEXT_FIDELITY__REP_TXT_EX:
        return getRepTxtEx();
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
      case AfpTextPackage.TEXT_FIDELITY__STP_TXT_EX:
        setStpTxtEx((Integer)newValue);
        return;
      case AfpTextPackage.TEXT_FIDELITY__REP_TXT_EX:
        setRepTxtEx((Integer)newValue);
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
      case AfpTextPackage.TEXT_FIDELITY__STP_TXT_EX:
        setStpTxtEx(STP_TXT_EX_EDEFAULT);
        return;
      case AfpTextPackage.TEXT_FIDELITY__REP_TXT_EX:
        setRepTxtEx(REP_TXT_EX_EDEFAULT);
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
      case AfpTextPackage.TEXT_FIDELITY__STP_TXT_EX:
        return stpTxtEx != STP_TXT_EX_EDEFAULT;
      case AfpTextPackage.TEXT_FIDELITY__REP_TXT_EX:
        return repTxtEx != REP_TXT_EX_EDEFAULT;
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
    result.append(" (StpTxtEx: ");
    result.append(stpTxtEx);
    result.append(", RepTxtEx: ");
    result.append(repTxtEx);
    result.append(')');
    return result.toString();
  }

} //TextFidelityImpl
