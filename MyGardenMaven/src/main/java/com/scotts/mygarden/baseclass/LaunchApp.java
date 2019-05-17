package com.scotts.mygarden.baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.scotts.mygarden.page.GuestUserSignup;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.utility.PropertyFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LaunchApp {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			AppInitialize();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void AppInitialize() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", PropertyFile.proReader("deviceName"));
		cap.setCapability("udid", PropertyFile.proReader("udid"));
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", PropertyFile.proReader("platformVersion"));
		cap.setCapability("appPackage", "com.scotts.gro.alpha");
		cap.setCapability("appActivity", "com.scotts.gro.ui.splash.SplashScreenActivity");
		cap.setCapability("noReset", "true");
		
		URL url = new URL("http://"+PropertyFile.proReader("s")+".0.0.1:"+PropertyFile.proReader("port")+"/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application startd...");
		
		HomePage hp = new HomePage(driver);
		hp.GetStarted().click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		GuestUserSignup gus = new GuestUserSignup(driver);
		gus.guestUser().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gus.zipcode().click();
	
	}

}
