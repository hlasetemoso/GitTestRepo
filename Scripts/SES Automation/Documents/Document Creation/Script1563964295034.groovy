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

WebUI.navigateToUrl('https://jnb-core-app01.sybrin.co.za:15000/Studio/#/')

WebUI.setText(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/input_User Name_usernameBox'), 
    'admin')
(WebUI.delay(1))
WebUI.setEncryptedText(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/input_Password_passwordBox'), 
    'RAIVpflpDOg=')
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Log In'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/i_Documents_documentListAddButton'))
(WebUI.delay(1))
WebUI.setText(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/input_Display Name_SybrinEnterpriseDocumentsWizard_Display_Name_Label'), 
    'new document test02')
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Next'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Next'))
(WebUI.delay(1))
WebUI.setText(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/input_Data Type_text'), 
    'name and surname')
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Next'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Next'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/New Document Test Objects/Page_Sybrin Enterprise Studio/button_Finish'))

