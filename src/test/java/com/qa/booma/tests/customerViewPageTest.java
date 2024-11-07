package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.constants.AppConstants;

public class customerViewPageTest extends BaseTest {

	@BeforeClass
	public void addCustomersPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

		AddCustomerPage = DBPage.leftCustomerMenu();
		customersViewPage = AddCustomerPage.clickListAll();
		//customersViewPage.clickCustomer();
	}

	@Test
	public void EmailHeader() {
		String actualHader = customersViewPage.EmailView();
		System.out.println("Email" + actualHader);
		//Assert.assertEquals("Email", "actualHader");
	
		Assert.assertEquals(actualHader, "Email");
		
		
	}

	@Test
	public void phoneView() {
		String phoneHeader = customersViewPage.phoneView();
		System.out.println("Phone" + phoneHeader);
		Assert.assertEquals(phoneHeader, "Phone");
	}
@Test
	public void customercode()
	{
		String cus_code= customersViewPage.customerCode();
		System.out.println("Customer Code:" + cus_code);
		Assert.assertEquals(cus_code, "Customer Code");
	}
@Test
	public void address()
	{
		String cus_address= customersViewPage.address();
		System.out.println("Address:" + cus_address);
		Assert.assertEquals(cus_address, "Address");
	}
	
	
}
