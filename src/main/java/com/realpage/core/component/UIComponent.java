package com.realpage.core.component;

import java.util.HashMap;
import java.util.Map;

/**
 * A JavaBean object responsible for parsing and storing all the defined CQ components's elements from a YAML file
 *
 */

public class UIComponent {
	private String name = null;
	private HashMap<String, UIElement> uiElements;

	public UIComponent() {}

	public UIComponent(Map<String, UIElement> elements) {}

	// Getter for all components's elements
	public HashMap<String, UIElement> getUIElements() {
		return uiElements;
	}

	// Setter for all components's elements
	public void setUIElements(HashMap<String, UIElement> uiElements) {
		this.uiElements = uiElements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addElement(UIElement element, String name) {

	}
}
