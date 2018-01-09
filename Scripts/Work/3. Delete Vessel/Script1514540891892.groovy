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
import org.openqa.selenium.Keys as Keys

'Входим в систему'
WebUI.callTestCase(findTestCase('Work/Valid login'), [('StartURL') : 'https://system.misnik.by:8484/index.php', ('Name') : 'TaushevIS'
        , ('Pass') : 'tMYPHSIa'], FailureHandling.STOP_ON_FAILURE)

'Заходим в Сосуды'
WebUI.click(findTestObject('GIAP-DC/deleteVessel/Page_  GIAP-DC/VesselBlock'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

'Выполняем поиск сосуда'
WebUI.click(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/Search'))

'В поиск подставляем переменную'
WebUI.setText(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/Search'), GlobalVariable.Position)

WebUI.sendKeys(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/Search'), Keys.chord(Keys.ENTER))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.delay(2)

'Кликаем на строку с содержимым "test10"'
WebUI.click(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/Vessel_Test10'))

'Кликаем на кнопку "Удалить"'
WebUI.click(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/deleteButton'))

WebUiBuiltInKeywords.delay(2)

'Подтверждаем удаление'
WebUI.click(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/confirmDeleteButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

'Проверяем наличие всплывающей подсказки'
WebUI.verifyElementPresent(findTestObject('GIAP-DC/deleteVessel/Page_    GIAP-DC/successDeletemessage'), 0)

'Закрываем браузер'
WebUI.closeBrowser()

