import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('001 - Login/_Positive/001-TC-01-User successfully login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_theJob1desc_oxd-icon-button oxd-tabl_880e9e'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Yes, Delete'))

WebUI.click(findTestObject('004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Show More_oxd-icon-button oxd-table-cell-action-space'))

WebUI.click(findTestObject('004-TC-Job Title/004_02-TC-01-user_Delete_Job_Title/Page_OrangeHRM/button_Yes, Delete'))

