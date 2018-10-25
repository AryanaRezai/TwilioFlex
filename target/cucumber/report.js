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
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "QA Tester wants to navigate the content of LoginPage",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User have landed on Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters valid username \"john.fischelli@realpage.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters valid password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User is directed to the Home Page \"/properties\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
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
});
formatter.match({
  "arguments": [
    {
      "val": "QA Tester",
      "offset": 0
    },
    {
      "val": "LoginPage",
      "offset": 43
    }
  ],
  "location": "CucumberStepDefinitions.open_site(String,String)"
});
formatter.result({
  "duration": 5216056100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_have_landed_on_Login_Page()"
});
formatter.result({
  "duration": 68684500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
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
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_clicks_on_Login_Button()"
});
formatter.result({
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
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
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
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
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
  "status": "passed"
});
formatter.after({
  "duration": 1727268800,
  "status": "passed"
});
});