package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']") WebElement filter;
	@FindBy(xpath="//option[@value='lohi']") WebElement select;
	
	public void Filters() throws InterruptedException {
		filter.click();
		Thread.sleep(2000);
		
	}
	public void Filter_Select() throws Exception {
		select.click();
		Thread.sleep(2000);
		
	}

}
