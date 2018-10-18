Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "TextTest"
    Given <userName> wants to navigate the content of <pageName>
    When Consumer selects Text
    And Consumer enters the first name "Ary"
    And Consumer enters the last name "Rez"
    And Consumer marks the opt in box
    And Consumer enters the phone nrs
    When Consumer clicks the START TEXTING button
    Then Consumer is directed to connecting page
    When Agent logs in to desktop <agentDesk>
    And Agent navigates to Tasks Page
    And Agent accepts text
    Then Agent is directed to the bridge widget
    And Agent logs out of the agent desktop
   
    Examples:
    |userName|pageName|agentDesk|
    |QA Tester|ConsumerWidgetPage|https://uc-agent-desktop-uat.devplaypen.com/login|
  
    
   
 
   