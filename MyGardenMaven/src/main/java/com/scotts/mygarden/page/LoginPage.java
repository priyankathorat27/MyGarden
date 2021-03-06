package com.scotts.mygarden.page;


import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends LaunchApp {
	
	public LoginPage() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Log In')]")
	private static AndroidElement loginTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Email')]")
	private static AndroidElement loginEmail;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Password')]")
	private static AndroidElement loginPassword;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'LOG IN')]")
	private static AndroidElement loginbtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'Facebook Facebook')]")
	private static AndroidElement fbLogin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'Google Google')]")
	private static AndroidElement googleLogin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Forgot Password?')]")
	private static AndroidElement forgotpasswordlink;

	public boolean LoginValidation() {
		
		return LoginPage.loginTitle.isDisplayed();
	}

    public ExplorerScreen ValidData(String loginEmail, String loginPassword) {
    	
    	LoginPage.loginEmail.sendKeys(loginEmail);
    	driver.hideKeyboard();
    	LoginPage.loginPassword.sendKeys(loginPassword);
    	driver.hideKeyboard();
    	LoginPage.loginbtn.click();
    	
		return new ExplorerScreen();
    	  
      }
    
    public boolean ValidationForgotPwd() {
		
		return LoginPage.forgotpasswordlink.isDisplayed();	
	}
    
    
    public LoginPage InvalidData(String loginEmail, String loginPassword) {
    	
    	LoginPage.loginEmail.sendKeys(loginEmail);
    	driver.hideKeyboard();
    	LoginPage.loginPassword.sendKeys(loginPassword);
    	driver.hideKeyboard();
    	LoginPage.loginbtn.click();
    	
		return new LoginPage();
    	  
     }
   
     public GooglePage GoogleBtn() {
	   
	   LoginPage.googleLogin.click();
	   return new GooglePage();
   }
   
   public FbPage FbBtn() {
	   
	   LoginPage.fbLogin.click();
	   return new FbPage();
   }
    
}    
