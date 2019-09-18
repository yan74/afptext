/**
 * generated by Xtext 2.18.0.M3
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>SV Size</em>' attribute.
   * @see #setSVSize(int)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_SVSize()
   * @model
   * @generated
   */
  int getSVSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSVSize <em>SV Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SV Size</em>' attribute.
   * @see #getSVSize()
   * @generated
   */
  void setSVSize(int value);

  /**
   * Returns the value of the '<em><b>SH Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>SH Scale</em>' attribute.
   * @see #setSHScale(int)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_SHScale()
   * @model
   * @generated
   */
  int getSHScale();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSHScale <em>SH Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SH Scale</em>' attribute.
   * @see #getSHScale()
   * @generated
   */
  void setSHScale(int value);

  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' attribute.
   * @see #setSection(int)
   * @see org.afplib.afpText.AfpTextPackage#getCFIRG_Section()
   * @model
   * @generated
   */
  int getSection();

  /**
   * Sets the value of the '{@link org.afplib.afpText.CFIRG#getSection <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' attribute.
   * @see #getSection()
   * @generated
   */
  void setSection(int value);

} // CFIRG
