/**
 * generated by Xtext 2.18.0.M3
 */
package org.afplib.afpText.impl;

import org.afplib.afpText.AfpTextPackage;
import org.afplib.afpText.CPD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getCPDesc <em>CP Desc</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getGCGIDLen <em>GCGID Len</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getNumCdPts <em>Num Cd Pts</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getCPGID <em>CPGID</em>}</li>
 *   <li>{@link org.afplib.afpText.impl.CPDImpl#getEncScheme <em>Enc Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPDImpl extends structuredFieldImpl implements CPD
{
  /**
   * The default value of the '{@link #getCPDesc() <em>CP Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPDesc()
   * @generated
   * @ordered
   */
  protected static final String CP_DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCPDesc() <em>CP Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPDesc()
   * @generated
   * @ordered
   */
  protected String cpDesc = CP_DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getGCGIDLen() <em>GCGID Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCGIDLen()
   * @generated
   * @ordered
   */
  protected static final int GCGID_LEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGCGIDLen() <em>GCGID Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCGIDLen()
   * @generated
   * @ordered
   */
  protected int gcgidLen = GCGID_LEN_EDEFAULT;

  /**
   * The default value of the '{@link #getNumCdPts() <em>Num Cd Pts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumCdPts()
   * @generated
   * @ordered
   */
  protected static final int NUM_CD_PTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumCdPts() <em>Num Cd Pts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumCdPts()
   * @generated
   * @ordered
   */
  protected int numCdPts = NUM_CD_PTS_EDEFAULT;

  /**
   * The default value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCSGID()
   * @generated
   * @ordered
   */
  protected static final int GCSGID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGCSGID()
   * @generated
   * @ordered
   */
  protected int gcsgid = GCSGID_EDEFAULT;

  /**
   * The default value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPGID()
   * @generated
   * @ordered
   */
  protected static final int CPGID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCPGID()
   * @generated
   * @ordered
   */
  protected int cpgid = CPGID_EDEFAULT;

  /**
   * The default value of the '{@link #getEncScheme() <em>Enc Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncScheme()
   * @generated
   * @ordered
   */
  protected static final int ENC_SCHEME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEncScheme() <em>Enc Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncScheme()
   * @generated
   * @ordered
   */
  protected int encScheme = ENC_SCHEME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CPDImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AfpTextPackage.eINSTANCE.getCPD();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCPDesc()
  {
    return cpDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCPDesc(String newCPDesc)
  {
    String oldCPDesc = cpDesc;
    cpDesc = newCPDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__CP_DESC, oldCPDesc, cpDesc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getGCGIDLen()
  {
    return gcgidLen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGCGIDLen(int newGCGIDLen)
  {
    int oldGCGIDLen = gcgidLen;
    gcgidLen = newGCGIDLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__GCGID_LEN, oldGCGIDLen, gcgidLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumCdPts()
  {
    return numCdPts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumCdPts(int newNumCdPts)
  {
    int oldNumCdPts = numCdPts;
    numCdPts = newNumCdPts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__NUM_CD_PTS, oldNumCdPts, numCdPts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getGCSGID()
  {
    return gcsgid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGCSGID(int newGCSGID)
  {
    int oldGCSGID = gcsgid;
    gcsgid = newGCSGID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__GCSGID, oldGCSGID, gcsgid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCPGID()
  {
    return cpgid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCPGID(int newCPGID)
  {
    int oldCPGID = cpgid;
    cpgid = newCPGID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__CPGID, oldCPGID, cpgid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getEncScheme()
  {
    return encScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEncScheme(int newEncScheme)
  {
    int oldEncScheme = encScheme;
    encScheme = newEncScheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AfpTextPackage.CPD__ENC_SCHEME, oldEncScheme, encScheme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AfpTextPackage.CPD__CP_DESC:
        return getCPDesc();
      case AfpTextPackage.CPD__GCGID_LEN:
        return getGCGIDLen();
      case AfpTextPackage.CPD__NUM_CD_PTS:
        return getNumCdPts();
      case AfpTextPackage.CPD__GCSGID:
        return getGCSGID();
      case AfpTextPackage.CPD__CPGID:
        return getCPGID();
      case AfpTextPackage.CPD__ENC_SCHEME:
        return getEncScheme();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AfpTextPackage.CPD__CP_DESC:
        setCPDesc((String)newValue);
        return;
      case AfpTextPackage.CPD__GCGID_LEN:
        setGCGIDLen((Integer)newValue);
        return;
      case AfpTextPackage.CPD__NUM_CD_PTS:
        setNumCdPts((Integer)newValue);
        return;
      case AfpTextPackage.CPD__GCSGID:
        setGCSGID((Integer)newValue);
        return;
      case AfpTextPackage.CPD__CPGID:
        setCPGID((Integer)newValue);
        return;
      case AfpTextPackage.CPD__ENC_SCHEME:
        setEncScheme((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AfpTextPackage.CPD__CP_DESC:
        setCPDesc(CP_DESC_EDEFAULT);
        return;
      case AfpTextPackage.CPD__GCGID_LEN:
        setGCGIDLen(GCGID_LEN_EDEFAULT);
        return;
      case AfpTextPackage.CPD__NUM_CD_PTS:
        setNumCdPts(NUM_CD_PTS_EDEFAULT);
        return;
      case AfpTextPackage.CPD__GCSGID:
        setGCSGID(GCSGID_EDEFAULT);
        return;
      case AfpTextPackage.CPD__CPGID:
        setCPGID(CPGID_EDEFAULT);
        return;
      case AfpTextPackage.CPD__ENC_SCHEME:
        setEncScheme(ENC_SCHEME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AfpTextPackage.CPD__CP_DESC:
        return CP_DESC_EDEFAULT == null ? cpDesc != null : !CP_DESC_EDEFAULT.equals(cpDesc);
      case AfpTextPackage.CPD__GCGID_LEN:
        return gcgidLen != GCGID_LEN_EDEFAULT;
      case AfpTextPackage.CPD__NUM_CD_PTS:
        return numCdPts != NUM_CD_PTS_EDEFAULT;
      case AfpTextPackage.CPD__GCSGID:
        return gcsgid != GCSGID_EDEFAULT;
      case AfpTextPackage.CPD__CPGID:
        return cpgid != CPGID_EDEFAULT;
      case AfpTextPackage.CPD__ENC_SCHEME:
        return encScheme != ENC_SCHEME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (CPDesc: ");
    result.append(cpDesc);
    result.append(", GCGIDLen: ");
    result.append(gcgidLen);
    result.append(", NumCdPts: ");
    result.append(numCdPts);
    result.append(", GCSGID: ");
    result.append(gcsgid);
    result.append(", CPGID: ");
    result.append(cpgid);
    result.append(", EncScheme: ");
    result.append(encScheme);
    result.append(')');
    return result.toString();
  }

} //CPDImpl
