package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FreshTipsPage extends LaunchApp{
	
	public FreshTipsPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView")
	private static AndroidElement heroArticle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Growing Vegetables in Containers')]")
	private static AndroidElement feedArticle;
	
	public HeroArticlePage heroArt() {
		
		FreshTipsPage.heroArticle.click();
		return new HeroArticlePage();
	}
	
    public FeedArticlePage feedArt() {
    	
//    	 driver.findElement(MobileBy.AndroidUIAutomator(
//    	 "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Growing Vegetables in Containers\"));"));
    	
    	driver.findElement(MobileBy.AndroidUIAutomator(
	    		 "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView"
	    		 + "(new UiSelector().textContains(\"Growing Vegetables in Containers\"));"));
    	
		FreshTipsPage.feedArticle.click();
		return new FeedArticlePage();
	}
    
    public boolean heroArtVal() {
    	
    	return FreshTipsPage.heroArticle.isDisplayed();
    }
    
    public boolean feedArtVal() {
    	
    	return FreshTipsPage.feedArticle.isDisplayed();
    }
    

}
