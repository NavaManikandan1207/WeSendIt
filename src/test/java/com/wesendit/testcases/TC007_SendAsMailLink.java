package com.wesendit.testcases;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.SendMailLinkObjects;

public class TC007_SendAsMailLink extends TC002_Login{
	
	@Test
	public void sendMailTest() throws InterruptedException {
		SendMailLinkObjects sendMail=new SendMailLinkObjects(driver);
		fill(sendMail.getRecipientEmail(), readcon.getRegisterUser());
		fill(sendMail.getTextMassage(),"testing mail");
		click(sendMail.getDropZoneBtn());
		fillUpload(readcon.getMultiFileUpload(1));
		Thread.sleep(3000);
		click(sendMail.getSendBtn());
		click(sendMail.getInsideSendBtn());
		Thread.sleep(3000);
		
	}

}
