package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.Assertion;
import page.BasePage;
public class LoginSteps extends BasePage {

WebDriver driver;
LoginPage loginpage;
DashBoardPage dashboardPage;
String username = "demotechfios.com";
String password = "abc123";

@Before
public void runFirst() {
	
	driver = BrowserFactory.launchBrowser();
	loginpage = PageFactory.initElements(driver, LoginPage.class);
	dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
	
}

	@Given("^i am on techfios site$")
	public void i_am_on_techfios_site() throws Throwable {
		

	}

	@When("^i enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassword("abc123");

	}

	@When("^i click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		loginpage.clinkSignButton();
		Thread.sleep(2000);
		screenShot(driver, "C:\\screenshot\\screen.jpg");

		throw new PendingException();


	}

	@Then("^Dashboard page should diplay$")
	public void dashboard_page_should_diplay() throws Throwable {
	  
		String expected = "Dashboard- iBilling";
		Assertion.equals("wrong page!", dashboardPage.getPageTitle(), expected);

	}
	


@When("^user logs in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_logs_in_with_valid_and(String arg1, String arg2) throws Throwable {
	loginpage.enterUserName(username);
	loginpage.enterPassword(password);
	Thread.sleep(3000);

}

@Then("^Dashboard page should display$")
public void dashboard_page_should_display() throws Throwable {

	loginpage.clinkSignButton();
	screenShot(driver, "C:\\screenshot\\screen.jpg");

	new PendingException();
}



	@After
	public void afterRun() throws InterruptedException {
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}


}
