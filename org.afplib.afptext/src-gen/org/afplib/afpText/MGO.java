/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MGO#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMGO()
 * @model
 * @generated
 */
public interface MGO extends structuredField
{
  /**
   * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.MGORG}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rg</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getMGO_Rg()
   * @model containment="true"
   * @generated
   */
  EList<MGORG> getRg();

} // MGO
