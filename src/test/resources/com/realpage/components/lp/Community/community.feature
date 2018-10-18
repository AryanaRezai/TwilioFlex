Feature: Properties HTML Rendering


 Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Blue Page verification"
   Given <userName> wants to navigate the content of <pageName>
   When User is directed to welcome page "welcome"
   And User clicks on Community in the sub nav
   Then User is directed to community page "community"
   And The Apply Now button is displayed
   And The Request a Tour calendar is open
   And Community text is there
   And Community Amenities are there
   And Media Gallery is there
   And Your Neighbors section is there
   When User clicks on the calendar icon
   Then the calendar will open
   And a Live chat widget is visible
   
   
    
   
   
   
   
   
   Examples:
    |userName|pageName|
    |QA Tester|lpBluePage2|