package com.qa.saucedemo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class LoginPage extends BaseClass{
public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@name='user-name']") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement lngbutn;
	@FindBy(xpath = "/html/body/div[2]/div[1]/img")WebElement logo;
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateImage() {
		return logo.isDisplayed();
	}
	
	public void login(String un,String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		lngbutn.click();
	}
	

}
