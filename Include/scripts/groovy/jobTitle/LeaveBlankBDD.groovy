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



class LeaveBlankBDD {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to the OrangeHRM website")
	def user_go_to_OrangeHRM_website() {
		
		WebUI.callTestCase(findTestCase('001 - Login/_Positive/001-TC-01-User successfully login'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}

	@When("User navigate to job title interfaces")
	def user_navigate_to_job_title() {
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/a_Admin'))
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/li_Job'))
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/li_Job Titles'))
		
	}
	
	@And("User leave the space blank")
	def user_leave_blank() {
	
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/button_Add'))
		
		WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'),
			'')
		
		WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'),
			'')
		
		WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'),
			'')
		
	}

	@Then("User click the save button to save changes")
	def user_clicks_save() {
		
		WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/button_Save'))
		
			
	}
}