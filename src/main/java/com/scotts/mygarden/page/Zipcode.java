package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Zipcode extends LaunchApp{
	
	public Zipcode() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/zipcode_text")
	private static AndroidElement ziptext;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.Button")
	private static AndroidElement nextbtn;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement closebtn;
	
	@CacheLookup
	@AndroidFindBy(id ="com.scotts.gro.alpha:id/snackbar_text")
	private static AndroidElement invalidCodeErrorMsg;
	

   public static GrowingInterests zipcodeInput(String zipcode) {
	   
	   Zipcode.ziptext.sendKeys(zipcode);
	   driver.hideKeyboard();
	   Zipcode.nextbtn.click();
	   
	   return new GrowingInterests();
	   
   }
   
   public static boolean ZipcodeVal() {
   	
   	return Zipcode.ziptext.isDisplayed();
   }
   
   public static Zipcode invalidZipcodeInput(String zipcode) {
	   
	   Zipcode.ziptext.sendKeys(zipcode);
	   driver.hideKeyboard();
	   Zipcode.nextbtn.click();
	   
	   return new Zipcode();
	   
   }
   
   public static boolean ErrorMsg() {
	   
	   return Zipcode.invalidCodeErrorMsg.isDisplayed() && Zipcode.ziptext.isDisplayed();
   }
}





