package org.testngpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	

		static WebDriver driver;

		public static void driverSetup() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		public static void browserLaunch(String url) {

			driver.get(url);

		}

		public static WebElement locatorsPath(String locatorsType, String locatorsValue) {

			if (locatorsType.equals("id")) {

				WebElement elementRef = driver.findElement(By.id(locatorsValue));

				return elementRef;

			} else if (locatorsType.equals("className")) {

				WebElement elementRef = driver.findElement(By.className(locatorsValue));

				return elementRef;

			} else if (locatorsType.equals("name")) {

				WebElement elementRef = driver.findElement(By.name(locatorsValue));

				return elementRef;
			} else {

				WebElement elementRef = driver.findElement(By.xpath(locatorsValue));

				return elementRef;
			}

		}

		public static void sendKeys(String SendKeyValue, WebElement path) {

			path.sendKeys(SendKeyValue);

		}

		public static void clickButton(WebElement path) {

			path.click();
		}

		public static void close() {
			driver.close();

		}

		public static File screenShot() {

			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File screen = screenshot.getScreenshotAs(OutputType.FILE);
			return screen;
		}

		public static void screenShotCopy(String fileNameWithPath, File name) throws IOException {
			File folder1 = new File(fileNameWithPath);
			FileUtils.copyFile(name, folder1);
		}

		public static void refresh() {

			driver.navigate().refresh();
		}

		public static void backward() {

			driver.navigate().back();
		}

		public static void forward() {

			driver.navigate().forward();
		}
		
		
		public static Actions actions() {
			
			 Actions actions = new Actions(driver);
			 
			return actions;
		}
		
		public static void moveToElement(Actions ref,WebElement path) {
			ref.moveToElement(path).perform();
		}
		
		public static void actionClick(Actions ref) {
			
			ref.click().perform();
		}
		
		public static void dragAndDrop(Actions ref, WebElement pathsrc,WebElement pathdes) {
			
			ref.dragAndDrop(pathsrc, pathdes).perform();
			
		}
		
		public static void cClick(Actions ref) {
			ref.contextClick().perform();
		}
		
		public static void cClickElement(Actions ref,WebElement path) {
			ref.contextClick(path).perform();
		}
		
		public static void dClick(Actions ref) {
			ref.doubleClick().perform();
		}
		
		public static Robot robot() throws AWTException {
			Robot robot = new Robot();
			return robot;

		}
		
		public static void robotDown(Robot ref) {
			ref.keyPress(KeyEvent.VK_DOWN);
			ref.keyRelease(KeyEvent.VK_DOWN);
		}
		
		public static void robotUp(Robot ref) {
			ref.keyPress(KeyEvent.VK_UP);
			ref.keyRelease(KeyEvent.VK_UP);
		}
		
		public static void robotRight(Robot ref) {
			ref.keyPress(KeyEvent.VK_RIGHT);
			ref.keyRelease(KeyEvent.VK_RIGHT);
		}
		
		public static void robotLeft(Robot ref) {
			ref.keyPress(KeyEvent.VK_LEFT);
			ref.keyRelease(KeyEvent.VK_LEFT);
		}
		
		public static void robotEnter(Robot ref) {
			ref.keyPress(KeyEvent.VK_ENTER);
			ref.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static Select selectOption(WebElement path) {
			
			Select select = new Select(path);
			
			return select;
		}
		
		public static void selectChoice(Select ref, String choice, String value ) {
			
			if (choice.equals("Value")) {
				
				ref.selectByValue(value);;
				
			} else { ref.deselectByVisibleText(value);

			}
		}
		
		public static void selectInt(Select ref, int value) {
			
			ref.selectByIndex(value);
		}
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





