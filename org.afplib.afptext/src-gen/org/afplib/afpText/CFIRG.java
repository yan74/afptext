/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFIRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.CFIRG#getFCSName <em>FCS Name</em>}</li>
 *   <li>{@link org.afplib.afpText.CFIRG#getCPName <em>CP Name</em>}</li>
 *   <li>{@link org.afplib.afpText.CFIRG#getSVSize <em>SV Size</em>}</li>
 *   <li>{@link org.afplib.afpText.CFIRG#getSHScale <em>SH Scale</em>}</li>
 *   <li>{@link org.afplib.afpText.CFIRG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afpText.CFIRG#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getCFIRG()
 * @model
 * @generated
 */
public interface CFIRG extends EObject
{
  /**
   * Returns the value of the '<em><b>FCS Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FCS Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FCS Name</em>' attribute.
   * @see #setFCSName(String)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_FCSName()
   * @model
   * @generated
   */
  String getFCSName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getFCSName <em>FCS Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FCS Name</em>' attribute.
   * @see #getFCSName()
   * @generated
   */
  void setFCSName(String value);

  /**
   * Returns the value of the '<em><b>CP Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CP Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CP Name</em>' attribute.
   * @see #setCPName(String)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_CPName()
   * @model
   * @generated
   */
  String getCPName();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getCPName <em>CP Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CP Name</em>' attribute.
   * @see #getCPName()
   * @generated
   */
  void setCPName(String value);

  /**
   * Returns the value of the '<em><b>SV Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SV Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SV Size</em>' attribute.
   * @see #setSVSize(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_SVSize()
   * @model
   * @generated
   */
  Integer getSVSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSVSize <em>SV Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SV Size</em>' attribute.
   * @see #getSVSize()
   * @generated
   */
  void setSVSize(Integer value);

  /**
   * Returns the value of the '<em><b>SH Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SH Scale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SH Scale</em>' attribute.
   * @see #setSHScale(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_SHScale()
   * @model
   * @generated
   */
  Integer getSHScale();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSHScale <em>SH Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SH Scale</em>' attribute.
   * @see #getSHScale()
   * @generated
   */
  void setSHScale(Integer value);

  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reserved</em>' attribute.
   * @see #setReserved(String)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_Reserved()
   * @model
   * @generated
   */
  String getReserved();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getReserved <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reserved</em>' attribute.
   * @see #getReserved()
   * @generated
   */
  void setReserved(String value);

  /**
   * Returns the value of the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Section</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' attribute.
   * @see #setSection(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_Section()
   * @model
   * @generated
   */
  Integer getSection();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSection <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' attribute.
   * @see #getSection()
   * @generated
   */
  void setSection(Integer value);

} // CFIRG
