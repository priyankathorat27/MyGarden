package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FbPage extends LaunchApp{
	
	public FbPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "m_login_email")
	private static AndroidElement fbEmail;
	
	@CacheLookup
	@AndroidFindBy(id = "m_login_password")
	private static AndroidElement fbPassword;
	
	@CacheLookup
	@AndroidFindBy(id = "u_0_5")
	private static AndroidElement fbLoginBtn;
	
	
    public ContinueFbPage fbLogin(String Email, String Password) {
    	
    	FbPage.fbEmail.sendKeys(Email);
    	driver.hideKeyboard();
    	FbPage.fbPassword.sendKeys(Password);
    	driver.hideKeyboard();
    	FbPage.fbLoginBtn.click();
    	
		return new ContinueFbPage();
    	  
      }
	

}
