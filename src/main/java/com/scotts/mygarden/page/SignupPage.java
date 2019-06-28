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
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sign Up')]")
	private static AndroidElement SignupTitle;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Continue as Guest')]")
	private static AndroidElement guestUser;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Email')]")
	private static AndroidElement inputemail;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Password')]")
	private static AndroidElement inputpassword;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Confirm Password')]")
	private static AndroidElement inputconfirmpassword;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'CREATE ACCOUNT')]")
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
		SignupPage.inputpassword.sendKeys(SignupPassword);
		SignupPage.inputconfirmpassword.sendKeys(SignupPassword);
		SignupPage.createaccountbtn.click();
		
		return new Zipcode();
		
	}
	


}
