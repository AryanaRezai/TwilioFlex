$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5191379500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
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
  "name": "Agent enters password UniversalStudios@2020",
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
  "name": "User validates contacts name",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters a message from the Agent",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies that the contact received the message",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verifies agents nickname on the widget",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User sends a message from the widget",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User verifies that the agent received the message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User verifies the info section",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User sends a canned response from the agent",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User ends the conversation",
  "keyword": "When "
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
  "duration": 2998611800,
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
  "duration": 32052667100,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d83.0.4103.106)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 14.02 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u00275CG7523PNR-LT\u0027, ip: \u002710.25.237.172\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50729}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e), userDataDir\u003dC:\\Users\\arezai\\AppData\\Local\\Temp\\scoped_dir8096_22835}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d83.0.4103.106, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: a516480c6fcf15261eaf52e457e074a8\n*** Element info: {Using\u003dname, value\u003dloginfmt}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:181)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:178)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat com.realpage.core.page.PageBase.waitForElementPresence(PageBase.java:38)\r\n\tat com.realpage.flex.FlexLogin.FlexLoginStepDefinitions.Agent_enters_User_name(FlexLoginStepDefinitions.java:80)\r\n\tat ✽.And Agent enters User name test-leasing.agent@realpage.onmicrosoft.com(src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "UniversalStudios@2020",
      "offset": 22
    }
  ],
  "location": "FlexLoginStepDefinitions.Agent_enters_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_selects_Sign_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.Agent_opens_a_widget_in_a_new_window()"
});
formatter.result({
  "status": "skipped"
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
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_ends_the_conversation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1167127700,
  "status": "passed"
});
});