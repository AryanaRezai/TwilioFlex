Feature: Onboarding HTML Rendering

  Scenario Outline: Rendering Onboarding Page 
  

   *Scenario Name: "Onboarding"
     Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User expands the Naigation Menu
    And User clicks on Onboarding
    Then User is directed to the Onboarding Page "/onboard"
    And User clicks on the onboarding property search drop down
    And User enters a Property ID to onboard "22"
    Then User sees a Matching Property message "We have matched the property to the following. If this is correct, please click the onboard button below."
    Then User sees eight titles
    And User sees an Onboarding button
    When User enters a Property ID to onboard "0"
    And User clicks on the search submit icon
    Then User sees a missMatching Property message "Unable to locate the Property in the Books Api."
    When User enters a Property ID to onboard "7789"
    Then User sees an already onboarded message "This Property has already been onboarded. View the Property Page."
    And User clicks on the onboarding company search drop down
    And User enters a Company ID to onboard "22"
    Then User sees an already onboarded message "This Company has already been onboarded."
    And User enters a Company ID to onboard "0"
    Then User sees an unable to locate message "Unable to locate the Company in the Books Api."
    And User enters a Company ID to onboard "45"
    Then User sees an already onboarded message "We have matched the property to the following. If this is correct, please click the onboard button below."
    
    
    
    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 
   