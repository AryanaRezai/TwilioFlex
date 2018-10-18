package com.realpage.ui.WidgetSearch;

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
		glue = {"com.foundation.cucumber", "com.realpage.ui.Login", "com.realpage.ui.Properties", "com.realpage.ui.WidgetSearch"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/WidgetSearch/widgetsearch.feature"}
		)
public class WidgetSearchCucumberTest {

}
