package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyGardenPage extends LaunchApp{
	
	public MyGardenPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'My Garden')]")
	private static AndroidElement gardenHeader;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Bee Balm')]")
	private static AndroidElement beeBalmProject;
	
	
	public boolean MyGardenVal() {
		
		return MyGardenPage.gardenHeader.isDisplayed();
	}
	
	public SuccessPlan ThisWeekData() {
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bee Balm\"));"));
		MyGardenPage.beeBalmProject.click();
		return new SuccessPlan();
	}
	

}
