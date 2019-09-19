/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.DBR#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afpText.DBR#getRWIDTH <em>RWIDTH</em>}</li>
 *   <li>{@link org.afplib.afpText.DBR#getRWIDTHFRACTION <em>RWIDTHFRACTION</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getDBR()
 * @model
 * @generated
 */
public interface DBR extends triplet
{
  /**
   * Returns the value of the '<em><b>RLENGTH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RLENGTH</em>' attribute.
   * @see #setRLENGTH(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getDBR_RLENGTH()
   * @model
   * @generated
   */
  Integer getRLENGTH();

  /**
   * Sets the value of the '{@link org.afplib.afpText.DBR#getRLENGTH <em>RLENGTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RLENGTH</em>' attribute.
   * @see #getRLENGTH()
   * @generated
   */
  void setRLENGTH(Integer value);

  /**
   * Returns the value of the '<em><b>RWIDTH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RWIDTH</em>' attribute.
   * @see #setRWIDTH(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getDBR_RWIDTH()
   * @model
   * @generated
   */
  Integer getRWIDTH();

  /**
   * Sets the value of the '{@link org.afplib.afpText.DBR#getRWIDTH <em>RWIDTH</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RWIDTH</em>' attribute.
   * @see #getRWIDTH()
   * @generated
   */
  void setRWIDTH(Integer value);

  /**
   * Returns the value of the '<em><b>RWIDTHFRACTION</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RWIDTHFRACTION</em>' attribute.
   * @see #setRWIDTHFRACTION(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getDBR_RWIDTHFRACTION()
   * @model
   * @generated
   */
  Integer getRWIDTHFRACTION();

  /**
   * Sets the value of the '{@link org.afplib.afpText.DBR#getRWIDTHFRACTION <em>RWIDTHFRACTION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RWIDTHFRACTION</em>' attribute.
   * @see #getRWIDTHFRACTION()
   * @generated
   */
  void setRWIDTHFRACTION(Integer value);

} // DBR
