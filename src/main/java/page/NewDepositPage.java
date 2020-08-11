package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewDepositPage extends BasePage {

	WebDriver driver;

	public NewDepositPage(WebDriver driver) {
		this.driver = driver;
	}

	// elt lib



	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/a/span[1]")
	WebElement TRANSACTION_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")
	WebElement NEW_DEPOSIT_BUTTON_LOCATOR;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACOUNT_DROPDOWN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DISCRIPTION_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"amount\"]")
	WebElement AMOUT_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_BUTTON_LOCATOR;

	// Methods to interact with the elements



	public void clickTransationButton() {
		TRANSACTION_BUTTON_LOCATOR.click();
	}

	public void clickNewDepositButton() {
		NEW_DEPOSIT_BUTTON_LOCATOR.click();
	}

	public void insertAcount( ) {
		Select sel = new Select(ACOUNT_DROPDOWN_LOCATOR);	
		sel.selectByVisibleText("Mean680");
}

	public void insertDescription(String description) {
		
		BasePage.waitForElement(DISCRIPTION_FIELD_LOCATOR, driver);	

		DISCRIPTION_FIELD_LOCATOR.sendKeys(description);
	}
	public void insertAmount(String amount) {
		AMOUT_FIELD_LOCATOR.sendKeys(amount);
	}

	public void clickSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
	}

}
