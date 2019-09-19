/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.FontResolution#getMetTech <em>Met Tech</em>}</li>
 *   <li>{@link org.afplib.afpText.FontResolution#getRPuBase <em>RPu Base</em>}</li>
 *   <li>{@link org.afplib.afpText.FontResolution#getRPUnits <em>RP Units</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getFontResolution()
 * @model
 * @generated
 */
public interface FontResolution extends triplet
{
  /**
   * Returns the value of the '<em><b>Met Tech</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Met Tech</em>' attribute.
   * @see #setMetTech(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getFontResolution_MetTech()
   * @model
   * @generated
   */
  Integer getMetTech();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FontResolution#getMetTech <em>Met Tech</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Met Tech</em>' attribute.
   * @see #getMetTech()
   * @generated
   */
  void setMetTech(Integer value);

  /**
   * Returns the value of the '<em><b>RPu Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RPu Base</em>' attribute.
   * @see #setRPuBase(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getFontResolution_RPuBase()
   * @model
   * @generated
   */
  Integer getRPuBase();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FontResolution#getRPuBase <em>RPu Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RPu Base</em>' attribute.
   * @see #getRPuBase()
   * @generated
   */
  void setRPuBase(Integer value);

  /**
   * Returns the value of the '<em><b>RP Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RP Units</em>' attribute.
   * @see #setRPUnits(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getFontResolution_RPUnits()
   * @model
   * @generated
   */
  Integer getRPUnits();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FontResolution#getRPUnits <em>RP Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RP Units</em>' attribute.
   * @see #getRPUnits()
   * @generated
   */
  void setRPUnits(Integer value);

} // FontResolution
