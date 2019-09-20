/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.TilePosition#getXOFFSET <em>XOFFSET</em>}</li>
 *   <li>{@link org.afplib.afpText.TilePosition#getYOFFSET <em>YOFFSET</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getTilePosition()
 * @model
 * @generated
 */
public interface TilePosition extends triplet
{
  /**
   * Returns the value of the '<em><b>XOFFSET</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XOFFSET</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XOFFSET</em>' attribute.
   * @see #setXOFFSET(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getTilePosition_XOFFSET()
   * @model
   * @generated
   */
  Integer getXOFFSET();

  /**
   * Sets the value of the '{@link org.afplib.afpText.TilePosition#getXOFFSET <em>XOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XOFFSET</em>' attribute.
   * @see #getXOFFSET()
   * @generated
   */
  void setXOFFSET(Integer value);

  /**
   * Returns the value of the '<em><b>YOFFSET</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>YOFFSET</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>YOFFSET</em>' attribute.
   * @see #setYOFFSET(Integer)
   * @see org.afplib.afpText.AfpTextPackage#getTilePosition_YOFFSET()
   * @model
   * @generated
   */
  Integer getYOFFSET();

  /**
   * Sets the value of the '{@link org.afplib.afpText.TilePosition#getYOFFSET <em>YOFFSET</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YOFFSET</em>' attribute.
   * @see #getYOFFSET()
   * @generated
   */
  void setYOFFSET(Integer value);

} // TilePosition
