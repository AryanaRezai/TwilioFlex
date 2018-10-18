Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "SignIn"
    Given I go to login page
    When I enter valid username "john.fischelli@realpage.com"
    And I enter valid password "password"
    And I click on Login Button
    And I am directed to the Home Page "https://realpageos-uat.devplaypen.com/properties"
    

    Examples:
   ||
  
   
 

   