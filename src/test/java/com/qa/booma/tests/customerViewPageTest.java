package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.constants.AppConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic 100: Design buybooma Customer View Page")
@Story("US 101: Design Page feature for BuyBooma Application")
@Feature("Feature 201: Adding Customer View Page feature")
public class customerViewPageTest extends BaseTest {
	@BeforeClass
	public void CustomersViewPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

		AddCustomerPage = DBPage.leftCustomerMenu();
		customersViewPage = AddCustomerPage.clickListAll();
		// customersViewPage.clickCustomer();
	}

	@Description("checking Customer view Page Headings.....")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 1)
	public void EmailHeader() {
		String actualHader = customersViewPage.EmailView();
		System.out.println("Email" + actualHader);
		// Assert.assertEquals("Email", "actualHader");

		Assert.assertEquals(actualHader, "Email");

	}

	@Test
	public void phoneView() {
		String phoneHeader = customersViewPage.phoneView();
		System.out.println("Phone" + phoneHeader);
		Assert.assertEquals(phoneHeader, "Phone");
	}

	@Test
	public void customercode() {
		String cus_code = customersViewPage.customerCode();
		System.out.println("Customer Code:" + cus_code);
		Assert.assertEquals(cus_code, "Customer Code");
	}

	@Test
	public void address() {
		String cus_address = customersViewPage.address();
		System.out.println("Address:" + cus_address);
		Assert.assertEquals(cus_address, "Address");
	}

}
