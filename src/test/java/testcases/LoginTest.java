package testcases;




import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class LoginTest extends TestBase {
public WebDriver driver;
LoginPage lp;

public LoginTest() {
	super();
}

@BeforeMethod
public void setup_browser() {
	
	driver =select_browser_launch_url(prop.getProperty("browser"));
	HomePage hp = new HomePage(driver);
	hp.click_myaccount();
	hp.select_loginlink();
}
	@Test(priority=1)
	public void verify_login_valid_credentials() {
		

		lp = new LoginPage(driver);
		lp.enter_user_info("test243@gmail.com", "test23");
		String myaccountpagetitle = lp.getPageTitle();
		System.out.println("myaccountpagetitle"+myaccountpagetitle);
		Assert.assertEquals("My Account", myaccountpagetitle);

		
		
	}
	

	@Test(priority=2)
	public void verify_invalid_credentials() {
		
		lp = new LoginPage(driver);
		lp.enter_user_info("testf243@gmail.com"+TestUtil.generate_timestamp(), "test23");
		String expected_warning_msg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(expected_warning_msg,lp.getInvaliddataMsg() );
		
	}
	

}
