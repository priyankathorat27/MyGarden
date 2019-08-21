package com.scotts.mygarden.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GrowingInterests extends LaunchApp {
	
	public GrowingInterests() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_skip")
	private static AndroidElement skipbtn;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement backarrow;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plants for Small Spaces')]")
	private static AndroidElement smallspacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plants for Medium Spaces')]")
	private static AndroidElement mediumspacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plants for Large Spaces')]")
	private static AndroidElement largespacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'BuzzFeed Nifty Projects')]")
	private static AndroidElement buzzfeedInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Indoorsy Plants')]")
	private static AndroidElement indoorsyplants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Balcony or Patio Plants')]")
	private static AndroidElement balconyPatioPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Outdoorsy Plants')]")
	private static AndroidElement outdoorsyPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plants I Can't Kill')]")
	private static AndroidElement plantsCantKill;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Yard to Table')]")
	private static AndroidElement yardToTable;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Flowers and More')]")
	private static AndroidElement flowersAndMore;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Leafy Looks')]")
	private static AndroidElement leafyLooks;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Share the Harvest')]")
	private static AndroidElement shareTheHarvest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plans for My Plants')]")
	private static AndroidElement plansForMyPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Plants to Grow Together')]")
	private static AndroidElement plantsToGrowTogether;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Keep It Simple')]")
	private static AndroidElement keepItSimple;
	
	@CacheLookup
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.Button")
	private static AndroidElement viewplantbtn;
	
	
	public static ExplorerScreen skipInterest() {
		
		GrowingInterests.skipbtn.click();
		return new ExplorerScreen();
		
	}
	
	public static boolean InterestsVal() {
		
		return GrowingInterests.smallspacesInterest.isDisplayed();
		
	}
	
	public static ExplorerScreen SelectInterests() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//android.widget.TextView[contains(@text, 'Plants for Small Spaces')]")));
		GrowingInterests.smallspacesInterest.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//android.widget.TextView[contains(@text, 'BuzzFeed Nifty Projects')]")));
		GrowingInterests.buzzfeedInterest.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//android.widget.TextView[contains(@text, 'Indoorsy Plants')]")));
		GrowingInterests.indoorsyplants.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.Button")));
		GrowingInterests.viewplantbtn.click();
		
		return new ExplorerScreen();
	}
	
    public static ExplorerScreen Select3Interests() {
    	
    	driver.findElement(MobileBy.AndroidUIAutomator(
 			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Keep It Simple\"));"));
		
		GrowingInterests.leafyLooks.click();
		GrowingInterests.shareTheHarvest.click();
		GrowingInterests.plantsToGrowTogether.click();
		GrowingInterests.viewplantbtn.click();
		
		return new ExplorerScreen();
	}
    
    public static GrowingInterests lessthan3Interests() {
		
		GrowingInterests.smallspacesInterest.click();
		GrowingInterests.mediumspacesInterest.click();
		GrowingInterests.viewplantbtn.click();
		
		return new GrowingInterests();
	}
    
    public static boolean ViewPlantBtnVal() {
    	
    	return GrowingInterests.viewplantbtn.isEnabled();
    }


}
