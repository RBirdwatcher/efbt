/**
 */
package org.eclipse.efbt.controller.core.model.platform_call.util;

import org.eclipse.efbt.controller.core.model.platform_call.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.controller.core.model.platform_call.Platform_callPackage
 * @generated
 */
public class Platform_callSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Platform_callPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_callSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = Platform_callPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case Platform_callPackage.COMPARE_ATTRIBUTE_LINEAGE_MODELS:
			{
				CompareAttributeLineageModels compareAttributeLineageModels = (CompareAttributeLineageModels)theEObject;
				T result = caseCompareAttributeLineageModels(compareAttributeLineageModels);
				if (result == null) result = casePlatformCall(compareAttributeLineageModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.IS_NOT_SUBSET:
			{
				IsNotSubset isNotSubset = (IsNotSubset)theEObject;
				T result = caseIsNotSubset(isNotSubset);
				if (result == null) result = caseSubsetBoolean(isNotSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.IS_SUBSET:
			{
				IsSubset isSubset = (IsSubset)theEObject;
				T result = caseIsSubset(isSubset);
				if (result == null) result = caseSubsetBoolean(isSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.SUBSET_BOOLEAN:
			{
				SubsetBoolean subsetBoolean = (SubsetBoolean)theEObject;
				T result = caseSubsetBoolean(subsetBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.EXECUTE_ATTRIBUTE_LINEAGE_MODEL:
			{
				ExecuteAttributeLineageModel executeAttributeLineageModel = (ExecuteAttributeLineageModel)theEObject;
				T result = caseExecuteAttributeLineageModel(executeAttributeLineageModel);
				if (result == null) result = casePlatformCall(executeAttributeLineageModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.PLATFORM_CALL:
			{
				PlatformCall platformCall = (PlatformCall)theEObject;
				T result = casePlatformCall(platformCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.PLATFORM_CALL_MODULE:
			{
				PlatformCallModule platformCallModule = (PlatformCallModule)theEObject;
				T result = casePlatformCallModule(platformCallModule);
				if (result == null) result = caseModule(platformCallModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.GET_ATTRIBUTE_LINEAGE_MODEL:
			{
				GetAttributeLineageModel getAttributeLineageModel = (GetAttributeLineageModel)theEObject;
				T result = caseGetAttributeLineageModel(getAttributeLineageModel);
				if (result == null) result = casePlatformCall(getAttributeLineageModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_callPackage.GET_ATTRIBUTE_LINEAGE_FOR_ONE_REPORT_CELL:
			{
				GetAttributeLineageForOneReportCell getAttributeLineageForOneReportCell = (GetAttributeLineageForOneReportCell)theEObject;
				T result = caseGetAttributeLineageForOneReportCell(getAttributeLineageForOneReportCell);
				if (result == null) result = casePlatformCall(getAttributeLineageForOneReportCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Attribute Lineage Models</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Attribute Lineage Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompareAttributeLineageModels(CompareAttributeLineageModels object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Not Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Not Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsNotSubset(IsNotSubset object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSubset(IsSubset object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetBoolean(SubsetBoolean object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Attribute Lineage Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Attribute Lineage Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteAttributeLineageModel(ExecuteAttributeLineageModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformCall(PlatformCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Call Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Call Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformCallModule(PlatformCallModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Lineage Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Lineage Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAttributeLineageModel(GetAttributeLineageModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Lineage For One Report Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Lineage For One Report Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAttributeLineageForOneReportCell(GetAttributeLineageForOneReportCell object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.eclipse.efbt.common.model.module_management.Module object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //Platform_callSwitch