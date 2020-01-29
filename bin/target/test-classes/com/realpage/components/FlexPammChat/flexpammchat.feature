Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "FlexPammChat"
   Given <userName> wants to navigate the content of <pageName>
    And Agent enters User name <userEmail>
    And Agent enters password <passWord>
    And Agent selects Sign In
    Then Agent is logged in
    And Agent opens a widget in a new window
    When Consumer selects CHAT
    And Consumer enters first name "Ary"
    And Consumer enters last name "Rez"
    And Consumer enters email address "aryana.rezai@realpage.com"
    And consumer enters phone number
    And Consumer clicks the START CHATTING button
    And User logs in to PAMM
    And User validates contacts name
    And User enters a message from the Agent
    And User verifies that the contact received the message
    And User verifies agents nickname on the widget
    And User sends a message from the widget
    And User verifies that the agent received the message
    And User verifies the info section
    And User sends a canned response from the agent
  
   
    Examples:
    |userName|pageName|userEmail|passWord|
    |QA Tester|Flexloginpage|test-leasing.agent@realpage.onmicrosoft.com|Testflex123!|
  
    
   
 
   