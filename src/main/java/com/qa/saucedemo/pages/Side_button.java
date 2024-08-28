package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class Side_button extends BaseClass {
	
	public Side_button() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='bm-burger-button']")  WebElement side_menu_bar;
	@FindBy(xpath="//button[text()='Close Menu']") WebElement cross_button;
	
	public void sidebtn() throws InterruptedException {
		side_menu_bar.click();
		Thread.sleep(2000);
	}
	public void crossbtn() throws InterruptedException {
		cross_button.click();
		Thread.sleep(2000);
	}

}