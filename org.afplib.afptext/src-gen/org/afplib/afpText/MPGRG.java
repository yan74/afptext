/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPGRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MPGRG#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afpText.MPGRG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMPGRG()
 * @model
 * @generated
 */
public interface MPGRG extends EObject
{
  /**
   * Returns the value of the '<em><b>RG Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RG Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RG Length</em>' attribute.
   * @see #setRGLength(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMPGRG_RGLength()
   * @model
   * @generated
   */
  Integer getRGLength();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MPGRG#getRGLength <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RG Length</em>' attribute.
   * @see #getRGLength()
   * @generated
   */
  void setRGLength(Integer value);

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
   * @see org.afplib.afpText.AfpTextPackage#getMPGRG_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // MPGRG
