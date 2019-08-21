package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignupPage extends LaunchApp {
	
	
	public SignupPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
	private static AndroidElement SignupTitle;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Continue as Guest')]")
	private static AndroidElement guestUser;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[1]")
	private static AndroidElement inputemail;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText[2]")
	private static AndroidElement inputpassword;
	
	@CacheLookup
	@AndroidFindBy(id = "gigya-password-62810461056618370")
	private static AndroidElement inputconfirmpassword;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'CREATE ACCOUNT')]")
	private static AndroidElement createaccountbtn;
	
	
    public static boolean SignupValidation() {
    	
		return SignupPage.SignupTitle.isDisplayed();	
	}
    
    public static Zipcode VerificationGuestLink() {
    	SignupPage.guestUser.click();
    	return new Zipcode();
    }
	
	
	public static Zipcode ScottsSignup(String SignupEmail, String SignupPassword) {
		
		SignupPage.inputemail.sendKeys(SignupEmail);
		driver.hideKeyboard();
		SignupPage.inputpassword.sendKeys(SignupPassword);
		driver.hideKeyboard();
		SignupPage.inputconfirmpassword.sendKeys(SignupPassword);
		driver.hideKeyboard();
		SignupPage.createaccountbtn.click();
		
		return new Zipcode();
		
	}
	


}
