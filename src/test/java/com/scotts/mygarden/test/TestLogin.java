package com.scotts.mygarden.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.utility.Testcase;


public class TestLogin extends LaunchApp {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
	}
	
	@Test(priority = 1, groups = {"smoke", "regression"}, description = Testcase.tc15)
	public void ValidLoginTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertEquals(driver.getTitle(), login.LoginValidation());
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		//Explorer Page
		Assert.assertTrue(login.ValidationExplorer());
	}  
	
	@Test(priority = 2, description = Testcase.tc16)
	public void InvalidEmailValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("InvalidEmail"), proReader("loginPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 3, description = Testcase.tc17)
	public void ValidEmailinValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("loginEmail"), proReader("InvalidPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 4, description = Testcase.tc18)
	public void InvalidEmailInvalidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("InvalidEmail"), proReader("InvalidPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 5, description = Testcase.tc19)
	public void BlankEmailValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData("", proReader("loginPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 6, description = Testcase.tc20)
	public void ValidEmailBlankPwd() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("loginEmail"), "");
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.quit();
	}

}
