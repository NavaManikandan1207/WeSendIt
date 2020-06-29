package com.readconfig.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File file = new File("./Configuration\\config.properties");

		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getOpenURL() {
		String url = pro.getProperty("openURL");
		return url;
	}

	public String getChrome() {
		String chrome = pro.getProperty("chromeDriver");
		return chrome;
	}

	public String getGecko() {
		String gecko = pro.getProperty("geckoDriver");
		return gecko;
	}

	public String getRegisterUser() {
		String user = pro.getProperty("registerUser");
		return user;
	}

	public String getRegisterPass() {
		String pass = pro.getProperty("registerPass");
		return pass;
	}

	public String getRegisterPassAgain() {
		String passAgain = pro.getProperty("registerPassAgain");
		return passAgain;
	}

	public String getMultiFileUpload(int no) {
		String file="";
		if(no==1) {
			file = pro.getProperty("firstFileUpload");
		}else if(no==2) {
			file = pro.getProperty("secondFileUpload");	
		}else if(no==3) {
			file = pro.getProperty("thirdFileUpload");
		}else if(no==4) {
			file = pro.getProperty("forthFileUpload");
		}
		return file;
	}
}
