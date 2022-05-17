package com.actitime.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.properties.ReadConfig;

public class LoginPage extends BaseClass{
	
	public WebDriver driver;

	@FindBy(xpath = "//input[contains(@name,'username')]")
	private WebElement username;
	@ FindBy(xpath = "//input[contains(@name,'pwd')]")
	private WebElement password;
	@FindBy(partialLinkText ="Login ")
	private WebElement loginButton;
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setData() {
		this.username.sendKeys(usernamedata);
		this.password.sendKeys(passworddata,Keys.ENTER);
		//this.loginButton.click();
		
	}

}
