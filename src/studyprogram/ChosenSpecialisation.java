/**
 */
package studyprogram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chosen Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.ChosenSpecialisation#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getChosenSpecialisation()
 * @model
 * @generated
 */
public interface ChosenSpecialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see studyprogram.StudyprogramPackage#getChosenSpecialisation_Specialisation()
	 * @model
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link studyprogram.ChosenSpecialisation#getSpecialisation <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

} // ChosenSpecialisation
