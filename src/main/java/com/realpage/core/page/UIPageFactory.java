package com.realpage.core.page;

import java.io.File;

/**
 * Factory pattern to instantiate the Selenium-Cucumber site pages from the specified environment
 *
 */
public class UIPageFactory {
	private String profile;
	private UIPage uiPage = null;

	private UIPageFactory(String profile) {
		System.out.println("PageFactory profile1: " + profile);
		this.profile = profile;
	}

	public static UIPageFactory getUIPages(File profileDir, String profile) throws Exception {
		UIPageFactory uiPageFactory = new UIPageFactory(profile);
		uiPageFactory.uiPage = UIPage.buildUIPages(profileDir, profile);
		System.out.println("PageFactory profileDir: " + profileDir);
		System.out.println("PageFactory profile: " + profile);
		return uiPageFactory;
	}

	public String getPageUrl(String uiPageName) {
		return uiPage.getUIPageUrl(uiPageName);
	}
}