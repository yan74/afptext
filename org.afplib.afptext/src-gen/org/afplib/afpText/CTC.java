/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.CTC#getConData <em>Con Data</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getCTC()
 * @model
 * @generated
 */
public interface CTC extends structuredField
{
  /**
   * Returns the value of the '<em><b>Con Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Con Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con Data</em>' attribute.
   * @see #setConData(String)
   * @see org.afplib.afpText.AfpTextPackage#getCTC_ConData()
   * @model
   * @generated
   */
  String getConData();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CTC#getConData <em>Con Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Con Data</em>' attribute.
   * @see #getConData()
   * @generated
   */
  void setConData(String value);

} // CTC
