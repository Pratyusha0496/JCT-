package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class LoginCode {
	WebDriver driver;
	
	@FindBy(name = "verifyCodeButton")
	private WebElement codebtn;
	
	@FindBy(id = "dashboardButton")
	private WebElement dashboardbtn;
	
	public  LoginCode(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public void submit()
	{
		GenericLib.clickElement(driver, codebtn, " Submit Btn");
	}
	
	public void gotodashboard()
	{
		GenericLib.clickElement(driver, dashboardbtn, " Dashboard Button");
	}

}
