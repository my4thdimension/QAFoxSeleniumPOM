package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends TestBase{
	
	public WebDriver driver;
	HomePage hp;
	SearchPage sp;
	
	public SearchTest() {
		super();
	}
	
	@BeforeMethod
	public void setup_browser() {
		System.out.println("<<<<<<<-----team member commentsssss-sssfffs--->");
		driver =select_browser_launch_url(prop.getProperty("browser"));
		 hp = new HomePage(driver);
			
	}
	
	@Test
	public void search_product() {
		 sp= new SearchPage(driver);
		 boolean searchedresult= sp.search_product("iphone");
		 Assert.assertEquals(searchedresult, true);
	}
	
	

}
