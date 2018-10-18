package com.realpage.ui.Onboarding;

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
		glue = {"com.foundation.cucumber", "com.realpage.ui.Login", "com.realpage.ui.Properties", "com.realpage.ui.Onboarding", "com.realpage.ui.OnboardingDev"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/Onboarding/onboardingdev.feature"}
		)
public class OnboardingDevCucumberTest {

}
