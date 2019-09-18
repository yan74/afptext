/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IOB#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getRefCSys <em>Ref CSys</em>}</li>
 *   <li>{@link org.afplib.afpText.IOB#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIOB()
 * @model
 * @generated
 */
public interface IOB extends structuredField
{
  /**
   * Returns the value of the '<em><b>Obj Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Name</em>' attribute.
   * @see #setObjName(String)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_ObjName()
   * @model
   * @generated
   */
  String getObjName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getObjName <em>Obj Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Name</em>' attribute.
   * @see #getObjName()
   * @generated
   */
  void setObjName(String value);

  /**
   * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Type</em>' attribute.
   * @see #setObjType(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_ObjType()
   * @model
   * @generated
   */
  int getObjType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getObjType <em>Obj Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Type</em>' attribute.
   * @see #getObjType()
   * @generated
   */
  void setObjType(int value);

  /**
   * Returns the value of the '<em><b>Xoa Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xoa Oset</em>' attribute.
   * @see #setXoaOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_XoaOset()
   * @model
   * @generated
   */
  int getXoaOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getXoaOset <em>Xoa Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xoa Oset</em>' attribute.
   * @see #getXoaOset()
   * @generated
   */
  void setXoaOset(int value);

  /**
   * Returns the value of the '<em><b>Yoa Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yoa Oset</em>' attribute.
   * @see #setYoaOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_YoaOset()
   * @model
   * @generated
   */
  int getYoaOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getYoaOset <em>Yoa Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yoa Oset</em>' attribute.
   * @see #getYoaOset()
   * @generated
   */
  void setYoaOset(int value);

  /**
   * Returns the value of the '<em><b>Xoa Orent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xoa Orent</em>' attribute.
   * @see #setXoaOrent(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_XoaOrent()
   * @model
   * @generated
   */
  int getXoaOrent();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getXoaOrent <em>Xoa Orent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xoa Orent</em>' attribute.
   * @see #getXoaOrent()
   * @generated
   */
  void setXoaOrent(int value);

  /**
   * Returns the value of the '<em><b>Yoa Orent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yoa Orent</em>' attribute.
   * @see #setYoaOrent(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_YoaOrent()
   * @model
   * @generated
   */
  int getYoaOrent();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getYoaOrent <em>Yoa Orent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yoa Orent</em>' attribute.
   * @see #getYoaOrent()
   * @generated
   */
  void setYoaOrent(int value);

  /**
   * Returns the value of the '<em><b>Xoca Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xoca Oset</em>' attribute.
   * @see #setXocaOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_XocaOset()
   * @model
   * @generated
   */
  int getXocaOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getXocaOset <em>Xoca Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xoca Oset</em>' attribute.
   * @see #getXocaOset()
   * @generated
   */
  void setXocaOset(int value);

  /**
   * Returns the value of the '<em><b>Yoca Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yoca Oset</em>' attribute.
   * @see #setYocaOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_YocaOset()
   * @model
   * @generated
   */
  int getYocaOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getYocaOset <em>Yoca Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yoca Oset</em>' attribute.
   * @see #getYocaOset()
   * @generated
   */
  void setYocaOset(int value);

  /**
   * Returns the value of the '<em><b>Ref CSys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref CSys</em>' attribute.
   * @see #setRefCSys(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOB_RefCSys()
   * @model
   * @generated
   */
  int getRefCSys();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOB#getRefCSys <em>Ref CSys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref CSys</em>' attribute.
   * @see #getRefCSys()
   * @generated
   */
  void setRefCSys(int value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getIOB_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IOB
