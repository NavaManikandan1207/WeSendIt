package com.wesendit.testcases;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.UploadFileObjects;

public class TC004_UploadMultiFiles extends TC002_Login {

	@Test
	public void uploadMultiFile() throws InterruptedException {
		UploadFileObjects uploadBox = new UploadFileObjects(driver);
		click(uploadBox.getUploadLink());

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 1; j++) {
				click(uploadBox.getUploadBox());
			}
			fillUpload(readcon.getMultiFileUpload(i));
			Thread.sleep(5000);
		}

		click(uploadBox.getUploadBtn());

		click(uploadBox.getInsideUploadBtn());
		Thread.sleep(5000);
		String downloadLink = uploadBox.getDownloadLink().getAttribute("value");

		if (downloadLink.contains("wesendit2-short.webandappstudio.com:8003")) {

			System.out.println("Multi file uploaded successfully");
		} else {
			System.out.println("file not uploaded");
		}
		screenShot("MultiUpload");
		click(uploadBox.getCopyLinkBtn());
		click(uploadBox.getOkBtn());

	}

}
