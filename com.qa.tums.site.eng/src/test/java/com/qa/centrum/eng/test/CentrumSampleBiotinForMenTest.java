package com.qa.centrum.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumDifferentDietPage;
import com.qa.centrum.eng.pages.CentrunBiotinForMenPage;

public class CentrumSampleBiotinForMenTest extends BaseClass{
	
	CentrunBiotinForMenPage bm;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/nutrients-and-routine/biotin-for-men/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/nutrients-and-routine/biotin-for-men/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		bm = new CentrunBiotinForMenPage();
		switchingTab(firstTab);
		bm.clickCookieBtn();
		bm.clickGigyaForm();
		switchingTab(secondTab);
		bm.clickCookieBtn();
		bm.clickGigyaForm();
	}
	
	@Test(priority = 1)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		bm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
		switchingTab(secondTab);
		bm.clickShowReference();
		System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
	}
	
	@Test(priority = 2)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		bm.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bm.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		bm.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bm.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		bm.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bm.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		bm.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		bm.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same :"+compareTwoText);
	}
}
