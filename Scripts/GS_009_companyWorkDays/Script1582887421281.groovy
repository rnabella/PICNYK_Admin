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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin-stag.picnyk.com/global')

WebUI.verifyElementVisible(findTestObject('Global Settings (GS)/div_Company Work Days'))

WebUI.click(findTestObject('Global Settings (GS)/span_Sun'))

WebUI.click(findTestObject('Global Settings (GS)/span_Sun'))

WebUI.click(findTestObject('Global Settings (GS)/span_Mon'))

WebUI.click(findTestObject('Global Settings (GS)/span_Mon'))

WebUI.click(findTestObject('Global Settings (GS)/span_Tues'))

WebUI.click(findTestObject('Global Settings (GS)/span_Tues'))

WebUI.click(findTestObject('Global Settings (GS)/span_Wed'))

WebUI.click(findTestObject('Global Settings (GS)/span_Wed'))

WebUI.click(findTestObject('Global Settings (GS)/span_Thur'))

WebUI.click(findTestObject('Global Settings (GS)/span_Thur'))

WebUI.click(findTestObject('Global Settings (GS)/span_Fri'))

WebUI.click(findTestObject('Global Settings (GS)/span_Fri'))

WebUI.click(findTestObject('Global Settings (GS)/span_Sat'))

WebUI.click(findTestObject('Global Settings (GS)/span_Sat'))

WebUI.closeBrowser()

