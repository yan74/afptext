/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCRLINE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.GCRLINE#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getGCRLINE()
 * @model
 * @generated
 */
public interface GCRLINE extends triplet
{
  /**
   * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.GCRLINERG}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rg</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getGCRLINE_Rg()
   * @model containment="true"
   * @generated
   */
  EList<GCRLINERG> getRg();

} // GCRLINE
