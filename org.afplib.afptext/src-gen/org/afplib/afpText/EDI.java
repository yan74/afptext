/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.EDI#getIndxName <em>Indx Name</em>}</li>
 *   <li>{@link org.afplib.afpText.EDI#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getEDI()
 * @model
 * @generated
 */
public interface EDI extends structuredField
{
  /**
   * Returns the value of the '<em><b>Indx Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indx Name</em>' attribute.
   * @see #setIndxName(String)
   * @see org.afplib.afpText.AfpTextPackage#getEDI_IndxName()
   * @model
   * @generated
   */
  String getIndxName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.EDI#getIndxName <em>Indx Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indx Name</em>' attribute.
   * @see #getIndxName()
   * @generated
   */
  void setIndxName(String value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getEDI_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // EDI
