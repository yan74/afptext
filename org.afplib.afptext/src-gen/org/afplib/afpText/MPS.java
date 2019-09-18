/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MPS#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afpText.MPS#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMPS()
 * @model
 * @generated
 */
public interface MPS extends structuredField
{
  /**
   * Returns the value of the '<em><b>RG Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RG Length</em>' attribute.
   * @see #setRGLength(int)
   * @see org.afplib.afpText.AfpTextPackage#getMPS_RGLength()
   * @model
   * @generated
   */
  int getRGLength();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MPS#getRGLength <em>RG Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RG Length</em>' attribute.
   * @see #getRGLength()
   * @generated
   */
  void setRGLength(int value);

  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reserved</em>' attribute.
   * @see #setReserved(String)
   * @see org.afplib.afpText.AfpTextPackage#getMPS_Reserved()
   * @model
   * @generated
   */
  String getReserved();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MPS#getReserved <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reserved</em>' attribute.
   * @see #getReserved()
   * @generated
   */
  void setReserved(String value);

} // MPS