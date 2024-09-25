package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.constants.AppConstants;
import com.qa.booma.pages.DBMenuPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;



@Epic("Epic 100: Design buybooma login page")
@Story("US 101: Design Page feature for BuyBooma Application")
@Feature("Feature 201: Adding login feature")
public class LoginPageTest extends BaseTest {

	@Description("checking loigin page Title.....")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Description("checking loigin URL Checking.....")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 2)
	public void PageUrlTest() {
		String url = loginPage.getLoinPageURL();
		Assert.assertEquals(url, AppConstants.LOGIN_PAGE_URL_FRACTION);
	}

	
	@Description("checking Existing forgot password link.....")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 3)

	public void forGotPassworExistLinkkTest() {
		Assert.assertTrue(loginPage.getLinkText());

	}

	
	@Description("checking loigin Username nad Password Title.....")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 4)
	
	public void loginTest() {

		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

		Assert.assertEquals(DBPage.getDBPageTitle(), "buyBooma");
	}

}
