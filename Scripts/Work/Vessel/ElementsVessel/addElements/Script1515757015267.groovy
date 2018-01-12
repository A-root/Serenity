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

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addElement'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/typeElement'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/selectTypeElement'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/subtypeElement'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/selectSubtypeElement'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/nameElement'), 'Вентиль')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/codeElement'), 'Вн12.59х')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/passportCodeElement'), '-')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/countElement'), '2')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/innerDiameterElement'), '20')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/innerDiameterMinElement'), '20')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/externalDiameterElement'), '50')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/externalDiameterMinElement'), '45')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/lengthElement'), '500')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/heightElement'), '400')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/widthElement'), '380')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/materialDesignElement'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/searchMaterialDesignElement'), '45')

WebUiBuiltInKeywords.delay(5)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/selectMaterilDesignElement'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/gostMaterialDesignElement'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/selectGostMaterialElement'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/gostOnElement'), '-')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addWeldengTextButton'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addWeldingTextarea'), 'авто СВ08ГА+ СВ06х25Н12Т10 2246-70')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/okAddWeldingTextareaButton'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addThermalprocessingTextButton'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addThermalprocessingTextarea'), '-')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/okAddThermalprocessingTextareaButton'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/thickIspElement'), '24')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/thickRaschElement'), '17')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/thickPlackElement'), '8')

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/angleElement'), '-')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/ElementsVessel/AddElement/addElementButton'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

