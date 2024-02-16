package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.RegisterPage;
import util.TestUtil;

public class RegisterTest extends TestBase {

	public WebDriver driver;
	HomePage hp;
	RegisterPage rp;

		
		@BeforeMethod
		public void setup_broswer() {
			driver =select_browser_launch_url(prop.getProperty("browser"));
			driver.get(prop.getProperty("url"));
			hp= new HomePage(driver);
			hp.click_myaccount();
			hp.select_Registerlink();
		}
		
		@Test
		public void enter_new_user_data() {
			rp = new RegisterPage(driver);
			rp.enter_new_user_info("ffname", "llname", "tttt33@gmail.com"+TestUtil.generate_timestamp(), "342222", "test44", "test44");
			String new_user_reg_page_title="Your Account Has Been Created!";
			String actual_page_title =rp.getRegisterPagetitle();

			Assert.assertEquals(actual_page_title, new_user_reg_page_title);
		}
			
}
