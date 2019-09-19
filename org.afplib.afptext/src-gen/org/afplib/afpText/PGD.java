/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.PGD#getXpgBase <em>Xpg Base</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getYpgBase <em>Ypg Base</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getXpgUnits <em>Xpg Units</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getYpgUnits <em>Ypg Units</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getXpgSize <em>Xpg Size</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getYpgSize <em>Ypg Size</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afpText.PGD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getPGD()
 * @model
 * @generated
 */
public interface PGD extends structuredField
{
  /**
   * Returns the value of the '<em><b>Xpg Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpg Base</em>' attribute.
   * @see #setXpgBase(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_XpgBase()
   * @model
   * @generated
   */
  Integer getXpgBase();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getXpgBase <em>Xpg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpg Base</em>' attribute.
   * @see #getXpgBase()
   * @generated
   */
  void setXpgBase(Integer value);

  /**
   * Returns the value of the '<em><b>Ypg Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ypg Base</em>' attribute.
   * @see #setYpgBase(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_YpgBase()
   * @model
   * @generated
   */
  Integer getYpgBase();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getYpgBase <em>Ypg Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ypg Base</em>' attribute.
   * @see #getYpgBase()
   * @generated
   */
  void setYpgBase(Integer value);

  /**
   * Returns the value of the '<em><b>Xpg Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpg Units</em>' attribute.
   * @see #setXpgUnits(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_XpgUnits()
   * @model
   * @generated
   */
  Integer getXpgUnits();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getXpgUnits <em>Xpg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpg Units</em>' attribute.
   * @see #getXpgUnits()
   * @generated
   */
  void setXpgUnits(Integer value);

  /**
   * Returns the value of the '<em><b>Ypg Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ypg Units</em>' attribute.
   * @see #setYpgUnits(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_YpgUnits()
   * @model
   * @generated
   */
  Integer getYpgUnits();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getYpgUnits <em>Ypg Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ypg Units</em>' attribute.
   * @see #getYpgUnits()
   * @generated
   */
  void setYpgUnits(Integer value);

  /**
   * Returns the value of the '<em><b>Xpg Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpg Size</em>' attribute.
   * @see #setXpgSize(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_XpgSize()
   * @model
   * @generated
   */
  Integer getXpgSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getXpgSize <em>Xpg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpg Size</em>' attribute.
   * @see #getXpgSize()
   * @generated
   */
  void setXpgSize(Integer value);

  /**
   * Returns the value of the '<em><b>Ypg Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ypg Size</em>' attribute.
   * @see #setYpgSize(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_YpgSize()
   * @model
   * @generated
   */
  Integer getYpgSize();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getYpgSize <em>Ypg Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ypg Size</em>' attribute.
   * @see #getYpgSize()
   * @generated
   */
  void setYpgSize(Integer value);

  /**
   * Returns the value of the '<em><b>Reserved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reserved</em>' attribute.
   * @see #setReserved(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getPGD_Reserved()
   * @model
   * @generated
   */
  Integer getReserved();

  /**
   * Sets the value of the '{@link org.afplib.afpText.PGD#getReserved <em>Reserved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reserved</em>' attribute.
   * @see #getReserved()
   * @generated
   */
  void setReserved(Integer value);

  /**
   * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.triplet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triplets</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getPGD_Triplets()
   * @model containment="true"
   * @generated
   */
  EList<triplet> getTriplets();

} // PGD
