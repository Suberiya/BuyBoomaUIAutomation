package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class AddCustomerPageTest extends BaseTest{

	
	@BeforeClass
	public void addCustomerSetUp()
	{
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void setUpCustomer()
	{
		//AddMultiProjectPage =	DBPage.clickleftMenuProjects();
//		String actualheader =AddMultiProjectPage.getProjectHeader();
//		System.out.println("Add Project page header:" + actualheader);
//		Assert.assertEquals(actualheader, "Project List");
		
		
//		addVipContactsPage =DBPage.vipContactsLeftMenu();
//		
//		String  actualheader =addVipContactsPage.vipHeader();
//		
//		System.out.println("Vip Contacts Page Header " +actualheader );
//		Assert.assertEquals(actualheader, "VIP Contacts");
		
		
		
		AddCustomerPage =	DBPage.leftCustomerMenu();
		
	String actualHader= 	AddCustomerPage.getCustomerHeader();
	
	System.out.println("Customer Page: " + actualHader);
	
	Assert.assertEquals(actualHader, "My Customer");
		
	}
	
	
	
}
