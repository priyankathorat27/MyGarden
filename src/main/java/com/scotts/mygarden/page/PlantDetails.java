package com.scotts.mygarden.page;


import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlantDetails extends LaunchApp{
	
	public PlantDetails() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Bee Balm')]")
	private static AndroidElement starterPlant;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Garden Gloves')]")
	private static AndroidElement gloves;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/non_essentials_group")
	private static AndroidElement SuppliesLink;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'See planting instructions')]")
	private static AndroidElement instructionsLink; 
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/video_image")
	private static AndroidElement video;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_close")
	private static AndroidElement videoCloseBtn;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/start_project_button")
	private static AndroidElement addToMyGardenBtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Aloe vera')]")
	private static AndroidElement header;
	
	@CacheLookup
	@AndroidFindBy(id = "android:id/button1")
	private static AndroidElement okBtn;
	
	
	public PlantDetails WhatYouNeedSection() {
		
    	driver.findElement(MobileBy.AndroidUIAutomator(
  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Garden Gloves\"));"));
		return new PlantDetails();
	}
	
	public boolean headerVal() {
		
		return PlantDetails.header.isDisplayed();
	}
	
	public boolean WhatYouNeedVal() {
		
		return PlantDetails.starterPlant.isDisplayed() || PlantDetails.gloves.isDisplayed();
	}
	
	public SuppliesPage NonEssentialSupplies() {
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Non-Essential Supplies\"));"));
		PlantDetails.SuppliesLink.click();
		return new SuppliesPage();
	}
	
	public PlantDetails PrepVideo() {
		driver.findElement(MobileBy.AndroidUIAutomator(
	  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"See planting instructions\"));"));
		PlantDetails.video.click();
		return new PlantDetails();
	}
	
	public boolean videoDisplay() {
		
		return PlantDetails.videoCloseBtn.isDisplayed();
	}
	
	public PlantDetails PrepVideoClose() {
		
		PlantDetails.videoCloseBtn.click();
		return new PlantDetails();
	}
	
    public boolean PlantingInstructions() {
		
		return PlantDetails.instructionsLink.isDisplayed();
	}
    
    public PrepPlantPage PrepInstructionsLink() {
    	
    	driver.findElement(MobileBy.AndroidUIAutomator(
	  		"new UiScrollable(new UiSelector()).scrollIntoView(text(\"See planting instructions\"));"));
    	PlantDetails.instructionsLink.click();
    	return new PrepPlantPage();
    }
    
    public MyGardenPage AddPlan() {
    	
    	PlantDetails.addToMyGardenBtn.click();
    	return new MyGardenPage();
    }
    
    
    public PlantDetails existingSetupPlan() {
    	
    	PlantDetails.addToMyGardenBtn.click();
    	PlantDetails.okBtn.click();
    	return new PlantDetails();
    	
    	
    }

}
