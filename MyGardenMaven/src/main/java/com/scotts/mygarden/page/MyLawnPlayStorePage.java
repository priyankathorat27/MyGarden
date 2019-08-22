package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyLawnPlayStorePage extends LaunchApp{
	
	public MyLawnPlayStorePage() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'My Lawn: A Guide to Lawn Care (Beta)')]")
	private static AndroidElement playStore;
	

	
	public boolean AppTitleVal() {
		
		return MyLawnPlayStorePage.playStore.isDisplayed();
	}
	
	

}
