package com.dunn.taylor.sripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dunn.taylor.init.Iconstants;
import com.dunn.taylor.lib.Baselib;
import com.dunn.taylor.lib.ExcelLib;
import com.dunn.taylor.pages.LoginCode;
import com.dunn.taylor.pages.Logout;
import com.dunn.taylor.pages.SignIn;

@Listeners(com.dunn.taylor.listners.Mylistners.class)
public class LoginLogout extends Baselib {
	
	 
	
	@Test
	public void tc_02() throws InterruptedException
	{
		
	
		SignIn sip = new SignIn(driver);
		String un = ExcelLib.getData("Sheet1",1,1,Iconstants.DataexcelPath);
		String pw = ExcelLib.getData("Sheet1",1,2,Iconstants.DataexcelPath);
		Thread.sleep(20);
		sip.doLogin(un, pw);
		Thread.sleep(20);
	
	LoginCode lc = new LoginCode(driver);
	Thread.sleep(5000);
	lc.submit();
	Thread.sleep(5000);
	lc.gotodashboard();
	
	Logout log =  new Logout(driver);
	Thread.sleep(5000);
	log.out();

	}
	

}
