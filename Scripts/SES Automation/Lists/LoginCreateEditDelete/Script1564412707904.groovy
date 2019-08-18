
/*
 
 Description : Functional Test Script
 
 @author Temoso Hlase
 
 Script Name : Lists ;
 
 Generated : 2019/07/29;
 
 Description : Create, Edit and Delete List
 
 
 */

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

/*Calling Login TestCase*/

WebUI.callTestCase(findTestCase('SES Automation/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/i_Lists_fa fa-plus pull-right'))

WebUI.delay(1)

/*Creation of a List*/

WebUI.setText(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/input_Name_form-control ng-untouched ng-star-inserted ng-dirty ng-valid'), 
    'NewListCreationTest03')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/input_Display Name_form-control ng-untouched ng-star-inserted ng-dirty ng-valid'), 
    'NewListCreationTest03')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/input_Description_form-control ng-untouched ng-valid ng-star-inserted ng-dirty'), 
    'NewListCreationTest03')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/span_List Type_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/div_SQL'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/span_Data Store_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/div_Default_Dat'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/span_Document Name_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/input'), 'list')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/div_ListTestDocument'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/span_Display Field_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/div_IdNumber'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/span_Key Field_ng-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/div_NameSurname'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/List Creation Objects/Page_Sybrin Enterprise Studio/button_Finish'))
WebUI.delay(2)


/*Editing of a List*/

WebUI.click(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/a_Lists'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/span_TestListAuto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/span_Edit'))

WebUI.delay(1)

WebUI.setText(findTestObject('Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/input_Name_form-control ng-untouched ng-valid ng-star-inserted ng-dirty'), 
    'TestListAuto01')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/input_Display Name_form-control ng-untouched ng-valid ng-star-inserted ng-dirty'), 
    'TestListAuto01')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/input_Description_form-control ng-untouched ng-valid ng-star-inserted ng-dirty'), 
    'TestListAuto01')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Editing a List (From Edit button)/Page_Sybrin Enterprise Studio/span_Save'))
WebUI.delay(2)

/*deletion of a List*/

WebUI.click(findTestObject('Object Repository/List Deletion Objects/Page_Sybrin Enterprise Studio/a_Lists'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/List Deletion Objects/Page_Sybrin Enterprise Studio/span_TestListAuto01'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/List Deletion Objects/Page_Sybrin Enterprise Studio/li_Delete'))
(WebUI.delay(1))
WebUI.click(findTestObject('Object Repository/List Deletion Objects/Page_Sybrin Enterprise Studio/button_Yes'))



