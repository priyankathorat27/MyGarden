package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TermsPage extends LaunchApp{
	
	public TermsPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.sec.android.app.sbrowser:id/location_bar_edit_text")
	private static AndroidElement termsTitle;
	
	public boolean TermsVal() {
		
		return TermsPage.termsTitle.isDisplayed();
	}

}
