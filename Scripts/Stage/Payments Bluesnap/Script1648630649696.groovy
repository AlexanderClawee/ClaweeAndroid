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

Mobile.tap(findTestObject('Bluesnap/Profile (btn)'), 0)

Mobile.tap(findTestObject('Bluesnap/DEV menu (btn)'), 0)

Mobile.tap(findTestObject('Bluesnap/Production payments (swith)'), 0)

Mobile.tap(findTestObject('Bluesnap/Back (btn)'), 0)

Mobile.tap(findTestObject('Bluesnap/VIP (group)'), 0)

Mobile.tap(findTestObject('Bluesnap/Become VIP (btn)'), 0)

Mobile.tap(findTestObject('Bluesnap/Confirm (btn)'), 0)

Mobile.setText(findTestObject('Bluesnap/Credit card number (field)'), '4242424242424242', 0)

Mobile.setText(findTestObject('Bluesnap/CVV (field)'), '125', 0)

Mobile.setText(findTestObject('Bluesnap/Expiration date (field)'), '12/25', 0)

Mobile.setText(findTestObject('Bluesnap/Full name (field)'), 'Testing test', 0)

Mobile.tap(findTestObject('Bluesnap/Confirm Credit card (btn)'), 0)

Mobile.tap(findTestObject('Bluesnap/Awesome VIP club pop up (btn)'), 0)

