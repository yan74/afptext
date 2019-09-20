/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.PresentationControl#getPRSFlg <em>PRS Flg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getPresentationControl()
 * @model
 * @generated
 */
public interface PresentationControl extends triplet
{
  /**
   * Returns the value of the '<em><b>PRS Flg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PRS Flg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PRS Flg</em>' attribute.
   * @see #setPRSFlg(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPresentationControl_PRSFlg()
   * @model
   * @generated
   */
  Integer getPRSFlg();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PresentationControl#getPRSFlg <em>PRS Flg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PRS Flg</em>' attribute.
   * @see #getPRSFlg()
   * @generated
   */
  void setPRSFlg(Integer value);

} // PresentationControl
