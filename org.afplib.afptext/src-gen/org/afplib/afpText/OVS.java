/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.OVS#getBYPSIDEN <em>BYPSIDEN</em>}</li>
 *   <li>{@link org.afplib.afpText.OVS#getOVERCHAR <em>OVERCHAR</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getOVS()
 * @model
 * @generated
 */
public interface OVS extends triplet
{
  /**
   * Returns the value of the '<em><b>BYPSIDEN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>BYPSIDEN</em>' attribute.
   * @see #setBYPSIDEN(int)
   * @see org.afplib.afpText.AfpTextPackage#getOVS_BYPSIDEN()
   * @model
   * @generated
   */
  int getBYPSIDEN();

  /**
   * Sets the value of the '{@link org.afplib.afpText.OVS#getBYPSIDEN <em>BYPSIDEN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BYPSIDEN</em>' attribute.
   * @see #getBYPSIDEN()
   * @generated
   */
  void setBYPSIDEN(int value);

  /**
   * Returns the value of the '<em><b>OVERCHAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>OVERCHAR</em>' attribute.
   * @see #setOVERCHAR(int)
   * @see org.afplib.afpText.AfpTextPackage#getOVS_OVERCHAR()
   * @model
   * @generated
   */
  int getOVERCHAR();

  /**
   * Sets the value of the '{@link org.afplib.afpText.OVS#getOVERCHAR <em>OVERCHAR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OVERCHAR</em>' attribute.
   * @see #getOVERCHAR()
   * @generated
   */
  void setOVERCHAR(int value);

} // OVS
