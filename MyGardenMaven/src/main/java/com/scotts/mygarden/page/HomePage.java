package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends LaunchApp {
	
	public HomePage(AppiumDriver<MobileElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_signup")
	WebElement getStarted;

	
public WebElement GetStarted() {
	
		return getStarted;
		
	}
}