/**
 */
package no.tdt4250.f2019.ra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.tdt4250.f2019.ra.RaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface RaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://ra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ra.ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaPackage eINSTANCE = no.tdt4250.f2019.ra.impl.RaPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.tdt4250.f2019.ra.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.tdt4250.f2019.ra.impl.DepartmentImpl
	 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STAFF = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 3;

	/**
	 * The feature id for the '<em><b>Resource Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__RESOURCE_ALLOCATIONS = 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Allocate Staff To Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT___ALLOCATE_STAFF_TO_COURSE__PERSON_COURSE_FLOAT = 0;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.tdt4250.f2019.ra.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.tdt4250.f2019.ra.impl.CourseImpl
	 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ALLOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.tdt4250.f2019.ra.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.tdt4250.f2019.ra.impl.PersonImpl
	 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYER = 1;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ALLOCATIONS = 2;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WORKLOAD = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.tdt4250.f2019.ra.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.tdt4250.f2019.ra.impl.ResourceAllocationImpl
	 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getResourceAllocation()
	 * @generated
	 */
	int RESOURCE_ALLOCATION = 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__PERSON = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION__FACTOR = 2;

	/**
	 * The number of structural features of the '<em>Resource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ALLOCATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.tdt4250.f2019.ra.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see no.tdt4250.f2019.ra.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.tdt4250.f2019.ra.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Department#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see no.tdt4250.f2019.ra.Department#getShortName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link no.tdt4250.f2019.ra.Department#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see no.tdt4250.f2019.ra.Department#getStaff()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Staff();

	/**
	 * Returns the meta object for the containment reference list '{@link no.tdt4250.f2019.ra.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see no.tdt4250.f2019.ra.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link no.tdt4250.f2019.ra.Department#getResourceAllocations <em>Resource Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Allocations</em>'.
	 * @see no.tdt4250.f2019.ra.Department#getResourceAllocations()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_ResourceAllocations();

	/**
	 * Returns the meta object for the '{@link no.tdt4250.f2019.ra.Department#allocateStaffToCourse(no.tdt4250.f2019.ra.Person, no.tdt4250.f2019.ra.Course, float) <em>Allocate Staff To Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allocate Staff To Course</em>' operation.
	 * @see no.tdt4250.f2019.ra.Department#allocateStaffToCourse(no.tdt4250.f2019.ra.Person, no.tdt4250.f2019.ra.Course, float)
	 * @generated
	 */
	EOperation getDepartment__AllocateStaffToCourse__Person_Course_float();

	/**
	 * Returns the meta object for class '{@link no.tdt4250.f2019.ra.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.tdt4250.f2019.ra.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.tdt4250.f2019.ra.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see no.tdt4250.f2019.ra.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the reference list '{@link no.tdt4250.f2019.ra.Course#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocations</em>'.
	 * @see no.tdt4250.f2019.ra.Course#getAllocations()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Allocations();

	/**
	 * Returns the meta object for class '{@link no.tdt4250.f2019.ra.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.tdt4250.f2019.ra.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.tdt4250.f2019.ra.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the container reference '{@link no.tdt4250.f2019.ra.Person#getEmployer <em>Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Employer</em>'.
	 * @see no.tdt4250.f2019.ra.Person#getEmployer()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Employer();

	/**
	 * Returns the meta object for the reference list '{@link no.tdt4250.f2019.ra.Person#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocations</em>'.
	 * @see no.tdt4250.f2019.ra.Person#getAllocations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Allocations();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.Person#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workload</em>'.
	 * @see no.tdt4250.f2019.ra.Person#getWorkload()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Workload();

	/**
	 * Returns the meta object for class '{@link no.tdt4250.f2019.ra.ResourceAllocation <em>Resource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Allocation</em>'.
	 * @see no.tdt4250.f2019.ra.ResourceAllocation
	 * @generated
	 */
	EClass getResourceAllocation();

	/**
	 * Returns the meta object for the reference '{@link no.tdt4250.f2019.ra.ResourceAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.tdt4250.f2019.ra.ResourceAllocation#getPerson()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EReference getResourceAllocation_Person();

	/**
	 * Returns the meta object for the reference '{@link no.tdt4250.f2019.ra.ResourceAllocation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see no.tdt4250.f2019.ra.ResourceAllocation#getCourse()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EReference getResourceAllocation_Course();

	/**
	 * Returns the meta object for the attribute '{@link no.tdt4250.f2019.ra.ResourceAllocation#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see no.tdt4250.f2019.ra.ResourceAllocation#getFactor()
	 * @see #getResourceAllocation()
	 * @generated
	 */
	EAttribute getResourceAllocation_Factor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RaFactory getRaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.tdt4250.f2019.ra.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.tdt4250.f2019.ra.impl.DepartmentImpl
		 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__SHORT_NAME = eINSTANCE.getDepartment_ShortName();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STAFF = eINSTANCE.getDepartment_Staff();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Resource Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__RESOURCE_ALLOCATIONS = eINSTANCE.getDepartment_ResourceAllocations();

		/**
		 * The meta object literal for the '<em><b>Allocate Staff To Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTMENT___ALLOCATE_STAFF_TO_COURSE__PERSON_COURSE_FLOAT = eINSTANCE.getDepartment__AllocateStaffToCourse__Person_Course_float();

		/**
		 * The meta object literal for the '{@link no.tdt4250.f2019.ra.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.tdt4250.f2019.ra.impl.CourseImpl
		 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ALLOCATIONS = eINSTANCE.getCourse_Allocations();

		/**
		 * The meta object literal for the '{@link no.tdt4250.f2019.ra.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.tdt4250.f2019.ra.impl.PersonImpl
		 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Employer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMPLOYER = eINSTANCE.getPerson_Employer();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ALLOCATIONS = eINSTANCE.getPerson_Allocations();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__WORKLOAD = eINSTANCE.getPerson_Workload();

		/**
		 * The meta object literal for the '{@link no.tdt4250.f2019.ra.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.tdt4250.f2019.ra.impl.ResourceAllocationImpl
		 * @see no.tdt4250.f2019.ra.impl.RaPackageImpl#getResourceAllocation()
		 * @generated
		 */
		EClass RESOURCE_ALLOCATION = eINSTANCE.getResourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ALLOCATION__PERSON = eINSTANCE.getResourceAllocation_Person();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ALLOCATION__COURSE = eINSTANCE.getResourceAllocation_Course();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ALLOCATION__FACTOR = eINSTANCE.getResourceAllocation_Factor();

	}

} //RaPackage
