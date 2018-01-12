import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/Work/Vessel/1. Create New Vessel', new TestCaseBinding('Test Cases/Work/Vessel/1. Create New Vessel',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/Work/Vessel/2. FillingGeneralInformation', new TestCaseBinding('Test Cases/Work/Vessel/2. FillingGeneralInformation',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_2() {
    TestCaseMain.runTestCase('Test Cases/Work/Vessel/3. FillingOperatingParameters', new TestCaseBinding('Test Cases/Work/Vessel/3. FillingOperatingParameters',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/CreateVessel')

suiteProperties.put('name', 'CreateVessel')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\TestProject\\glowing-giggle\\Reports\\CreateVessel\\20180112_130110\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('CreateVessel', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/CreateVessel')

(0..2).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/CreateVessel')

KeywordLogger.getInstance().endSuite('CreateVessel', null)
