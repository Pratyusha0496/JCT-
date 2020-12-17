package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class RegisterAgency {
WebDriver driver;
	
	@FindBy(id = "registrationWelcome_label_button_register_agency")
	private WebElement register;
	
	@FindBy(xpath = "//div[@id=\"content\"]/div[1]/div[2]/div[1]/a/div/div/img")
	private WebElement NewbrokerAgent;
	
	@FindBy(xpath="//div[@class='registration-option']/descendant::input[@type='radio']")
	private WebElement NewAgency;
	
	@FindBy(xpath="//input[@id='new' and @type='submit']")
	private WebElement RegisterAgency;
	
	
	public  RegisterAgency(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void clickonAgency()
	{
		GenericLib.clickElement(driver, register, " Registration Btn");
	}
	
	public void NewRegistration()
	{
		GenericLib.clickElement(driver, NewbrokerAgent, "NewBrowkerRegistration");
	}
	
	public void NewAgency()
	{
		Actions acti = new Actions(driver);
		acti.moveToElement(NewAgency).click().perform();
		//GenericLib.clickElement(driver, NewAgency, "NewAgencyRegistration");
	}
	
	public void RegisteryorAgency()
	{
		GenericLib.clickElement(driver, RegisterAgency, "Register Your Agency");
	}

	
	
}
