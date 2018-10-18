Feature: WidgetTest HTML Rendering


  Scenario Outline: Rendering Widget Page 
  

   *Scenario Name: "WidgetTest"
     Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User expands the Naigation Menu
    And User clicks on Widget Search Page
    Then User is directed to the Widget Search Page "/products/widgetsearch"
    When User enters a Widget ID ""
    And User clicks on the search submit icon
    Then User sees information that is related to the search
    When User clicks on the Preview button
    Then User sees a payload
    And A widget is opened in less than 10 seconds
    Then the widget is enabled
    And There is a text color
    And There is a primary color
    And There is a secondary color
    And the trigger is 30 seconds
    And Proactive invitation says "Have questions about living at {property_name}? Chat with a live person right now about our community."
    And Proactive button text says "Click to chat"  
    And Cta button text says "Need Help?"
    
    
    
    Examples:
    |ID|CTA|
    |25lko1cAu5435bNODpgCYj|Need Help?|
  
    
   
 
   