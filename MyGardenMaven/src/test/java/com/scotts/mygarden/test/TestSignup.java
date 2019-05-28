package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.SignupPage;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.GrowingInterests;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.MyAccountScreen;
import com.scotts.mygarden.page.Zipcode;
import com.scotts.mygarden.utility.PropertyFile;

import io.appium.java_client.MobileBy;


public class TestSignup extends LaunchApp {
	
	
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
		
	}  */
	
	@Test(priority = 1, description = "MGTC_9: Verify the signup functionality")
	public void ValidSignUp() {
		
		//Signup Page
		SignupPage gus = new SignupPage();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		gus.inputemail().sendKeys(PropertyFile.proReader("signupEmail"));
		gus.inputpassword().sendKeys("Test12!@");
		gus.inputconfirmpassword().sendKeys("Test12!@");
		driver.hideKeyboard();
		gus.createaccountbtn().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Zipcode Page
		Zipcode zp = new Zipcode();
		WebElement zipcode = zp.ziptext();
		Assert.assertTrue(zipcode.isDisplayed(), "User is not redirected to zipcode field. Testcase is failed");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		zp.ziptext().sendKeys("10011");
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		zp.nextbtn().click();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Growing Interests Page
		GrowingInterests gi = new GrowingInterests();
		gi.skipbtn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explorer Page
		ExplorerScreen es = new ExplorerScreen();
		es.myaccount().click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//My Account Page
		MyAccountScreen mas = new MyAccountScreen();
		WebElement logout = mas.logoutbtn();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logout.click();
		
		//Home Page
		HomePage hp = new HomePage();
		WebElement getstarted = hp.GetStarted();
		Assert.assertTrue(getstarted.isDisplayed(), "User is not redirected to home page. Testcase is failed");
	}
	
	
/*	@AfterMethod
	public void TearDrop() {
		
		driver.close();
		//driver.quit();
		//driver.resetApp();
	}  */
	

}
