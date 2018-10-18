package com.realpage.core.component;

public class UIElement {
	private String name;
	private String idSelector;
	private String cssSelector;
	private String className;
	private String xpathSelector;

	public UIElement() {}

	public UIElement( String name, String idSelector, String cssSelector, String className, String xpathSelector) {
		this.setName(name);
		this.setIdSelector(idSelector);
		this.setCssSelector(cssSelector);
		this.setClassName(className);
		this.setXpathSelector(xpathSelector);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdSelector() {
		return idSelector;
	}

	public void setIdSelector(String idSelector) {
		this.idSelector = idSelector;
	}

	public String getCssSelector() {
		return cssSelector;
	}

	public void setCssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getXpathSelector() {
		return xpathSelector;
	}

	public void setXpathSelector(String xpathSelector) {
		this.xpathSelector = xpathSelector;
	}
}
