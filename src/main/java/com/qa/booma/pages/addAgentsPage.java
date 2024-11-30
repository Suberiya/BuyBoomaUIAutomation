package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class addAgentsPage {

	private WebDriver driver;

	private ElementUtil eleUtil;

	addAgentsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	private By marketersName = By.xpath("//input[@id='text-0-agentName']");

	private By teamLeader = By.xpath("//div[contains(text(),'Enter Team Leader')]");
	private By phone = By.xpath("//input[@id='number-2-phone']");
	private By email = By.xpath("//input[@id='email-4-email']");

	private By location = By.xpath("//input[@id='text-5-location']");
	private By designation = By.xpath("//div[contains(@class,'css-1wa3eu0-placeholder')]");
	private By sub_Btn = By.xpath("//button[@type='submit']");
	
	public void addAgents(String M_name, String T_Leader, String phone, String email, String location, String designation) throws InterruptedException 
	{
		eleUtil.waitForElementPresence(marketersName, 50).sendKeys(M_name);
		//eleUtil.doSendKeys(this.teamLeader, T_Leader);
		//eleUtil.DoSelectValueFromDropDown(this.teamLeader, T_Leader);
		eleUtil.getdroDownValues(this.teamLeader, T_Leader);
		eleUtil.DoSelectValueFromDropDownWait(marketersName, designation);
		eleUtil.doSendKeys(this.phone, phone);
		eleUtil.doSendKeys(this.email, email);
		eleUtil.doSendKeys(this.location, location);
		eleUtil.doSendKeys(this.designation, designation);
		eleUtil.DoSelectValueFromDropDownWait(this.designation, designation);
		//eleUtil.getdroDownValues(this.designation, designation);
		
	}
	
	public void sub_Btn()
	{
		eleUtil.doClick(sub_Btn);
	}

	
	
	
	
	
	
	
}
