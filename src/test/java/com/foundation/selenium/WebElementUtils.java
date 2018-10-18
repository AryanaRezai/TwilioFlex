package com.foundation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.Assert.fail;

public class WebElementUtils {
	public static boolean assertElementsPresent(WebDriver driver, WebElement context, List<By> uiElements) throws InterruptedException {
    	boolean elementsPresent = true;

    	StringBuffer elementsNotPresent = new StringBuffer();
    	for(By by : uiElements){
    		if(!isElementPresent(driver, context, by)){
    			elementsNotPresent.append(by.toString()).append(" not present");
    		}
    	}

    	if(elementsNotPresent.length() > 0){
    		fail("Some elements are not present: "+elementsNotPresent.toString());
    	}

    	return elementsPresent;
    }

    public static boolean isElementPresent(WebDriver driver, WebElement context, By by) {
		try {
			context.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

    public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
