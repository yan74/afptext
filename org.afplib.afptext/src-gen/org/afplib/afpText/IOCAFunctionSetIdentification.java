/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOCA Function Set Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IOCAFunctionSetIdentification#getCATEGORY <em>CATEGORY</em>}</li>
 *   <li>{@link org.afplib.afpText.IOCAFunctionSetIdentification#getFCNSET <em>FCNSET</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIOCAFunctionSetIdentification()
 * @model
 * @generated
 */
public interface IOCAFunctionSetIdentification extends triplet
{
  /**
   * Returns the value of the '<em><b>CATEGORY</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>CATEGORY</em>' attribute.
   * @see #setCATEGORY(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOCAFunctionSetIdentification_CATEGORY()
   * @model
   * @generated
   */
  int getCATEGORY();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOCAFunctionSetIdentification#getCATEGORY <em>CATEGORY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CATEGORY</em>' attribute.
   * @see #getCATEGORY()
   * @generated
   */
  void setCATEGORY(int value);

  /**
   * Returns the value of the '<em><b>FCNSET</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>FCNSET</em>' attribute.
   * @see #setFCNSET(int)
   * @see org.afplib.afpText.AfpTextPackage#getIOCAFunctionSetIdentification_FCNSET()
   * @model
   * @generated
   */
  int getFCNSET();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IOCAFunctionSetIdentification#getFCNSET <em>FCNSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FCNSET</em>' attribute.
   * @see #getFCNSET()
   * @generated
   */
  void setFCNSET(int value);

} // IOCAFunctionSetIdentification