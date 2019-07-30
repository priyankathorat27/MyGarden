package com.scotts.mygarden.test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scotts.mygarden.baseclass.LaunchApp;
import com.scotts.mygarden.page.ExplorerScreen;
import com.scotts.mygarden.page.FeedArticlePage;
import com.scotts.mygarden.page.FreshTipsPage;
import com.scotts.mygarden.page.HeroArticlePage;
import com.scotts.mygarden.page.HomePage;
import com.scotts.mygarden.page.LoginPage;
import com.scotts.mygarden.utility.Testcase;

public class TestFreshTips extends LaunchApp {
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() throws MalformedURLException {
		
        AppInitialize();
		
		HomePage home = new HomePage();
		home.LoginLink();
		
		LoginPage login = new LoginPage();
		login.ValidData(proReader("loginEmail"), proReader("loginPassword"));
		
		ExplorerScreen explorer = new ExplorerScreen();
		explorer.FreshTipsTab();
		
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC126)
	public void HeroArticleData() {
		
		FreshTipsPage fresh = new FreshTipsPage();
		fresh.heroArt();
		HeroArticlePage hero = new HeroArticlePage();
		assertTrue(hero.heroTitleVal());
		hero.heroBackArrow();
		Assert.assertTrue(fresh.heroArtVal());
	}
	
	@Test(groups = {"smoke"}, description = Testcase.TC130)
	public void FeedArticleData() {
		
		FreshTipsPage fresh = new FreshTipsPage();
		fresh.feedArt();
		FeedArticlePage feed = new FeedArticlePage();
		assertTrue(feed.feedTitleVal());
		feed.feedBackArrow();
		Assert.assertTrue(fresh.feedArtVal());
	}
	
	@AfterMethod(alwaysRun = true)
	public void TearDrop() {
		
		driver.quit();
	}

}
