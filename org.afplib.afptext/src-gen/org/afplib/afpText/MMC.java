/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MMC#getMMCid <em>MM Cid</em>}</li>
 *   <li>{@link org.afplib.afpText.MMC#getPARAMETER1 <em>PARAMETER1</em>}</li>
 *   <li>{@link org.afplib.afpText.MMC#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMMC()
 * @model
 * @generated
 */
public interface MMC extends structuredField
{
  /**
   * Returns the value of the '<em><b>MM Cid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MM Cid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MM Cid</em>' attribute.
   * @see #setMMCid(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMMC_MMCid()
   * @model
   * @generated
   */
  Integer getMMCid();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MMC#getMMCid <em>MM Cid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MM Cid</em>' attribute.
   * @see #getMMCid()
   * @generated
   */
  void setMMCid(Integer value);

  /**
   * Returns the value of the '<em><b>PARAMETER1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PARAMETER1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PARAMETER1</em>' attribute.
   * @see #setPARAMETER1(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMMC_PARAMETER1()
   * @model
   * @generated
   */
  Integer getPARAMETER1();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MMC#getPARAMETER1 <em>PARAMETER1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PARAMETER1</em>' attribute.
   * @see #getPARAMETER1()
   * @generated
   */
  void setPARAMETER1(Integer value);

  /**
   * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.MMCRG}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rg</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getMMC_Rg()
   * @model containment="true"
   * @generated
   */
  EList<MMCRG> getRg();

} // MMC
