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

WebUI.callTestCase(findTestCase('UsersModule/Enter Users Module'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Ищем созданного пользователя'
WebUI.setText(findTestObject('GIAP-DC/UserModule/search_user'), GlobalVariable.NewName)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Редактируем права пользователя'
WebUI.click(findTestObject('GIAP-DC/UserModule/EditRightUserButton'))

'Проверяем заголовок окна'
WebUI.verifyTextPresent('Права пользователя', false)

'Закрываем окно редактирования прав пользователя'
WebUI.click(findTestObject('GIAP-DC/UserModule/CancelRightButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Редактируем права пользователя'
WebUI.click(findTestObject('GIAP-DC/UserModule/EditRightUserButton'))

'Проверяем заголовок окна'
WebUI.verifyTextPresent('Права пользователя', false)

'Выделяем все права'
WebUI.click(findTestObject('GIAP-DC/UserModule/SelectAllRight'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Снимаем все права'
WebUI.click(findTestObject('GIAP-DC/UserModule/UncheckAllButton'))

'Сохраняем изменение прав'
WebUI.click(findTestObject('GIAP-DC/UserModule/Save_Button'))

'Проверяем сообщение успеха изменения прав'
WebUI.verifyElementPresent(findTestObject('GIAP-DC/UserModule/div_toast toast-success'), 5)

WebUiBuiltInKeywords.closeBrowser()

