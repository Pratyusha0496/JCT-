package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class Logout {
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	private WebElement logout ; 
	

	public  Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public void out()
	{
		GenericLib.clickElement(driver, logout , "Clicked on logout button");
	}

	
}
