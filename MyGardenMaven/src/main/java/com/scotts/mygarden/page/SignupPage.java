package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.scotts.mygarden.baseclass.LaunchApp;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignupPage extends LaunchApp {
	
	
	public SignupPage() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.scotts.gro.alpha:id/tv_continue_as_guest")
	WebElement guestUser;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
	WebElement inputemail;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
	WebElement inputpassword;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Confirm Password']")
	WebElement inputconfirmpassword;
	
	@AndroidFindBy(xpath = "(//android.widget.Button)[3]")
	WebElement createaccountbtn;
	
	public WebElement guestUser() {
		
		return guestUser;
	}
	
    public WebElement inputemail() {
    	return inputemail;
    
    }
    
    public WebElement inputpassword() {
    	return inputpassword;
    
    }
    
    public WebElement inputconfirmpassword() {
    	return inputconfirmpassword;
    
    }
    
    public WebElement createaccountbtn() {
    	return createaccountbtn;
    
    }
    

}
