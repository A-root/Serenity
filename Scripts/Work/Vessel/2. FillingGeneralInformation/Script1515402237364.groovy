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

not_run: WebUI.callTestCase(findTestCase('Work/Vessel/1. Create New Vessel'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.comment('Заполняем группу параметров "Основное"')

WebUI.callTestCase(findTestCase('Work/Vessel/GenInfo/BasicInfo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Заходим в блок регистрации сосуда')

WebUI.callTestCase(findTestCase('Work/Vessel/GenInfo/Registration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Закончили с регистрацией, заполняем блок "Технические характеристики"')

WebUI.callTestCase(findTestCase('Work/Vessel/GenInfo/Specifications'), [:], FailureHandling.STOP_ON_FAILURE)

'Сохраняем изменения на вкладке'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/SaveButton'))

WebUiBuiltInKeywords.delay(10)

