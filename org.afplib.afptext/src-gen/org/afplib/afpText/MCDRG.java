/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCDRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MCDRG#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afpText.MCDRG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMCDRG()
 * @model
 * @generated
 */
public interface MCDRG extends EObject
{
  /**
   * Returns the value of the '<em><b>RG Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RG Length</em>' attribute.
   * @see #setRGLength(int)
   * @see org.afplib.afpText.AfpTextPackage#getMCDRG_RGLength()
   * @model
   * @generated
   */
  int getRGLength();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MCDRG#getRGLength <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RG Length</em>' attribute.
   * @see #getRGLength()
   * @generated
   */
  void setRGLength(int value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getMCDRG_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // MCDRG
