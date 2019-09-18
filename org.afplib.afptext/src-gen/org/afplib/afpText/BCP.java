/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BCP#getRSName <em>RS Name</em>}</li>
 *   <li>{@link org.afplib.afpText.BCP#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBCP()
 * @model
 * @generated
 */
public interface BCP extends structuredField
{
  /**
   * Returns the value of the '<em><b>RS Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RS Name</em>' attribute.
   * @see #setRSName(String)
   * @see org.afplib.afpText.AfpTextPackage#getBCP_RSName()
   * @model
   * @generated
   */
  String getRSName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BCP#getRSName <em>RS Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RS Name</em>' attribute.
   * @see #getRSName()
   * @generated
   */
  void setRSName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getBCP_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // BCP
