package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContinueFbPage extends LaunchApp{
	
	public ContinueFbPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "u_0_1")
	private static AndroidElement continueBtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'Cancel')]")
	private static AndroidElement cancelBtn;
	
	@CacheLookup
	@AndroidFindBy(id = "m-future-page-header-title")
	private static AndroidElement fbTitle;
	
	
	public ExplorerScreen ContinueFbLogin() {
		
		ContinueFbPage.continueBtn.click();
		return new ExplorerScreen();
	}
	
	public LoginPage CancelFbLogin() {
		
		ContinueFbPage.cancelBtn.click();
		return new LoginPage();
	}
	
	public boolean FbVal() {
		
		return ContinueFbPage.fbTitle.isDisplayed();
	}

}
