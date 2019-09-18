/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.GSMC#getCELLWI <em>CELLWI</em>}</li>
 *   <li>{@link org.afplib.afpText.GSMC#getCELLHI <em>CELLHI</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getGSMC()
 * @model
 * @generated
 */
public interface GSMC extends triplet
{
  /**
   * Returns the value of the '<em><b>CELLWI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>CELLWI</em>' attribute.
   * @see #setCELLWI(int)
   * @see org.afplib.afpText.AfpTextPackage#getGSMC_CELLWI()
   * @model
   * @generated
   */
  int getCELLWI();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GSMC#getCELLWI <em>CELLWI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CELLWI</em>' attribute.
   * @see #getCELLWI()
   * @generated
   */
  void setCELLWI(int value);

  /**
   * Returns the value of the '<em><b>CELLHI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>CELLHI</em>' attribute.
   * @see #setCELLHI(int)
   * @see org.afplib.afpText.AfpTextPackage#getGSMC_CELLHI()
   * @model
   * @generated
   */
  int getCELLHI();

  /**
   * Sets the value of the '{@link org.afplib.afpText.GSMC#getCELLHI <em>CELLHI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CELLHI</em>' attribute.
   * @see #getCELLHI()
   * @generated
   */
  void setCELLHI(int value);

} // GSMC