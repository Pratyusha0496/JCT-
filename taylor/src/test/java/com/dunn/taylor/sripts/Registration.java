package com.dunn.taylor.sripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dunn.taylor.init.Iconstants;
import com.dunn.taylor.lib.Baselib;
import com.dunn.taylor.lib.ExcelLib;
import com.dunn.taylor.lib.GenericLib;
import com.dunn.taylor.pages.LoginCode;
import com.dunn.taylor.pages.Logout;
import com.dunn.taylor.pages.RegisterAgency;
import com.dunn.taylor.pages.RegistrationForm;
import com.dunn.taylor.pages.SignIn;

@Listeners(com.dunn.taylor.listners.Mylistners.class)
public class Registration  extends Baselib {
	
	 
	
	@Test
	public void registration() throws InterruptedException
	{
		

	
	RegisterAgency RA = new RegisterAgency(driver);
	RA.clickonAgency();
	RA.NewRegistration();
	//Thread.sleep(5000);
	RA.NewAgency();
	Thread.sleep(5000);
	RA.RegisteryorAgency();
	
	RegistrationForm RF = new RegistrationForm(driver);
	String e_mail = ExcelLib.getData("sheet1", 1, 0,Iconstants.RegistrationPath);
	String c_mail = ExcelLib.getData("sheet1", 1, 1,Iconstants.RegistrationPath);
	String psw = ExcelLib.getData("sheet1", 1, 2,Iconstants.RegistrationPath);
	String c_psw = ExcelLib.getData("sheet1", 1, 3,Iconstants.RegistrationPath);
	RF.form(e_mail,c_mail,psw,c_psw);
	Thread.sleep(5000);
	
	
	
	


	}


}
