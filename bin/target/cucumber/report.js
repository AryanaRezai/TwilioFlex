<<<<<<< Updated upstream
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/Properties/properties.feature");
formatter.feature({
  "line": 1,
  "name": "Properties HTML Rendering",
  "description": "",
  "id": "properties-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6497576600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Rendering Properties Page",
  "description": "",
  "id": "properties-html-rendering;rendering-properties-page;;2",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature");
formatter.feature({
  "line": 1,
  "name": "ChatTest HTML Rendering",
  "description": "",
  "id": "chattest-html-rendering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8403951300,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Rendering Consumer Widget Page",
  "description": "",
  "id": "chattest-html-rendering;rendering-consumer-widget-page;;2",
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
  "name": "User enters valid username \"john.fischelli@realpage.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters valid password \"password\"",
=======
  "name": "Agent enters password Testflex123!",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Agent selects Sign In",
>>>>>>> Stashed changes
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Agent is logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
<<<<<<< Updated upstream
  "name": "User is directed to the Home Page \"/properties\"",
=======
  "name": "Agent opens a widget in a new window",
>>>>>>> Stashed changes
  "keyword": "And "
});
formatter.step({
  "line": 13,
<<<<<<< Updated upstream
  "name": "User expands the Naigation Menu",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Properties",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User is directed to the Properties Page \"/properties\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User sees a list of search options",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User picks Property Name",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters a Property Name 1000 Kiely",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User picks Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enters a Company Name \"Essex\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User clicks on the property search drop down",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User picks Property ID",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters a Property ID \"7789\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User clicks on the search submit icon",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User sees eight information titles",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User sees information related to the search",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User clicks on the actual property name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User is directed to the property details page \"/property/\"",
  "keyword": "Then "
=======
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
  "name": "consumer enters phone number",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Consumer clicks the START CHATTING button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User logs in to PAMM",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User validates contacts name",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User enters a message from the Agent",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User verifies that the contact received the message",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User verifies agents nickname on the widget",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User sends a message from the widget",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verifies that the agent received the message",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User verifies the info section",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User sends a canned response from the agent",
  "keyword": "And "
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
  "duration": 5216056100,
=======
  "duration": 1804364000,
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
  "duration": 68684500,
=======
  "duration": 3260526800,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "john.fischelli@realpage.com",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_username(String)"
});
formatter.result({
  "duration": 406239300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinitions.User_enters_valid_password(String)"
});
formatter.result({
  "duration": 233734700,
=======
      "val": "Testflex123!",
      "offset": 22
    }
  ],
  "location": "FlexLoginStepDefinitions.Agent_enters_password(String)"
});
formatter.result({
  "duration": 124295000,
  "status": "passed"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_selects_Sign_In()"
});
formatter.result({
  "duration": 4376561800,
  "status": "passed"
});
formatter.match({
  "location": "FlexLoginStepDefinitions.Agent_is_logged_in()"
});
formatter.result({
  "duration": 1749413000,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.Agent_opens_a_widget_in_a_new_window()"
});
formatter.result({
<<<<<<< Updated upstream
  "duration": 2751626400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/properties",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.User_is_directed_to_the_Home_Page(String)"
});
formatter.result({
  "duration": 1021270400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_expands_the_Naigation_Menu()"
});
formatter.result({
  "duration": 1231828000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_Properties()"
});
formatter.result({
  "duration": 1336629200,
=======
  "duration": 11158931900,
  "status": "passed"
});
formatter.match({
  "location": "ChatTestStepDefinitions.Consumer_selects_CHAT()"
});
formatter.result({
  "duration": 191508200,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "/properties",
      "offset": 41
    }
  ],
  "location": "PropertiesStepDefinitions.User_is_directed_to_the_Properties_Page(String)"
});
formatter.result({
  "duration": 1010715100,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 716116700,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_a_list_of_search_options()"
});
formatter.result({
  "duration": 526918300,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Property_Name()"
});
formatter.result({
  "duration": 631250800,
=======
      "val": "Ary",
      "offset": 28
    }
  ],
  "location": "ChatTestStepDefinitions.Consumer_enters_first_name(String)"
});
formatter.result({
  "duration": 485091600,
  "status": "passed"
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
  "duration": 102034400,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
<<<<<<< Updated upstream
      "val": "1000 Kiely",
      "offset": 28
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Property_Name(String)"
});
formatter.result({
  "duration": 249137600,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3101669900,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 63500,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 444379900,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 715075000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Company_Name()"
});
formatter.result({
  "duration": 646915700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Essex",
      "offset": 28
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Company_Name(String)"
});
formatter.result({
  "duration": 269790700,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3215409200,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 77400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 301228000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_property_search_drop_down()"
});
formatter.result({
  "duration": 688624400,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_picks_Property_ID()"
});
formatter.result({
  "duration": 618867400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7789",
      "offset": 27
    }
  ],
  "location": "PropertiesStepDefinitions.User_enters_a_Property_ID(String)"
});
formatter.result({
  "duration": 161038200,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_search_submit_icon()"
});
formatter.result({
  "duration": 3115419000,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_eight_information_titles()"
});
formatter.result({
  "duration": 99500,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_sees_information_related_to_the_search()"
});
formatter.result({
  "duration": 374931300,
  "status": "passed"
});
formatter.match({
  "location": "PropertiesStepDefinitions.User_clicks_on_the_actual_property_name()"
});
formatter.result({
  "duration": 805501700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/property/",
      "offset": 47
    }
  ],
  "location": "PropertiesStepDefinitions.User_is_directed_to_the_property_details_page(String)"
});
formatter.result({
  "duration": 3073933300,
=======
      "val": "aryana.rezai@realpage.com",
      "offset": 31
    }
  ],
  "location": "ChatTestStepDefinitions.Consumer_enters_email_address(String)"
});
formatter.result({
  "duration": 329570200,
  "status": "passed"
});
formatter.match({
  "location": "ChatTestStepDefinitions.consumer_enters_phone_number()"
});
formatter.result({
  "duration": 801467900,
  "status": "passed"
});
formatter.match({
  "location": "ChatTestStepDefinitions.Consumer_clicks_the_START_CHATTING_button()"
});
formatter.result({
  "duration": 185541800,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_logs_in_to_PAMM()"
});
formatter.result({
  "duration": 4700273600,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_validates_contacts_name()"
});
formatter.result({
  "duration": 460412700,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_enters_a_message_from_the_Agent()"
});
formatter.result({
  "duration": 2167389000,
>>>>>>> Stashed changes
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_that_the_contact_received_the_message()"
});
formatter.result({
  "duration": 2033989600,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_agents_nickname_on_the_widget()"
});
formatter.result({
  "duration": 42090200,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_sends_a_message_from_the_widge()"
});
formatter.result({
  "duration": 1526691600,
  "status": "passed"
});
formatter.match({
  "location": "FlexPammChatStepDefinitions.User_verifies_that_the_agent_received_the_message()"
});
formatter.result({
  "duration": 1629697000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.realpage.flex.FlexPammChat.FlexPammChatStepDefinitions.User_verifies_that_the_agent_received_the_message(FlexPammChatStepDefinitions.java:328)\r\n\tat ✽.And User verifies that the agent received the message(src/test/resources/com/realpage/components/FlexPammChat/flexpammchat.feature:25)\r\n",
  "status": "failed"
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
<<<<<<< Updated upstream
  "duration": 1727268800,
=======
  "duration": 1680811900,
>>>>>>> Stashed changes
  "status": "passed"
});
});