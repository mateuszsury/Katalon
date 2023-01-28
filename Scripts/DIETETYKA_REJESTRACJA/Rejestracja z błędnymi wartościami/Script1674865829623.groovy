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

WebUI.openBrowser("https://dietetykanienazarty.pl/")
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/DIETETYKA_HOMEPAGE/lnk_logowanie'))
WebUI.click(findTestObject('Object Repository/DIETETYKA_LOGOWANIE/lnk_rejestracja'))
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/email'), email)
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/haslo'), haslo)
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/powhaslo'), powhaslo)
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/imie'), imie)
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/nazwisko'), nazwisko)
WebUI.setText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/telefon'), telefon)
WebUI.click(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/cookie'))
WebUI.scrollToPosition(9999999, 9999999)
WebUI.click(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/potwierdzenie'))
WebUI.click(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/rejestruj'))


String el_error_msg = WebUI.getText(findTestObject('Object Repository/DIETETYKA_REJESTRACJA/str_error_msg'))
assert error_msg == el_error_msg
WebUI.closeBrowser()



