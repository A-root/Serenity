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

'Выбираем из селекта тип сосуда'
WebUI.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/TypeVessel'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/TypeVesselSelect'))

'Задаем наименование'
WebUI.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/NameVessel'), 'Для тестирования')

'Выбираем из селекта учет в РТН'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/accountingInRTN'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/RTN(Y_N)'))

'Заводской номер'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/factoryNumber'), '2951')

'Инвентраный номер'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/inventNumber'), '6485-95-2.5')

'Дата ввода в экстплуатацию'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/factoryDate'), '2008')

'Дата производства'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/manufactureDate'), '05.03.2006')

'Выбираем из селекта производителя'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/manufacturer'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/ManufacturerSelect'))

'Нормативный срок службы'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/lifetime'), '10')

'Выбираем из селекта группу сосуда'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/groupVessel'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/GroupVesselSelect'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/categoryVessel'), 'сосуд')

'Записываем в Textarea назначение сосуда'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/tagetVesselButton'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/textareaTargetVessel'), 'Буферная емкость на нагнетании компрессора ')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/OkButtonTargetVessel'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/noticeButton'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/textareaNotice'), 'В паспорте не указана сварка, ссылаются на паспорт завода-изготовителя.')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/OkTextareaNotice'))

