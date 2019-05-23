package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Zipcode extends LaunchApp{
	
	public Zipcode() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/zipcode_text")
	WebElement ziptext;
	
	@AndroidFindBy(className = "android.widget.Button")
	WebElement nextbtn;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	WebElement closebtn;
	

    public WebElement ziptext() {
    	
	  return ziptext;
    }
    
    public WebElement nextbtn() {
    	
    	return nextbtn;
    }
    
public WebElement closebtn() {
    	
    	return closebtn;
    }

}





