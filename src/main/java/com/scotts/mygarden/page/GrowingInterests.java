package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

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
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plants for Small Spaces')]")
	private static AndroidElement smallspacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plants for Medium Spaces')]")
	private static AndroidElement mediumspacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plants for Large Spaces')]")
	private static AndroidElement largespacesInterest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Balcony or Patio Plants')]")
	private static AndroidElement balconyPatioPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Outdoorsy Plants')]")
	private static AndroidElement outdoorsyPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plants I Can't Kill')]")
	private static AndroidElement plantsCantKill;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Yard to Table')]")
	private static AndroidElement yardToTable;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Flowers and More')]")
	private static AndroidElement flowersAndMore;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Leafy Looks')]")
	private static AndroidElement leafyLooks;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Share the Harvest')]")
	private static AndroidElement shareTheHarvest;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plans for My Plants')]")
	private static AndroidElement plansForMyPlants;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Plants to Grow Together')]")
	private static AndroidElement plantsToGrowTogether;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//*[contains(@text, 'Keep It Simple')]")
	private static AndroidElement keepItSimple;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/btn_next")
	private static AndroidElement viewplantbtn;
	
	
	public static ExplorerScreen skipInterest() {
		
		GrowingInterests.skipbtn.click();
		return new ExplorerScreen();
		
	}
	
	public static boolean InterestsVal() {
		
		return GrowingInterests.smallspacesInterest.isDisplayed();
		
	}
	
	public static ExplorerScreen SelectInterests() {
		
		GrowingInterests.smallspacesInterest.click();
		GrowingInterests.mediumspacesInterest.click();
		GrowingInterests.largespacesInterest.click();
		GrowingInterests.viewplantbtn.click();
		
		return new ExplorerScreen();
	}
	
    public static ExplorerScreen Select3Interests() {
    	
    	driver.findElement(MobileBy.AndroidUIAutomator(
 			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"keepItSimple\"));"));
		
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
