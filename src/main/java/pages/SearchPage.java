package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;
	
	@FindBy(name="search")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;

	@FindBy(linkText="iPhone")
	WebElement searchedElement;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean  search_product(String search_text) {
		searchbox.sendKeys(search_text);
		btnSearch.click();
		return searchedElement.isDisplayed();
	}


}
