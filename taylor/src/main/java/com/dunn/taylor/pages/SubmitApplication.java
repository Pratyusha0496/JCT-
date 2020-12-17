package com.dunn.taylor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class SubmitApplication {
WebDriver driver;
	
	@FindBy(xpath = "//a[@id='newAppProcessLink']")
	private WebElement submit_application;
	
	public  SubmitApplication(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void sub_app()
	{
	Actions ac = new Actions(driver);
		
		ac.moveToElement(submit_application).click().build().perform();
		//GenericLib.clickElement(driver, submit_application, "Submit_application Button");
		
		
	}
}
