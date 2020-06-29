package com.wesendit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wesendit.baseclass.Base;

public class UploadFileObjects extends Base{
	public UploadFileObjects(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//button[@class=\"md-secondary md-raised linkuploadbtn md-button md-ink-ripple\"]")
	private WebElement uploadLink;

	@FindBy(id="filedropzone")
	private WebElement UploadBox;
	
	@FindBy(xpath="//div[@class=\"upload-summary layout-align-space-between-center layout-row\"]")
	private WebElement multiFileUploadBox;

	@FindBy(xpath = "//button[@class='md-raised md-accent sendbtn md-button md-ink-ripple']")
	private WebElement uploadBtn;
	
	@FindBy(xpath = "//button[@class=\"md-primary md-raised md-button md-ink-ripple\"]")
	private WebElement insideUploadBtn;
	
	@FindBy(id="downloadLink")
	private WebElement downloadLink;
	
	@FindBy(xpath="//button[@class=\"md-primary md-raised pd-btn md-button ng-binding ng-scope md-ink-ripple\"]")
	private WebElement copyLinkBtn;
	
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn;
	
	public WebElement getMultiFileUploadBox() {
		return multiFileUploadBox;
	}
	
	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getCopyLinkBtn() {
		return copyLinkBtn;
	}

	public WebElement getDownloadLink() {
		return downloadLink;
	}

	public WebElement getInsideUploadBtn() {
		return insideUploadBtn;
	}

	public WebElement getUploadBtn() {
		return uploadBtn;
	}

	public WebElement getUploadLink() {
		return uploadLink;
	}

	public WebElement getUploadBox() {
		return UploadBox;
	}
	
	
	
	

	
}
