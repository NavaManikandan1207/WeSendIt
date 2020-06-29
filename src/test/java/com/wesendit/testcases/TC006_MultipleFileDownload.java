package com.wesendit.testcases;

import java.io.File;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.FileDownloadObjects;
import com.wesendit.pageObjects.UploadFileObjects;

public class TC006_MultipleFileDownload extends TC002_Login {

	@Test
	public void downloadMultipleFile() throws InterruptedException {
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
		click(uploadBox.getCopyLinkBtn());
		click(uploadBox.getOkBtn());

		FileDownloadObjects fileDownload = new FileDownloadObjects(driver);
		click(fileDownload.getMyAccountBtn());
		click(fileDownload.getFileManagementBtn());
		click(fileDownload.getSelectMultiFiles());
		click(fileDownload.getActionBtn());
		click(fileDownload.getMultiDownloadBtn());
		screenShot("multiDownload");

		File fl = new File("C:\\Users\\Tharma Thenu\\Downloads");
		File[] listFiles = fl.listFiles();
		for (File file : listFiles) {
			if (file.getName().contains("WeSendit")) {
				System.out.println("Multiplefile is downloaded");
				break;
			}
		}

	}

}
