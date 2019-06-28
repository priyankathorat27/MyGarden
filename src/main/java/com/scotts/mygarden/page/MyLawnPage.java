package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyLawnPage extends LaunchApp{
	
	public MyLawnPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/title")
	private static AndroidElement myLawnTitle;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/button")
	private static AndroidElement exploreBtn;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement myLawnCloseBtn;
	
	
	public boolean myLawnTitleVal() {
		
		return MyLawnPage.myLawnTitle.isDisplayed();
	}
	
	public MyLawnPlayStorePage ExploreInStore() {
		
		MyLawnPage.exploreBtn.click();
		return new MyLawnPlayStorePage();
	}
	
	

}
