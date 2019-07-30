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
	
	
	@Test(priority = 1, description = Testcase.TC89)
	public void ThisWeekDataVerify() {
		
		SuccessPlan plan = new SuccessPlan();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	
	@Test(groups = {"smoke", "regression"}, priority = 3, description = Testcase.TC90)
	public void ActivityCompleted() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.ReadLink();
		
		ReadInstructions read = new ReadInstructions();
		Assert.assertTrue(read.InstructionDataVal());
		read.MarkActivityCompleted();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	@Test(priority = 2, description = Testcase.TC92)
	public void InstructionsData() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.ReadLink();
		
		ReadInstructions read = new ReadInstructions();
		Assert.assertTrue(read.InstructionDataVal());
	}
	
	@Test(description = Testcase.TC97)
	public void CancelDeleteSuccessPlan() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.CancelDeletePlan();
		Assert.assertTrue(plan.ThisWeekVal());
	}
	
	@Test(groups = {"smoke", "regression"}, description = Testcase.TC98)
	public void DeleteSuccessPlan() {
		
		SuccessPlan plan = new SuccessPlan();
		plan.BackBtn();
		MyGardenPage garden = new MyGardenPage();
		garden.AirPlantsProject();
		plan.DeletePlan();
		Assert.assertTrue(garden.MyGardenVal());
	}
	
	@Test(description = Testcase.TC99)
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
