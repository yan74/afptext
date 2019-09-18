/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IPO#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afpText.IPO#getXolOset <em>Xol Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IPO#getYolOset <em>Yol Oset</em>}</li>
 *   <li>{@link org.afplib.afpText.IPO#getOvlyOrent <em>Ovly Orent</em>}</li>
 *   <li>{@link org.afplib.afpText.IPO#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIPO()
 * @model
 * @generated
 */
public interface IPO extends structuredField
{
  /**
   * Returns the value of the '<em><b>Ovly Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ovly Name</em>' attribute.
   * @see #setOvlyName(String)
   * @see org.afplib.afpText.AfpTextPackage#getIPO_OvlyName()
   * @model
   * @generated
   */
  String getOvlyName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPO#getOvlyName <em>Ovly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ovly Name</em>' attribute.
   * @see #getOvlyName()
   * @generated
   */
  void setOvlyName(String value);

  /**
   * Returns the value of the '<em><b>Xol Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xol Oset</em>' attribute.
   * @see #setXolOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIPO_XolOset()
   * @model
   * @generated
   */
  int getXolOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPO#getXolOset <em>Xol Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xol Oset</em>' attribute.
   * @see #getXolOset()
   * @generated
   */
  void setXolOset(int value);

  /**
   * Returns the value of the '<em><b>Yol Oset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yol Oset</em>' attribute.
   * @see #setYolOset(int)
   * @see org.afplib.afpText.AfpTextPackage#getIPO_YolOset()
   * @model
   * @generated
   */
  int getYolOset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPO#getYolOset <em>Yol Oset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yol Oset</em>' attribute.
   * @see #getYolOset()
   * @generated
   */
  void setYolOset(int value);

  /**
   * Returns the value of the '<em><b>Ovly Orent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ovly Orent</em>' attribute.
   * @see #setOvlyOrent(int)
   * @see org.afplib.afpText.AfpTextPackage#getIPO_OvlyOrent()
   * @model
   * @generated
   */
  int getOvlyOrent();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IPO#getOvlyOrent <em>Ovly Orent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ovly Orent</em>' attribute.
   * @see #getOvlyOrent()
   * @generated
   */
  void setOvlyOrent(int value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getIPO_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IPO