package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	// not working yet
	By homePageUserName = By.xpath("//table//tr[@class='heading3']");
	//By homePageUserName = By.className("barone");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// get the username from Home Page
	public String getHomePageDashboardUserName() {
		return driver.findElement(homePageUserName).getText();
	}
	
}
