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

WebUI.callTestCase(findTestCase('Work/Vessel/1. Create New Vessel'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.comment('Заполняем группу параметров "Основное"')

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

WebUI.comment('Заходим в блок регистрации сосуда')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/registrationBlock'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/addRegistrationButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Рег номер'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/RegNumber'), '123-x56')

'Дата регистрации'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/DateRegistration'), 
    '05/11/2010')

'Выбираем из селекта место регистрации'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/PlaceRegistration'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/PlaceRegistrationSelect'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

'Сохраняем данные о регистрации'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Registration/SaveRegistrationButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.comment('Закончили с регистрацией, заполняем блок "Технические характеристики"')

'Объем сосуда'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/Volume'), '22.6')

'Марка'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/ModelVessel'), 'Test')

'Выбираем из селекта расположение сосуда'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/location'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/LocationSelect'))

'Длина'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/length'), '2850')

'Выбираем из селекта режим работы'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/regime'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/regimeSelect'))

'Выбираем из селекта наличие теплоизоляции'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/presenceOfinsulation'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/InsulationSelect'))

'Выбираем из селекта наличие футеровки'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/presrnceOfTheLining'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/liningSelect'))

'Выбираем из селекта наличие антикоррозионного покрытия внутри'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/anticorrosionCoatingIn'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/antiInSelect'))

'Выбираем из селекта наличие антикоррозионного покрытия снаружи'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/anticorrosionCoatingOut'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/antiOutSelect'))

'Выбираем из селекта наличие внутренних устройств'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/innerDevice'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/innerDeviceSelect'))

'Выбираем из селекта наличие расчетов'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/calculation'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/calculationSelect'))

'Масса пустого сосуда'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/weight'), '300')

'Макс масса среды'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/maxWeight'), '50')

'Компенсация коррозии'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/compensationCorrosion'), '20')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/count'), '1')

'Площадь теплообмена'
WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/GeneralInformationAboutVessel/heatExchangeSurface'), '10')

'Сохраняем изменения на вкладке'
WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/SaveButton'))

WebUiBuiltInKeywords.delay(10)

