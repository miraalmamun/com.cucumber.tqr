Feature: Login into Rediff Money App


  @Login3
 Scenario Outline:Login in App
   Given I open <Browser>
   And I go to loginURL
   And I login inside application
   |Username|miraalmamun|
   |Password|Mimo949658 |
   Then Login should be <Result>
   
   Examples:
   |Browser|Result |
   |Mozilla|success|
   |Chrome |success|