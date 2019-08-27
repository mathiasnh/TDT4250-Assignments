/**
 */
package no.tdt4250.f2019.ra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.tdt4250.f2019.ra.ResourceAllocation#getPerson <em>Person</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.ResourceAllocation#getCourse <em>Course</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.ResourceAllocation#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see no.tdt4250.f2019.ra.RaPackage#getResourceAllocation()
 * @model
 * @generated
 */
public interface ResourceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.tdt4250.f2019.ra.Person#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see no.tdt4250.f2019.ra.RaPackage#getResourceAllocation_Person()
	 * @see no.tdt4250.f2019.ra.Person#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.ResourceAllocation#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.tdt4250.f2019.ra.Course#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see no.tdt4250.f2019.ra.RaPackage#getResourceAllocation_Course()
	 * @see no.tdt4250.f2019.ra.Course#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.ResourceAllocation#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(float)
	 * @see no.tdt4250.f2019.ra.RaPackage#getResourceAllocation_Factor()
	 * @model
	 * @generated
	 */
	float getFactor();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.ResourceAllocation#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(float value);

} // ResourceAllocation
