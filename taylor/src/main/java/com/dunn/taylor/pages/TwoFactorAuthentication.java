package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class TwoFactorAuthentication {
WebDriver driver;
	
	@FindBy(xpath= "//input[@value='Send Code']")
	private WebElement sendcode;
	 	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit_code;
	
	@FindBy(id = "continueButton")
	private WebElement continue_button;
	
	public TwoFactorAuthentication(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void code()
	{
		GenericLib.clickElement(driver, sendcode, "Send Code Button");
	}
	
	public void submit()
	{
		GenericLib.clickElement(driver, submit_code, "submit_code button");
	}
	
	public void con()
	{
		GenericLib.clickElement(driver, continue_button, "Continue button");
	}
}
