package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlantsProject extends LaunchApp {
	
	public PlantsProject( ) {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/thumbnail")
	private static AndroidElement selectplant;
	
	
	public static PlantDetails Plantselect() {
		
		PlantsProject.selectplant.click();
		return new PlantDetails();
	}

}
