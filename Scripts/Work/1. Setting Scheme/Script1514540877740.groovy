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

'Переходим на вкладку "Структура предприятия"'
WebUI.click(findTestObject('GIAP-DC/MainPage/StructureBlock'))

WebUI.delay(5)

'Переходим на вкладку схемы производства'
WebUI.click(findTestObject('GIAP-DC/StructurePage/StructureButton'))

WebUI.delay(5)

WebUiBuiltInKeywords.waitForJQueryLoad(0)

'Открываем окно настроек схемы'
WebUI.click(findTestObject('GIAP-DC/StructurePage/SettingButton'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('GIAP-DC/StructurePage/td_'))

'Меняем цвет'
WebUI.setText(findTestObject('GIAP-DC/StructurePage/input_form-control minicolors- (1)'), '#19fc00')

WebUI.sendKeys(findTestObject('GIAP-DC/StructurePage/input_form-control minicolors- (1)'), Keys.chord(Keys.ENTER))

'Перерисовываем схему'
WebUI.click(findTestObject('GIAP-DC/StructurePage/OkColorButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.delay(2)

'Снимаем глачку "Все уровни"'
WebUI.click(findTestObject('GIAP-DC/StructurePage/UncheckAlllevel'))

WebUI.click(findTestObject('GIAP-DC/StructurePage/div_draw-struc-menu'))

'Ставим уровень 1'
WebUI.setText(findTestObject('GIAP-DC/StructurePage/input_levelstruc'), '1')

'Строим схему'
WebUI.click(findTestObject('GIAP-DC/StructurePage/button_ (1)'))

WebUiBuiltInKeywords.delay(5)

'Закрываем браузер'
WebUI.closeBrowser()

