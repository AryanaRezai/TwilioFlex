Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "ChatTestDev"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT
    And Consumer enters first name "Ary"
    And Consumer enters last name "Rez"
    And Consumer enters email address "aryana.rezai@realpage.com"
    And consumer enters phone number
    And Consumer clicks the START CHATTING button
    When Consumer is directed to the connecting page
    Then Agent desktop is logged in to
    And Agent navigates to the Tasks Page
    And Agent accepts the chat
    And Agent logs out of agent desktop
    
   
   
   
    Examples:
    |userName|pageName|agentDesk|
    |QA Tester|ConsumerWidgetPage|https://uc-agent-desktop-dev.devplaypen.com/login|
  
    
   
 
   