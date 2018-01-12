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

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/thermalProcessingButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/addThermalProcessing'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/nameThermalProcessing'))

WebUiBuiltInKeywords.delay(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/selectNameThermalProcessing'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/timeThermalProcessing'), '600')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/speedHeating'), '40')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/speedCooling'), '20')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/methodColling'), '-')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ThermalProcessing/addThermalProcessingButton'), 
    FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

