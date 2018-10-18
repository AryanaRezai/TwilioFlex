Feature: Properties HTML Rendering


 Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Neighborhood verification"
   Given <userName> wants to navigate the content of <pageName>
   When User is directed to welcome page "welcome"
   And User clicks on Neighborhood in the sub nav
   Then User is directed to Neighborhood page "neighborhood"
   And The Apply Now button is displayed
   And Neighborhood search bar is displayed
   And A map is displayed
   When User extends the bar
   Then Few options are displayed
   And User minimizes the search bar window
   Then There is a Transportation section
   And There is Walk score icon "Walk Score"
   And There is transit Score icon "Transit Score"
   And There is Transportation map
   And There is Travel Time  
   And There is Transit
   Then There is a School section
   And The school section has different categories
 
   Examples:
   |userName|pageName|
   |QA Tester|lpBluePage2|