/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCCRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MCCRG#getStartnum <em>Startnum</em>}</li>
 *   <li>{@link org.afplib.afpText.MCCRG#getStopnum <em>Stopnum</em>}</li>
 *   <li>{@link org.afplib.afpText.MCCRG#getMMCid <em>MM Cid</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMCCRG()
 * @model
 * @generated
 */
public interface MCCRG extends EObject
{
  /**
   * Returns the value of the '<em><b>Startnum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startnum</em>' attribute.
   * @see #setStartnum(int)
   * @see org.afplib.afpText.AfpTextPackage#getMCCRG_Startnum()
   * @model
   * @generated
   */
  int getStartnum();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MCCRG#getStartnum <em>Startnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startnum</em>' attribute.
   * @see #getStartnum()
   * @generated
   */
  void setStartnum(int value);

  /**
   * Returns the value of the '<em><b>Stopnum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stopnum</em>' attribute.
   * @see #setStopnum(int)
   * @see org.afplib.afpText.AfpTextPackage#getMCCRG_Stopnum()
   * @model
   * @generated
   */
  int getStopnum();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MCCRG#getStopnum <em>Stopnum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stopnum</em>' attribute.
   * @see #getStopnum()
   * @generated
   */
  void setStopnum(int value);

  /**
   * Returns the value of the '<em><b>MM Cid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>MM Cid</em>' attribute.
   * @see #setMMCid(int)
   * @see org.afplib.afpText.AfpTextPackage#getMCCRG_MMCid()
   * @model
   * @generated
   */
  int getMMCid();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MCCRG#getMMCid <em>MM Cid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MM Cid</em>' attribute.
   * @see #getMMCid()
   * @generated
   */
  void setMMCid(int value);

} // MCCRG
