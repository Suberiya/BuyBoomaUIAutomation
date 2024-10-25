package com.qa.booma.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.booma.factory.DriverFactory;
import com.qa.booma.pages.AddCustomerPage;
import com.qa.booma.pages.AddMultiProjectPage;
import com.qa.booma.pages.AddPlotProjectPage;
import com.qa.booma.pages.DBMenuPage;
import com.qa.booma.pages.LoginPage;
import com.qa.booma.pages.PlotProjectView;
import com.qa.booma.pages.SelectMutliProjectTypePoUp;
import com.qa.booma.pages.addVipContactsPage;

import io.qameta.allure.Step;

import com.qa.booma.pages.addCustomersPage;

//import io.qameta.allure.Step;

public class BaseTest {
	WebDriver driver;
	protected Properties prop;
	DriverFactory df;
	protected LoginPage loginPage;
	protected DBMenuPage DBPage;
	protected AddMultiProjectPage AddMultiProjectPage;
	protected SelectMutliProjectTypePoUp MultiProjectPouUp;
	protected AddPlotProjectPage addPlotProjectPage;
	protected PlotProjectView plotProjectView;
	protected addVipContactsPage addVipContactsPage;
	protected AddCustomerPage AddCustomerPage;
	protected addCustomersPage addCustomersPage;

	protected SoftAssert softAssert;

//	
//	@Parameters({ "browser", "browserversion", "testname" })
//
//	// @Parameters({"browser"})
//	@BeforeTest
//	public void setup(String browserName, String browserVersion, String testName)
//	// public void setup(String browserName, String browserVersion)
//	{
//		// public void setup(String browserName) {
//
//		df = new DriverFactory();
//		prop = df.initProp();
//
//		if (browserName != null) {
//			prop.setProperty("browser", browserName);
//			prop.setProperty("browserversion", browserVersion);
//			prop.setProperty("testname", testName);
//
//		}
//
//		driver = df.initDriver(prop);
//		loginPage = new LoginPage(driver);
//		softAssert = new SoftAssert();
//	}
	@Step("Setup: launching {0} browser & init the properties")
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browserName) {
		df = new DriverFactory();
		prop = df.initProp();

		if (browserName != null) {
			prop.setProperty("browser", browserName);
		}

		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);

		softAssert = new SoftAssert();

	}
//@Step("Closing the Browser")
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
