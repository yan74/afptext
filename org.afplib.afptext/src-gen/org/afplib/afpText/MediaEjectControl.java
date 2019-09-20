/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Eject Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MediaEjectControl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afpText.MediaEjectControl#getEjCtrl <em>Ej Ctrl</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMediaEjectControl()
 * @model
 * @generated
 */
public interface MediaEjectControl extends triplet
{
  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reserved</em>' attribute.
   * @see #setReserved(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMediaEjectControl_Reserved()
   * @model
   * @generated
   */
  Integer getReserved();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MediaEjectControl#getReserved <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reserved</em>' attribute.
   * @see #getReserved()
   * @generated
   */
  void setReserved(Integer value);

  /**
   * Returns the value of the '<em><b>Ej Ctrl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ej Ctrl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ej Ctrl</em>' attribute.
   * @see #setEjCtrl(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMediaEjectControl_EjCtrl()
   * @model
   * @generated
   */
  Integer getEjCtrl();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MediaEjectControl#getEjCtrl <em>Ej Ctrl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ej Ctrl</em>' attribute.
   * @see #getEjCtrl()
   * @generated
   */
  void setEjCtrl(Integer value);

} // MediaEjectControl
