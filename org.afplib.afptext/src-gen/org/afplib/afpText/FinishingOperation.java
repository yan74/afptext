/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.FinishingOperation#getFOpType <em>FOp Type</em>}</li>
 *   <li>{@link org.afplib.afpText.FinishingOperation#getRefEdge <em>Ref Edge</em>}</li>
 *   <li>{@link org.afplib.afpText.FinishingOperation#getFOpCnt <em>FOp Cnt</em>}</li>
 *   <li>{@link org.afplib.afpText.FinishingOperation#getAxOffst <em>Ax Offst</em>}</li>
 *   <li>{@link org.afplib.afpText.FinishingOperation#getOpPos <em>Op Pos</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation()
 * @model
 * @generated
 */
public interface FinishingOperation extends triplet
{
  /**
   * Returns the value of the '<em><b>FOp Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>FOp Type</em>' attribute.
   * @see #setFOpType(int)
   * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation_FOpType()
   * @model
   * @generated
   */
  int getFOpType();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FinishingOperation#getFOpType <em>FOp Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FOp Type</em>' attribute.
   * @see #getFOpType()
   * @generated
   */
  void setFOpType(int value);

  /**
   * Returns the value of the '<em><b>Ref Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Edge</em>' attribute.
   * @see #setRefEdge(int)
   * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation_RefEdge()
   * @model
   * @generated
   */
  int getRefEdge();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FinishingOperation#getRefEdge <em>Ref Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Edge</em>' attribute.
   * @see #getRefEdge()
   * @generated
   */
  void setRefEdge(int value);

  /**
   * Returns the value of the '<em><b>FOp Cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>FOp Cnt</em>' attribute.
   * @see #setFOpCnt(int)
   * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation_FOpCnt()
   * @model
   * @generated
   */
  int getFOpCnt();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FinishingOperation#getFOpCnt <em>FOp Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FOp Cnt</em>' attribute.
   * @see #getFOpCnt()
   * @generated
   */
  void setFOpCnt(int value);

  /**
   * Returns the value of the '<em><b>Ax Offst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ax Offst</em>' attribute.
   * @see #setAxOffst(int)
   * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation_AxOffst()
   * @model
   * @generated
   */
  int getAxOffst();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FinishingOperation#getAxOffst <em>Ax Offst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ax Offst</em>' attribute.
   * @see #getAxOffst()
   * @generated
   */
  void setAxOffst(int value);

  /**
   * Returns the value of the '<em><b>Op Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Pos</em>' attribute.
   * @see #setOpPos(String)
   * @see org.afplib.afpText.AfpTextPackage#getFinishingOperation_OpPos()
   * @model
   * @generated
   */
  String getOpPos();

  /**
   * Sets the value of the '{@link org.afplib.afpText.FinishingOperation#getOpPos <em>Op Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Pos</em>' attribute.
   * @see #getOpPos()
   * @generated
   */
  void setOpPos(String value);

} // FinishingOperation