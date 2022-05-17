package com.actitimeatestcase;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.actitime.pageobject.BaseClass;
import com.actitime.pageobject.LoginPage;

public class TC_LoginTest_01 extends BaseClass{
	
	@Test
	public void testcaseTest() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,10,1000);
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		lp.setData();
		/*if(driver.getTitle().equals("actiitmelogin"))
		{
			assertTrue(true);
		}
		else
		{
			assertTrue(false);
			
		}*/
	}

}
