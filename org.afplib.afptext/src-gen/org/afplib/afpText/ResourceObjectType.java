/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ResourceObjectType#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afpText.ResourceObjectType#getConData <em>Con Data</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getResourceObjectType()
 * @model
 * @generated
 */
public interface ResourceObjectType extends triplet
{
  /**
   * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Type</em>' attribute.
   * @see #setObjType(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getResourceObjectType_ObjType()
   * @model
   * @generated
   */
  Integer getObjType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ResourceObjectType#getObjType <em>Obj Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Type</em>' attribute.
   * @see #getObjType()
   * @generated
   */
  void setObjType(Integer value);

  /**
   * Returns the value of the '<em><b>Con Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con Data</em>' attribute.
   * @see #setConData(String)
   * @see org.afplib.afpText.AfpTextPackage#getResourceObjectType_ConData()
   * @model
   * @generated
   */
  String getConData();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ResourceObjectType#getConData <em>Con Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Con Data</em>' attribute.
   * @see #getConData()
   * @generated
   */
  void setConData(String value);

} // ResourceObjectType
