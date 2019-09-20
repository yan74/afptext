/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Image Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.BandImageData#getBANDNUM <em>BANDNUM</em>}</li>
 *   <li>{@link org.afplib.afpText.BandImageData#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afpText.BandImageData#getDATA <em>DATA</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getBandImageData()
 * @model
 * @generated
 */
public interface BandImageData extends triplet
{
  /**
   * Returns the value of the '<em><b>BANDNUM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BANDNUM</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BANDNUM</em>' attribute.
   * @see #setBANDNUM(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getBandImageData_BANDNUM()
   * @model
   * @generated
   */
  Integer getBANDNUM();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BandImageData#getBANDNUM <em>BANDNUM</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BANDNUM</em>' attribute.
   * @see #getBANDNUM()
   * @generated
   */
  void setBANDNUM(Integer value);

  /**
   * Returns the value of the '<em><b>RESERVED</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RESERVED</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RESERVED</em>' attribute.
   * @see #setRESERVED(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getBandImageData_RESERVED()
   * @model
   * @generated
   */
  Integer getRESERVED();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BandImageData#getRESERVED <em>RESERVED</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RESERVED</em>' attribute.
   * @see #getRESERVED()
   * @generated
   */
  void setRESERVED(Integer value);

  /**
   * Returns the value of the '<em><b>DATA</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DATA</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DATA</em>' attribute.
   * @see #setDATA(String)
   * @see org.afplib.afpText.AfpTextPackage#getBandImageData_DATA()
   * @model
   * @generated
   */
  String getDATA();

  /**
   * Sets the value of the '{@link org.afplib.afpText.BandImageData#getDATA <em>DATA</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DATA</em>' attribute.
   * @see #getDATA()
   * @generated
   */
  void setDATA(String value);

} // BandImageData
