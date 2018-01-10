import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\GDC\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Work\\Vessel\\2. FillingGeneralInformation\\20180108_155108\\execution.properties')

TestCaseMain.beforeStart()
try {
    
	    TestCaseMain.runTestCase('Test Cases/Work/Vessel/2. FillingGeneralInformation', new TestCaseBinding('Test Cases/Work/Vessel/2. FillingGeneralInformation', [:]), FailureHandling.STOP_ON_FAILURE , true)
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Work/Vessel/2. FillingGeneralInformation')
}
