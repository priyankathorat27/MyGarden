package com.scotts.mygarden.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.page.MyGardenPage;
import com.scotts.mygarden.page.PlantDetails;
import com.scotts.mygarden.page.PrepPlantPage;
import com.scotts.mygarden.page.SuppliesPage;
import com.scotts.mygarden.utility.Testcase;

public class TestProjectOverview extends LaunchApp{
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
		LoginPage login = new LoginPage();
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.selectPlan();
	}
	
	@Test(description = Testcase.TC62)
	public void WhatYouNeedSection() {
		
		PlantDetails details = new PlantDetails();
		details.WhatYouNeedSection();
		Assert.assertTrue(details.WhatYouNeedVal());
	}
	
	@Test(description = Testcase.TC63)
	public void Supplies() {
		
		PlantDetails details = new PlantDetails();
		details.NonEssentialSupplies();
		
		SuppliesPage sup = new SuppliesPage();
		Assert.assertTrue(sup.NonEssentials());
	} 
	
	@Test(description = Testcase.TC64)
	public void PrepPlantvideo() {
		
		PlantDetails details = new PlantDetails();
		details.PrepVideo();
		Assert.assertTrue(details.videoDisplay());
		details.PrepVideoClose();
		Assert.assertTrue(details.PlantingInstructions());
	} 
		
	@Test(description = Testcase.TC72)
	public void PrepPlant() {
		
		PlantDetails details = new PlantDetails();
		details.PrepInstructionsLink();
		
		PrepPlantPage prep = new PrepPlantPage();
		prep.PrepAndPlant();
		Assert.assertTrue(prep.PrepCloseBtnVal());
		prep.PrepClose();
	}
	/*
	@Test(description = Testcase.TC77)
	public void NewSetupPlan() {
		
		
		PlantDetails details = new PlantDetails();
		details.AddPlan();
		MyGardenPage garden = new MyGardenPage();
		Assert.assertTrue(garden.MyGardenVal());
	}
	*/

}
