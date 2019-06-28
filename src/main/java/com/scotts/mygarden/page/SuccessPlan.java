package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SuccessPlan extends LaunchApp{
	
	public SuccessPlan() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/text_action")
	private static AndroidElement readAboutItLink;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Prep & Plant')]")
	private static AndroidElement plant;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Watering')]")
	private static AndroidElement watering;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageView")
	private static AndroidElement menuSuccessPlan;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Delete This Success Plan')]")
	private static AndroidElement deletePlan;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/cancel")
	private static AndroidElement cancelBtn;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/yes")
	private static AndroidElement deleteBtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.support.v7.app.ActionBar$Tab[@index = '1']")
	private static AndroidElement allActivitiesTab;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Completed')]")
	private static AndroidElement completedtask;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Missed')]")
	private static AndroidElement missedtask;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Overdue')]")
	private static AndroidElement overduetask;
	
	
	public boolean ThisWeekVal() {
		
		return SuccessPlan.watering.isDisplayed() || SuccessPlan.plant.isDisplayed();
	}
	
	public ReadInstructions ReadLink() {
		
		SuccessPlan.readAboutItLink.click();
		return new ReadInstructions();
	}
	
	public SuccessPlan CancelDeletePlan() {
		
		SuccessPlan.menuSuccessPlan.click();
		SuccessPlan.deletePlan.click();
		SuccessPlan.cancelBtn.click();
		return new SuccessPlan();
	}
	
    public MyGardenPage DeletePlan() {
		
		SuccessPlan.menuSuccessPlan.click();
		SuccessPlan.deletePlan.click();
		SuccessPlan.deleteBtn.click();
		return new MyGardenPage();
	}
    
    public SuccessPlan AllActivites() {
    	
    	SuccessPlan.allActivitiesTab.click();
    	return new SuccessPlan();
    }
    
    public boolean AllActivitiesVal() {
    	
    	return SuccessPlan.completedtask.isDisplayed() || SuccessPlan.missedtask.isDisplayed() 
    			|| SuccessPlan.overduetask.isDisplayed();
    			
    }

}
