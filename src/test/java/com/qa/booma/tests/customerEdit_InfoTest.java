package com.qa.booma.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class customerEdit_InfoTest extends BaseTest{

	
	@BeforeClass
	public void CustomersEditPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		AddCustomerPage = DBPage.leftCustomerMenu();
		customersViewPage = AddCustomerPage.clickListAll();
		customerEdit_InfoPage=	customersViewPage.cus_editIcon();
	}
	@Test
	public void nameEdit()
	{
		customerEdit_InfoPage.cus_name_Edit();
	}
	
	@Test
	public void editSub_btn()
	{
		customerEdit_InfoPage.edit_sub_btn();
	}
}