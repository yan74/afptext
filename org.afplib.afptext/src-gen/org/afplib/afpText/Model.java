/**
 * generated by Xtext 2.19.0
 */
package org.afplib.afpText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.Model#getStructuredFields <em>Structured Fields</em>}</li>
 * </ul>
 *
 * @see org.afplib.afpText.AfpTextPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Structured Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.afplib.afpText.structuredField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Fields</em>' containment reference list.
   * @see org.afplib.afpText.AfpTextPackage#getModel_StructuredFields()
   * @model containment="true"
   * @generated
   */
  EList<structuredField> getStructuredFields();

} // Model
