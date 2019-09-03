/**
 */
package no.tdt4250.f2019.ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.tdt4250.f2019.ra.Course#getName <em>Name</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.Course#getCode <em>Code</em>}</li>
 *   <li>{@link no.tdt4250.f2019.ra.Course#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see no.tdt4250.f2019.ra.RaPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseShouldntHaveTooLittleStaff'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseShouldntHaveTooLittleStaff='aql:self.allocations.factor -&gt; sum() &gt; 0.8'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.tdt4250.f2019.ra.RaPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see no.tdt4250.f2019.ra.RaPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link no.tdt4250.f2019.ra.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link no.tdt4250.f2019.ra.ResourceAllocation}.
	 * It is bidirectional and its opposite is '{@link no.tdt4250.f2019.ra.ResourceAllocation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see no.tdt4250.f2019.ra.RaPackage#getCourse_Allocations()
	 * @see no.tdt4250.f2019.ra.ResourceAllocation#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<ResourceAllocation> getAllocations();

} // Course
