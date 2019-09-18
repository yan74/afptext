/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding Scheme ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.EncodingSchemeID#getESidCP <em>ESid CP</em>}</li>
 *   <li>{@link org.afplib.afpText.EncodingSchemeID#getESidUD <em>ESid UD</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getEncodingSchemeID()
 * @model
 * @generated
 */
public interface EncodingSchemeID extends triplet
{
  /**
   * Returns the value of the '<em><b>ESid CP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ESid CP</em>' attribute.
   * @see #setESidCP(int)
   * @see org.afplib.afpText.AfpTextPackage#getEncodingSchemeID_ESidCP()
   * @model
   * @generated
   */
  int getESidCP();

  /**
   * Sets the value of the '{@link org.afplib.afpText.EncodingSchemeID#getESidCP <em>ESid CP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ESid CP</em>' attribute.
   * @see #getESidCP()
   * @generated
   */
  void setESidCP(int value);

  /**
   * Returns the value of the '<em><b>ESid UD</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ESid UD</em>' attribute.
   * @see #setESidUD(int)
   * @see org.afplib.afpText.AfpTextPackage#getEncodingSchemeID_ESidUD()
   * @model
   * @generated
   */
  int getESidUD();

  /**
   * Sets the value of the '{@link org.afplib.afpText.EncodingSchemeID#getESidUD <em>ESid UD</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ESid UD</em>' attribute.
   * @see #getESidUD()
   * @generated
   */
  void setESidUD(int value);

} // EncodingSchemeID
