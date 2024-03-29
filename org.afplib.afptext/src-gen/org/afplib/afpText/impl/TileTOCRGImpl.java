/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.TileTOCRG;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile TOCRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getXOFFSET <em>XOFFSET</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getYOFFSET <em>YOFFSET</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getTHSIZE <em>THSIZE</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getTVSIZE <em>TVSIZE</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getRELRES <em>RELRES</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getCOMPR <em>COMPR</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.TileTOCRGImpl#getDATAPOS <em>DATAPOS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileTOCRGImpl extends MinimalEObjectImpl.Container implements TileTOCRG
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
   * The default value of the '{@link #getTHSIZE() <em>THSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHSIZE()
   * @generated
   * @ordered
   */
  protected static final Integer THSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTHSIZE() <em>THSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTHSIZE()
   * @generated
   * @ordered
   */
  protected Integer thsize = THSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getTVSIZE() <em>TVSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTVSIZE()
   * @generated
   * @ordered
   */
  protected static final Integer TVSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTVSIZE() <em>TVSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTVSIZE()
   * @generated
   * @ordered
   */
  protected Integer tvsize = TVSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getRELRES() <em>RELRES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRELRES()
   * @generated
   * @ordered
   */
  protected static final Integer RELRES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRELRES() <em>RELRES</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRELRES()
   * @generated
   * @ordered
   */
  protected Integer relres = RELRES_EDEFAULT;

  /**
   * The default value of the '{@link #getCOMPR() <em>COMPR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOMPR()
   * @generated
   * @ordered
   */
  protected static final Integer COMPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCOMPR() <em>COMPR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOMPR()
   * @generated
   * @ordered
   */
  protected Integer compr = COMPR_EDEFAULT;

  /**
   * The default value of the '{@link #getDATAPOS() <em>DATAPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATAPOS()
   * @generated
   * @ordered
   */
  protected static final Integer DATAPOS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDATAPOS() <em>DATAPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATAPOS()
   * @generated
   * @ordered
   */
  protected Integer datapos = DATAPOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TileTOCRGImpl()
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
    return AfpTextPackage.eINSTANCE.getTileTOCRG();
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
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__XOFFSET, oldXOFFSET, xoffset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__YOFFSET, oldYOFFSET, yoffset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getTHSIZE()
  {
    return thsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTHSIZE(Integer newTHSIZE)
  {
    Integer oldTHSIZE = thsize;
    thsize = newTHSIZE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__THSIZE, oldTHSIZE, thsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getTVSIZE()
  {
    return tvsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTVSIZE(Integer newTVSIZE)
  {
    Integer oldTVSIZE = tvsize;
    tvsize = newTVSIZE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__TVSIZE, oldTVSIZE, tvsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getRELRES()
  {
    return relres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRELRES(Integer newRELRES)
  {
    Integer oldRELRES = relres;
    relres = newRELRES;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__RELRES, oldRELRES, relres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getCOMPR()
  {
    return compr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCOMPR(Integer newCOMPR)
  {
    Integer oldCOMPR = compr;
    compr = newCOMPR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__COMPR, oldCOMPR, compr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getDATAPOS()
  {
    return datapos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDATAPOS(Integer newDATAPOS)
  {
    Integer oldDATAPOS = datapos;
    datapos = newDATAPOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.TILE_TOCRG__DATAPOS, oldDATAPOS, datapos));
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
      case AfpTextPackage.TILE_TOCRG__XOFFSET:
        return getXOFFSET();
      case AfpTextPackage.TILE_TOCRG__YOFFSET:
        return getYOFFSET();
      case AfpTextPackage.TILE_TOCRG__THSIZE:
        return getTHSIZE();
      case AfpTextPackage.TILE_TOCRG__TVSIZE:
        return getTVSIZE();
      case AfpTextPackage.TILE_TOCRG__RELRES:
        return getRELRES();
      case AfpTextPackage.TILE_TOCRG__COMPR:
        return getCOMPR();
      case AfpTextPackage.TILE_TOCRG__DATAPOS:
        return getDATAPOS();
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
      case AfpTextPackage.TILE_TOCRG__XOFFSET:
        setXOFFSET((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__YOFFSET:
        setYOFFSET((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__THSIZE:
        setTHSIZE((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__TVSIZE:
        setTVSIZE((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__RELRES:
        setRELRES((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__COMPR:
        setCOMPR((Integer)newValue);
        return;
      case AfpTextPackage.TILE_TOCRG__DATAPOS:
        setDATAPOS((Integer)newValue);
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
      case AfpTextPackage.TILE_TOCRG__XOFFSET:
        setXOFFSET(XOFFSET_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__YOFFSET:
        setYOFFSET(YOFFSET_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__THSIZE:
        setTHSIZE(THSIZE_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__TVSIZE:
        setTVSIZE(TVSIZE_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__RELRES:
        setRELRES(RELRES_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__COMPR:
        setCOMPR(COMPR_EDEFAULT);
        return;
      case AfpTextPackage.TILE_TOCRG__DATAPOS:
        setDATAPOS(DATAPOS_EDEFAULT);
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
      case AfpTextPackage.TILE_TOCRG__XOFFSET:
        return XOFFSET_EDEFAULT == null ? xoffset != null : !XOFFSET_EDEFAULT.equals(xoffset);
      case AfpTextPackage.TILE_TOCRG__YOFFSET:
        return YOFFSET_EDEFAULT == null ? yoffset != null : !YOFFSET_EDEFAULT.equals(yoffset);
      case AfpTextPackage.TILE_TOCRG__THSIZE:
        return THSIZE_EDEFAULT == null ? thsize != null : !THSIZE_EDEFAULT.equals(thsize);
      case AfpTextPackage.TILE_TOCRG__TVSIZE:
        return TVSIZE_EDEFAULT == null ? tvsize != null : !TVSIZE_EDEFAULT.equals(tvsize);
      case AfpTextPackage.TILE_TOCRG__RELRES:
        return RELRES_EDEFAULT == null ? relres != null : !RELRES_EDEFAULT.equals(relres);
      case AfpTextPackage.TILE_TOCRG__COMPR:
        return COMPR_EDEFAULT == null ? compr != null : !COMPR_EDEFAULT.equals(compr);
      case AfpTextPackage.TILE_TOCRG__DATAPOS:
        return DATAPOS_EDEFAULT == null ? datapos != null : !DATAPOS_EDEFAULT.equals(datapos);
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
    result.append(", THSIZE: ");
    result.append(thsize);
    result.append(", TVSIZE: ");
    result.append(tvsize);
    result.append(", RELRES: ");
    result.append(relres);
    result.append(", COMPR: ");
    result.append(compr);
    result.append(", DATAPOS: ");
    result.append(datapos);
    result.append(')');
    return result.toString();
  }

} //TileTOCRGImpl
