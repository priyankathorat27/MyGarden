package com.scotts.mygarden.page;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.scotts.mygarden.baseclass.LaunchApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExplorerScreen extends LaunchApp {
	
	public ExplorerScreen() {
		
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/account")
	private static AndroidElement myaccount;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.RelativeLayout")
	private static AndroidElement searchfield;
	
	@CacheLookup
 	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Edibles')]")
 	private static AndroidElement edibles;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Decoratives')]")
	private static AndroidElement decoratives;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Pests')]")
	private static AndroidElement pests;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Weeds')]")
	private static AndroidElement weeds;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Diseases')]")
	private static AndroidElement diseases;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Out Of Season')]")
	private static AndroidElement outofseason;
	
	@CacheLookup
	@AndroidFindBy(className = "android.widget.ImageButton")
	private static AndroidElement backbtn;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//com.scotts.gro.alpha:id/header_title[contains(@text, 'Edibles')]")
	private static AndroidElement ediblestitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//com.scotts.gro.alpha:id/header_title[contains(@text, 'Decoratives')]")
	private static AndroidElement decorativestitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//com.scotts.gro.alpha:id/header_title[contains(@text, 'Pests')]")
	private static AndroidElement peststitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//com.scotts.gro.alpha:id/header_title[contains(@text, 'Weeds')]")
	private static AndroidElement weedstitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//com.scotts.gro.alpha:id/header_title[contains(@text, 'Diseases')]")
	private static AndroidElement diseasestitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Browse by Category')]")
	private static AndroidElement browsebycategory;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Bee Balm')]/preceding-sibling::android.widget.FrameLayout")
	private static AndroidElement beeBalmLink;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Aloe vera')]/preceding-sibling::android.widget.FrameLayout")
	private static AndroidElement aloeVeraLink;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/my_care_plans")
	private static AndroidElement myGardenTab;
	
	@CacheLookup
	@AndroidFindBy(id = "com.scotts.gro.alpha:id/fresh_cuts")
	private static AndroidElement freshTips;


   public boolean browseValidation() {
	   
	   return ExplorerScreen.browsebycategory.isDisplayed();
	   
   }
   
   public ExplorerScreen EdiblesPage() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Edibles\"));"));
	   ExplorerScreen.edibles.click();
	   ExplorerScreen.outofseason.click();
	   ExplorerScreen.backbtn.click();
	   
	   return new ExplorerScreen();
   }
   
   
   public ExplorerScreen DecorativesPage() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Decoratives\"));"));
	   ExplorerScreen.decoratives.click();
	   ExplorerScreen.outofseason.click();
	   ExplorerScreen.backbtn.click();
	   
	   return new ExplorerScreen();
   }
   
   public ExplorerScreen PestsPage() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pests\"));"));
	   ExplorerScreen.pests.click();
	   ExplorerScreen.outofseason.click();
	   ExplorerScreen.backbtn.click();
	   
	   return new ExplorerScreen();
   }

   public ExplorerScreen WeedsPage() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Weeds\"));"));
	   ExplorerScreen.weeds.click();
	   ExplorerScreen.outofseason.click();
	   ExplorerScreen.backbtn.click();
	   
	   return new ExplorerScreen();
   }
   
   public ExplorerScreen DiseasesPage() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Diseases\"));"));
	   ExplorerScreen.diseases.click();
	   ExplorerScreen.outofseason.click();
	   ExplorerScreen.backbtn.click();
	   
	   return new ExplorerScreen();
   }
   
   public boolean SearchVal() {
	   
	   return ExplorerScreen.searchfield.isDisplayed();
   }
   
   public PlantDetails selectPlan() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bee Balm\"));"));
	   ExplorerScreen.beeBalmLink.click();
	   return new PlantDetails();
   }
   
   public PlantDetails selectExistingPlan() {
	   
	   driver.findElement(MobileBy.AndroidUIAutomator(
  			   "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aloe vera\"));"));
	   ExplorerScreen.aloeVeraLink.click();
	   return new PlantDetails();
   }
   
   public MyGardenPage GardenTab() {
	   
	   ExplorerScreen.myGardenTab.click();
	   return new MyGardenPage();
   }
   
   public FreshTipsPage FreshTipsTab() {
	   
	   ExplorerScreen.freshTips.click();
	   return new FreshTipsPage();
   }
   
   public MyAccountScreen AccountTab() {
	   
	   ExplorerScreen.myaccount.click();
	   return new MyAccountScreen();
   }
   

}
