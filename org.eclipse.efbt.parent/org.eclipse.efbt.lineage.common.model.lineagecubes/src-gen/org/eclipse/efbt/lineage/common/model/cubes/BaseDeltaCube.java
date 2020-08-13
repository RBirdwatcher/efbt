/**
 */
package org.eclipse.efbt.lineage.common.model.cubes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Delta Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.lineage.common.model.cubes.BaseDeltaCube#getUltimateBaseCube <em>Ultimate Base Cube</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.lineage.common.model.cubes.CubesPackage#getBaseDeltaCube()
 * @model
 * @generated
 */
public interface BaseDeltaCube extends BaseCube
{
	/**
	 * Returns the value of the '<em><b>Ultimate Base Cube</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Base Cube</em>' reference.
	 * @see #setUltimateBaseCube(FreeBirdToolsCube)
	 * @see org.eclipse.efbt.lineage.common.model.cubes.CubesPackage#getBaseDeltaCube_UltimateBaseCube()
	 * @model
	 * @generated
	 */
	FreeBirdToolsCube getUltimateBaseCube();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.lineage.common.model.cubes.BaseDeltaCube#getUltimateBaseCube <em>Ultimate Base Cube</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Base Cube</em>' reference.
	 * @see #getUltimateBaseCube()
	 * @generated
	 */
	void setUltimateBaseCube(FreeBirdToolsCube value);

} // BaseDeltaCube
