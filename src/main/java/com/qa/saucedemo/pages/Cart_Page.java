package com.qa.saucedemo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class Cart_Page extends BaseClass {
	
	public Cart_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='item_5_title_link']") WebElement product_name;
	@FindBy(xpath="//button[text()='ADD TO CART']") WebElement product_cart;
	@FindBy(xpath="//a[@id='item_3_title_link']") WebElement product_name1;
	@FindBy(xpath="//button[text()='<- Back']") WebElement product_back;
	@FindBy(xpath="//button[text()='REMOVE']") WebElement product_remove;
	@FindBy(xpath="//a[@class='btn_action checkout_button']") WebElement Check_out;
	@FindBy(id="first-name") WebElement Name;
	@FindBy(id="last-name") WebElement Last_name;
	@FindBy(id="postal-code") WebElement pincode;
	@FindBy(xpath="//input[@class='btn_primary cart_button']") WebElement con;
	@FindBy(xpath="//a[@class='btn_action cart_button']") WebElement Finish;
	public void Add_products_to_cart() throws InterruptedException {
		product_name.click();
		Thread.sleep(2000);
		product_cart.click();
		Thread.sleep(2000);
		product_back.click();
		Thread.sleep(2000);
		product_name1.click();
		Thread.sleep(2000);
		product_cart.click();
		Thread.sleep(2000);
		product_back.click();
		Thread.sleep(2000);
	}
	public void Open_Item() throws InterruptedException {
		product_name.click();
		Thread.sleep(2000);
		product_back.click();
		Thread.sleep(2000);
		product_name1.click();
		Thread.sleep(2000);
		product_back.click();
		Thread.sleep(2000);
	}
	
	public void Remove_products_from_cart() throws InterruptedException {
		product_remove.click();
		Thread.sleep(2000);
	}
	public void checkout(String nam,String last, String pin) throws InterruptedException {
		Check_out.click();
		Thread.sleep(1000);
		Name.sendKeys(nam);
		Thread.sleep(1000);
		Last_name.sendKeys(last);
		Thread.sleep(1000);
		pincode.sendKeys(pin);
		Thread.sleep(1000);
		con.click();
		Thread.sleep(2000);
	}
	public void order() throws InterruptedException {
		Finish.click();
		Thread.sleep(2000);
		
	}

}

