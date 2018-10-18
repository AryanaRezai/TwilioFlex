package com.foundation.selenium;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for creating a WebDriver instance
 *
 */
@Component			// Enable Spring container to auto scan this class and register it as a bean
@Scope("thread")	// Every request for a bean will return the same instance for the same thread
public class WebDriverManager {
    @Autowired
    private WebDriver driver;
	private List<String> tags;

	public WebDriverManager() {
		System.out.println("\n***** WebDriverManager ******");
		tags = new ArrayList<String>();
	}

    public WebDriver getWebDriver() {
    	return driver;
    }

    // Create a WebDriver instance that executes each test per-job basis
    public void createInstance() {
    	tags.clear();
    	driver = WebDriverUtils.getWebDriverInstance();
    }

    public void disposeInstance() {
    	List<String> tagList = new ArrayList<String>(tags);

    	tags.clear();

    	if(driver !=null) {
    		driver.quit();
    	}
    	driver = null;
    }

}
