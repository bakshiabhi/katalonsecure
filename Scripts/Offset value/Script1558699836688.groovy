import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://r-uklo-pd01.int.appriss.com/secure/cpf/core/logon?i=4&url=/secure/portal#/0')

WebUI.setText(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/input_Username_username'), 
    'superuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/input_Password_password'), 
    'P22/mDurbpJw+G87ijze8Q==')

WebUI.click(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/button_Sign In'))

not_run: WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Business calender/Page_Secure/span_'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Secure/span__1'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Calendars - Secure/a_Business Calendar                            Business Calendar'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Edit - Calendars - Secure/span_Fiscal'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://r-uklo-pd01.int.appriss.com/secure/cpf/core/logon?i=4&url=/secure/portal#/0')

WebUI.setText(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/input_Username_username'), 
    'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/input_Password_password'), 
    'P22/mDurbpJw+G87ijze8Q==')

WebUI.setText(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/input_Username_username'), 
    'superuser')

WebUI.click(findTestObject('Object Repository/Business calender/Page_Appriss Retail - Log on/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Secure/span_Administration'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Secure/span__2'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Calendars - Secure/div_Business Calendar                            Business Calendar'))

WebUI.click(findTestObject('Object Repository/Business calender/Page_Calendars - Secure/a_Business Calendar                            Business Calendar'))

not_run: WebUI.closeBrowser()

