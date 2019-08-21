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
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
	private static AndroidElement loginEmail;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
	private static AndroidElement loginPassword;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.widget.Button")
	private static AndroidElement loginbtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
	private static AndroidElement fbLogin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
	private static AndroidElement googleLogin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[contains(@text, 'Forgot Password?')]")
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
