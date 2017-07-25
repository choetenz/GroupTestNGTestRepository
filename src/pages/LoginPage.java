package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username = By.name("uid");
	By password = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// set username in text box
	public void setUsername(String strUserName) {
		driver.findElement(username).sendKeys(strUserName);
	}
	
	// set password in password textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	
	// click on login page
	public void clickLogin(){
		driver.findElement(login).click();
	}
	
	// get the title of login page
	public String getLoginTitle(){
		return driver.findElement(titleText).getText();
	}
	
	/**
	 * this POM method will be exposed in test case to login the application
	 * @param strUserName
	 * @param strPassword
	 * @return
	 */
	public void loginToGuru99(String strUserName, String strPassword) {
		// fill user name
		this.setUsername(strUserName);
		
		// fill password
		this.setPassword(strPassword);
		
		// click login button
		this.clickLogin();
		
	}
}
