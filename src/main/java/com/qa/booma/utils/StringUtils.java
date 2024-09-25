package com.qa.booma.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtils {
	public static String getRandomEmailId() {
		String emailId = "booma" + System.currentTimeMillis() + "@gmail.com";
		return emailId;
	}

	public static String getRandomNumber()
	{
		String generatingString= RandomStringUtils.randomNumeric(10);
		return generatingString;
	}
	
	
	public static String getRandomAadarNumber()
	{
		String generatingString= RandomStringUtils.randomNumeric(12);
		return generatingString;
	}

	
public String randomNumberprojectcode()
	
	{
		String generatingString1= RandomStringUtils.randomNumeric(3);
		return generatingString1;
	}
public String randomNumberaadar()
	
	{
		String generatingString1= RandomStringUtils.randomNumeric(12);
		return generatingString1;
	}
public String randomNumberpan()

{
	String generatingString1= RandomStringUtils.randomNumeric(3);
	return generatingString1;
}
	public String randomAlphanumeric()
	{
		String str= RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		return (str+"@"+num);
	}
	
}