package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GooglePage extends LaunchApp{
	
	public GooglePage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.google.android.gms:id/main_title")
	private static AndroidElement googleTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Willy James')]")
	private static AndroidElement googleAcc;
	
	
	public boolean GoogleVal() {
		
		return GooglePage.googleTitle.isDisplayed();
	}
	
	public ExplorerScreen GoogleLogin() {
		
		GooglePage.googleAcc.click();
		return new ExplorerScreen();
	}

}
