package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class addAgentPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	addAgentPage(WebDriver driver) {
		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

	
	//Locators
	
	
	private By agentHeader = By.xpath("//h2[normalize-space()='Agents']");
	private By addAgentsBtn = By.xpath("//button[@id='Tooltip-Add-Agent']");

	
	public addAgentsPage addAgentsBtn()
	{
		eleUtil.doClick(addAgentsBtn, 50);
		return new addAgentsPage(driver);
	}
	
	
	
	
}
