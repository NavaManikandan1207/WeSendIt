package com.wesendit.testcases;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.LoginPageObjects;

public class TC002_Login extends CommonTests {

	@Test
	public void loginTest() throws Throwable {
		
		LoginPageObjects loginPage=new LoginPageObjects(driver);
		
		click(loginPage.getLogInBtn());
		fill(loginPage.getLoginUser(),readcon.getRegisterUser());
		fill(loginPage.getLoginPass(), readcon.getRegisterPass());
		click(loginPage.getInsideLoginBtn());
		screenShot("LogIn");
		Thread.sleep(3000);
		
	}
}
