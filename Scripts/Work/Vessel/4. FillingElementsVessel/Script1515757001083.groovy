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

'Переходим на вкладку "Элементы сосуда"'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/ElementsVesselButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.comment('Добавляем элементы сосуда')

WebUI.callTestCase(findTestCase('Work/Vessel/ElementsVessel/addElements'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Добавляем термообработку')

WebUI.callTestCase(findTestCase('Work/Vessel/ElementsVessel/ThermalProcessing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Добавляем расчеты')

WebUI.callTestCase(findTestCase('Work/Vessel/ElementsVessel/Calculation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/SaveButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

