package com.wesendit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wesendit.baseclass.Base;

public class RegisterObjects extends Base {
	
	public RegisterObjects(WebDriver driver) {

	PageFactory.initElements(driver,this);
	
	}

	@FindBy(id="email")
	private WebElement registerUser;
	
	@FindBy(id="password")
	private WebElement registerPass;
	
	@FindBy(id="passwordagain")
	private WebElement registerPassAgain;
	
	@FindBy(name="agb")
	private WebElement registerCheckbox;
	
	@FindBy(xpath = "//button[contains(text(),\"now for free\")]")
	private WebElement registerNowBtn;

	public WebElement getRegisterCheckbox() {
		return registerCheckbox;
	}

	public WebElement getRegisterNowBtn() {
		return registerNowBtn;
	}

	public WebElement getRegisterUser() {
		return registerUser;
	}

	public WebElement getRegisterPass() {
		return registerPass;
	}

	public WebElement getRegisterPassAgain() {
		return registerPassAgain;
	}
	
	
	
	
	
	
}
