package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GuestUserSignup extends LaunchApp {
	
	AppiumDriver<MobileElement> driver;
	
	public GuestUserSignup(AppiumDriver<MobileElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/tv_continue_as_guest")
	WebElement guestUser;
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/zipcode_text")
	WebElement zipcode;
	
	
	
	public WebElement guestUser() {
		
		return guestUser;
	}
	
    public WebElement zipcode() {
		
		return zipcode;
	}
	

}
