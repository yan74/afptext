/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.MetricAdjustment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getUnitBase <em>Unit Base</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getXUPUB <em>XUPUB</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getYUPUB <em>YUPUB</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getHUniformIncrement <em>HUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getVUniformIncrement <em>VUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getHBaselineIncrement <em>HBaseline Increment</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.MetricAdjustmentImpl#getVBaselineIncrement <em>VBaseline Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricAdjustmentImpl extends tripletImpl implements MetricAdjustment
{
  /**
   * The default value of the '{@link #getUnitBase() <em>Unit Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitBase()
   * @generated
   * @ordered
   */
  protected static final int UNIT_BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUnitBase() <em>Unit Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitBase()
   * @generated
   * @ordered
   */
  protected int unitBase = UNIT_BASE_EDEFAULT;

  /**
   * The default value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXUPUB()
   * @generated
   * @ordered
   */
  protected static final int XUPUB_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXUPUB()
   * @generated
   * @ordered
   */
  protected int xupub = XUPUB_EDEFAULT;

  /**
   * The default value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYUPUB()
   * @generated
   * @ordered
   */
  protected static final int YUPUB_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYUPUB()
   * @generated
   * @ordered
   */
  protected int yupub = YUPUB_EDEFAULT;

  /**
   * The default value of the '{@link #getHUniformIncrement() <em>HUniform Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHUniformIncrement()
   * @generated
   * @ordered
   */
  protected static final int HUNIFORM_INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHUniformIncrement() <em>HUniform Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHUniformIncrement()
   * @generated
   * @ordered
   */
  protected int hUniformIncrement = HUNIFORM_INCREMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getVUniformIncrement() <em>VUniform Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVUniformIncrement()
   * @generated
   * @ordered
   */
  protected static final int VUNIFORM_INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVUniformIncrement() <em>VUniform Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVUniformIncrement()
   * @generated
   * @ordered
   */
  protected int vUniformIncrement = VUNIFORM_INCREMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getHBaselineIncrement() <em>HBaseline Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHBaselineIncrement()
   * @generated
   * @ordered
   */
  protected static final int HBASELINE_INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHBaselineIncrement() <em>HBaseline Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHBaselineIncrement()
   * @generated
   * @ordered
   */
  protected int hBaselineIncrement = HBASELINE_INCREMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getVBaselineIncrement() <em>VBaseline Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVBaselineIncrement()
   * @generated
   * @ordered
   */
  protected static final int VBASELINE_INCREMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVBaselineIncrement() <em>VBaseline Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVBaselineIncrement()
   * @generated
   * @ordered
   */
  protected int vBaselineIncrement = VBASELINE_INCREMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetricAdjustmentImpl()
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
    return AfpTextPackage.eINSTANCE.getMetricAdjustment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getUnitBase()
  {
    return unitBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnitBase(int newUnitBase)
  {
    int oldUnitBase = unitBase;
    unitBase = newUnitBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__UNIT_BASE, oldUnitBase, unitBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXUPUB()
  {
    return xupub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXUPUB(int newXUPUB)
  {
    int oldXUPUB = xupub;
    xupub = newXUPUB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__XUPUB, oldXUPUB, xupub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYUPUB()
  {
    return yupub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYUPUB(int newYUPUB)
  {
    int oldYUPUB = yupub;
    yupub = newYUPUB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__YUPUB, oldYUPUB, yupub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHUniformIncrement()
  {
    return hUniformIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHUniformIncrement(int newHUniformIncrement)
  {
    int oldHUniformIncrement = hUniformIncrement;
    hUniformIncrement = newHUniformIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT, oldHUniformIncrement, hUniformIncrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVUniformIncrement()
  {
    return vUniformIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVUniformIncrement(int newVUniformIncrement)
  {
    int oldVUniformIncrement = vUniformIncrement;
    vUniformIncrement = newVUniformIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT, oldVUniformIncrement, vUniformIncrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHBaselineIncrement()
  {
    return hBaselineIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHBaselineIncrement(int newHBaselineIncrement)
  {
    int oldHBaselineIncrement = hBaselineIncrement;
    hBaselineIncrement = newHBaselineIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT, oldHBaselineIncrement, hBaselineIncrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVBaselineIncrement()
  {
    return vBaselineIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVBaselineIncrement(int newVBaselineIncrement)
  {
    int oldVBaselineIncrement = vBaselineIncrement;
    vBaselineIncrement = newVBaselineIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT, oldVBaselineIncrement, vBaselineIncrement));
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
      case AfpTextPackage.METRIC_ADJUSTMENT__UNIT_BASE:
        return getUnitBase();
      case AfpTextPackage.METRIC_ADJUSTMENT__XUPUB:
        return getXUPUB();
      case AfpTextPackage.METRIC_ADJUSTMENT__YUPUB:
        return getYUPUB();
      case AfpTextPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
        return getHUniformIncrement();
      case AfpTextPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
        return getVUniformIncrement();
      case AfpTextPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
        return getHBaselineIncrement();
      case AfpTextPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
        return getVBaselineIncrement();
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
      case AfpTextPackage.METRIC_ADJUSTMENT__UNIT_BASE:
        setUnitBase((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__XUPUB:
        setXUPUB((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__YUPUB:
        setYUPUB((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
        setHUniformIncrement((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
        setVUniformIncrement((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
        setHBaselineIncrement((Integer)newValue);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
        setVBaselineIncrement((Integer)newValue);
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
      case AfpTextPackage.METRIC_ADJUSTMENT__UNIT_BASE:
        setUnitBase(UNIT_BASE_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__XUPUB:
        setXUPUB(XUPUB_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__YUPUB:
        setYUPUB(YUPUB_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
        setHUniformIncrement(HUNIFORM_INCREMENT_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
        setVUniformIncrement(VUNIFORM_INCREMENT_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
        setHBaselineIncrement(HBASELINE_INCREMENT_EDEFAULT);
        return;
      case AfpTextPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
        setVBaselineIncrement(VBASELINE_INCREMENT_EDEFAULT);
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
      case AfpTextPackage.METRIC_ADJUSTMENT__UNIT_BASE:
        return unitBase != UNIT_BASE_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__XUPUB:
        return xupub != XUPUB_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__YUPUB:
        return yupub != YUPUB_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
        return hUniformIncrement != HUNIFORM_INCREMENT_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
        return vUniformIncrement != VUNIFORM_INCREMENT_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
        return hBaselineIncrement != HBASELINE_INCREMENT_EDEFAULT;
      case AfpTextPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
        return vBaselineIncrement != VBASELINE_INCREMENT_EDEFAULT;
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
    result.append(" (UnitBase: ");
    result.append(unitBase);
    result.append(", XUPUB: ");
    result.append(xupub);
    result.append(", YUPUB: ");
    result.append(yupub);
    result.append(", HUniformIncrement: ");
    result.append(hUniformIncrement);
    result.append(", VUniformIncrement: ");
    result.append(vUniformIncrement);
    result.append(", HBaselineIncrement: ");
    result.append(hBaselineIncrement);
    result.append(", VBaselineIncrement: ");
    result.append(vBaselineIncrement);
    result.append(')');
    return result.toString();
  }

} //MetricAdjustmentImpl