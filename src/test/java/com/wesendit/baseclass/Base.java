package com.wesendit.baseclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.readconfig.testdata.ReadConfig;

public class Base {
	
	public WebDriver driver;
	ReadConfig readCon=new ReadConfig();
	
	public void setup(String openURL){
		System.setProperty("webdriver.chrome.driver", readCon.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(openURL);
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void fill(WebElement element,String str) {	
		element.sendKeys(str);		
	}
	
	public void click(WebElement elements) {
		elements.click();
	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	public void actions(WebElement element) {
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
	}
	
	public void fillUpload(String path)  {
		
		StringSelection filepath=new StringSelection(System.getProperty("user.dir")+path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
		
		Robot robot;
		try {
			robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
	
		public void screenShot(String shotName) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
			File fil=new File(System.getProperty("user.dir")+"/ScreensShot\\"+shotName+".png");
			try {
				FileUtils.copyFile(screenshotAs, fil);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
