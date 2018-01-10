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

'Переходим с сосуды'
WebUI.click(findTestObject('GIAP-DC/AddVessel/Vessel'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

'Вызываем окно добавления Сосудов'
WebUI.click(findTestObject('GIAP-DC/AddVessel/Add'))

WebUI.verifyElementText(findTestObject('GIAP-DC/AddVessel/h4_'), 'Выбор интерфейса для добавления')

'Выбираем интерфейс "Другие"'
WebUI.click(findTestObject('GIAP-DC/AddVessel/Other'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Клик на select'
WebUI.click(findTestObject('GIAP-DC/AddVessel/Select'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'В выпадающем списке выбираем АВТ-4'
WebUI.click(findTestObject('GIAP-DC/AddVessel/ABT-4'))

'Заполняем позицию из переменной'
WebUI.setText(findTestObject('GIAP-DC/AddVessel/Position'), GlobalVariable.Position)

'Добавляем сосуд'
WebUI.click(findTestObject('GIAP-DC/AddVessel/AddVessel'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Закрываем браузер'
not_run: WebUI.closeBrowser()

