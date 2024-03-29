/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.TilePosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.TilePositionImpl#getXOFFSET <em>XOFFSET</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TilePositionImpl#getYOFFSET <em>YOFFSET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TilePositionImpl extends tripletImpl implements TilePosition
{
  /**
   * The default value of the '{@link #getXOFFSET() <em>XOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXOFFSET()
   * @generated
   * @ordered
   */
  protected static final Integer XOFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXOFFSET() <em>XOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXOFFSET()
   * @generated
   * @ordered
   */
  protected Integer xoffset = XOFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getYOFFSET() <em>YOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYOFFSET()
   * @generated
   * @ordered
   */
  protected static final Integer YOFFSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYOFFSET() <em>YOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYOFFSET()
   * @generated
   * @ordered
   */
  protected Integer yoffset = YOFFSET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TilePositionImpl()
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
    return AfpTextPackage.eINSTANCE.getTilePosition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getXOFFSET()
  {
    return xoffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXOFFSET(Integer newXOFFSET)
  {
    Integer oldXOFFSET = xoffset;
    xoffset = newXOFFSET;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_POSITION__XOFFSET, oldXOFFSET, xoffset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getYOFFSET()
  {
    return yoffset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYOFFSET(Integer newYOFFSET)
  {
    Integer oldYOFFSET = yoffset;
    yoffset = newYOFFSET;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_POSITION__YOFFSET, oldYOFFSET, yoffset));
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
      case AfpTextPackage.TILE_POSITION__XOFFSET:
        return getXOFFSET();
      case AfpTextPackage.TILE_POSITION__YOFFSET:
        return getYOFFSET();
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
      case AfpTextPackage.TILE_POSITION__XOFFSET:
        setXOFFSET((Integer)newValue);
        return;
      case AfpTextPackage.TILE_POSITION__YOFFSET:
        setYOFFSET((Integer)newValue);
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
      case AfpTextPackage.TILE_POSITION__XOFFSET:
        setXOFFSET(XOFFSET_EDEFAULT);
        return;
      case AfpTextPackage.TILE_POSITION__YOFFSET:
        setYOFFSET(YOFFSET_EDEFAULT);
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
      case AfpTextPackage.TILE_POSITION__XOFFSET:
        return XOFFSET_EDEFAULT == null ? xoffset != null : !XOFFSET_EDEFAULT.equals(xoffset);
      case AfpTextPackage.TILE_POSITION__YOFFSET:
        return YOFFSET_EDEFAULT == null ? yoffset != null : !YOFFSET_EDEFAULT.equals(yoffset);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (XOFFSET: ");
    result.append(xoffset);
    result.append(", YOFFSET: ");
    result.append(yoffset);
    result.append(')');
    return result.toString();
  }

} //TilePositionImpl
