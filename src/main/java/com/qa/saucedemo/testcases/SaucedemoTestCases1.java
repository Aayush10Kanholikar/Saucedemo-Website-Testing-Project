package com.qa.saucedemo.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.Cart_Page;
import com.qa.saucedemo.pages.HomePage;
import com.qa.saucedemo.pages.InvalidLoginPage;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.LogoutPage;
import com.qa.saucedemo.pages.ProductListingPage;
import com.qa.saucedemo.pages.Side_button;
import com.qa.saucedemo.utils.Capture_Screenshots;

public class SaucedemoTestCases1 extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	Capture_Screenshots SS;
	HomePage hp;
	Side_button sb;
	ProductListingPage plp;
	LogoutPage lop;
	Cart_Page cp;
	InvalidLoginPage ilp;
	
	public SaucedemoTestCases1() {
		super();
	}
	@BeforeTest
	public void setup() throws Exception {
		intitialization();
		lp=new LoginPage();
		SS = new Capture_Screenshots();
		hp=new HomePage();
		sb=new Side_button();
		plp = new ProductListingPage(driver);
		cp=new Cart_Page();
		lop=new LogoutPage();
		ilp=new InvalidLoginPage();
		
	}
	@Test (priority=1)
	public void loginPageTitle() {
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test (priority=2)
	public void logoImageTest() {
		boolean flag = lp.validateImage();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		lp.login(props.getProperty("username"),props.getProperty("password"));
		Thread.sleep(2000);
		SS.Capture("LoginTC");
		
	}
	@Test(priority=4)
	public void FilterTest() throws Exception {
		hp.Filters();
		Thread.sleep(2000);
		SS.Capture("FilterTC");
		hp.Filter_Select();
		Thread.sleep(2000);
		SS.Capture("Filter_selectTC");
		
	}
	@Test(priority=5)
	public void SidebtnTest() throws Exception {
		sb.sidebtn();
		Thread.sleep(2000);
		SS.Capture("sidebtn_TC");
		sb.crossbtn();
		Thread.sleep(2000);
		SS.Capture("crossbtn_TC");
	}
	@Test(priority=6)
	public void productDetailPage() throws Exception, InterruptedException {
		plp.clickonProductTitle();
		Thread.sleep(2000);
		SS.Capture("productDetail_TC");
		
	}
	
	@Test(priority=7)
	public void productPage() throws Exception {
		
        final String ExpectedSRC = plp.validateExpectedImageSrc();
		
		Thread.sleep(2000);
		plp.clickonProductImage();
		Thread.sleep(2000);
		String ActualSRC = plp.validateActualImageSrc();
		
        if(ExpectedSRC.equals(ActualSRC)) {
        	
			SS.Capture("Imageclick");
		}
		else {
			System.out.println("Test case is failed");
		}
		
	}
	@Test(priority=8)
	public void CartTest() throws Exception {
		plp.clickonShoppingCart();
		Thread.sleep(2000);
	}
	@Test(priority=9)
public void validateCartPage() throws IOException, InterruptedException {
		
		String Actual_Title= plp.validateYourCartPageTitle();
		Thread.sleep(2000);
		
		String Expected_Title = "Your Cart";
		if(Expected_Title.equals(Actual_Title)) {
			
			System.out.println("Test case is passed");
			SS.Capture("Cart");
			System.out.println("Screenshot Captured Successfully");
		}
		else {
			System.out.println("Test case is failed");
		}
		Assert.assertEquals(Actual_Title, Expected_Title);
		Thread.sleep(1000);
		plp.continueshopping();
		Thread.sleep(2000);
		
		
	}
	@Test(priority=10)
	public void cartpageTest() throws Exception {
		cp.Add_products_to_cart();
		Thread.sleep(2000);
		plp.clickonShoppingCart();
		Thread.sleep(2000);
		SS.Capture("Products_on_cart");
		cp.Open_Item();
		Thread.sleep(2000);
		cp.Remove_products_from_cart();
		Thread.sleep(2000);
		SS.Capture("Remove_Products");
		Thread.sleep(2000);			
	}
	@Test(priority=11)
	public void OrderProducts() throws Exception {
		cp.checkout(props.getProperty("firstname"),props.getProperty("lastname"),props.getProperty("pin"));
		Thread.sleep(2000);
		SS.Capture("Overview");	
		
	}
	@Test(priority=12)
	public void orderFinish() throws Exception {
		cp.order();
		Thread.sleep(2000);
		SS.Capture("OrderItems");	
	}
	@Test(priority=13)
	public void LogoutTest() throws Exception {
		lop.logout();
		Thread.sleep(2000);
		SS.Capture("LogoutTC");
		
	}
	@Test(priority=14)
	public void InavlidTest() throws InterruptedException {
		ilp.Invalidlogin(props.getProperty("Wronguser"), props.getProperty("Wrongpass"));
		Thread.sleep(2000);
		SS.Capture("InvalidLoginTC");
	}
@AfterSuite
	
	public void tearDown() {
		close();
	}
	
	
	


}
