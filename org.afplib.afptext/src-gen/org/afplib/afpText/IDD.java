/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.IDD#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afpText.IDD#getXRESOL <em>XRESOL</em>}</li>
 *   <li>{@link org.afplib.afpText.IDD#getYRESOL <em>YRESOL</em>}</li>
 *   <li>{@link org.afplib.afpText.IDD#getXSIZE <em>XSIZE</em>}</li>
 *   <li>{@link org.afplib.afpText.IDD#getYSIZE <em>YSIZE</em>}</li>
 *   <li>{@link org.afplib.afpText.IDD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getIDD()
 * @model
 * @generated
 */
public interface IDD extends structuredField
{
  /**
   * Returns the value of the '<em><b>UNITBASE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>UNITBASE</em>' attribute.
   * @see #setUNITBASE(int)
   * @see org.afplib.afpText.AfpTextPackage#getIDD_UNITBASE()
   * @model
   * @generated
   */
  int getUNITBASE();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IDD#getUNITBASE <em>UNITBASE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>UNITBASE</em>' attribute.
   * @see #getUNITBASE()
   * @generated
   */
  void setUNITBASE(int value);

  /**
   * Returns the value of the '<em><b>XRESOL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XRESOL</em>' attribute.
   * @see #setXRESOL(int)
   * @see org.afplib.afpText.AfpTextPackage#getIDD_XRESOL()
   * @model
   * @generated
   */
  int getXRESOL();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IDD#getXRESOL <em>XRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XRESOL</em>' attribute.
   * @see #getXRESOL()
   * @generated
   */
  void setXRESOL(int value);

  /**
   * Returns the value of the '<em><b>YRESOL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>YRESOL</em>' attribute.
   * @see #setYRESOL(int)
   * @see org.afplib.afpText.AfpTextPackage#getIDD_YRESOL()
   * @model
   * @generated
   */
  int getYRESOL();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IDD#getYRESOL <em>YRESOL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YRESOL</em>' attribute.
   * @see #getYRESOL()
   * @generated
   */
  void setYRESOL(int value);

  /**
   * Returns the value of the '<em><b>XSIZE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSIZE</em>' attribute.
   * @see #setXSIZE(int)
   * @see org.afplib.afpText.AfpTextPackage#getIDD_XSIZE()
   * @model
   * @generated
   */
  int getXSIZE();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IDD#getXSIZE <em>XSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XSIZE</em>' attribute.
   * @see #getXSIZE()
   * @generated
   */
  void setXSIZE(int value);

  /**
   * Returns the value of the '<em><b>YSIZE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>YSIZE</em>' attribute.
   * @see #setYSIZE(int)
   * @see org.afplib.afpText.AfpTextPackage#getIDD_YSIZE()
   * @model
   * @generated
   */
  int getYSIZE();

  /**
   * Sets the value of the '{@link org.afplib.afpText.IDD#getYSIZE <em>YSIZE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YSIZE</em>' attribute.
   * @see #getYSIZE()
   * @generated
   */
  void setYSIZE(int value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getIDD_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // IDD
