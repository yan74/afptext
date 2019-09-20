/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BRG#getRGrpName <em>RGrp Name</em>}</li>
 *   <li>{@link org.afplib.afpText.BRG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBRG()
 * @model
 * @generated
 */
public interface BRG extends structuredField
{
  /**
   * Returns the value of the '<em><b>RGrp Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RGrp Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RGrp Name</em>' attribute.
   * @see #setRGrpName(String)
   * @see org.afplib.afpText.AfpTextPackage#getBRG_RGrpName()
   * @model
   * @generated
   */
  String getRGrpName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BRG#getRGrpName <em>RGrp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RGrp Name</em>' attribute.
   * @see #getRGrpName()
   * @generated
   */
  void setRGrpName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triplets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getBRG_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // BRG
