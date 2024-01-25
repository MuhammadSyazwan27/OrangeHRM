package jobCategory
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



class DeleteJobCategoryBDD {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User go to login starting page")
	def go_to_login_page() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		
		WebUI.setText(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/input_Username_username'),
			'Admin')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/input_Password_password'),
			'hUKwJTbofgPU9eVlw/CnDQ==')
		
		WebUI.click(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/button_Login'))
		
	}

	@When("User enter job category section")
	def enter_job_category_section() {
		
		WebUI.click(findTestObject('Object Repository/006-TC-Job Categories/006_01-TC-01-add_Job_Category/Page_OrangeHRM/a_Admin'))
		
		WebUI.click(findTestObject('Object Repository/006-TC-Job Categories/006_01-TC-01-add_Job_Category/Page_OrangeHRM/li_Job'))
		
		WebUI.click(findTestObject('Object Repository/006-TC-Job Categories/006_01-TC-01-add_Job_Category/Page_OrangeHRM/li_Job Categories'))
		
	}
	
	@When("User enter delete the job category")
	def enter_delete_job_category() {
	
		WebUI.click(findTestObject('006-TC-Job Categories/006_01-TC-01-add_Job_Category/Page_OrangeHRM/button_Jobless1_oxd-icon-button oxd-table-cell-action-space'))
		
	}

	@Then("User confirmed to delete the job category")
	def I_verify_the_status_in_step() {
		
	WebUI.click(findTestObject('003-TC-User Management/003_03-TC-01-user_Delete_Account/Page_OrangeHRM/button_Yes, Delete'))

	}
}