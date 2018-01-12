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

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/CalculationButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/addCalculation'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/dateCalculation'), '01/02/2013')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/nameCalculation'), 'Расчет на прочность')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/organizitonCalculation'), '')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/addNoticeCalculation'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/noticeTextarea'), 'Произведен расчет')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/okNoticeTextareaButton'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/addResulCalculation'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/selectResultCalculation'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/Calculation/saveCalculation'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

