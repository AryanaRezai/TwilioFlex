package com.realpage.core.component;

import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A JavaBean object responsible for parsing and storing all the defined CQ page components from a YAML file
 *
 */

public class UIComponentMap {
	private HashMap<String, UIComponent> uiComponents;

	public UIComponentMap() {
		System.out.println("\n***** UIComponentMap ******");
		uiComponents = new HashMap<String, UIComponent>();
	}

	public UIComponentMap(HashMap<String, UIComponent> uiComponents) {
		this.setUIComponents(uiComponents);
	}

	// Getter for all components's elements
	public HashMap<String, UIComponent> getUIComponents() {
		return uiComponents;
	}

	// Setter for all components's elements
	public void setUIComponents(HashMap<String, UIComponent> uiComponents) {
		this.uiComponents = uiComponents;
	}

	public String getNameFor(String component, String element) {
		UIElement requestedElement = getElement(component, element);
		if(requestedElement != null) {
			return requestedElement.getName();
		}

		return null;
	}

	public By getIdSelectorFor(String component, String element) {
		System.out.println("UIComponentMap getIdSelectorFor components: " + component);
		System.out.println("UIComponentMap getIdSelectorFor element: " + element);
		UIElement requestedElement = getElement( component, element);
		if(requestedElement != null) {
			System.out.println("UIComponentMap getIdSelectorFor requestedElement1: " + requestedElement);
			System.out.println("UIComponentMap getIdSelectorFor requestedElement2: " + By.id(requestedElement.getIdSelector()));
			return By.id(requestedElement.getIdSelector());
		}

		return null;
	}

	public By getCssSelectorFor(String component, String element) {
		System.out.println("UIComponentMap getCssSelectorFor components: " + component);
		System.out.println("UIComponentMap getCssSelectorFor element: " + element);
		UIElement requestedElement = getElement( component, element);
		if(requestedElement != null) {
			System.out.println("UIComponentMap getCssSelectorFor requestedElement1: " + requestedElement);
			System.out.println("UIComponentMap getCssSelectorFor requestedElement2: " + By.id(requestedElement.getCssSelector()));
			return By.cssSelector(requestedElement.getCssSelector());
		}

		return null;
	}

	public String getClassNameFor(String component, String element) {
		System.out.println("UIComponentMap getClassNameFor components: " + component);
		System.out.println("UIComponentMap getClassNameFor element: " + element);
		UIElement requestedElement = getElement( component, element);
		if(requestedElement != null) {
			System.out.println("UIComponentMap getClassNameFor requestedElement1: " + requestedElement);
			System.out.println("UIComponentMap getClassNameFor requestedElement2: " + requestedElement.getClassName());
			return requestedElement.getClassName();
		}

		return null;
	}

	public By getClassNameSelectorFor(String component, String element) {
		System.out.println("UIComponentMap getClassNameSelectorFor components: " + component);
		System.out.println("UIComponentMap getClassNameSelectorFor element: " + element);
		UIElement requestedElement = getElement( component, element);
		if(requestedElement != null) {
			System.out.println("UIComponentMap getClassNameSelectorFor requestedElement1: " + requestedElement);
			System.out.println("UIComponentMap getClassNameSelectorFor requestedElement2: " + By.className(requestedElement.getClassName()));
			return By.className(requestedElement.getClassName());
		}

		return null;
	}

	public By getXpathSelectorFor(String component, String element) {
		UIElement requestedElement = getElement( component, element);
		System.out.println("UIComponentMap getXpathSelectorFor components: " + component);
		System.out.println("UIComponentMap getXpathSelectorFor element: " + element);
		if(requestedElement != null) {
			System.out.println("UIComponentMap getXpathSelectorFor requestedElement1: " + requestedElement);
			System.out.println("UIComponentMap getXpathSelectorFor requestedElement2: " + By.xpath(requestedElement.getXpathSelector()));
			return By.xpath(requestedElement.getXpathSelector());
		}

		return null;
	}

	private UIElement getElement(String component, String element) {
		UIComponent requestedComponent = (UIComponent) uiComponents.get(component);
		System.out.println("UIComponentMap getElement components: " + component);
		System.out.println("UIComponentMap getElement element: " + element);
		if(requestedComponent != null) {
			UIElement requestedElement = requestedComponent.getUIElements().get(element);
			System.out.println("UIComponentMap getElement requestedElement: " + requestedElement);
			if(requestedElement != null) {return requestedElement;}else{return null;}
		}
		return null;
	}

	public UIComponent getComponent(String key) {
		UIComponent requestedComponent = (UIComponent) uiComponents.get(key);
		System.out.println("UIComponentMap getComponent key: " + key);
		return requestedComponent;
	}

	public void addUIComponentMap(HashMap<String, UIComponent> map) {
		for (Entry<String, UIComponent> entry : map.entrySet()) {
			System.out.println("UIComponentMap addUIComponentMap map key: " + entry.getKey() + " | val: " + entry.getValue().toString());
			this.uiComponents.put(entry.getKey(), entry.getValue());
		}
	}
}
