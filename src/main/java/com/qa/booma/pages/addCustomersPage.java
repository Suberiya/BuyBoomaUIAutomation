package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class addCustomersPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	addCustomersPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// locators
	// By cusName = By.id("customerName");
	By cusName = By.xpath("//input[@id='text-0-customerName']");
	By email = By.name("email");
	By phone = By.xpath("//input[@id='number-2-phone']");
	By secPhone = By.xpath("//input[@id='number-3-secondaryPhoneNo']");
	By aadaar = By.xpath("//input[@id='number-4-aadhaar']");
	// By pan = By.xpath("//input[@id='text-5-pan']");
	By pan = By.name("pan");

	By address = By.xpath("//textarea[@id='textarea-6-address']");
	By dob = By.xpath("//input[@id='date-7-dateOfBirth']");
	By relationshipOf = By.xpath("//select[@id='relation']");
	By relationName = By.xpath("//input[@id='relativeName']");
	By maritalStatus = By.xpath("//select[@id='select-10-maritalStatus']");
	By currentResidence = By.xpath("//input[@id='text-14-currentAddress']");
	By occupation = By.xpath("//input[@id='text-15-occupation']");
	By qualification = By.xpath("//input[@id='text-16-qualification']");
	By designation = By.xpath("//input[@id='text-17-designation']");
	By Monthlyincome = By.xpath("//input[@id='text-18-monthlyIncome']");
	By nationality = By.xpath("//input[@id='text-19-nationality']");
	By submitBtn = By.xpath("//button[@type='submit']");

	// Action

	public void addCustomersPage(String customerName, String email, String phone, String secPhone, String aadaar,
			String pan, String address, String dob, String relationshipOf, String relationName, String maritalStatus,
			String currentResidence, String occupation, String qualification, String designation, String Monthlyincome,
			String nationality) {
		
		
		//public void addCustomersPage(String EneterValue) {

		// eleUtil.waitForElementPresence(cusName, 50).sendKeys(customerName);
		eleUtil.waitForElementVisible(cusName, 50).sendKeys(customerName);
		eleUtil.doSendKeys(this.email, email);
		eleUtil.doSendKeys(this.phone, phone);
		eleUtil.doSendKeys(this.secPhone, secPhone);
		eleUtil.doSendKeys(this.aadaar, aadaar);
		eleUtil.doSendKeys(this.pan, pan);
		eleUtil.doSendKeys(this.address, address);
		eleUtil.doSendKeys(this.dob, dob);

		// eleUtil.doSendKeys(this.relationshipOf, relationshipOf);
		eleUtil.doSelectDropDownValue(this.relationshipOf, relationshipOf);
		eleUtil.doSendKeys(this.relationName, relationName);
		// eleUtil.doSendKeys(this.maritalStatus, maritalStatus);
		eleUtil.doSelectDropDownValue(this.maritalStatus, maritalStatus);
		eleUtil.doSendKeys(this.currentResidence, currentResidence);
		eleUtil.doSendKeys(this.occupation, occupation);
		eleUtil.doSendKeys(this.qualification, qualification);
		eleUtil.doSendKeys(this.designation, designation);
		eleUtil.doSendKeys(this.Monthlyincome, Monthlyincome);
		eleUtil.doSendKeys(this.nationality, nationality);
	}

	public void clickSubbtn() {
		eleUtil.doClick(submitBtn, 20);

	}

}
