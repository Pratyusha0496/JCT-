package com.dunn.taylor.sripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dunn.taylor.init.Iconstants;
import com.dunn.taylor.lib.Baselib;
import com.dunn.taylor.lib.ExcelLib;
import com.dunn.taylor.pages.LoginCode;
import com.dunn.taylor.pages.SignIn;
import com.dunn.taylor.pages.SubmitApplication;

public class SubApplication extends Baselib {
	@Test
	public void tc_02() throws InterruptedException
	{
		
	
	SignIn sip = new SignIn(driver);
		String un = ExcelLib.getData("Sheet1",1,1,Iconstants.DataexcelPath);
		String pw = ExcelLib.getData("Sheet1",1,2,Iconstants.DataexcelPath);
		Thread.sleep(9);
		sip.doLogin(un, pw);
		Thread.sleep(9);
	
	LoginCode lc = new LoginCode(driver);
	Thread.sleep(5000);
	lc.submit();
	Thread.sleep(5000);
	lc.gotodashboard();
	
	SubmitApplication SA = new SubmitApplication(driver);
	System.out.println("Hello");
	SA.sub_app();
	Thread.sleep(6000);
	
	}
}
