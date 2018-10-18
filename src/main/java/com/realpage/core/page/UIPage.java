package com.realpage.core.page;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A JavaBean object responsible for parsing and storing all the defined CQ site pages from a YAML file
 *
 */
public class UIPage {
	private HashMap<String, String> uiPages;

	public UIPage() {
		System.out.println("\n***** UIPage ******");
		uiPages = new HashMap<String, String>();
	}

	// Getter for all site pages
	public HashMap<String, String> getUIPages() {
		System.out.println("UIPage getPages: " + uiPages);
		return uiPages;
	}

	// Setter for all site pages
	public void setUIPages(HashMap<String, String> uiPages) {
		this.uiPages = uiPages;
	}

	// Get the page Url of this page name
	public String getUIPageUrl(String uiPageName) {
		if(uiPages == null) {
			return "";
		}
		String uiPageUrl = uiPages.get(uiPageName);
		System.out.println("UIPage uiPageName: " + uiPageName);
		System.out.println("UIPage uiPageUrl: " + uiPageUrl);
		if(uiPageUrl != null) { return uiPageUrl; }
		return "";
	}

	// De-serialize a stream of bytes from the YAML file into Java HashMap and store the defined site pages
	public static UIPage buildUIPages(File profileDir, String profile) throws IOException {
		// Get the list of YAML files based on the pattern "ui-page-*"
		UIPage uiPage = new UIPage();
		Collection<File> uiPages = FileUtils.listFiles(profileDir, new RegexFileFilter("^ui-page(-\\w+)?\\.yaml$"), null);
		Iterator<File> uiPagesIterator = uiPages.iterator();

		System.out.println("UIPage profileDir: " + profileDir);
		System.out.println("UIPage profile: " + profile);

		// Load each YAML file and convert its data mappings into Java HashMap
		while(uiPagesIterator.hasNext()) {
			File file = uiPagesIterator.next();
			System.out.println("UIPage file: " + file);
			UIPage data = loadYamlFile(file, profile);
			if(data != null) {
				uiPage.merge(data);
			}
		}

		return uiPage;
	}

	// Load and convert a YAML file into a Java object
	private static UIPage loadYamlFile(File yamlFile, String profile) {
		UIPage uiPage = null;
		InputStream input;

		try {
			input = new FileInputStream(yamlFile);
		} catch (FileNotFoundException e1) {
			return uiPage;
		}

		System.out.println("UIPage yamlFile: " + yamlFile);

		// Provide additional runtime information necessary to create Page object
		TypeDescription mapType = new TypeDescription(Map.class);
		mapType.putMapPropertyType("development", String.class, UIPage.class );
		mapType.putMapPropertyType("uat", String.class, UIPage.class );
		mapType.putMapPropertyType("stage", String.class, UIPage.class );
		mapType.putMapPropertyType("production", String.class, UIPage.class );

		// Construct a YAML instance w/ a custom Class Loader into Page object
		Constructor constructor = new Constructor(mapType);
		Yaml yaml = new Yaml(constructor);

		// Parse all data mappings of the matching profile in this YAML file
		try {
			@SuppressWarnings("unchecked")
			Map<String, UIPage> map = (Map<String, UIPage>) yaml.load(input);

			uiPage = map.get(profile);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("UIPage error: " + e.getLocalizedMessage());
			//return uiPage;
		}
		return uiPage;
	}

	// Merge key/value pair mapping from the YAML file
	private void merge(UIPage uiPage) {
		uiPages.putAll(uiPage.getUIPages());
	}
}
