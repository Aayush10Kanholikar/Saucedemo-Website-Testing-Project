package com.qa.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class LogoutPage extends BaseClass{
	
	public LogoutPage() throws IOException {
        PageFactory.initElements(driver, this);
    }
	@FindBy(xpath = "//div[@class='bm-burger-button']")
    WebElement button;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;


    public void logout() {
    	button.click();
    	logoutLink.click();
    	
    	
    }

}