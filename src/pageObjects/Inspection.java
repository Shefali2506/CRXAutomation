package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Inspection {
private static WebElement element = null;

	

	public static WebElement Main_Dashboard(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"Dashboard\"]/a"));

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
}