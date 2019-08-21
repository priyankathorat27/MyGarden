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
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
	private static AndroidElement myGardenTitle;

	
	public LoginPage LoginLink() {
		
		HomePage.loginlink.click();
		return new LoginPage();
	
	}
	
	public SignupPage getStartedbtn() {
		
		HomePage.getStarted.click();
		return new SignupPage();
		
	}
	
	public boolean myGardenTitleVal() {
		
		return HomePage.myGardenTitle.isDisplayed();
	}


}
