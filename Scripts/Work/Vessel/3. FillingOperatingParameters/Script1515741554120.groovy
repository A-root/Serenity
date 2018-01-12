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

WebUiBuiltInKeywords.comment('Добавляем объект на вкладку "Текущие пространиства"')

WebUI.callTestCase(findTestCase('Work/Vessel/OpParam/Main'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Добавляем данные на вкладку "История параметров"')

WebUI.callTestCase(findTestCase('Work/Vessel/OpParam/History'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Work/Vessel/OpParam/History_2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Заносим данные на вкладку "Технологические среды"')

WebUI.callTestCase(findTestCase('Work/Vessel/OpParam/Envir'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.comment('Заносим данные на вкладку "Режим эксплуатации"')

WebUI.callTestCase(findTestCase('Work/Vessel/OpParam/Regime'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/SaveButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

