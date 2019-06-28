package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.GrowingInterests;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.SignupPage;
import com.scotts.mygarden.page.Zipcode;
import com.scotts.mygarden.utility.Testcase;


public class TestSignup extends LaunchApp {
	
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		System.out.println("Started Server");
		AppInitialize();
		
		HomePage home = new HomePage();
		home.getStartedbtn();

	}
	
	/*
	@Test(description = Testcase.tc09)
	public void GuestUserLink() {
		
		Assert.assertTrue(SignupPage.SignupValidation());
		SignupPage.VerificationGuestLink();
		Assert.assertTrue(Zipcode.ZipcodeVal());
	
	}
	
	@Test(description = Testcase.tc27)
	public void GuestUserSkipInterest() {
		
		Assert.assertTrue(SignupPage.SignupValidation());
		SignupPage.VerificationGuestLink();
		Assert.assertTrue(Zipcode.ZipcodeVal());
		Zipcode.zipcodeInput(proReader("code"));
		Assert.assertTrue(GrowingInterests.InterestsVal());
		GrowingInterests.skipInterest();
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());		
	} */
	
	@Test(priority = 2, description = Testcase.tc28)
	public void GuestUserInterests() {
		
		Assert.assertTrue(SignupPage.SignupValidation());
		SignupPage.VerificationGuestLink();
		Assert.assertTrue(Zipcode.ZipcodeVal());
		Zipcode.zipcodeInput(proReader("code"));
		Assert.assertTrue(GrowingInterests.InterestsVal());
		GrowingInterests.Select3Interests();
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());
	}
	
	@Test(priority = 1, description = Testcase.tc03)
	public void ValidSignUp() {
		
		SignupPage.ScottsSignup(proReader("signupemail"), proReader("signuppassword"));
		Assert.assertTrue(Zipcode.ZipcodeVal());
		Zipcode.zipcodeInput(proReader("code"));
		Assert.assertTrue(GrowingInterests.InterestsVal());
		GrowingInterests.SelectInterests();
		ExplorerScreen explorer = new ExplorerScreen();
		Assert.assertTrue(explorer.SearchVal());

	}
	
	/*
	@Test(priority = 3, description = Testcase.tc29)
	public void GuestUserSelectLessInterests() {
		
		Assert.assertTrue(SignupPage.SignupValidation());
		SignupPage.VerificationGuestLink();
		Assert.assertTrue(Zipcode.ZipcodeVal());
		Zipcode.zipcodeInput(proReader("code"));
		Assert.assertTrue(GrowingInterests.InterestsVal());
		GrowingInterests.lessthan3Interests();
		Assert.assertFalse(GrowingInterests.ViewPlantBtnVal());
	} 
	
	@Test(description = Testcase.tc149)
	public void InvalidZipcode() {
		
		Assert.assertTrue(SignupPage.SignupValidation());
		SignupPage.VerificationGuestLink();
		Assert.assertTrue(Zipcode.ZipcodeVal());
		Zipcode.invalidZipcodeInput(proReader("invalidCode"));
		Assert.assertTrue(Zipcode.ErrorMsg());
	
	}  
	
	*/
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
	
		driver.quit();
	}  
	

}
