package com.actiTime.test;

import org.testng.annotations.Test;

import com.actiTime.Utilities.ReadDataConfiguration;
import com.actiTime.pageObjects.LoginPage;

public class TC_001_LoginPageTest extends Baseclass
{
	ReadDataConfiguration readLogin=new ReadDataConfiguration();
@Test
public void loginTest()
{
	driver.get(readLogin.getUrl());
	LoginPage initLogin=new LoginPage(driver);
	initLogin.setUserName();
	initLogin.setPassword();
	initLogin.clickSignInBTN();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}
}
