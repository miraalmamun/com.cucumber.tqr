Feature: Login into Rediff Money 

    @Login
  Scenario:Login into Rediff Money 
	Given I open chrome 
	And I navigate to loginURL 
	And I type miraalmamun in username_id field 
	And I click on confirmEmailButton_xpath
	And I type Mimo949658 in password_id field
	And I click on loginSubmit_xpath
	Then I see login success
	And I look for "you"
	
	
	