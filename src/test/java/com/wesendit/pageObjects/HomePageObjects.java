package com.wesendit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wesendit.baseclass.Base;

public class HomePageObjects extends Base{
	
	public HomePageObjects(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	}

@FindBy(xpath = "//button[@class='md-raised md-accent self-align mr-15 md-button ng-binding ng-scope md-ink-ripple layout-align-end-center']")
private WebElement registerBtn;

@FindBy(xpath="//button[@class='select-plan md-primary md-raised md-button layout-align-start-center']")
private WebElement insideRegister;


public WebElement getregisterBtn() {
	return registerBtn;
}

public WebElement getinsideRegister() {
	return insideRegister;
}

	
	
	
	
	
}
