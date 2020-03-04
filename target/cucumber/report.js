$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4713798100,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of Flexloginpage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Agent enters User name test-leasing.agent@realpage.onmicrosoft.com",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Agent enters password Automation@2020",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Agent selects Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Agent is logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Agent opens a widget in a new window",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Consumer selects CHAT",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Consumer enters first name \"Ary\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Consumer enters last name \"Rez\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Consumer enters email address \"aryana.rezai@realpage.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Consumer clicks the START CHATTING button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User logs in to PAMM",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User validates contacts name",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters a message from the Agent",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verifies that the contact received the message",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User verifies agents nickname on the widget",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User sends a message from the widget",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User verifies that the agent received the message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verifies the info section",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User sends a canned response from the agent",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "Flexloginpage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 1370639800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test-leasing.agent@realpage.onmicrosoft.com",
      "offset": 23
    }
  ],
  "location": "FlexLoginStepDefinitions.Agent_enters_User_name(String)"
});
formatter.result({
  "duration": 3190035400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation@2020",
      "offset": 22
    }
  ],
  "location": "FlexLoginStepDefinitions.Agent_enters_password(String)"
});
formatter.result({
  "duration": 132766700,
  "status": "passed"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_selects_Sign_In()"
});
formatter.result({
  "duration": 3047090400,
  "status": "passed"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_is_logged_in()"
});
formatter.result({
  "duration": 2161159000,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.Agent_opens_a_widget_in_a_new_window()"
});
formatter.result({
  "duration": 34610364300,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id Twilio-Splitter-Pane\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u00275CG7523PNR-LT\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:997)\r\n\tat com.realpage.flex.FlexPammChat.FlexPammChatStepDefinitions.Agent_opens_a_widget_in_a_new_window(FlexPammChatStepDefinitions.java:116)\r\n\tat ✽.And Agent opens a widget in a new window(src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ChatTestStepDefinitions.Consumer_selects_CHAT()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ary",
      "offset": 28
    }
  ],
  "location": "ChatTestStepDefinitions.Consumer_enters_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rez",
      "offset": 27
    }
  ],
  "location": "ChatTestStepDefinitions.Consumer_enters_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "aryana.rezai@realpage.com",
      "offset": 31
    }
  ],
  "location": "ChatTestStepDefinitions.Consumer_enters_email_address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ChatTestStepDefinitions.Consumer_clicks_the_START_CHATTING_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_logs_in_to_PAMM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_validates_contacts_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_enters_a_message_from_the_Agent()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_that_the_contact_received_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_agents_nickname_on_the_widget()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_sends_a_message_from_the_widge()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_that_the_agent_received_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_the_info_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_sends_a_canned_response_from_the_agent()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1870629900,
  "status": "passed"
});
});