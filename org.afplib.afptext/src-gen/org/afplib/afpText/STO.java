/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.STO#getIORNTION <em>IORNTION</em>}</li>
 *   <li>{@link org.afplib.afpText.STO#getBORNTION <em>BORNTION</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getSTO()
 * @model
 * @generated
 */
public interface STO extends triplet
{
  /**
   * Returns the value of the '<em><b>IORNTION</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IORNTION</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IORNTION</em>' attribute.
   * @see #setIORNTION(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getSTO_IORNTION()
   * @model
   * @generated
   */
  Integer getIORNTION();

  /**
   * Sets the value of the '{@link org.afplib.afpText.STO#getIORNTION <em>IORNTION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IORNTION</em>' attribute.
   * @see #getIORNTION()
   * @generated
   */
  void setIORNTION(Integer value);

  /**
   * Returns the value of the '<em><b>BORNTION</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BORNTION</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BORNTION</em>' attribute.
   * @see #setBORNTION(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getSTO_BORNTION()
   * @model
   * @generated
   */
  Integer getBORNTION();

  /**
   * Sets the value of the '{@link org.afplib.afpText.STO#getBORNTION <em>BORNTION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BORNTION</em>' attribute.
   * @see #getBORNTION()
   * @generated
   */
  void setBORNTION(Integer value);

} // STO
