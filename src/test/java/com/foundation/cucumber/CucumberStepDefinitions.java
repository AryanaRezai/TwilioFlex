package com.foundation.cucumber;

import com.realpage.core.component.UIComponent;
import com.realpage.core.component.UIComponentMap;
import com.realpage.core.page.UIPageFactory;
import com.foundation.selenium.DataManager;
import com.foundation.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.foundation.selenium.WebDriverUtils.openPage;

public class CucumberStepDefinitions {
	private WebDriver driver;
	private WebDriverManager webDriverManager;
	private UIPageFactory uiPageFactory;
	private UIComponentMap uiComponentMap;
	private UIComponent uiComponent;
	private List<WebElement> containers;

	/*
	 *******************************************************
	 ************* SELENIUM WEBDRIVER INSTANCE *************
	 *******************************************************
	 */
	@Autowired
	public CucumberStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.webDriverManager = webDriver;
		uiPageFactory = data.getUIPageFactory();
	}

	@Before
	public void createDriverInstance() {
		webDriverManager.createInstance();
		driver = webDriverManager.getWebDriver();
	
	}

	@After
	public void disposeDriver(Scenario result) {
		String environment = System.getProperty("run.environment", "NOT_PROVIDED");
		webDriverManager.disposeInstance();
	}

	/*
	 *******************************************************
	 ********** SELENIUM WEBDRIVER/CUCUMBER TESTS **********
	 *******************************************************
	 */
	@Given("Scenario Name: \"([^\"]+)\"$")
	public void log_scenario_name(String scenarioname) {
		System.out.println("Scenario Name: " + scenarioname);

	}

	@Given("^([^\"]+) wants to navigate the content of ([^\"]+)$")
	public void open_site(String userName, String pageName) {
		openPage(driver, uiPageFactory, pageName);
	}
}
