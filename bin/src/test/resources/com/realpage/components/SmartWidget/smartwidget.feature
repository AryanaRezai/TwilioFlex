Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "FlexChat"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects CHAT
    And Consumer enters first name "Ary"
    And Consumer enters last name "Rez"
    And Consumer enters email address "aryana.rezai@realpage.com"
    And consumer enters phone number
    And User enters Home size
    And User enters move in date
    And User enters number of pets
    And Consumer clicks the START CHATTING button
    Then Consumer is directed to the connecting page
  
   
   
    Examples:
    |userName|pageName|
    |QA Tester|FlexWidgetPage|
    
   
 
   