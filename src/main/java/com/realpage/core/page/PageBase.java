package com.realpage.core.page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;

public class PageBase {
	
			public void waitForPageLoad(WebDriver driver)  throws InterruptedException {
		        System.out.println("Enter wait function");
				ExpectedCondition<Boolean> expectation = new
		                ExpectedCondition<Boolean>() {
		                    public Boolean apply(WebDriver driver) {
		                    	System.out.println("Execute javascript");
		                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
		                        
		                    }				
		                };
		        try {
		            Thread.sleep(1000);
		            WebDriverWait wait = new WebDriverWait(driver, 90);
		            System.out.println("In Try and start the wait");
		            wait.until(expectation);
		            System.out.println("Wait is completed");
		        	} catch (Throwable error) {
		            Assert.fail("Timeout waiting for Page Load Request to complete.");
		        }
		    }
			
			public void waitForElementPresence(WebDriver driver, By element)  throws InterruptedException {
				
				try {	
					WebDriverWait wait = new WebDriverWait(driver, 90);
					wait.until(ExpectedConditions.presenceOfElementLocated(element));		
				} catch (NoSuchElementException e) {
					fail("Timeout - Cannot find element!");
					}
			} 
			
			public void clickOnElement(WebDriver driver, By element) throws InterruptedException{
					
					try {	
						WebDriverWait wait = new WebDriverWait(driver, 60);
						wait.until(ExpectedConditions.elementToBeClickable(element));
						WebElement Element = driver.findElement(element);
						Element.click();
					} catch (NoSuchElementException e) {
						fail("Timeout - Cannot find element and click element!");
						}
			}

			public void clickOnElement(WebDriver driver, String frame, By element) throws InterruptedException{

				try {
					WebDriverWait wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.elementToBeClickable(element));
					WebElement Element = driver.switchTo().frame(frame).findElement(element);
					Element.click();
				} catch (NoSuchElementException e) {
					fail("Timeout - Cannot find element in frame and click element!");
				}
			}

	public String getElementText(WebDriver driver, By element) throws InterruptedException {
				
				WebElement Element = null;
				try {	
					WebDriverWait wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.presenceOfElementLocated(element));
					Element = driver.findElement(element);
				} catch (NoSuchElementException e) {
					fail("Timeout - Cannot find element get element text!");
					}
				return Element.getText();
		    } 
			
			public void sendElementText(WebDriver driver, By element, String text) throws InterruptedException{
				
				try {	
					WebDriverWait wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.presenceOfElementLocated(element));
					WebElement Element = driver.findElement(element);
					Element.clear();
					Element.sendKeys(text);
				} catch (NoSuchElementException e) {
					fail("Timeout - Cannot find element and send element text!");
					}
			} 
			
			
          
	
}
