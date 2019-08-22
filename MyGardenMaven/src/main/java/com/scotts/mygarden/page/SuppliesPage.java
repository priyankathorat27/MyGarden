package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SuppliesPage extends LaunchApp {
	
	public SuppliesPage() {
		
	super();
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Hand Trowel')]")
	private static AndroidElement trowel;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Hand Cultivator')]")
	private static AndroidElement cultivator;
	
	public boolean NonEssentials() {
		
		return SuppliesPage.trowel.isDisplayed() || SuppliesPage.cultivator.isDisplayed();
	}
	

}
