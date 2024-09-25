package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.constants.AppConstants;
import com.qa.booma.logger.Log.Log;
import com.qa.booma.utils.ElementUtil;
import com.qa.booma.utils.TimeUtil;

import io.qameta.allure.Step;

public class LoginPage {
// Page class/ page Library/ Page Object
	private WebDriver driver;
	private ElementUtil eleUtil;
	// Private By Locators

	private By forgotlink = By.xpath("//button[@type='button']");
	private By username = By.xpath("//input[@placeholder='Login ID']");
	private By Password = By.xpath("//input[@placeholder='Password']");
	private By loginbtn = By.xpath("//button[@type='submit']");

	// class page const

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

	// Page class method Action

	
	@Step("Getting login page Title")
	public String getLoginPageTitle() {
		String title = eleUtil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE, TimeUtil.DEFAULT_SHORT_TIME);
		//System.out.println("login Page Title" + title);
		Log.info("login Page Title " + title);
		return title;
	}

	public boolean getLinkText() {

		return eleUtil.isElementDisplayed(forgotlink);

	}
	@Step("Getting login page URL")
	public String getLoinPageURL() {
		String url = eleUtil.waitForURLContains( AppConstants.LOGIN_PAGE_URL_FRACTION, TimeUtil.DEFAULT_SHORT_TIME);
		//System.out.println("Login Page URL :" + url);
		
		Log.info("Login Page URL :" + url);
		
		return url;
	}
@Step("Login With UserName: {0} and Password {1}")
	public DBMenuPage doLogin(String userName, String pwd) {
		//System.out.println("user cred:" + userName + " : " + pwd);
		
		Log.info("user cred:" + userName + " : " + pwd);
		eleUtil.waitForElementVisible(username, TimeUtil.DEFAULT_LONG_TIME).sendKeys(userName);
		eleUtil.doSendKeys(Password, pwd);
		eleUtil.doClick(loginbtn);
		// return eleUtil.waitForTitleIs("buyBooma", 5);
		return new DBMenuPage(driver);

	}

}
