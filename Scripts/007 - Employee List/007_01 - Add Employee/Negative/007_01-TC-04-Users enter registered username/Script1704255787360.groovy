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

WebUI.callTestCase(findTestCase('007 - Employee List/007_01 - Add Employee/_Positive/007_01-TC-01-Users successfully add employee'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/007_01-TC-01-employee_login/Page_OrangeHRM/li_Employee List'))

WebUI.click(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/007_01-TC-01-employee_login/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    'first')

WebUI.setText(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    'middle')

WebUI.setText(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'last')

WebUI.click(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/button_Save'))

