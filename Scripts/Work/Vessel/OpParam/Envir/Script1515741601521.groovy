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

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/EnviromentButton'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/addEnviroment'))

WebUiBuiltInKeywords.waitForJQueryLoad(0)

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/dateEnviroment'), '25/01/2011')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/sourceEnviroment'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/selectSourceEnviroment'))

WebUiBuiltInKeywords.setText(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/nameEnviroment'), 'нефтепродукты')

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/dangerClassEnviroment'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/selectDangerClassEnviroment'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/explosiveEnviroment'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/selectExplosiveEnviroment'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/addSpaceEnviromentButton'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/openSelectSpaceEnviroment'))

WebUiBuiltInKeywords.delay(GlobalVariable.Delay)

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/selectSpaceEnviroment'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/OkSelectSpaceEnviroment'))

WebUiBuiltInKeywords.click(findTestObject('GIAP-DC/Vessel/Operating Parameters/Environment/addEnviromentButton'))

