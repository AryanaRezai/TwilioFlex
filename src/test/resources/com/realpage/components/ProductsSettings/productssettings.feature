Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Products - Settings"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User navigates to the Proprty Product URL <prodUrl> 
    When User picks Chat For Leasing
    And User navigates to Settings Page 
    Then The Leasing settings Card is displayed
    When User navigates to the widget <WidgetPage>
    Then The Leasing Subject is displayed 
    When User navigates back to Products 
    And User selects Chat for Maintenance
    And User navigates to Settings Page 
    Then The Maintenance settings Card is displayed
    When User navigates to the widget <WidgetPage>
    Then The Maintenance Subject is displayed 
    When User navigates back to Products
    And User selects Text for Leasing
    And User navigates to Settings Page
    Then The Phone Numbers card is displayed
    And the IVR Greeting Menus is displayed
    When User navigates to the widget <WidgetPage> 
    Then Text Messages option is Enabled under Leasing subject
    When User navigates back to Products  
    And User selects Text for Maintenance
    And User navigates to Settings Page
    Then The Phone Numbers card is displayed
    And the IVR Greeting Menus is displayed
    When User navigates to the widget <WidgetPage> 
    Then Text Messages option is Enabled under Maintenance subject
    And User unmarks all the options
  
    
   
  
    Examples:
    |userName|pageName|prodUrl|WidgetPage|
    |QA Tester|LoginPage|https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/products|https://realpageos-uat.devplaypen.com/property/8d514821-236a-445e-84d5-eecc4a14b24b/widgets/l6gSG9m8NAHKW2hRrY25Wg|
   
 
   