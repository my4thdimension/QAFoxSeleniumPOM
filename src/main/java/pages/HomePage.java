package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	//objects
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText="Login")
	private WebElement LoginLink;
	
	@FindBy(linkText="Register")
	private WebElement RegisterLink;
	
	public HomePage(WebDriver driver) {
	
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//actions
	public void click_myaccount() {
		myAccountLink.click();
	}
	
	public void select_loginlink() {
		LoginLink.click();
	}
	
	public void select_Registerlink() {
		RegisterLink.click();
	}

}
