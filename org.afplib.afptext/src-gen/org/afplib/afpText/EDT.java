/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.EDT#getDocName <em>Doc Name</em>}</li>
 *   <li>{@link org.afplib.afpText.EDT#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getEDT()
 * @model
 * @generated
 */
public interface EDT extends structuredField
{
  /**
   * Returns the value of the '<em><b>Doc Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Name</em>' attribute.
   * @see #setDocName(String)
   * @see org.afplib.afpText.AfpTextPackage#getEDT_DocName()
   * @model
   * @generated
   */
  String getDocName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.EDT#getDocName <em>Doc Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc Name</em>' attribute.
   * @see #getDocName()
   * @generated
   */
  void setDocName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getEDT_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // EDT