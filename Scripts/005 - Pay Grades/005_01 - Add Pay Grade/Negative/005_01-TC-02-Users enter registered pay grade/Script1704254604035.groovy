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

WebUI.callTestCase(findTestCase('005 - Pay Grades/005_01 - Add Pay Grade/_Positive/005_01-TC-01-Users successfully add new pay grade'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('005-TC-Pay Grades/005_01-TC-01-add_Pay_Grade/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/005-TC-Pay Grades/005_01-TC-01-add_Pay_Grade/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/005-TC-Pay Grades/005_01-TC-01-add_Pay_Grade/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    'Grade_A')

WebUI.click(findTestObject('Object Repository/005-TC-Pay Grades/005_01-TC-01-add_Pay_Grade/Page_OrangeHRM/button_Save'))

