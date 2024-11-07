package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class customersViewPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	customersViewPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

//Locators

	// By cusNameView = By.xpath("//div[contains(text(),'Dinesh')]");

	By CusNameView = By.cssSelector(
			"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)");
	By phoneView = By.xpath("//span[normalize-space()='Phone']");

	By Email = By.xpath("//span[normalize-space()='Email']");

	By CustomerCode = By.xpath("//span[normalize-space()='Customer Code']");
	By Address = By.xpath("//span[normalize-space()='Address']");
	
	By edit_icon= By.xpath("//main[@class='main']//button[2]");
	

	// actions

	public void clickCustomer() {
		eleUtil.doClick(CusNameView);

	}

	public String phoneView() {
		String phoneViewHeader = eleUtil.waitForElementPresence(phoneView, 20).getText();
		return phoneViewHeader;
	}

	public String EmailView() {
		String EmailViewHeader = eleUtil.waitForElementPresence(Email, 40).getText();
		return EmailViewHeader;
	}

	public String customerCode() {
		String customer_cde = eleUtil.waitForElementPresence(CustomerCode, 40).getText();
		return customer_cde;
	}
	
	public String address()
	{
		String address= eleUtil.waitForElementPresence(Address,20).getText();
		
		return address;
	}

	public customerEdit_InfoPage cus_editIcon()
	{
		eleUtil.doClick(edit_icon, 20);
		
		return new customerEdit_InfoPage(driver);
	}

	
	
	
	
}
