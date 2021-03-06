package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrivacyPolicyPage extends LaunchApp{
	
	public PrivacyPolicyPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[contains(@text, 'Privacy Policy')]")
	private static AndroidElement privacyTitle;
	
	public boolean PrivacyVal() {
		
		return PrivacyPolicyPage.privacyTitle.isDisplayed();
	}
	

}
