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
    And A chat preview is displayed in uat
    And The widget name box is not empty
    And Greeting Text is there in uat
    And Call To Action Text is there in uat
    And Prechat questions are there in uat
    When User navigates to Appearance in uat
    Then there is a note visible
    And there is a Text color field in uat
    And there is a Header and Button color field
    Then User opens the widget url <widgetUrl>
    Then The header text is matching in uat
    When User clicks on the widget in uat
    And The text color is matching in uat
    And The header and button color is matching in uat
  


    Examples:
    |userName|pageName|adminUrl|widgetUrl|
    |QA Tester|LoginPage|https://realpageos-uat.devplaypen.com/property/54fadeb0-4112-438a-bf97-6febc95161bf/widgets/l6gSG9m8NAHKW2hRrY25Wg|https://realpageos-uat.devplaypen.com/products/widgetsearch/l6gSG9m8NAHKW2hRrY25Wg|
    |QA Tester|LoginPage|https://realpageos-uat.devplaypen.com/property/54fadeb0-4112-438a-bf97-6febc95161bf/widgets/3cE2o9POxJDrgQLAtbqzg|https://realpageos-uat.devplaypen.com/products/widgetsearch/3cE2o9POxJDrgQLAtbqzg|
    |QA Tester|LoginPage|https://realpageos-uat.devplaypen.com/property/54fadeb0-4112-438a-bf97-6febc95161bf/widgets/Ya1ITCXgNMc6EVQ2446n7A|https://realpageos-uat.devplaypen.com/products/widgetsearch/Ya1ITCXgNMc6EVQ2446n7A|
   