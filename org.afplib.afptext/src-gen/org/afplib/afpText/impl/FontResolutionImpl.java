/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.FontResolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.FontResolutionImpl#getMetTech <em>Met Tech</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.FontResolutionImpl#getRPuBase <em>RPu Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.FontResolutionImpl#getRPUnits <em>RP Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontResolutionImpl extends tripletImpl implements FontResolution
{
  /**
   * The default value of the '{@link #getMetTech() <em>Met Tech</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetTech()
   * @generated
   * @ordered
   */
  protected static final int MET_TECH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMetTech() <em>Met Tech</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetTech()
   * @generated
   * @ordered
   */
  protected int metTech = MET_TECH_EDEFAULT;

  /**
   * The default value of the '{@link #getRPuBase() <em>RPu Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPuBase()
   * @generated
   * @ordered
   */
  protected static final int RPU_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRPuBase() <em>RPu Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPuBase()
   * @generated
   * @ordered
   */
  protected int rPuBase = RPU_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getRPUnits() <em>RP Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPUnits()
   * @generated
   * @ordered
   */
  protected static final int RP_UNITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRPUnits() <em>RP Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPUnits()
   * @generated
   * @ordered
   */
  protected int rpUnits = RP_UNITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontResolutionImpl()
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
    return AfpTextPackage.eINSTANCE.getFontResolution();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMetTech()
  {
    return metTech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetTech(int newMetTech)
  {
    int oldMetTech = metTech;
    metTech = newMetTech;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.FONT_RESOLUTION__MET_TECH, oldMetTech, metTech));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRPuBase()
  {
    return rPuBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRPuBase(int newRPuBase)
  {
    int oldRPuBase = rPuBase;
    rPuBase = newRPuBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.FONT_RESOLUTION__RPU_BASE, oldRPuBase, rPuBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRPUnits()
  {
    return rpUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRPUnits(int newRPUnits)
  {
    int oldRPUnits = rpUnits;
    rpUnits = newRPUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.FONT_RESOLUTION__RP_UNITS, oldRPUnits, rpUnits));
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
      case AfpTextPackage.FONT_RESOLUTION__MET_TECH:
        return getMetTech();
      case AfpTextPackage.FONT_RESOLUTION__RPU_BASE:
        return getRPuBase();
      case AfpTextPackage.FONT_RESOLUTION__RP_UNITS:
        return getRPUnits();
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
      case AfpTextPackage.FONT_RESOLUTION__MET_TECH:
        setMetTech((Integer)newValue);
        return;
      case AfpTextPackage.FONT_RESOLUTION__RPU_BASE:
        setRPuBase((Integer)newValue);
        return;
      case AfpTextPackage.FONT_RESOLUTION__RP_UNITS:
        setRPUnits((Integer)newValue);
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
      case AfpTextPackage.FONT_RESOLUTION__MET_TECH:
        setMetTech(MET_TECH_EDEFAULT);
        return;
      case AfpTextPackage.FONT_RESOLUTION__RPU_BASE:
        setRPuBase(RPU_BASE_EDEFAULT);
        return;
      case AfpTextPackage.FONT_RESOLUTION__RP_UNITS:
        setRPUnits(RP_UNITS_EDEFAULT);
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
      case AfpTextPackage.FONT_RESOLUTION__MET_TECH:
        return metTech != MET_TECH_EDEFAULT;
      case AfpTextPackage.FONT_RESOLUTION__RPU_BASE:
        return rPuBase != RPU_BASE_EDEFAULT;
      case AfpTextPackage.FONT_RESOLUTION__RP_UNITS:
        return rpUnits != RP_UNITS_EDEFAULT;
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
    result.append(" (MetTech: ");
    result.append(metTech);
    result.append(", RPuBase: ");
    result.append(rPuBase);
    result.append(", RPUnits: ");
    result.append(rpUnits);
    result.append(')');
    return result.toString();
  }

} //FontResolutionImpl