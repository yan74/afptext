/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFARC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.GFARC#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afpText.GFARC#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afpText.GFARC#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afpText.GFARC#getMFR <em>MFR</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getGFARC()
 * @model
 * @generated
 */
public interface GFARC extends triplet
{
  /**
   * Returns the value of the '<em><b>XPOS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XPOS</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPOS</em>' attribute.
   * @see #setXPOS(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getGFARC_XPOS()
   * @model
   * @generated
   */
  Integer getXPOS();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GFARC#getXPOS <em>XPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XPOS</em>' attribute.
   * @see #getXPOS()
   * @generated
   */
  void setXPOS(Integer value);

  /**
   * Returns the value of the '<em><b>YPOS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>YPOS</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>YPOS</em>' attribute.
   * @see #setYPOS(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getGFARC_YPOS()
   * @model
   * @generated
   */
  Integer getYPOS();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GFARC#getYPOS <em>YPOS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YPOS</em>' attribute.
   * @see #getYPOS()
   * @generated
   */
  void setYPOS(Integer value);

  /**
   * Returns the value of the '<em><b>MH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MH</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MH</em>' attribute.
   * @see #setMH(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getGFARC_MH()
   * @model
   * @generated
   */
  Integer getMH();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GFARC#getMH <em>MH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MH</em>' attribute.
   * @see #getMH()
   * @generated
   */
  void setMH(Integer value);

  /**
   * Returns the value of the '<em><b>MFR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MFR</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MFR</em>' attribute.
   * @see #setMFR(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getGFARC_MFR()
   * @model
   * @generated
   */
  Integer getMFR();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GFARC#getMFR <em>MFR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MFR</em>' attribute.
   * @see #getMFR()
   * @generated
   */
  void setMFR(Integer value);

} // GFARC
