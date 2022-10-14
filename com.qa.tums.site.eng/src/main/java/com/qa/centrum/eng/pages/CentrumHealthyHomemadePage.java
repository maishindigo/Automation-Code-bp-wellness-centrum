package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CentrumHealthyHomemadePage  extends BaseClass{
	
	public CentrumHealthyHomemadePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Dismiss']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;
	
	@FindBy(xpath = "//a[text()='Expert Corner']")
	private static WebElement sweetPotatoesLinkOne;
	
	@FindBy(xpath = "//a[text()='nutrition']")
	private static WebElement sweetPotatoesLinkTwo;
	
	@FindBy(xpath = "//a[text()='diet']")
	private static WebElement sweetPotatoesLinkThree;
	
	@FindBy(xpath = "//strong[text()='5 Things to Do When Not Feeling Well and Bored']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//strong[text()='How to Make Coffee at Home']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//strong[text()='Tips for Working From Home With Kids']")
	private static WebElement articleThree;
	
	@FindBy (xpath = "//strong[text()='Establishing a Self-Care Routine']")
	private static WebElement articleFour;
	
	
	
	
	
	
	
	
	
	public void clickCookieBtn() {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickSweetPotatoesLinkOne() throws Exception {
		scrollDownUsingElement(sweetPotatoesLinkOne);
		clickElementUsingJavaScript(sweetPotatoesLinkOne);
	}
	
	public void clickSweetPotatoesLinkTwo() throws Exception {
		scrollDownUsingElement(sweetPotatoesLinkTwo);
		clickElementUsingJavaScript(sweetPotatoesLinkTwo);
	}
	
	public void clickSweetPotatoesLinkThree() throws Exception {
		scrollDownUsingElement(sweetPotatoesLinkThree);
		clickElementUsingJavaScript(sweetPotatoesLinkThree);
	}
	
	public void clickArticleOne() throws Exception {
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
	}
	
	public void clickArticleTwo() throws Exception {
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
	}
	
	public void clickArticleThree() throws Exception {
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
	}
	
	public void clickArticleFour() throws Exception {
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
	}
	
}
