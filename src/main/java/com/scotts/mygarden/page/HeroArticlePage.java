package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HeroArticlePage extends LaunchApp{
	
	public HeroArticlePage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/tv_title")
	private static AndroidElement heroTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc = 'Navigate up']")
	private static AndroidElement heroBackBtn;
	
	
	public boolean heroTitleVal() {
		
		return HeroArticlePage.heroTitle.isDisplayed();
	}
	
	public FreshTipsPage heroBackArrow() {
		
		HeroArticlePage.heroBackBtn.click();
		return new FreshTipsPage();
	}

}
