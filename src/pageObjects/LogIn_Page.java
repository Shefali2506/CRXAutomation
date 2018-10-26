package pageObjects;

import org.openqa.selenium.*;

import utility.Log;

public class LogIn_Page {

	static WebElement element ;

	public static WebElement txtbx_UserName(WebDriver driver) {

		
		WebElement element = driver.findElement(By.id("UserName"));

		Log.info("Username text box found");

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"Password\"]"));

		Log.info("Password text box found");

		return element;

	}

	public static WebElement btn_LogIn(WebDriver driver) {

		element = driver.findElement(By.id("btnlogin"));

		Log.info("Submit button found");

		return element;

	}

}