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

'Ищем пользователя'
WebUI.setText(findTestObject('GIAP-DC/UserModule/search_user'), GlobalVariable.NewUser)

'Заходим в редактирование'
WebUI.click(findTestObject('GIAP-DC/UserModule/EditUserButton'))

WebUI.verifyTextPresent('Редактирование пользователя', false)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Удаляем имя пользователя'
WebUI.setText(findTestObject('GIAP-DC/UserModule/input_0_1'), '')

'Сохраняем'
WebUI.click(findTestObject('GIAP-DC/UserModule/SaveButton'))

'Проверяем наличие сообщения об ошибке'
WebUI.verifyElementPresent(findTestObject('GIAP-DC/UserModule/Error'), 3)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUI.closeBrowser()

