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

WebUI.click(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    'first')

WebUI.setText(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    'middle')

WebUI.setText(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'last')

WebUI.sendKeys(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '1412')

WebUI.click(findTestObject('Object Repository/007-TC-Employee List/007_01-TC-employee_List/Page_OrangeHRM/button_Save'))

