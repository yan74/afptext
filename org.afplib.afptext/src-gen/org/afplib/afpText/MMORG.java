/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMORG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.MMORG#getOVLid <em>OV Lid</em>}</li>
 *   <li>{@link org.afplib.afpText.MMORG#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afpText.MMORG#getOVLname <em>OV Lname</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getMMORG()
 * @model
 * @generated
 */
public interface MMORG extends EObject
{
  /**
   * Returns the value of the '<em><b>OV Lid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OV Lid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OV Lid</em>' attribute.
   * @see #setOVLid(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getMMORG_OVLid()
   * @model
   * @generated
   */
  Integer getOVLid();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MMORG#getOVLid <em>OV Lid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OV Lid</em>' attribute.
   * @see #getOVLid()
   * @generated
   */
  void setOVLid(Integer value);

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
   * @see org.afplib.afpText.AfpTextPackage#getMMORG_Flags()
   * @model
   * @generated
   */
  Integer getFlags();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MMORG#getFlags <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flags</em>' attribute.
   * @see #getFlags()
   * @generated
   */
  void setFlags(Integer value);

  /**
   * Returns the value of the '<em><b>OV Lname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OV Lname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OV Lname</em>' attribute.
   * @see #setOVLname(String)
   * @see org.afplib.afpText.AfpTextPackage#getMMORG_OVLname()
   * @model
   * @generated
   */
  String getOVLname();

  /**
   * Sets the value of the '{@link org.afplib.afpText.MMORG#getOVLname <em>OV Lname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OV Lname</em>' attribute.
   * @see #getOVLname()
   * @generated
   */
  void setOVLname(String value);

} // MMORG
