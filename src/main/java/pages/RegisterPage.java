package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage {
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-email")
	WebElement emailid;
	
	
	@FindBy(id="input-password")
	WebElement password;
	
	
	@FindBy(id="input-confirm")
	WebElement pwd_confirm;
	
	@FindBy(name="agree")
	WebElement chkbox_agree;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnclick;

public RegisterPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public void enter_new_user_info(String fname, String lname, String email, String tel, String pwd, String conf_pwd) {

	firstname.sendKeys(fname);

	lastname.sendKeys(lname);

	emailid.sendKeys(email);

	password.sendKeys(pwd);

	pwd_confirm.sendKeys(conf_pwd);

	telephone.sendKeys(tel);
	chkbox_agree.click();
	btnclick.click();
	
}

public String getRegisterPagetitle() {
	return driver.getTitle();
}



}
