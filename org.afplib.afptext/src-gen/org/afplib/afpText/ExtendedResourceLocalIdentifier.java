/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Resource Local Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ExtendedResourceLocalIdentifier#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.afplib.afpText.ExtendedResourceLocalIdentifier#getResLID <em>Res LID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getExtendedResourceLocalIdentifier()
 * @model
 * @generated
 */
public interface ExtendedResourceLocalIdentifier extends triplet
{
  /**
   * Returns the value of the '<em><b>Res Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res Type</em>' attribute.
   * @see #setResType(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getExtendedResourceLocalIdentifier_ResType()
   * @model
   * @generated
   */
  Integer getResType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ExtendedResourceLocalIdentifier#getResType <em>Res Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res Type</em>' attribute.
   * @see #getResType()
   * @generated
   */
  void setResType(Integer value);

  /**
   * Returns the value of the '<em><b>Res LID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res LID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res LID</em>' attribute.
   * @see #setResLID(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getExtendedResourceLocalIdentifier_ResLID()
   * @model
   * @generated
   */
  Integer getResLID();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ExtendedResourceLocalIdentifier#getResLID <em>Res LID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res LID</em>' attribute.
   * @see #getResLID()
   * @generated
   */
  void setResLID(Integer value);

} // ExtendedResourceLocalIdentifier
