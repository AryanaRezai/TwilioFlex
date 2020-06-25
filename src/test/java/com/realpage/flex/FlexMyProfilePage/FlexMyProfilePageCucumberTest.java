package com.realpage.flex.FlexMyProfilePage;

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
		glue = {"com.foundation.cucumber", "com.realpage.flex.FlexLogin", "com.realpage.flex.FlexMyProfilePage"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/FlexMyProfilePage/flexmyprofilepage.feature"}
		)
public class FlexMyProfilePageCucumberTest {

	
}
