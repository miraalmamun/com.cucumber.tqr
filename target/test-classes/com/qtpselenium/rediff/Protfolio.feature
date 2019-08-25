@Portfolio
Feature: Title of your feature
  I want to use this template for my feature file
	
	Background:
  Given I open Chrome
  And I go to loginURL
  And I login inside application
    |Username|miraalmamun|
    |Password|Mimo949658 |

  @CreatePortFolio
  Scenario: Creating a Portfolio
    And I click createPortFolio_id and wait for portfolioName_id
    And I clear portfolioName_id
    And I type Port12345 in portfolioName_id field
    And I click on portFolioSubmit_id
#    Then I see Port12345 is added to my portfolioAddedSelection_id 
       
  @DeletePortFolio
  Scenario: Deleting a Portfolio
    And I wait for page to load
    And I select Port12345 from portfolioAddedSelection_xpath
    And I wait for page to load
    And I click on deletePortfolio_id
    When I accept alert
#    Then Portfolio should be deleted