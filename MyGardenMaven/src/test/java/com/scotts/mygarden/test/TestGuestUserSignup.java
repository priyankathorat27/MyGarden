package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.GrowingInterests;
import com.scotts.mygarden.page.SignupPage;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.Zipcode;


public class TestGuestUserSignup extends LaunchApp {
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		System.out.println("Started Server");
		AppInitialize();
		
		HomePage hp = new HomePage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.GetStarted().click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
/*	@Test(description = "MGTC_9: Verify the functionality when user clicks on Continue as Guest link")
	public void GuestUserLink() {
		
		SignupPage gus = new SignupPage();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		gus.guestUser().click();
		
		Zipcode zp = new Zipcode();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement zipcode = zp.ziptext();
		Assert.assertTrue(zipcode.isDisplayed(), "User is not redirected to zipcode field. Testcase is failed");
		
	} */
	
	@Test(priority = 1, description = "MGTC_9: Verify the signup functionality")
	public void ValidSignUp() {
		
		SignupPage gus = new SignupPage();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		gus.inputemail().sendKeys("priyankat@test.com");
		gus.inputpassword().sendKeys("Test12!@");
		gus.inputconfirmpassword().sendKeys("Test12!@");
		gus.createaccountbtn().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Zipcode zp = new Zipcode();
		WebElement zipcode = zp.ziptext();
		Assert.assertTrue(zipcode.isDisplayed(), "User is not redirected to zipcode field. Testcase is failed");
	}
	

}
