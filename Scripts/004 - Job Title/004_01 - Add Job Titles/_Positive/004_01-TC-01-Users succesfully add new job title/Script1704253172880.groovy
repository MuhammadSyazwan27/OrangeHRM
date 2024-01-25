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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/input_Username_username'), 
    GlobalVariable.main_Username)

WebUI.setEncryptedText(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/input_Password_password'), 
    GlobalVariable.main_Password)

WebUI.click(findTestObject('Object Repository/001-TC-Login/001-TC-01-User_successfully_login/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    'theJob1')

WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    'theJob1desc')

WebUI.setText(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 
    'nota1')

WebUI.click(findTestObject('Object Repository/004-TC-Job Title/004_01-TC-01-user_Add_Job_Title/Page_OrangeHRM/button_Save'))

