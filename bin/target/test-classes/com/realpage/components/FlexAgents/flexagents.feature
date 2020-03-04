Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "Flex Agents"
   Given <userName> wants to navigate the content of <pageName>
    And Agent enters User name "aryana.rezai@realpage.com"
    And Agent enters password "Realpaged@2019"
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
    And Agent navigated to Agents page
    Then Agent is In Task
    And Agent has their friendly name displayed "(Ary) In Task"
    And Agent navigates to chat and info section
    
  
   
   
    Examples:
    |userName|pageName|
    |QA Tester|Flexloginpage|
  
    
   
 
   