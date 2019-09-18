/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.ColorManagementResourceDescriptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Management Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.ColorManagementResourceDescriptorImpl#getProcMode <em>Proc Mode</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ColorManagementResourceDescriptorImpl#getCMRScpe <em>CMR Scpe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorManagementResourceDescriptorImpl extends tripletImpl implements ColorManagementResourceDescriptor
{
  /**
   * The default value of the '{@link #getProcMode() <em>Proc Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcMode()
   * @generated
   * @ordered
   */
  protected static final int PROC_MODE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProcMode() <em>Proc Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcMode()
   * @generated
   * @ordered
   */
  protected int procMode = PROC_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCMRScpe() <em>CMR Scpe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCMRScpe()
   * @generated
   * @ordered
   */
  protected static final int CMR_SCPE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCMRScpe() <em>CMR Scpe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCMRScpe()
   * @generated
   * @ordered
   */
  protected int cmrScpe = CMR_SCPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorManagementResourceDescriptorImpl()
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
    return AfpTextPackage.eINSTANCE.getColorManagementResourceDescriptor();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getProcMode()
  {
    return procMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcMode(int newProcMode)
  {
    int oldProcMode = procMode;
    procMode = newProcMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE, oldProcMode, procMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCMRScpe()
  {
    return cmrScpe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCMRScpe(int newCMRScpe)
  {
    int oldCMRScpe = cmrScpe;
    cmrScpe = newCMRScpe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE, oldCMRScpe, cmrScpe));
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
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
        return getProcMode();
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
        return getCMRScpe();
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
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
        setProcMode((Integer)newValue);
        return;
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
        setCMRScpe((Integer)newValue);
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
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
        setProcMode(PROC_MODE_EDEFAULT);
        return;
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
        setCMRScpe(CMR_SCPE_EDEFAULT);
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
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
        return procMode != PROC_MODE_EDEFAULT;
      case AfpTextPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
        return cmrScpe != CMR_SCPE_EDEFAULT;
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
    result.append(" (ProcMode: ");
    result.append(procMode);
    result.append(", CMRScpe: ");
    result.append(cmrScpe);
    result.append(')');
    return result.toString();
  }

} //ColorManagementResourceDescriptorImpl