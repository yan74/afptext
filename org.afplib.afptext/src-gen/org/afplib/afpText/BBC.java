/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BBC#getBCdoName <em>BCdo Name</em>}</li>
 *   <li>{@link org.afplib.afpText.BBC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBBC()
 * @model
 * @generated
 */
public interface BBC extends structuredField
{
  /**
   * Returns the value of the '<em><b>BCdo Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>BCdo Name</em>' attribute.
   * @see #setBCdoName(String)
   * @see org.afplib.afpText.AfpTextPackage#getBBC_BCdoName()
   * @model
   * @generated
   */
  String getBCdoName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BBC#getBCdoName <em>BCdo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BCdo Name</em>' attribute.
   * @see #getBCdoName()
   * @generated
   */
  void setBCdoName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getBBC_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // BBC
