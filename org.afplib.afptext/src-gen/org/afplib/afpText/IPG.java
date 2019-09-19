/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IPG#getPgName <em>Pg Name</em>}</li>
 *   <li>{@link org.afplib.afpText.IPG#getIPgFlgs <em>IPg Flgs</em>}</li>
 *   <li>{@link org.afplib.afpText.IPG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIPG()
 * @model
 * @generated
 */
public interface IPG extends structuredField
{
  /**
   * Returns the value of the '<em><b>Pg Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pg Name</em>' attribute.
   * @see #setPgName(String)
   * @see org.afplib.afpText.AfpTextPackage#getIPG_PgName()
   * @model
   * @generated
   */
  String getPgName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPG#getPgName <em>Pg Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pg Name</em>' attribute.
   * @see #getPgName()
   * @generated
   */
  void setPgName(String value);

  /**
   * Returns the value of the '<em><b>IPg Flgs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>IPg Flgs</em>' attribute.
   * @see #setIPgFlgs(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getIPG_IPgFlgs()
   * @model
   * @generated
   */
  Integer getIPgFlgs();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPG#getIPgFlgs <em>IPg Flgs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IPg Flgs</em>' attribute.
   * @see #getIPgFlgs()
   * @generated
   */
  void setIPgFlgs(Integer value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getIPG_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IPG
