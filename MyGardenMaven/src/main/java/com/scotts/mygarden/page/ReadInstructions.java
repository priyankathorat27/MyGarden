package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReadInstructions extends LaunchApp{
	
	public ReadInstructions() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_done")
	private static AndroidElement doneBtn;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/action_title")
	private static AndroidElement instTitle;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement instCloseBtn;
	
	
	public boolean InstructionDataVal() {
		
		return ReadInstructions.instTitle.isDisplayed() && ReadInstructions.doneBtn.isDisplayed();
	}
	
	public SuccessPlan MarkActivityCompleted() {
		
		ReadInstructions.doneBtn.click();
		return new SuccessPlan();
	} 

}
