/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IPS#getPsegName <em>Pseg Name</em>}</li>
 *   <li>{@link org.afplib.afpText.IPS#getXpsOset <em>Xps Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IPS#getYpsOset <em>Yps Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IPS#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIPS()
 * @model
 * @generated
 */
public interface IPS extends structuredField
{
  /**
   * Returns the value of the '<em><b>Pseg Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseg Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseg Name</em>' attribute.
   * @see #setPsegName(String)
   * @see org.afplib.afpText.AfpTextPackage#getIPS_PsegName()
   * @model
   * @generated
   */
  String getPsegName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPS#getPsegName <em>Pseg Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseg Name</em>' attribute.
   * @see #getPsegName()
   * @generated
   */
  void setPsegName(String value);

  /**
   * Returns the value of the '<em><b>Xps Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xps Oset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xps Oset</em>' attribute.
   * @see #setXpsOset(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getIPS_XpsOset()
   * @model
   * @generated
   */
  Integer getXpsOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPS#getXpsOset <em>Xps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xps Oset</em>' attribute.
   * @see #getXpsOset()
   * @generated
   */
  void setXpsOset(Integer value);

  /**
   * Returns the value of the '<em><b>Yps Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yps Oset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yps Oset</em>' attribute.
   * @see #setYpsOset(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getIPS_YpsOset()
   * @model
   * @generated
   */
  Integer getYpsOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPS#getYpsOset <em>Yps Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yps Oset</em>' attribute.
   * @see #getYpsOset()
   * @generated
   */
  void setYpsOset(Integer value);

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
   * @see org.afplib.afpText.AfpTextPackage#getIPS_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IPS
