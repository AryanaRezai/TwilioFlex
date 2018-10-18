Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Widget Check"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "Aryana.Rezai@realpage.com"
    And User enters valid password "Aryana.Rezai"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User opens the widget admin url <adminUrl>
    And A chat preview is displayed in prod
    And Greeting Text is there
    And Call To Action Text is there
    And Prechat questions are there in prod
    When User navigates to Appearance in prod
    Then there is a note visible
    And there is a Text color field in prod
    And there is a Header and Button color field in prod
    Then User opens the widget url <widgetUrl>
    Then The header text is matching in prod
    When User clicks on the widget in prod
    And The text color is matching in prod
    And The header and button color is matching in prod
  

  
    
    


    Examples:
    |userName|pageName|adminUrl|widgetUrl|
    |QA Tester|LoginPagee|/8d514821-236a-445e-84d5-eecc4a14b24b/settings/widgets/4dGqfwVh4l35uSRT23yF3L|https://admin.rentjoy.com/products/widgetsearch/4dGqfwVh4l35uSRT23yF3L|
   
 
   