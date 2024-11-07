package com.qa.booma.tests;

import org.testng.annotations.BeforeClass;

import com.qa.booma.base.BaseTest;
import com.qa.booma.pages.customersViewPage;

public class customersListallPageTest extends BaseTest {

	@BeforeClass
	public void addCustomersPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	
	
	AddCustomerPage = DBPage.leftCustomerMenu();
	customersViewPage= AddCustomerPage.clickListAll();
	
	}
	
}