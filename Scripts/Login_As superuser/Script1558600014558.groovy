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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/Page_Appriss Retail - Log on/input_Username_username'), superuser)

not_run: WebUI.click(findTestObject('Object Repository/Page_Appriss Retail - Log on/span_Password_validation-wrapper'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Appriss Retail - Log on/input_Password_password'), Password)

not_run: WebUI.navigateToUrl('http://r-uklo-pd01.int.appriss.com/secure/cpf/core/logon?i=4&url=/secure')

WebUI.click(findTestObject('Object Repository/Page_Appriss Retail - Log on/button_Sign In'))

