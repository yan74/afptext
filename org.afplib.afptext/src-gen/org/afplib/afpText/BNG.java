/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BNG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BNG#getPGrpName <em>PGrp Name</em>}</li>
 *   <li>{@link org.afplib.afpText.BNG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBNG()
 * @model
 * @generated
 */
public interface BNG extends structuredField
{
  /**
   * Returns the value of the '<em><b>PGrp Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PGrp Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PGrp Name</em>' attribute.
   * @see #setPGrpName(String)
   * @see org.afplib.afpText.AfpTextPackage#getBNG_PGrpName()
   * @model
   * @generated
   */
  String getPGrpName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BNG#getPGrpName <em>PGrp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PGrp Name</em>' attribute.
   * @see #getPGrpName()
   * @generated
   */
  void setPGrpName(String value);

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
   * @see org.afplib.afpText.AfpTextPackage#getBNG_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // BNG
