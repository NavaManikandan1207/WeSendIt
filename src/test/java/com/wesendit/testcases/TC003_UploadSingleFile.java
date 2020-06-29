package com.wesendit.testcases;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.UploadFileObjects;

public class TC003_UploadSingleFile extends TC002_Login {

	@Test
	public void UploadFile() throws Throwable {
		UploadFileObjects uploadBox = new UploadFileObjects(driver);
		click(uploadBox.getUploadLink());
		click(uploadBox.getUploadBox());

		fillUpload(readcon.getMultiFileUpload(1));
		Thread.sleep(5000);

		click(uploadBox.getUploadBtn());
		click(uploadBox.getInsideUploadBtn());
		Thread.sleep(5000);
		String downloadLink = uploadBox.getDownloadLink().getAttribute("value");

		if (downloadLink.contains("wesendit2-short.webandappstudio.com:8003")) {

			System.out.println("file uploaded successfully");
		} else {
			System.out.println("file not uploaded");
		}
		screenShot("singleUploaded");
		click(uploadBox.getCopyLinkBtn());
		click(uploadBox.getOkBtn());
	}
}
