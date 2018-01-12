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

