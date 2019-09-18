/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IMM#getMMPName <em>MMP Name</em>}</li>
 *   <li>{@link org.afplib.afpText.IMM#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIMM()
 * @model
 * @generated
 */
public interface IMM extends structuredField
{
  /**
   * Returns the value of the '<em><b>MMP Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>MMP Name</em>' attribute.
   * @see #setMMPName(String)
   * @see org.afplib.afpText.AfpTextPackage#getIMM_MMPName()
   * @model
   * @generated
   */
  String getMMPName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IMM#getMMPName <em>MMP Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MMP Name</em>' attribute.
   * @see #getMMPName()
   * @generated
   */
  void setMMPName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getIMM_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IMM