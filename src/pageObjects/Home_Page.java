package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_Page {

	private static WebElement element = null;

	

	public static WebElement user_img(WebDriver driver) {

		element = driver.findElement(By.id("userimg"));

		utility.Log.info("Clicked on logged in User image");

		return element;

	}

	public static WebElement lnk_LogOut(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/ul/ul/li/ul/li[1]/form/a"));
		action.moveToElement(a).click().build().perform();

		utility.Log.info("Log Out link element found");
		return element;

	}

	public static WebElement Select_Hospital(WebDriver driver) {

		element = driver
				.findElement(By.xpath("//*[@id=\"body\"]/section/div/div[2]/section[2]/div/div/div/ul/li[2]/a"));

		utility.Log.info("The hospital has been selected");

		return element;

	}
	
	 public static WebElement find_hospital(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("//*[@id=\"body\"]/section/div/div[2]/section[2]/div/div/div/ul/li[2]/a"));
		  
		 utility.Log.info("Hospital  element found");
		 
		  return element;
		 
		 }

}