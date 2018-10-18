package com.foundation.selenium;

import com.realpage.core.component.UIComponentMapFactory;
import com.realpage.core.page.UIPageFactory;
import com.realpage.core.component.UIComponentMap;
import org.springframework.stereotype.Component;
import com.foundation.cucumber.CucumberStepDefinitions;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

/**
 * Responsible for parsing and storing the existing site and components pages from a specified environment
 *
 */
@Component
public class DataManager {
	private static final HashMap<String, String> RUN_PROFILE = getRunProfile();
    private static final UIPageFactory UI_PAGE_FACTORY = setUpUIPageFactory();
    private static final UIComponentMap UI_COMPONENT_FACTORY = setUpUIComponentMapFactory();
    private UIPageFactory uiPageFactory;
    private UIComponentMap uiComponentMap;

    public DataManager() {
    	uiPageFactory = UI_PAGE_FACTORY;
    	uiComponentMap = UI_COMPONENT_FACTORY;

    	System.out.println("\n***** DataManager ******");
    	System.out.println("[INFO] Using profile: " + RUN_PROFILE);
    }

    public UIPageFactory getUIPageFactory() {
		return uiPageFactory;
    }

    public UIComponentMap getUIComponentMap() {
		return uiComponentMap;
    }

    // Store the site pages
    private static UIPageFactory setUpUIPageFactory() {
    	UIPageFactory uiPageFactory = null;
    	try {
			uiPageFactory = UIPageFactory.getUIPages(getProfileDir(), RUN_PROFILE.get("environment"));
			System.out.println("DataManager profile: " + RUN_PROFILE.get("environment"));
		} catch (Exception e) {
			return null;
		}
    	return uiPageFactory;
    }

    // Store the components pages
    private static UIComponentMap setUpUIComponentMapFactory() {
    	UIComponentMap uiComponentMap = null;
    	try {
    		uiComponentMap = UIComponentMapFactory.getUIComponentMap(getProfileDir(), RUN_PROFILE.get("environment"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DataManager UIComponentMap error: " + e.getLocalizedMessage());
			return null;
		}
    	return uiComponentMap;
    }

    // Load the predefined directory where it stores all the site and components pages
    private static File getProfileDir() {
    	URL profileURL = DataManager.class.getClassLoader().getResource("data/" + RUN_PROFILE.get("brand"));
		File profileDir;
		try {
			profileDir = new File(profileURL.toURI());
			System.out.println("DataManager profileDir: " + profileDir.toString());
			System.out.println("DataManager brand: " + RUN_PROFILE.get("brand"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
			System.out.println("DataManager getProfile error: run.brand is empty.");
			return null;
		}
		return profileDir;
    }

    private static HashMap<String, String> getRunProfile() {
    	String brand = System.getProperty("run.brand", "");							// Default brand to blank
    	String environment = System.getProperty("run.environment", "production");	// Default environment to production
    	HashMap<String, String> profileMap = new HashMap<String, String>(4);

    	profileMap.put("brand", brand);
    	profileMap.put("environment", environment);

    	if(brand.equals("realpage")) {
    		profileMap.put("siteDescription", "Real Page");
    		profileMap.put("siteStartingUrl", "https://www.realpage.com/");
		} else {
			profileMap.put("siteDescription", "Google");				// Default site description
			profileMap.put("siteStartingUrl", "http://www.google.com");		// Default site starting Url
    	}

    	return profileMap;
    }
}
