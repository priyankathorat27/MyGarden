package com.scotts.mygarden.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.utility.PropertyFile;

import io.appium.java_client.MobileBy;

public class TestExplorer extends LaunchApp {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
		AppInitialize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp = new HomePage();
		hp.loginlink().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Login Page
		LoginPage lp = new LoginPage();
		lp.loginEmail().sendKeys(PropertyFile.proReader("loginEmail"));
		driver.hideKeyboard();
		lp.loginPassword().sendKeys(PropertyFile.proReader("loginPassword"));
		driver.hideKeyboard();
		lp.loginbtn().click();
	}
	
	
	@Test(priority = 1, description = "MGTC_46: Verify the data on the page of edibles screen")
	public void Edibles() {
		
		//Explorer Page
		ExplorerScreen es = new ExplorerScreen();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Edibles\"));"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Edibles Page
		es.edibles().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		es.outofseason().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.backbtn().click();
		
		//Explorer Page
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}
	
	@Test(priority = 2, description = "MGTC_150: Verify the data on the page of Decoratives screen")
	public void Decoratives() {
		
		//Explorer Page
		ExplorerScreen es = new ExplorerScreen();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Decoratives\"));"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Decoratives Page
		es.decoratives().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		es.outofseason().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.backbtn().click();
		
		//Explorer Page
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}
	
	@Test(priority = 3, description = "MGTC_151: Verify the data on the page of Pests screen")
	public void Pests() {
		
		ExplorerScreen es = new ExplorerScreen();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pests\"));"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.pests().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		es.outofseason().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.backbtn().click();
		
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}
	
	@Test(priority = 4, description = "MGTC_152: Verify the data on the page of Weeds screen")
	public void Weeds() {
		
		ExplorerScreen es = new ExplorerScreen();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Weeds\"));"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.weeds().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		es.outofseason().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.backbtn().click();
		
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}
	
	@Test(priority = 5, description = "MGTC_153: Verify the data on the page of Diseases screen")
	public void Diseases() {
		
		ExplorerScreen es = new ExplorerScreen();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Diseases\"));"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.diseases().click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		es.outofseason().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		es.backbtn().click();
		
		WebElement search = es.searchfield();
		Assert.assertTrue(search.isDisplayed(), "User is not redirected to Explorer screen. Test case failed");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.resetApp();
	}  

}
