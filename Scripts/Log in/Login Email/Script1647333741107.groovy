import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.gigantic.clawee', FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Start page/logoClawee'), 0)

Mobile.tap(findTestObject('Start page/Connect button/Connect with Email/Connect with E-mail'), 0)

Mobile.setText(findTestObject('Start page/Connect button/Connect with Email/First name'), 'Alexander', 0)

Mobile.setText(findTestObject('Start page/Connect button/Connect with Email/Last name'), 'Testing', 0)

Mobile.setText(findTestObject('Start page/Connect button/Connect with Email/E-mail'), 'Alex.qa.eng+79@gmail.com', 0)

Mobile.setText(findTestObject('Start page/Connect button/Connect with Email/Password'), 'Alex0611', 0)

Mobile.tap(findTestObject('Start page/Connect button/Connect with Email/Sign Up'), 0)

