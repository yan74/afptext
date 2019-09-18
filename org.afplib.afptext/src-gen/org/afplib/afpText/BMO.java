/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BMO#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afpText.BMO#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBMO()
 * @model
 * @generated
 */
public interface BMO extends structuredField
{
  /**
   * Returns the value of the '<em><b>Ovly Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ovly Name</em>' attribute.
   * @see #setOvlyName(String)
   * @see org.afplib.afpText.AfpTextPackage#getBMO_OvlyName()
   * @model
   * @generated
   */
  String getOvlyName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BMO#getOvlyName <em>Ovly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ovly Name</em>' attribute.
   * @see #getOvlyName()
   * @generated
   */
  void setOvlyName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getBMO_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // BMO
