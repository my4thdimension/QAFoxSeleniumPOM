package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	WebDriver driver ;
	String browser_name ;
	public Properties prop;
	
	public TestBase() {
		
		prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		}
		catch(Exception io){
			io.printStackTrace();
		}
	}

	public WebDriver select_browser_launch_url(String browsername) {
	System.out.println("am in the before method" +browsername);
		browser_name = browsername;
		
		if (browser_name.equals("chrome")) 
		{
		driver =new ChromeDriver();
		}
		
		else if(browser_name.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(prop.getProperty("url"));
	return driver;
	}
	@AfterMethod
	public void quit_browser() {
		driver.quit();
		
	}

}
