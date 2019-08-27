/**
 */
package no.tdt4250.f2019.ra.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.tdt4250.f2019.ra.Course;
import no.tdt4250.f2019.ra.Department;
import no.tdt4250.f2019.ra.Person;
import no.tdt4250.f2019.ra.RaFactory;
import no.tdt4250.f2019.ra.RaPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.tdt4250.f2019.ra.Department#allocateStaffToCourse(no.tdt4250.f2019.ra.Person, no.tdt4250.f2019.ra.Course, float) <em>Allocate Staff To Course</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DepartmentTest extends TestCase {

	/**
	 * The fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Department fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DepartmentTest.class);
	}

	/**
	 * Constructs a new Department test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Department fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Department getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RaFactory.eINSTANCE.createDepartment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link no.tdt4250.f2019.ra.Department#allocateStaffToCourse(no.tdt4250.f2019.ra.Person, no.tdt4250.f2019.ra.Course, float) <em>Allocate Staff To Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.tdt4250.f2019.ra.Department#allocateStaffToCourse(no.tdt4250.f2019.ra.Person, no.tdt4250.f2019.ra.Course, float)
	 * @NOT generated
	 */
	public void testAllocateStaffToCourse__Person_Course_float() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		Person p1 = RaFactory.eINSTANCE.createPerson();
		Department d = getFixture();
		d.getStaff().add(p1);
		Course c1 = RaFactory.eINSTANCE.createCourse();
		d.getCourses().add(c1);
		assertTrue(d.getResourceAllocations().isEmpty());
		d.allocateStaffToCourse(p1, c1, 1.0f);
		assertFalse(d.getResourceAllocations().isEmpty());
	}
	
	public void testAllocateStaffToCource__loadingSample() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(RaPackage.eNS_URI, RaPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI("sample.xmi"), true);
		resource.load(getClass().getResourceAsStream("sample.xmi"), null);
		Department dep = (Department) resource.getContents().get(0);
		Person p1 = dep.getStaff().get(0);
		Course c1 = dep.getCourses().get(0);
		Course c2 = dep.getCourses().get(1);
		dep.allocateStaffToCourse(p1, c1, 0.5f);
		dep.allocateStaffToCourse(p1, c2, 0.5f);
		assertEquals(2, p1.getAllocations().size());
	}

} //DepartmentTest
