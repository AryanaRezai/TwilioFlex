Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Properties Products"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    When User navigates to "https://realpageos-dev.devplaypen.com/property/5de65574-31c3-445c-8131-bfbe175f9723"
    Then User is directed to the property details page "/property/"
    When user selects Transfer Tab
    Then User is directed to the Transfer page "/property/5de65574-31c3-445c-8131-bfbe175f9723/transfer"
    When user opens the drop down
    And user searches for a company 
    Then user selects that searched company
    When user clicks on Transfer
    Then User sees a success message "Property transferred successfully."
    When User searched the same company again
    Then that specific company is not there anymore
    Then Reverse back
    Examples:
    |userName|pageName|propName|
    |QA Tester|LoginPage|1000 Kiely|
  
   
 
   