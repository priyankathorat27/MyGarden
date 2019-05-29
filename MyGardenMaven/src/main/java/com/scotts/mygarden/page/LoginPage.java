package com.scotts.mygarden.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends LaunchApp {
	
	public LoginPage() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
	WebElement loginEmail;
	
	@AndroidFindBy(xpath = "//*[@text = 'Password']")
	WebElement loginPassword;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc = 'LOG IN']")
	WebElement loginbtn;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc = 'Forgot Password?']")
	WebElement forgotpasswordlink;
	
	
	public WebElement loginEmail() {
		
		return loginEmail;
	}
	
   public WebElement loginPassword() {
		
		return loginPassword;
	}
   
   public WebElement loginbtn() {
	   
	   return loginbtn;
   }
   
   public WebElement forgotpasswordlink() {
	   
	   return forgotpasswordlink;
   }


}
