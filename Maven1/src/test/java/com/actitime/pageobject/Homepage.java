package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "//a[contains(@class,'content reports')]")
	private WebElement reportmodule;
	@FindBy(xpath = "//div[contains(@class,'graphicButton createChart button')]")
	private WebElement createchart;
	@FindBy(xpath ="//span[contains(@id,'ext-gen246')]" )
	private WebElement Allstaffdropdown;
	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void aCtiononpage() {
		this.reportmodule.click();
		this.createchart.click();
		this.Allstaffdropdown.click();
	}
	

}
