Feature: OlgaTool HTML Rendering

  Scenario Outline: Rendering Olga Tool 
  

   *Scenario Name: "OlgaTool"
    Given <userName> wants to navigate the content of <pageName>
    And user enters username "aryana.rezai@realpage.com"
    And user enters password "password"
    And user clicks on Login
    When user searches a widget ID <id>
    
    
   
    
  
    Examples:
    |userName|pageName|id|
    |QA Tester|OlgaTool|16MmvUQ0weS2xibO4181a81|
  
    
   
 
   