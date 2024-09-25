package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.booma.utils.ElementUtil;

public class addVipContactsPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	addVipContactsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	// Locators

	private By Header = By.xpath("//h2[normalize-space()='VIP Contacts']");

	private By leftVipContactsLeft = By.xpath("//a[normalize-space()='VipContacts']");

	public String vipHeader() {
		String vipPageHeader = eleUtil.waitForElementVisible(Header, 20).getText();
		return vipPageHeader;
	}

	public void clickVipContactsMenu() {
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(driver.findElement(leftVipContactsLeft)).click().build().perform();
		
		
	}

}
