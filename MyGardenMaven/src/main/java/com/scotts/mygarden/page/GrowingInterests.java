package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GrowingInterests extends LaunchApp {
	
	public GrowingInterests() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_skip")
	WebElement skipbtn;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	WebElement backarrow;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Plants for Small Spaces'")
	WebElement smallspacesInterest;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Plants for Medium Spaces'")
	WebElement mediumspacesInterest;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Plants for Large Spaces'")
	WebElement largespacesInterest;
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_next")
	WebElement viewplantbtn;
	
	
	public WebElement skipbtn() {
		return skipbtn;
	}
	
	public WebElement backarrow() {
		return backarrow;
	}
	
	public WebElement smallspacesInterest() {
		return smallspacesInterest;
	}
	
	public WebElement mediumspacesInterest() {
		return mediumspacesInterest;
	}
	
	public WebElement largespacesInterest() {
		return largespacesInterest;
	}
	
	public WebElement viewplantbtn() {
		return viewplantbtn;
	}


}
