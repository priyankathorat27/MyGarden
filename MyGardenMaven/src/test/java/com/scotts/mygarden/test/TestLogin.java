package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.utility.PropertyFile;


public class TestLogin extends LaunchApp {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp = new HomePage();
		hp.loginlink().click();
		
	}
	
	@Test(priority = 1, groups = {"login"}, description = "MGTC_15: Verify the data when user login with valid credentials")
	public void ValidLogin() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("loginEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("loginPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explorer Page
		ExplorerScreen es = new ExplorerScreen();
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}  
	
	@Test(priority = 2, description = "MGTC_16: Verify the data when user login with invalid email address and valid password")
	public void ValidEmailInvalidPwd() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("InvalidEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("loginPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		WebElement forgotpwd = lp.forgotpasswordlink();
		Assert.assertTrue(forgotpwd.isDisplayed(), "User is able to login with invalid credentials. Test case failed");
	}
	
	@Test(priority = 3, description = "MGTC_17: Verify the data when user login with valid email address and invalid password")
	public void InvalidEmailValidPwd() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("loginEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("InvalidPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		WebElement forgotpwd = lp.forgotpasswordlink();
		Assert.assertTrue(forgotpwd.isDisplayed(), "User is able to login with invalid credentials. Test case failed");
	}
	
	@Test(priority = 4, description = "MGTC_18: Verify the data when user login with invalid email address and invalid password")
	public void InvalidEmailInvalidPwd() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("InvalidEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("InvalidPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		WebElement forgotpwd = lp.forgotpasswordlink();
		Assert.assertTrue(forgotpwd.isDisplayed(), "User is able to login with invalid credentials. Test case failed");
	}
	
	@Test(priority = 5, description = "MGTC_19: Verify the data when  user login with blank email address and valid password")
	public void BlankEmailValidPwd() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys("");
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("loginPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		WebElement forgotpwd = lp.forgotpasswordlink();
		Assert.assertTrue(forgotpwd.isDisplayed(), "User is able to login with invalid credentials. Test case failed");
	}
	
	@Test(priority = 6, description = "MGTC_20: Verify the data when user login with valid email address and blank password ")
	public void ValidEmailBlankPwd() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("loginEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys("");
		driver.hideKeyboard();
		lp.loginbtn().click();
		
		WebElement forgotpwd = lp.forgotpasswordlink();
		Assert.assertTrue(forgotpwd.isDisplayed(), "User is able to login with invalid credentials. Test case failed");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.resetApp();
	}

}
