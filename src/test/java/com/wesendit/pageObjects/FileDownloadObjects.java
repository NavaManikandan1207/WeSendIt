package com.wesendit.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadObjects {
	public FileDownloadObjects(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="account")
	private WebElement myAccountBtn;
	
	@FindBy(id="filemanagement")
	private WebElement fileManagementBtn;
	
	@FindBy(xpath="//md-icon[@class=\"ng-scope\"]")
	private List<WebElement> whichFileDownload;
	
	 @FindBy(xpath="(//button[@aria-label=\"Download file\"])[11]")
	 private WebElement clickDownloadFileBtn;

	 
	 @FindBy(xpath = "//md-checkbox[@class=\"massactions-checkbox\"]")
	 private WebElement selectMultiFiles;
	 
	 @FindBy(xpath = "//button[@class=\"md-no-ink md-button md-ink-ripple\"]")
	 private WebElement actionBtn;
	 
	 @FindBy(xpath="//button[@aria-label=\"Download selection\"]")
	 private WebElement multiDownloadBtn;
	 
	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getMultiDownloadBtn() {
		return multiDownloadBtn;
	}

	public WebElement getSelectMultiFiles() {
		return selectMultiFiles;
	}

	public WebElement getMyAccountBtn() {
		return myAccountBtn;
	}

	public WebElement getFileManagementBtn() {
		return fileManagementBtn;
	}

	public List<WebElement> getWhichFileDownload() {
		return whichFileDownload;
	}

	public WebElement getClickDownloadFileBtn() {
		return clickDownloadFileBtn;
	}
	 
	 
	
	
	
	
	
	
}
