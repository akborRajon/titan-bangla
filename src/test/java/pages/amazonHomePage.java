package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomePage {
 
	
	WebDriver driver;
	
	public amazonHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signInButton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton ;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password ;
	
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signinbutton ;
	
	
	public void clickOnSignButtonInHomePage() {
		signInButton.click();
	}
	
	public void enterEmailAdress(String email) {
		emailAddress.sendKeys("rajon8082@gmail.com");
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public void enterPassword(String pasword) {
		password.sendKeys("Raz781622");
	}
	public void clickOnsSignInButton() {
		signinbutton.click();
	}
}


