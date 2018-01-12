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

