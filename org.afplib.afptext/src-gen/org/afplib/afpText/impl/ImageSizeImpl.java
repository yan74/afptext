/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.ImageSize;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.ImageSizeImpl#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ImageSizeImpl#getHRESOL <em>HRESOL</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ImageSizeImpl#getVRESOL <em>VRESOL</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ImageSizeImpl#getHSIZE <em>HSIZE</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ImageSizeImpl#getVSIZE <em>VSIZE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageSizeImpl extends tripletImpl implements ImageSize
{
  /**
   * The default value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUNITBASE()
   * @generated
   * @ordered
   */
  protected static final int UNITBASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUNITBASE()
   * @generated
   * @ordered
   */
  protected int unitbase = UNITBASE_EDEFAULT;

  /**
   * The default value of the '{@link #getHRESOL() <em>HRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHRESOL()
   * @generated
   * @ordered
   */
  protected static final int HRESOL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHRESOL() <em>HRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHRESOL()
   * @generated
   * @ordered
   */
  protected int hresol = HRESOL_EDEFAULT;

  /**
   * The default value of the '{@link #getVRESOL() <em>VRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVRESOL()
   * @generated
   * @ordered
   */
  protected static final int VRESOL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVRESOL() <em>VRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVRESOL()
   * @generated
   * @ordered
   */
  protected int vresol = VRESOL_EDEFAULT;

  /**
   * The default value of the '{@link #getHSIZE() <em>HSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHSIZE()
   * @generated
   * @ordered
   */
  protected static final int HSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHSIZE() <em>HSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHSIZE()
   * @generated
   * @ordered
   */
  protected int hsize = HSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getVSIZE() <em>VSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVSIZE()
   * @generated
   * @ordered
   */
  protected static final int VSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVSIZE() <em>VSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVSIZE()
   * @generated
   * @ordered
   */
  protected int vsize = VSIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageSizeImpl()
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
    return AfpTextPackage.eINSTANCE.getImageSize();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getUNITBASE()
  {
    return unitbase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUNITBASE(int newUNITBASE)
  {
    int oldUNITBASE = unitbase;
    unitbase = newUNITBASE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IMAGE_SIZE__UNITBASE, oldUNITBASE, unitbase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHRESOL()
  {
    return hresol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHRESOL(int newHRESOL)
  {
    int oldHRESOL = hresol;
    hresol = newHRESOL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IMAGE_SIZE__HRESOL, oldHRESOL, hresol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVRESOL()
  {
    return vresol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVRESOL(int newVRESOL)
  {
    int oldVRESOL = vresol;
    vresol = newVRESOL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IMAGE_SIZE__VRESOL, oldVRESOL, vresol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHSIZE()
  {
    return hsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHSIZE(int newHSIZE)
  {
    int oldHSIZE = hsize;
    hsize = newHSIZE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IMAGE_SIZE__HSIZE, oldHSIZE, hsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVSIZE()
  {
    return vsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVSIZE(int newVSIZE)
  {
    int oldVSIZE = vsize;
    vsize = newVSIZE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.IMAGE_SIZE__VSIZE, oldVSIZE, vsize));
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
      case AfpTextPackage.IMAGE_SIZE__UNITBASE:
        return getUNITBASE();
      case AfpTextPackage.IMAGE_SIZE__HRESOL:
        return getHRESOL();
      case AfpTextPackage.IMAGE_SIZE__VRESOL:
        return getVRESOL();
      case AfpTextPackage.IMAGE_SIZE__HSIZE:
        return getHSIZE();
      case AfpTextPackage.IMAGE_SIZE__VSIZE:
        return getVSIZE();
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
      case AfpTextPackage.IMAGE_SIZE__UNITBASE:
        setUNITBASE((Integer)newValue);
        return;
      case AfpTextPackage.IMAGE_SIZE__HRESOL:
        setHRESOL((Integer)newValue);
        return;
      case AfpTextPackage.IMAGE_SIZE__VRESOL:
        setVRESOL((Integer)newValue);
        return;
      case AfpTextPackage.IMAGE_SIZE__HSIZE:
        setHSIZE((Integer)newValue);
        return;
      case AfpTextPackage.IMAGE_SIZE__VSIZE:
        setVSIZE((Integer)newValue);
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
      case AfpTextPackage.IMAGE_SIZE__UNITBASE:
        setUNITBASE(UNITBASE_EDEFAULT);
        return;
      case AfpTextPackage.IMAGE_SIZE__HRESOL:
        setHRESOL(HRESOL_EDEFAULT);
        return;
      case AfpTextPackage.IMAGE_SIZE__VRESOL:
        setVRESOL(VRESOL_EDEFAULT);
        return;
      case AfpTextPackage.IMAGE_SIZE__HSIZE:
        setHSIZE(HSIZE_EDEFAULT);
        return;
      case AfpTextPackage.IMAGE_SIZE__VSIZE:
        setVSIZE(VSIZE_EDEFAULT);
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
      case AfpTextPackage.IMAGE_SIZE__UNITBASE:
        return unitbase != UNITBASE_EDEFAULT;
      case AfpTextPackage.IMAGE_SIZE__HRESOL:
        return hresol != HRESOL_EDEFAULT;
      case AfpTextPackage.IMAGE_SIZE__VRESOL:
        return vresol != VRESOL_EDEFAULT;
      case AfpTextPackage.IMAGE_SIZE__HSIZE:
        return hsize != HSIZE_EDEFAULT;
      case AfpTextPackage.IMAGE_SIZE__VSIZE:
        return vsize != VSIZE_EDEFAULT;
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
    result.append(" (UNITBASE: ");
    result.append(unitbase);
    result.append(", HRESOL: ");
    result.append(hresol);
    result.append(", VRESOL: ");
    result.append(vresol);
    result.append(", HSIZE: ");
    result.append(hsize);
    result.append(", VSIZE: ");
    result.append(vsize);
    result.append(')');
    return result.toString();
  }

} //ImageSizeImpl
