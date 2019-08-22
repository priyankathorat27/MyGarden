package com.scotts.mygarden.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {
	
	public static String proReader (String PropertyName){
	String str =null;
	
	try {
    	// Load the properties File
    	Properties pro= new Properties();
        File fl= new File ("C:\\Users\\DELL\\git\\MyGarden\\MyGardenMaven\\constant.properties");
        FileInputStream fis = new FileInputStream(fl);
        pro.load(fis);
        str = pro.getProperty(PropertyName);
    } catch (Exception e){
        System.out.println("Expection is:  "+ e.getMessage());        
    }
	 return str;   
    }
	
	public static AppiumDriver<MobileElement> driver;

	
	public static void AppInitialize() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", proReader("deviceName"));
		cap.setCapability("udid", proReader("udid"));
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", proReader("platformVersion"));
		cap.setCapability("appPackage", "com.scotts.gro.alpha");
		cap.setCapability("appActivity", "com.scotts.gro.ui.splash.SplashScreenActivity");
		cap.setCapability("Reset", "true");
		
	//	URL url = new URL("http://"+PropertyFile.proReader("s")+".0.0.1:"+PropertyFile.proReader("port")+"/wd/hub");
	//	driver = new AppiumDriver<MobileElement>(url, cap);
		
		driver = new AndroidDriver<MobileElement>(new URL(proReader("url")+proReader("port")+"/wd/hub"), cap);
		System.out.println("Application started...");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
