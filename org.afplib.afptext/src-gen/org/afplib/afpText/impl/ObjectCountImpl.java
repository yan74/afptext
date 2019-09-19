/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.ObjectCount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.ObjectCountImpl#getSubObj <em>Sub Obj</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ObjectCountImpl#getSObjNum <em>SObj Num</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.ObjectCountImpl#getSobjNmHi <em>Sobj Nm Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectCountImpl extends tripletImpl implements ObjectCount
{
  /**
   * The default value of the '{@link #getSubObj() <em>Sub Obj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubObj()
   * @generated
   * @ordered
   */
  protected static final Integer SUB_OBJ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubObj() <em>Sub Obj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubObj()
   * @generated
   * @ordered
   */
  protected Integer subObj = SUB_OBJ_EDEFAULT;

  /**
   * The default value of the '{@link #getSObjNum() <em>SObj Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSObjNum()
   * @generated
   * @ordered
   */
  protected static final Integer SOBJ_NUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSObjNum() <em>SObj Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSObjNum()
   * @generated
   * @ordered
   */
  protected Integer sObjNum = SOBJ_NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getSobjNmHi() <em>Sobj Nm Hi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSobjNmHi()
   * @generated
   * @ordered
   */
  protected static final Integer SOBJ_NM_HI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSobjNmHi() <em>Sobj Nm Hi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSobjNmHi()
   * @generated
   * @ordered
   */
  protected Integer sobjNmHi = SOBJ_NM_HI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectCountImpl()
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
    return AfpTextPackage.eINSTANCE.getObjectCount();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getSubObj()
  {
    return subObj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubObj(Integer newSubObj)
  {
    Integer oldSubObj = subObj;
    subObj = newSubObj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.OBJECT_COUNT__SUB_OBJ, oldSubObj, subObj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getSObjNum()
  {
    return sObjNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSObjNum(Integer newSObjNum)
  {
    Integer oldSObjNum = sObjNum;
    sObjNum = newSObjNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.OBJECT_COUNT__SOBJ_NUM, oldSObjNum, sObjNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getSobjNmHi()
  {
    return sobjNmHi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSobjNmHi(Integer newSobjNmHi)
  {
    Integer oldSobjNmHi = sobjNmHi;
    sobjNmHi = newSobjNmHi;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.OBJECT_COUNT__SOBJ_NM_HI, oldSobjNmHi, sobjNmHi));
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
      case AfpTextPackage.OBJECT_COUNT__SUB_OBJ:
        return getSubObj();
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NUM:
        return getSObjNum();
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NM_HI:
        return getSobjNmHi();
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
      case AfpTextPackage.OBJECT_COUNT__SUB_OBJ:
        setSubObj((Integer)newValue);
        return;
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NUM:
        setSObjNum((Integer)newValue);
        return;
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NM_HI:
        setSobjNmHi((Integer)newValue);
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
      case AfpTextPackage.OBJECT_COUNT__SUB_OBJ:
        setSubObj(SUB_OBJ_EDEFAULT);
        return;
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NUM:
        setSObjNum(SOBJ_NUM_EDEFAULT);
        return;
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NM_HI:
        setSobjNmHi(SOBJ_NM_HI_EDEFAULT);
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
      case AfpTextPackage.OBJECT_COUNT__SUB_OBJ:
        return SUB_OBJ_EDEFAULT == null ? subObj != null : !SUB_OBJ_EDEFAULT.equals(subObj);
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NUM:
        return SOBJ_NUM_EDEFAULT == null ? sObjNum != null : !SOBJ_NUM_EDEFAULT.equals(sObjNum);
      case AfpTextPackage.OBJECT_COUNT__SOBJ_NM_HI:
        return SOBJ_NM_HI_EDEFAULT == null ? sobjNmHi != null : !SOBJ_NM_HI_EDEFAULT.equals(sobjNmHi);
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
    result.append(" (SubObj: ");
    result.append(subObj);
    result.append(", SObjNum: ");
    result.append(sObjNum);
    result.append(", SobjNmHi: ");
    result.append(sobjNmHi);
    result.append(')');
    return result.toString();
  }

} //ObjectCountImpl
