package com.actitimeatestcase;

import org.testng.annotations.Test;

import com.actitime.pageobject.BaseClass;
import com.actitime.pageobject.Homepage;

public class TC_HomePageTest_02 extends BaseClass {
	@ Test
	public void moduleChart() {
		TC_LoginTest_01 tc=new TC_LoginTest_01();
		tc.testcaseTest();
		Homepage hp=new Homepage(driver);
		hp.aCtiononpage();
		
	}

}
