Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "ChatTest"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT
    And Consumer enters first name "Ary"
    And Consumer enters last name "Rez"
    And Consumer enters email address "aryana.rezai@realpage.com"
    And consumer enters phone number "4692165826"
    And Consumer clicks the START CHATTING button
    When Consumer is directed to the connecting page
 
   
   
   
    Examples:
    |userName|pageName|agentDesk|
    |QA Tester|ConsumerWidgetPage|https://uc-agent-desktop-uat.devplaypen.com/login|
  
    
   
 
   