package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.properties.ReadConfig;

public class BaseClass {
	ReadConfig read=new ReadConfig();
	public static WebDriver driver;
	public String usernamedata=read.userName();
	public String passworddata=read.passWord();
	public String baseurl=read.baseUrl();
	@BeforeClass
	public void loadBrowser(
			) {
		
		//if(br.equals("chorme")) {
		System.out.println("load browser");
			System.setProperty("webdriver.chrome.driver", read.chromePath());
			 driver = new ChromeDriver();	
		//}
		//else if(br.equals("edge")) {
		//	System.setProperty("webdriver.edge.driver", read.edgepath());
		//	driver=new EdgeDriver();
		//}
		
	}
	@AfterClass
	public void quitbrowser() {
		driver.quit();
		
	}

}
