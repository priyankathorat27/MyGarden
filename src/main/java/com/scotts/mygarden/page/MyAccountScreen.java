package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAccountScreen extends LaunchApp {
	
	public MyAccountScreen() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_logout")
	WebElement logoutbtn;
	
	
	public WebElement logoutbtn() {
		
		return logoutbtn;
	}

}
