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
import com.scotts.mygarden.utility.Testcase;

public class TestExplorer extends LaunchApp {
	
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
		//Login Page
		LoginPage login = new LoginPage();
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
	}
	
	
	@Test(groups = {"smoke"}, description = Testcase.TC46)
	public void Edibles() {
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.EdiblesPage();
		Assert.assertTrue(explorer.browseValidation());
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC150)
	public void Decoratives() {
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.DecorativesPage();
		Assert.assertTrue(explorer.browseValidation());
		
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC151)
	public void Pests() {
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.PestsPage();
		Assert.assertTrue(explorer.browseValidation());
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC152)
	public void Weeds() {
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.WeedsPage();
		Assert.assertTrue(explorer.browseValidation());
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC153)
	public void Diseases() {
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.DiseasesPage();
		Assert.assertTrue(explorer.browseValidation());
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.resetApp();
	}  

}
