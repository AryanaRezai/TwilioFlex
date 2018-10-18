Feature: Properties HTML Rendering


 Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Blue Page verification"
   Given <userName> wants to navigate the content of <pageName>
   When User is on the welcome page "welcome"
   Then Property Name is displayed
   And Property Phone number is displayed
   And Visit Website icon is displayed
   And View on Map icon is displayed
   And Scheduale Tour box is displayed 
   When Schedule Tour is clicked
   Then A calendar is displayed
   And User picks date and time
   And User schedules a tour
   And User sees a confirmation box
   And Navigation Menu on the bottom left side is displayed
   And Apply Now box on the right corner is displayed
   And Five images on the right side of the page are displayed
   When images are clicked on 
   Then They will expand in a new window
   
   
   
   
   
   
   Examples:
    |userName|pageName|
    |QA Tester|lpBluePage2|