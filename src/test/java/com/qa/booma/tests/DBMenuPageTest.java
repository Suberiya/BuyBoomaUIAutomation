package com.qa.booma.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.constants.AppConstants;

public class DBMenuPageTest extends BaseTest {

	@BeforeClass
	public void accSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void DBPageTitleTest() {
		String actualTitle = DBPage.getDBPageTitle();

		Assert.assertEquals(actualTitle, AppConstants.DBPAGE_TITLE);
	}

	@Test
	public void DBPageURLTest() {
		String autualURL = DBPage.getDBURL();
		// Assert.assertEquals(autualURL, "");}
		Assert.assertTrue(autualURL.contains(AppConstants.DBPAGE_URL_FRACTION));

	}

	@Test
	public void DBPageLogoImageTest() {
		Assert.assertTrue(DBPage.isLogoImageExist());

	}

	@Test
	public void DBTopMenuLeadExistTest() {
		Assert.assertTrue(DBPage.isDBTopMenuLeadIsExist());
	}
	
//	@Test
//	public void DBPageLeftMenuLisTest()
//	{
//		List<String> actualMenuList =DBPage.getDBPageLeftMenuList();
//		
//		System.out.println("actual menu LIst " + actualMenuList);
//	}

	//@Test
//	public void DBLeftMenuList()
//	{
//		int munulist= DBPage.getLeftMenuList();
//		
//		System.out.println("total menu lists :" +munulist);
//	}
//	
	@Test
	public void DBpageLeftProjectLinkClickTest()
	{
		DBPage.clickleftMenuProjects();
	}
	
}