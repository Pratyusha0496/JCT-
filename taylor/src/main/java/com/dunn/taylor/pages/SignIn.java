package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class SignIn {
	
WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usrname;
	
	@FindBy(id = "brokerLogin_passwd")
	private WebElement psw;
	
	@FindBy(id = "brokerLogin_submit")
	private WebElement loginBtn;
	
	public SignIn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password)
	{
		GenericLib.enterText(driver, usrname, username, "Username TextBox");
		GenericLib.enterText(driver, psw, password, "password TextBox");
		GenericLib.clickElement(driver, loginBtn, "Login Btn");
	}
	
	public String getSignInPage()
	{
		return driver.getTitle();
	}


}
