/**
 */
package no.tdt4250.f2019.ra.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.tdt4250.f2019.ra.RaFactory;
import no.tdt4250.f2019.ra.ResourceAllocation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceAllocationTest extends TestCase {

	/**
	 * The fixture for this Resource Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAllocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceAllocationTest.class);
	}

	/**
	 * Constructs a new Resource Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAllocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceAllocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAllocation getFixture() {
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
		setFixture(RaFactory.eINSTANCE.createResourceAllocation());
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

} //ResourceAllocationTest
