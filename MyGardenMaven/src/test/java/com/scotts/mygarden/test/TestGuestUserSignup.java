package com.scotts.mygarden.test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.GuestUserSignup;
import com.scotts.mygarden.page.HomePage;


public class TestGuestUserSignup extends LaunchApp {
	
//	AppiumDriver<MobileElement> driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		System.out.println("Started Server");
		AppInitialize();
	}
	
	@Test
	public void GuestUser() {
		
		
		HomePage hp = new HomePage();
		hp.GetStarted().click();
		
		GuestUserSignup gus = new GuestUserSignup();
		gus.guestUser().click();
		gus.zipcode().click();
		
	}

}
