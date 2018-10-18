package com.realpage.core.component;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * Factory pattern to instantiate Selenium-Cucumber components Yaml files from the specified environment
 *
 */
public class UIComponentMapFactory {
	private static UIComponentMap uiComponentMap;

	private UIComponentMapFactory() {}

	public static UIComponentMap getUIComponentMap(File profileDir, String profile) throws IOException {
		if(uiComponentMap == null) {
			System.out.println("\n***** UIComponentMapFactory ******");
			System.out.println("UIComponentMapFactory getUIComponentMap profileDir: " + profileDir);
			System.out.println("UIComponentMapFactory getUIComponentMap profile: " + profile);
			uiComponentMap = buildUIComponents(profileDir, profile);
		}

		return uiComponentMap;
	}

	// De-serialize a stream of bytes from the YAML file into Java HashMap and store the defined page components
	private static UIComponentMap buildUIComponents(File profileDir, String profile) throws IOException {
		UIComponentMap uiComponentMap = new UIComponentMap();
		Collection<File> dataSources = FileUtils.listFiles(profileDir, new RegexFileFilter("^ui-components(-\\w+)?\\.yaml$"), null);
		Iterator<File> dataSourcesIterator = dataSources.iterator();

		System.out.println("UIComponentMapFactory buildUIComponents profileDir: " + profileDir);
		System.out.println("UIComponentMapFactory buildUIComponents profile: " + profile);

		while(dataSourcesIterator.hasNext()){
			File f = dataSourcesIterator.next();
			UIComponentMap map = loadYamlFile(f, profile);
			System.out.println("UIComponentMapFactory buildUIComponents file: " + f);
			if(map != null){
				uiComponentMap.addUIComponentMap(map.getUIComponents());
			}
		}

		return uiComponentMap;
	}

	private static UIComponentMap loadYamlFile(File yamlFile, String profile) {
		UIComponentMap uiComponentMap = null;
		InputStream input;

		try {
			input = new FileInputStream(yamlFile);
		} catch (FileNotFoundException e1) {
			return uiComponentMap;
		}

		TypeDescription mapType = new TypeDescription(Map.class);
		mapType.putMapPropertyType("development", String.class, UIComponentMap.class);
		mapType.putMapPropertyType("uat", String.class, UIComponentMap.class);
		mapType.putMapPropertyType("stage", String.class, UIComponentMap.class);
		mapType.putMapPropertyType("production", String.class, UIComponentMap.class);

		//Constructor constructor = new Constructor(UIComponentMap.class);
		Constructor constructor = new Constructor(mapType);

		TypeDescription uiComponentMapDescription = new TypeDescription(UIComponentMap.class);
		uiComponentMapDescription.putMapPropertyType("UIComponents", String.class , UIComponent.class);
		constructor.addTypeDescription(uiComponentMapDescription);

		System.out.println("UIComponentMapFactory loadYamlFile profile: " + profile);

		Yaml yaml = new Yaml(constructor);

		try {
			@SuppressWarnings("unchecked")
			Map<String, UIComponentMap> map = (Map<String, UIComponentMap>) yaml.load(input);
			uiComponentMap = map.get(profile);
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("UIComponentMapFactory error: " + e.getLocalizedMessage());
			return uiComponentMap;
		}
		return uiComponentMap;
	}
}
