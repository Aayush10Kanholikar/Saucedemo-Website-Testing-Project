package com.qa.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class CartPage extends ProductListingPage  {
public  WebDriver driver;
	
	public CartPage(WebDriver driver) throws IOException{
		super(driver);
		this.driver = driver;
	}

}