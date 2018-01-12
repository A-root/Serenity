import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

not_run: WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/historyButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/addHistory'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/DateHistory'), '25.05.2015')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/sourceHistory'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/selectDataSource'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/enviromentFromSource'), 'нефтепродукты')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/spaceFromSource'), 'корпус')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/valueHistory'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/selectValue'))

not_run: WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/buttonAdd Space'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/workPin'), '0.15')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/workPout'), '0.15')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/allowedP'), '0.15')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/calculatedP'), '0.15')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/workTin'), '80')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/workTout'), '80')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/allowedT'), '80')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/calculatedT'), '80')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/addSpaceHistoryButton'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/openSelectSpaceHistory'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/selectSpaceHistory'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/OkSelectSpaceHistory'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/History/addButton (1)'))

