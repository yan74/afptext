/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.DeviceAppearance#getDevApp <em>Dev App</em>}</li>
 *   <li>{@link org.afplib.afpText.DeviceAppearance#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getDeviceAppearance()
 * @model
 * @generated
 */
public interface DeviceAppearance extends triplet
{
  /**
   * Returns the value of the '<em><b>Dev App</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dev App</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dev App</em>' attribute.
   * @see #setDevApp(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getDeviceAppearance_DevApp()
   * @model
   * @generated
   */
  Integer getDevApp();

  /**
   * Sets the value of the '{@link org.afplib.afpText.DeviceAppearance#getDevApp <em>Dev App</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dev App</em>' attribute.
   * @see #getDevApp()
   * @generated
   */
  void setDevApp(Integer value);

  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reserved</em>' attribute.
   * @see #setReserved(String)
   * @see org.afplib.afpText.AfpTextPackage#getDeviceAppearance_Reserved()
   * @model
   * @generated
   */
  String getReserved();

  /**
   * Sets the value of the '{@link org.afplib.afpText.DeviceAppearance#getReserved <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reserved</em>' attribute.
   * @see #getReserved()
   * @generated
   */
  void setReserved(String value);

} // DeviceAppearance
