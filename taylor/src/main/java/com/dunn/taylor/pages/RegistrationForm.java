package com.dunn.taylor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dunn.taylor.lib.GenericLib;

public class RegistrationForm {
	WebDriver driver;
	
	@FindBy(xpath= "//input[@id='continueBrokerSignIn_m735broker_bkrloginemail']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continueBrokerSignIn_c_bkrloginemail']")
	private WebElement Confirm_email;
	
	@FindBy(xpath="//input[@id='mypassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='c_password']")
	private WebElement Confirm_password;
	
	@FindBy(xpath="//input[@type='submit' and @value='Continue']")
	private WebElement Continue;

	public  RegistrationForm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void form(String mail , String confirm_email,String passwd, String confirm_pswd)
	{
		
		GenericLib.enterText(driver, email, mail, "Email Text box");
		GenericLib.enterText(driver, Confirm_email, confirm_email, "confirm_email text box");
		GenericLib.enterText(driver, password, passwd, "Password text box ");
		GenericLib.enterText(driver, Confirm_password, confirm_pswd, "Confirm_password Text Box");
		GenericLib.clickElement(driver, Continue, "Continue Button");
	}
}
