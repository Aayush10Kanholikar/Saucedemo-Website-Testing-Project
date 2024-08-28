package com.qa.saucedemo.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage extends LoginPage{
	
	public  WebDriver driver;
	
	public ProductListingPage(WebDriver driver) throws IOException{
		super();
		this.driver = driver;
	}
	
	//locators of product listing page
	@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")public WebElement title;
	@FindBy(className = "inventory_details_name")public WebElement producttitle;
	@FindBy(id = "shopping_cart_container" )public WebElement shopping_cart;
	@FindBy(className="subheader")public WebElement cartpagetitle;
	@FindBy(xpath="//*[@id=\"item_4_img_link\"]/img") public WebElement productImage;
	@FindBy(className="inventory_details_img") public WebElement cartProductImage;
	@FindBy(xpath="//button[text()='<- Back']") WebElement product_back;
	@FindBy(xpath="//a[@class='btn_secondary']") public WebElement Shop_continue;
	
	public void clickonProductTitle() throws IOException, InterruptedException {
	
		title.click();
		Thread.sleep(2000);
		product_back.click();
		
	}
	
	public String validateProductListingPageTitle () {
		return producttitle.getText();
		
	}
	
	public void clickonShoppingCart() {
		shopping_cart.click();
	}
	
	public String validateYourCartPageTitle () {
		return cartpagetitle.getText();
		
	}
	
	public void clickonProductImage() {
		productImage.click();
		
	}
	
	public String validateExpectedImageSrc() {
		return productImage.getAttribute("src");
	}
	
	public String validateActualImageSrc() {
		return cartProductImage.getAttribute("src");
	}
	public void continueshopping() {
		Shop_continue.click();
		
	}

}
