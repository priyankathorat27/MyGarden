package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExplorerScreen extends LaunchApp {
	
	public ExplorerScreen() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/account")
	WebElement myaccount;
	
	@AndroidFindBy(className = "android.widget.RelativeLayout")
	WebElement searchfield;
	
	
	public WebElement myaccount() {
		
		return myaccount;
	}
	
	public WebElement searchfield() {
		
		return searchfield;
	}

}
