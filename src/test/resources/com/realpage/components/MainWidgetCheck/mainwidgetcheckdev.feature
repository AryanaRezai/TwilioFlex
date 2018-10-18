Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Widget Check"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User opens the widget admin url <adminUrl>
    And A chat preview is displayed
    And User setts the status to Active
    And The widget name box is not empty
    When User navigates to Appearance 
    Then there is a note visible
    And there is a Header and Button color field
    When User clicks on save button
    Then A success message will appear on top of the page
    And The correct date format is there "https://realpageos-dev.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets"
    Then User opens the widget url <widgetUrl>
    When User clicks on the widget
    Then User selects CHAT option
    And User selects maintenance from drop down
    And Maintenance Problem Category is displayed
    When User clicks on the category drop down
    Then user can select a ctegory
    And user can give permission to enter
    Then there is a warning text visible
    And user can select pets
    And user can select entry alarm  
    Then user enters issue description
    When User deselcts any of the mandatory questions 
    And clicks on Start Chatting 
  
    Examples:
    |userName|pageName|adminUrl|widgetUrl|
    |QA Tester|LoginPage|https://realpageos-dev.devplaypen.com/property/54fadeb0-4112-438a-bf97-6febc95161bf/widgets/1Ow2ns3gl2uq3vOPVL8jRmk|https://realpageos-dev.devplaypen.com/products/widgetsearch/1Ow2ns3gl2uq3vOPVL8jRmk|
 
   