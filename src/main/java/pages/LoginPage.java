package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	@FindBy(id="input-email")
	private WebElement email_id;
	
	@FindBy(id="input-password")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement invalidLoginMsg;

	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enter_user_info(String user_email, String password) {
		
		email_id.sendKeys(user_email);
		pwd.sendKeys(password);
		btnLogin.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getInvaliddataMsg() {
		return invalidLoginMsg.getText();
	}
}
