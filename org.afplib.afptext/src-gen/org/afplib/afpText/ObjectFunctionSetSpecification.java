/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Function Set Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ObjectFunctionSetSpecification#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectFunctionSetSpecification#getArchVrsn <em>Arch Vrsn</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectFunctionSetSpecification#getDCAFnSet <em>DCA Fn Set</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectFunctionSetSpecification#getOCAFnSet <em>OCA Fn Set</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getObjectFunctionSetSpecification()
 * @model
 * @generated
 */
public interface ObjectFunctionSetSpecification extends triplet
{
  /**
   * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Type</em>' attribute.
   * @see #setObjType(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getObjectFunctionSetSpecification_ObjType()
   * @model
   * @generated
   */
  Integer getObjType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectFunctionSetSpecification#getObjType <em>Obj Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Type</em>' attribute.
   * @see #getObjType()
   * @generated
   */
  void setObjType(Integer value);

  /**
   * Returns the value of the '<em><b>Arch Vrsn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arch Vrsn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arch Vrsn</em>' attribute.
   * @see #setArchVrsn(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getObjectFunctionSetSpecification_ArchVrsn()
   * @model
   * @generated
   */
  Integer getArchVrsn();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectFunctionSetSpecification#getArchVrsn <em>Arch Vrsn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arch Vrsn</em>' attribute.
   * @see #getArchVrsn()
   * @generated
   */
  void setArchVrsn(Integer value);

  /**
   * Returns the value of the '<em><b>DCA Fn Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DCA Fn Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DCA Fn Set</em>' attribute.
   * @see #setDCAFnSet(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getObjectFunctionSetSpecification_DCAFnSet()
   * @model
   * @generated
   */
  Integer getDCAFnSet();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectFunctionSetSpecification#getDCAFnSet <em>DCA Fn Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DCA Fn Set</em>' attribute.
   * @see #getDCAFnSet()
   * @generated
   */
  void setDCAFnSet(Integer value);

  /**
   * Returns the value of the '<em><b>OCA Fn Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OCA Fn Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OCA Fn Set</em>' attribute.
   * @see #setOCAFnSet(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getObjectFunctionSetSpecification_OCAFnSet()
   * @model
   * @generated
   */
  Integer getOCAFnSet();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectFunctionSetSpecification#getOCAFnSet <em>OCA Fn Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OCA Fn Set</em>' attribute.
   * @see #getOCAFnSet()
   * @generated
   */
  void setOCAFnSet(Integer value);

} // ObjectFunctionSetSpecification
