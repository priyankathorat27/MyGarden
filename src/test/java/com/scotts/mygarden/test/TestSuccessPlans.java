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
import com.scotts.mygarden.page.MyGardenPage;
import com.scotts.mygarden.page.ReadInstructions;
import com.scotts.mygarden.page.SuccessPlan;
import com.scotts.mygarden.utility.Testcase;

public class TestSuccessPlans extends LaunchApp {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
        AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
		LoginPage login = new LoginPage();
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.GardenTab();
		
		MyGardenPage garden = new MyGardenPage();
		garden.ThisWeekData();
	}
	
	
	@Test(description = Testcase.tc89)
	public void ThisWeekDataVerify() {
		
		SuccessPlan plan = new SuccessPlan();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	@Test(description = Testcase.tc90)
	public void ActivityCompleted() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.ReadLink();
		
		ReadInstructions read = new ReadInstructions();
		Assert.assertTrue(read.InstructionDataVal());
		read.MarkActivityCompleted();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	@Test(description = Testcase.tc92)
	public void InstructionsData() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.ReadLink();
		
		ReadInstructions read = new ReadInstructions();
		Assert.assertTrue(read.InstructionDataVal());
	}
	
	@Test(description = Testcase.tc97)
	public void CancelDeleteSuccessPlan() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.CancelDeletePlan();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	@Test(description = Testcase.tc98)
	public void DeleteSuccessPlan() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.DeletePlan();
		MyGardenPage garden = new MyGardenPage();
		Assert.assertTrue(garden.MyGardenVal());
	}
	
	@Test(description = Testcase.tc99)
	public void AllActivitesData() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.AllActivites();
		Assert.assertTrue(plan.AllActivitiesVal());
	}

	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.quit();
	}

}
