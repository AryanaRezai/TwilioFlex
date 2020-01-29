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
    And Chat preview is displayed in uat
    Then Leasing subject is selected
    And User checks Text Messages

  


    Examples:
    |userName|pageName|adminUrl|widgetUrl|
    |QA Tester|LoginPage|https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/IzJvOwxAhOqokZZw1vitaw|https://realpageos-uat.devplaypen.com/products/widgetsearch/IzJvOwxAhOqokZZw1vitaw|
   
   