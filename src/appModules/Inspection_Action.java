package appModules;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;

import pageObjects.Inspection;

public class Inspection_Action {

	public static void Execute(WebDriver driver) throws Exception {

		Inspection.Main_Dashboard(driver).click();

		//Log.info("Click action performed on Submit button");

	}

}