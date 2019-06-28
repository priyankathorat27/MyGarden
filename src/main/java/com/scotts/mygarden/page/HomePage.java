package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends LaunchApp {
	
	public HomePage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_signup")
	private static AndroidElement getStarted;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_login")
	private static AndroidElement loginlink;

	
	public LoginPage LoginLink() {
		
		HomePage.loginlink.click();
		return new LoginPage();
	
	}
	
	public SignupPage getStartedbtn() {
		
		HomePage.getStarted.click();
		return new SignupPage();
	}


}
