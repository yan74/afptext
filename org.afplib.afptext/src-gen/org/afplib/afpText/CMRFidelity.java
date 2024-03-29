/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMR Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.CMRFidelity#getStpCMREx <em>Stp CMR Ex</em>}</li>
 *   <li>{@link org.afplib.afpText.CMRFidelity#getRepCMREx <em>Rep CMR Ex</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getCMRFidelity()
 * @model
 * @generated
 */
public interface CMRFidelity extends triplet
{
  /**
   * Returns the value of the '<em><b>Stp CMR Ex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stp CMR Ex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stp CMR Ex</em>' attribute.
   * @see #setStpCMREx(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getCMRFidelity_StpCMREx()
   * @model
   * @generated
   */
  Integer getStpCMREx();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CMRFidelity#getStpCMREx <em>Stp CMR Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stp CMR Ex</em>' attribute.
   * @see #getStpCMREx()
   * @generated
   */
  void setStpCMREx(Integer value);

  /**
   * Returns the value of the '<em><b>Rep CMR Ex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rep CMR Ex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rep CMR Ex</em>' attribute.
   * @see #setRepCMREx(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getCMRFidelity_RepCMREx()
   * @model
   * @generated
   */
  Integer getRepCMREx();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CMRFidelity#getRepCMREx <em>Rep CMR Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rep CMR Ex</em>' attribute.
   * @see #getRepCMREx()
   * @generated
   */
  void setRepCMREx(Integer value);

} // CMRFidelity
