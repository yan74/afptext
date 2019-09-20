/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.AttributeQualifier#getSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link org.afplib.afpText.AttributeQualifier#getLevNum <em>Lev Num</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getAttributeQualifier()
 * @model
 * @generated
 */
public interface AttributeQualifier extends triplet
{
  /**
   * Returns the value of the '<em><b>Seq Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seq Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seq Num</em>' attribute.
   * @see #setSeqNum(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getAttributeQualifier_SeqNum()
   * @model
   * @generated
   */
  Integer getSeqNum();

  /**
   * Sets the value of the '{@link org.afplib.afpText.AttributeQualifier#getSeqNum <em>Seq Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seq Num</em>' attribute.
   * @see #getSeqNum()
   * @generated
   */
  void setSeqNum(Integer value);

  /**
   * Returns the value of the '<em><b>Lev Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lev Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lev Num</em>' attribute.
   * @see #setLevNum(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getAttributeQualifier_LevNum()
   * @model
   * @generated
   */
  Integer getLevNum();

  /**
   * Sets the value of the '{@link org.afplib.afpText.AttributeQualifier#getLevNum <em>Lev Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lev Num</em>' attribute.
   * @see #getLevNum()
   * @generated
   */
  void setLevNum(Integer value);

} // AttributeQualifier
