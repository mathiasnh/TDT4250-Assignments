/**
 */
package no.tdt4250.f2019.ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.tdt4250.f2019.ra.Person#getName <em>Name</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.Person#getEmployer <em>Employer</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.Person#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see no.tdt4250.f2019.ra.RaPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='personShouldntHaveTooMuchToDo'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.tdt4250.f2019.ra.RaPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.tdt4250.f2019.ra.Department#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer</em>' container reference.
	 * @see #setEmployer(Department)
	 * @see no.tdt4250.f2019.ra.RaPackage#getPerson_Employer()
	 * @see no.tdt4250.f2019.ra.Department#getStaff
	 * @model opposite="staff" transient="false"
	 * @generated
	 */
	Department getEmployer();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.Person#getEmployer <em>Employer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer</em>' container reference.
	 * @see #getEmployer()
	 * @generated
	 */
	void setEmployer(Department value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link no.tdt4250.f2019.ra.ResourceAllocation}.
	 * It is bidirectional and its opposite is '{@link no.tdt4250.f2019.ra.ResourceAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see no.tdt4250.f2019.ra.RaPackage#getPerson_Allocations()
	 * @see no.tdt4250.f2019.ra.ResourceAllocation#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<ResourceAllocation> getAllocations();

} // Person
