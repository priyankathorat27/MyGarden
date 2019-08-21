package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAccountScreen extends LaunchApp {
	
	public MyAccountScreen() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_my_lawn_partner")
	private static AndroidElement LawnApp;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_logout")
	private static AndroidElement logoutbtn;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_conditions")
	private static AndroidElement termsLink;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_privacylink")
	private static AndroidElement privacyLink;
	
	public MyLawnPage MyLawnApp() {
		
//		driver.findElement(MobileBy.AndroidUIAutomator(
//				   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"My Lawn App\"));"));
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	    		 "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
	    		 + "(new UiSelector().textContains(\"My Lawn App\"));"));
		
		MyAccountScreen.LawnApp.click();
		return new MyLawnPage();
	}
	
	public HomePage logout() {
		
//		driver.findElement(MobileBy.AndroidUIAutomator(
//				   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Log Out\"));"));
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	    		 "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
	    		 + "(new UiSelector().textContains(\"Log Out\"));"));
		
		MyAccountScreen.logoutbtn.click();
		return new HomePage();
	}
	
	public TermsPage TermsAndConditions() {
		
//		driver.findElement(MobileBy.AndroidUIAutomator(
//				   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Terms and Condition\"));"));
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	    		 "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
	    		 + "(new UiSelector().textContains(\"Terms and Condition\"));"));
		
		MyAccountScreen.termsLink.click();
		return new TermsPage();
	}
	
	public PrivacyPolicyPage PrivacyPolicyLink() {
		
//		driver.findElement(MobileBy.AndroidUIAutomator(
//				   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Privacy Policy\"));"));
		
		driver.findElement(MobileBy.AndroidUIAutomator(
	    		 "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
	    		 + "(new UiSelector().textContains(\"Privacy Policy\"));"));
		
		MyAccountScreen.privacyLink.click();
		return new PrivacyPolicyPage();
	}
	
	

}
