package com.scotts.mygarden.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ContinueFbPage;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.FbPage;
import com.scotts.mygarden.page.GooglePage;
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
	
	@Test(groups = {"smoke", "regression"}, priority = 1, description = Testcase.TC15)
	public void ValidLoginTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		//Explorer Page
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());
	}  
	
	@Test(priority = 2, description = Testcase.TC16)
	public void InvalidEmailValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("InvalidEmail"), proReader("loginPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 3, description = Testcase.TC17)
	public void ValidEmailinValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("loginEmail"), proReader("InvalidPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 4, description = Testcase.TC18)
	public void InvalidEmailInvalidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("InvalidEmail"), proReader("InvalidPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 5, description = Testcase.TC19)
	public void BlankEmailValidPwdTC() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData("", proReader("loginPassword"));
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(priority = 6, description = Testcase.TC20)
	public void ValidEmailBlankPwd() {
		
		//Login Page
		LoginPage login = new LoginPage();
		Assert.assertTrue(login.LoginValidation());
		login.InvalidData(proReader("loginEmail"), "");
		
		Assert.assertTrue(login.ValidationForgotPwd());
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1, description = Testcase.TC154)
	public void SocialFbLogin() {
		
		LoginPage login = new LoginPage();
		login.FbBtn();
		FbPage fb = new FbPage();
		fb.fbLogin(proReader("FbEmail"), proReader("FbPassword"));
		ContinueFbPage confb = new ContinueFbPage();
		Assert.assertTrue(confb.FbVal());
		confb.ContinueFbLogin();
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1, description = Testcase.TC155)
	public void SocialGoogleLogin() {
		
		LoginPage login = new LoginPage();
		login.GoogleBtn();
		GooglePage google = new GooglePage();
		Assert.assertTrue(google.GoogleVal());
		google.GoogleLogin();
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());
	}

	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.quit();
	}

}
