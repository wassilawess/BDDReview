package page;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static int randomGenerator() {
		Random rnd = new Random();
		int randomNum = rnd.nextInt(999);

		return randomNum;

	}

	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	public static void screenShot(WebDriver driver, String fileWithPath) throws Exception {
        // Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
         // Call getScreenshotAs method to create image file
         File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
         // Move image file to new destination
        File DestFile = new File(fileWithPath);
        // Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
        }

}
