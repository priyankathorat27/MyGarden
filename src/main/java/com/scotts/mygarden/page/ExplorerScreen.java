package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExplorerScreen extends LaunchApp {
	
	public ExplorerScreen() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/account")
	WebElement myaccount;
	
	@AndroidFindBy(className = "android.widget.RelativeLayout")
	WebElement searchfield;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Edibles']")
	WebElement edibles;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Decoratives']")
	WebElement decoratives;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Pests']")
	WebElement pests;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Weeds']")
	WebElement weeds;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Diseases']")
	WebElement diseases;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Out Of Season']")
	WebElement outofseason;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	WebElement backbtn;
	
	
    public WebElement myaccount() {
		
		return myaccount;
	}
	
	public WebElement searchfield() {
		
		return searchfield;
	}
	
	public WebElement edibles() {
		
		return edibles;
	}
	
    public WebElement decoratives() {
		
		return decoratives;
	}
    
    public WebElement pests() {
		
		return pests;
	}
    
    public WebElement weeds() {
		
		return weeds;
	}
    
    public WebElement diseases() {
		
		return diseases;
	}
    
    public WebElement outofseason() {
    	
    	return outofseason;
    }
    
    public WebElement backbtn() {
    	
    	return backbtn;
    }

}
