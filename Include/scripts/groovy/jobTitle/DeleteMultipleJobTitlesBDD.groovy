package jobTitle
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DeleteMultipleJobTitlesBDD {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User successfully login to the OrangeHRM website")
	def I_want_to_write_a_step_with_name() {
		
		WebUI.callTestCase(findTestCase('001 - Login/_Positive/001-TC-01-User successfully login'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/a_Admin'))
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/li_Job'))
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/li_Job Titles'))
		
	}

	@When("User delete a job title first")
	def User_delete_a_job_title_first() {
	
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_theJob1desc_oxd-icon-button oxd-tabl_880e9e'))
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Yes, Delete'))
			
	}

	
	@And("User delete another job title")
	def User_delete_another_job_title() {
		
		WebUI.click(findTestObject('004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Show More_oxd-icon-button oxd-table-cell-action-space'))
		
	}
	
	@Then("User delete another job title was successfull")
	def User_delete_another_job_title_was_successfull() {
		
		WebUI.click(findTestObject('004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Yes, Delete'))
		
	}
}