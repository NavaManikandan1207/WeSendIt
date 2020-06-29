package com.wesendit.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wesendit.baseclass.Base;

public class SendMailLinkObjects extends Base{

	public SendMailLinkObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="recipients")
	private WebElement recipientEmail;
	
	@FindBy(id="uploadTextarea")
	private WebElement textMassage;
	
	@FindBy(id="filedropzone")
	private WebElement dropZoneBtn;
	
	@FindBy(xpath = "//button[@class=\"md-raised md-accent sendbtn md-button md-ink-ripple\"]")
	private WebElement sendBtn;
	
	@FindBy(xpath="//*[@class=\"md-primary md-raised md-button md-ink-ripple\"]")
	private WebElement insideSendBtn;

	public WebElement getRecipientEmail() {
		return recipientEmail;
	}

	public WebElement getTextMassage() {
		return textMassage;
	}

	public WebElement getDropZoneBtn() {
		return dropZoneBtn;
	}

	public WebElement getSendBtn() {
		return sendBtn;
	}

	public WebElement getInsideSendBtn() {
		return insideSendBtn;
	}
	








}
