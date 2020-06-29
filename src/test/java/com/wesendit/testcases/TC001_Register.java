package com.wesendit.testcases;

import org.testng.annotations.Test;
import com.wesendit.pageObjects.HomePageObjects;
import com.wesendit.pageObjects.RegisterObjects;

public class TC001_Register extends CommonTests{
	

	@Test
	public void registerTest() throws InterruptedException {
		HomePageObjects register=new HomePageObjects(driver);
		click(register.getregisterBtn());
		scrolldown(register.getinsideRegister());
		click(register.getinsideRegister());
		
		RegisterObjects rgsObj=new RegisterObjects(driver);
		fill(rgsObj.getRegisterUser(),readcon.getRegisterUser());
		fill(rgsObj.getRegisterPass(),readcon.getRegisterPass());
		fill(rgsObj.getRegisterPassAgain(), readcon.getRegisterPassAgain());
		click(rgsObj.getRegisterCheckbox());
		click(rgsObj.getRegisterNowBtn());
		
	screenShot("register");
		
		
	}
	


}
