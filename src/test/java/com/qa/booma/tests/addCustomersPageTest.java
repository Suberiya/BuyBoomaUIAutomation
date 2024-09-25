package com.qa.booma.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.constants.AppConstants;
import com.qa.booma.utils.ExcelUtil;
import com.qa.booma.utils.StringUtils;

import io.qameta.allure.Step;

public class addCustomersPageTest extends BaseTest {

	@BeforeClass
	public void addCustomersPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		System.out.println("hhhhhhhhhhhhh");

		AddCustomerPage = DBPage.leftCustomerMenu();
		String actulaHeader = AddCustomerPage.getCustomerHeader();
		Assert.assertEquals(actulaHeader, "My Customer");
		addCustomersPage = AddCustomerPage.clickaddcustomer();
	}

	@DataProvider
	public Object[][] addCustomers() {
		return new Object[][] { { "Priya", "suberiya@Gmail.com", "ETPPS1870B", "Bangalore", "24/07/1990", "S_OF",
				"Priya", "Married", "Bangalore", "IT", "MCA", "IT", "15L", "Indian" } };
	}

	@DataProvider
	public Object[][] getUserRegTestDataFromExcel() {

		return ExcelUtil.getTestData(AppConstants.REGISTER_CUSTOMER_SHEET_NAME);

	}

	// passing values with parameters

//	@Test
//	public void getCutomersAddPage() {
//		AddCustomerPage = DBPage.leftCustomerMenu();
//		String actulaHeader = AddCustomerPage.getCustomerHeader();
//		Assert.assertEquals(actulaHeader, "My Customer");
//		addCustomersPage = AddCustomerPage.clickaddcustomer();

//		 addCustomersPage.addCustomersPage("John12", StringUtils.getRandomEmailId(),
//				 StringUtils.getRandomNumber() , StringUtils.getRandomNumber(), "307661463847",
//		 "ETPPS1870S", "Bangalore", "24/07/1990", "S_OF", "Priya", "Married",
//		 "Bangalore", "IT", "MCA", "IT",
//		 "15L", "Indian");

//		 addCustomersPage.addCustomersPage();
//		 addCustomersPage.clickSubbtn();

	// }
	
	
	
	@Step("checking user registartion"
			+ "")
	@Test(dataProvider = "addCustomers")

	// getUserRegTestDataFromExcel
	// @Test(dataProvider = "getUserRegTestDataFromExcel")
	public void addCust(String customerName, String email, String pan, String address, String dob,
			String relationshipOf, String relationName, String maritalStatus, String currentResidence,
			String occupation, String qualification, String designation, String Monthlyincome, String nationality) {
		addCustomersPage.addCustomersPage(customerName, email, StringUtils.getRandomNumber(),
				StringUtils.getRandomNumber(), StringUtils.getRandomAadarNumber(),

				pan, address, dob, relationshipOf, relationName, maritalStatus, currentResidence, occupation,
				qualification, designation, Monthlyincome, nationality);

		addCustomersPage.clickSubbtn();

	}
}