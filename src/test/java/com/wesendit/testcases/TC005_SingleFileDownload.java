package com.wesendit.testcases;

import java.io.File;

import org.testng.annotations.Test;

import com.wesendit.pageObjects.FileDownloadObjects;
import com.wesendit.pageObjects.UploadFileObjects;

public class TC005_SingleFileDownload extends TC002_Login{
	
	
	@Test
	public void downloadSingleFile() throws InterruptedException {
		UploadFileObjects uploadBox = new UploadFileObjects(driver);
		click(uploadBox.getUploadLink());
		click(uploadBox.getUploadBox());

		fillUpload(readcon.getMultiFileUpload(1));
		Thread.sleep(3000);

		click(uploadBox.getUploadBtn());
		click(uploadBox.getInsideUploadBtn());
		Thread.sleep(3000);
		String downloadLink = uploadBox.getDownloadLink().getAttribute("value");

		if (downloadLink.contains("wesendit2-short.webandappstudio.com:8003")) {

			System.out.println("file uploaded successfully");
		} else {
			System.out.println("file not uploaded");
		}
		click(uploadBox.getCopyLinkBtn());
		click(uploadBox.getOkBtn());

		
		FileDownloadObjects fileDownload=new FileDownloadObjects(driver);
		click(fileDownload.getMyAccountBtn());
		click(fileDownload.getFileManagementBtn());
		click(fileDownload.getWhichFileDownload().get(0));
		click(fileDownload.getClickDownloadFileBtn());
		screenShot("singleDownload");
	
	File fl=new File("C:\\Users\\Tharma Thenu\\Downloads");
	File[] listFiles = fl.listFiles();
	for (File file : listFiles) {
		if(file.getName().contains("WeSendit")) {
			System.out.println("file is downloaded");
			break;
		}
	}
	
	
	
	}
	

}
