package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class addTicketPage {
	private WebDriver driver;
	ElementUtil eleUtil;
	

	addTicketPage(WebDriver driver)
	{
		this.driver= driver;
		eleUtil = new ElementUtil(driver);
	}
	
	// locators
	
	
	
	
	By addTicketbtn = By.xpath("//button[@id='Tooltip-Add-E-Ticket']");
	
	By ticketpageHeader = By.xpath("//h2[normalize-space()='E-Ticket']");
	
	public String getHeader()
	{
		String actualheader = eleUtil.doGetElementText(ticketpageHeader);
		return actualheader;
	}
	
	
	public addticketsPage clickAddticketPage()
	{
		eleUtil.waitForElementPresence(addTicketbtn, 50);
		
		return new addticketsPage(driver);
	}
	
}
