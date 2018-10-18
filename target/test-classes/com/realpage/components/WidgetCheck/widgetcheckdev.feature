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
    And Greeting Text is modified
    And Call To Action Text is modified
    And Prechat questions are modified
    When User navigates to Appearance 
    Then there is a note visible
    And there is a Header and Button color field
    When User clicks on save button
    And The correct date format is there "https://realpageos-dev.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets"
    And Property Type is "Conventional"
    And the Version is "Classic"
    Then User opens the widget url <widgetUrl>
    Then The header text is matching
    When User clicks on the widget
    Then User selects CHAT option
    And Prechat questions are matching
  
    Examples:
    |userName|pageName|adminUrl|widgetUrl|
    |QA Tester|LoginPage|https://realpageos-dev.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/o1N9tZW1ZCRq5Oe1olC2Zw|https://realpageos-dev.devplaypen.com/products/widgetsearch/o1N9tZW1ZCRq5Oe1olC2Zw|
 
   