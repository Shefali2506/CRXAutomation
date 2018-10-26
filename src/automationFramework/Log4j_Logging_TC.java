package automationFramework;

// Import Package Log4j.*

import org.apache.log4j.xml.DOMConfigurator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;

import utility.*;

import appModules.*;

public class Log4j_Logging_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		// Provide Log4j configuration settings

		DOMConfigurator.configure("log4j.xml");

		Log.startTestCase("Selenium_Test_001");

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

		Log.info(" Excel sheet opened");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\shefali.rathore\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		Log.info("New driver instantiated");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Log.info("Implicit wait applied on the driver for 10 seconds");

		driver.get(Constant.URL);

		Log.info("Web application launched");

		SignIn_Action.Execute(driver);

		System.out.println("Login Successfully, now it is the time to Log Off buddy.");

		Home_Page.find_hospital(driver).click();
		Log.info("Click action is perfomred on the hospital selected");
		
		Home_Page.user_img(driver).click();

		Log.info("Click action is perfomred on User image of the logged in user");

		Home_Page.lnk_LogOut(driver).click();

		Log.info("Click action is perfomred on User image of the logged in user");
		driver.quit();

		Log.info("Browser closed");

		ExcelUtils.setCellData("Pass", 1, 3);

		Log.endTestCase("Selenium_Test_001");

		Home_Page.Select_Hospital(driver).click();
		Log.info("Click action on the hospital name has been performed");

	}

}