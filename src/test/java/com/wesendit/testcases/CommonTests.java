package com.wesendit.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.readconfig.testdata.ReadConfig;
import com.wesendit.baseclass.Base;

public class CommonTests extends Base {
	ReadConfig readcon=new ReadConfig();
	@BeforeClass
	public void browserStart() {
		setup(readcon.getOpenURL());
	}
	
	@AfterClass
	public void tearDown() {
			quitBrowser();
	}

}
