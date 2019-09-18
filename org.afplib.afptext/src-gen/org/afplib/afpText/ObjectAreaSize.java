/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Area Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.ObjectAreaSize#getSizeType <em>Size Type</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectAreaSize#getXoaSize <em>Xoa Size</em>}</li>
 *   <li>{@link org.afplib.afpText.ObjectAreaSize#getYoaSize <em>Yoa Size</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getObjectAreaSize()
 * @model
 * @generated
 */
public interface ObjectAreaSize extends triplet
{
  /**
   * Returns the value of the '<em><b>Size Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size Type</em>' attribute.
   * @see #setSizeType(int)
   * @see org.afplib.afpText.AfpTextPackage#getObjectAreaSize_SizeType()
   * @model
   * @generated
   */
  int getSizeType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectAreaSize#getSizeType <em>Size Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size Type</em>' attribute.
   * @see #getSizeType()
   * @generated
   */
  void setSizeType(int value);

  /**
   * Returns the value of the '<em><b>Xoa Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xoa Size</em>' attribute.
   * @see #setXoaSize(int)
   * @see org.afplib.afpText.AfpTextPackage#getObjectAreaSize_XoaSize()
   * @model
   * @generated
   */
  int getXoaSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectAreaSize#getXoaSize <em>Xoa Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xoa Size</em>' attribute.
   * @see #getXoaSize()
   * @generated
   */
  void setXoaSize(int value);

  /**
   * Returns the value of the '<em><b>Yoa Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yoa Size</em>' attribute.
   * @see #setYoaSize(int)
   * @see org.afplib.afpText.AfpTextPackage#getObjectAreaSize_YoaSize()
   * @model
   * @generated
   */
  int getYoaSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.ObjectAreaSize#getYoaSize <em>Yoa Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yoa Size</em>' attribute.
   * @see #getYoaSize()
   * @generated
   */
  void setYoaSize(int value);

} // ObjectAreaSize