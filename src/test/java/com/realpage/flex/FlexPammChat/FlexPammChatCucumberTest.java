package com.realpage.flex.FlexPammChat;

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
		glue = {"com.foundation.cucumber", "com.realpage.flex.FlexLogin", "com.realpage.flex.ChatTest", "com.realpage.flex.FlexPammChat"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature"}
		)
public class FlexPammChatCucumberTest {

}
