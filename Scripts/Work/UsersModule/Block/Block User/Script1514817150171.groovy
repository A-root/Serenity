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

WebUI.callTestCase(findTestCase('Work/UsersModule/Enter Users Module'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Ищем пользователя'
WebUI.setText(findTestObject('GIAP-DC/UserModule/search_user'), 'Test1010')

'Блокируем пользователя'
WebUI.click(findTestObject('GIAP-DC/UserModule/a_block btn red-sunglo'))

'Проверяем заголовок окна'
not_run: WebUI.verifyTextPresent('Данный пользователь будет заблокирован!', false)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Отменяем блокировку'
WebUI.click(findTestObject('GIAP-DC/UserModule/CancelBlockButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Блокируем пользователя'
WebUI.click(findTestObject('GIAP-DC/UserModule/a_block btn red-sunglo'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Проверяем заголовок окна'
not_run: WebUI.click(findTestObject('GIAP-DC/UserModule/HeaderBlockUser'))

'Подтверждаем блокировку'
WebUI.click(findTestObject('GIAP-DC/UserModule/BlockUserButton'))

'Проверяем подтверждение блокировки'
WebUI.verifyElementPresent(findTestObject('GIAP-DC/UserModule/div_toast toast-success'), 5)

WebUiBuiltInKeywords.closeBrowser()

