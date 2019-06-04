package com.scotts.mygarden.baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.scotts.mygarden.utility.PropertyFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {
	
	public static AppiumDriver<MobileElement> driver;

	
	public static void AppInitialize() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", PropertyFile.proReader("deviceName"));
		cap.setCapability("udid", PropertyFile.proReader("udid"));
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", PropertyFile.proReader("platformVersion"));
		cap.setCapability("appPackage", "com.scotts.gro.alpha");
		cap.setCapability("appActivity", "com.scotts.gro.ui.splash.SplashScreenActivity");
		cap.setCapability("Reset", "true");
		
	//	URL url = new URL("http://"+PropertyFile.proReader("s")+".0.0.1:"+PropertyFile.proReader("port")+"/wd/hub");
	//	driver = new AppiumDriver<MobileElement>(url, cap);
		driver = new AndroidDriver<MobileElement>(new URL("http://"+PropertyFile.proReader("s")+".0.0.1:"+PropertyFile.proReader("port")+"/wd/hub"), cap);
		
		System.out.println("Application started...");
		
		
	}

}
