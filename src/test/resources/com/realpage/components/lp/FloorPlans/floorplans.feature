Feature: Properties HTML Rendering


 Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Floor Plans verification"
   Given <userName> wants to navigate the content of <pageName>
   When User is directed to welcome page "welcome"
   And User clicks on Floor Plans in the sub nav
   Then User is directed to Floor Plans page "floor-plans"
   And The Apply Now button is displayed
   And User selects a move in date
   And User selects number of bedrooms 
   And User selects price range
   When User clicks on the view availability button
   Then Available apartments are displayed
   When User selects View Amenities 
   Then Amenities are displayed
   When User selects the property image
   Then a window is opened with all the images
 
  
   
   
   

   Examples:
   |userName|pageName|
   |QA Tester|lpBluePage2|