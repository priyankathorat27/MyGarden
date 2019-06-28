package com.scotts.mygarden.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.page.MyAccountScreen;
import com.scotts.mygarden.page.MyLawnPage;
import com.scotts.mygarden.page.MyLawnPlayStorePage;
import com.scotts.mygarden.page.PrivacyPolicyPage;
import com.scotts.mygarden.page.TermsPage;
import com.scotts.mygarden.utility.Testcase;

public class TestAccount extends LaunchApp{
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
        AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
		LoginPage login = new LoginPage();
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.AccountTab();
		
	}
		
	
	@Test(description = Testcase.tc115)
	public void MyLawnAppSection() {
		
		MyAccountScreen account = new MyAccountScreen();
		account.MyLawnApp();
		MyLawnPage lawn = new MyLawnPage();
		Assert.assertTrue(lawn.myLawnTitleVal());
		lawn.ExploreInStore();
		MyLawnPlayStorePage store = new MyLawnPlayStorePage();
		Assert.assertTrue(store.AppTitleVal());
	}
	
	@Test(description = Testcase.tc156)
	public void TermsConditionsSection() {
		
		MyAccountScreen account = new MyAccountScreen();
		account.TermsAndConditions();
		TermsPage terms = new TermsPage();
		Assert.assertTrue(terms.TermsVal());
	}
	
	@Test(description = Testcase.tc157)
	public void PrivacyPolicySection() {
		
		MyAccountScreen account = new MyAccountScreen();
		account.PrivacyPolicyLink();
		PrivacyPolicyPage policy = new PrivacyPolicyPage();
		Assert.assertTrue(policy.PrivacyVal());
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.quit();
	}

}
