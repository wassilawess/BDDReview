package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	// its a global var so all meth can usse it
	static WebDriver driver;
	
	//its static so we dont need an obj
	public static  WebDriver launchBrowser() {
		
		// set the chrome driver properties
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		//create a chrome driver object and launch  the chrome browser
		driver = new ChromeDriver();
		
		// manage some properties of the window exp max ...
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		// this is implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//take us to the web site
		driver.get("http://techfios.com/ibilling/?ng=admin/");
		
		
		// return the driver to the test class
		return driver;
		
	}
	
	
	// close the browser in the end of our test 
	public static void tearDown() {
		
		driver.close();
		driver.quit();
		
		
	}

}
