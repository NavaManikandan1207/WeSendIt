package com.wesendit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wesendit.baseclass.Base;

public class LoginPageObjects extends Base{
	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement logInBtn;
	
	@FindBy(id="email")
	private WebElement loginUser;
	
	@FindBy(id="password")
	private WebElement loginPass;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement insideLoginBtn;
	
	@FindBy(xpath = "//button[text()='Forgot Password']")
	private WebElement forgotPass;
	
	
	public WebElement getForgotPass() {
		return forgotPass;
	}


	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public WebElement getLoginUser() {
		return loginUser;
	}

	public WebElement getLoginPass() {
		return loginPass;
	}

	public WebElement getInsideLoginBtn() {
		return insideLoginBtn;
	}



}
