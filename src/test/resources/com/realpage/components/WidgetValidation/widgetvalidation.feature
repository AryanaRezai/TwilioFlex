Feature: WidgetTest HTML Rendering

  Scenario Outline: Rendering Widget Page 
  

   *Scenario Name: "WidgetTest"
    And User enters email "william.davis@realpage.com"
    And User enters password "william_davis!?"
    When User clicks on Login button
    Then User is directed to the search page
    Then User enters widget ID <ID>
    And We verify the widget
    Then CTA button will display

    Examples:
    |ID|CTA|
    |25lko1cAu5435bNODpgCYj|Need Help?|
  
    
   
 
   