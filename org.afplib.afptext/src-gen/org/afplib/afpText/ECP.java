/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ECP#getRSName <em>RS Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getECP()
 * @model
 * @generated
 */
public interface ECP extends structuredField
{
  /**
   * Returns the value of the '<em><b>RS Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RS Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RS Name</em>' attribute.
   * @see #setRSName(String)
   * @see org.afplib.afpText.AfpTextPackage#getECP_RSName()
   * @model
   * @generated
   */
  String getRSName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ECP#getRSName <em>RS Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RS Name</em>' attribute.
   * @see #getRSName()
   * @generated
   */
  void setRSName(String value);

} // ECP
