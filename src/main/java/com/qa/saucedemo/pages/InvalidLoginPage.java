package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class InvalidLoginPage extends BaseClass {
public InvalidLoginPage() {
		
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//*[@name='user-name']") WebElement username;
@FindBy(id="password") WebElement password;
@FindBy(id="login-button") WebElement lngbutn;

public void Invalidlogin(String un,String pass) {
	username.sendKeys(un);
	password.sendKeys(pass);
	lngbutn.click();
}
}
