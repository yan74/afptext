/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Structured Field Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ObjectStructuredFieldExtent#getSFExt <em>SF Ext</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectStructuredFieldExtent#getSFExtHi <em>SF Ext Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getObjectStructuredFieldExtent()
 * @model
 * @generated
 */
public interface ObjectStructuredFieldExtent extends triplet
{
  /**
   * Returns the value of the '<em><b>SF Ext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>SF Ext</em>' attribute.
   * @see #setSFExt(int)
   * @see org.afplib.afpText.AfpTextPackage#getObjectStructuredFieldExtent_SFExt()
   * @model
   * @generated
   */
  int getSFExt();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectStructuredFieldExtent#getSFExt <em>SF Ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SF Ext</em>' attribute.
   * @see #getSFExt()
   * @generated
   */
  void setSFExt(int value);

  /**
   * Returns the value of the '<em><b>SF Ext Hi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>SF Ext Hi</em>' attribute.
   * @see #setSFExtHi(int)
   * @see org.afplib.afpText.AfpTextPackage#getObjectStructuredFieldExtent_SFExtHi()
   * @model
   * @generated
   */
  int getSFExtHi();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectStructuredFieldExtent#getSFExtHi <em>SF Ext Hi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SF Ext Hi</em>' attribute.
   * @see #getSFExtHi()
   * @generated
   */
  void setSFExtHi(int value);

} // ObjectStructuredFieldExtent
