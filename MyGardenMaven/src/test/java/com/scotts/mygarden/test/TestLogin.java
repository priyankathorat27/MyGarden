package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.utility.PropertyFile;


public class TestLogin extends LaunchApp {
	
	@BeforeMethod
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
	}
	
	@Test(priority = 1, description = "MGTC_15: Verify the data when user login with valid credentials ")
	public void ValidLogin() {
		
		HomePage hp = new HomePage();
		hp.loginlink().click();
		
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

}
