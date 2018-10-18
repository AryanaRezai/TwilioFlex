package com.realpage.ui.WidgetCheckProd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * This runs all the defined cucumber tests
 *
 * @author:  Aryana.R
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"com.foundation.cucumber", "com.realpage.ui.Login", "com.realpage.ui.WidgetCheck", "com.realpage.ui.WidgetCheckProd"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/WidgetCheckProd/widgetcheckprod.feature"}
		)
public class WidgetCheckProdCucumberTest {

}
