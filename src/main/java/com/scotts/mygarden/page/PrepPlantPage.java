package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrepPlantPage extends LaunchApp{
	
	public PrepPlantPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement prepCloseBtn;
	
	
	
	public PrepPlantPage PrepAndPlant() {
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"8. Water at the base.\"));"));
		return new PrepPlantPage();
	}
	
	public boolean PrepCloseBtnVal() {
		
		return PrepPlantPage.prepCloseBtn.isDisplayed();
	}
	
	public PlantDetails PrepClose() {
		
		PrepPlantPage.prepCloseBtn.click();
		return new PlantDetails();
	}

}
