/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BDA#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afpText.BDA#getXoffset <em>Xoffset</em>}</li>
 *   <li>{@link org.afplib.afpText.BDA#getYoffset <em>Yoffset</em>}</li>
 *   <li>{@link org.afplib.afpText.BDA#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBDA()
 * @model
 * @generated
 */
public interface BDA extends structuredField
{
  /**
   * Returns the value of the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' attribute.
   * @see #setFlags(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getBDA_Flags()
   * @model
   * @generated
   */
  Integer getFlags();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BDA#getFlags <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flags</em>' attribute.
   * @see #getFlags()
   * @generated
   */
  void setFlags(Integer value);

  /**
   * Returns the value of the '<em><b>Xoffset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xoffset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xoffset</em>' attribute.
   * @see #setXoffset(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getBDA_Xoffset()
   * @model
   * @generated
   */
  Integer getXoffset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BDA#getXoffset <em>Xoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xoffset</em>' attribute.
   * @see #getXoffset()
   * @generated
   */
  void setXoffset(Integer value);

  /**
   * Returns the value of the '<em><b>Yoffset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yoffset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yoffset</em>' attribute.
   * @see #setYoffset(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getBDA_Yoffset()
   * @model
   * @generated
   */
  Integer getYoffset();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BDA#getYoffset <em>Yoffset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yoffset</em>' attribute.
   * @see #getYoffset()
   * @generated
   */
  void setYoffset(Integer value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(String)
   * @see org.afplib.afpText.AfpTextPackage#getBDA_Data()
   * @model
   * @generated
   */
  String getData();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BDA#getData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #getData()
   * @generated
   */
  void setData(String value);

} // BDA
