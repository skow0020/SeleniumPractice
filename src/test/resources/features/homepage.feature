Feature: Homepage

@homepage
  Scenario: Homepage-header
    Given I am on "http://www.tapqa.com/"
    Then I see the header
	    """
	    We test software
	    """

@homepage
Scenario: Homepage-LogoClick
  Given I am on "http://www.tapqa.com/"
  When I click the logo
  Then I navigate to page "http://www.tapqa.com/"

@homepage
Scenario: Homepage-TapStrategy
  Given I am on "http://www.tapqa.com/"
  When I click the strategy link
  Then I navigate to page "http://www.tapqa.com/solutions/tapstrategy/"

@homepage
Scenario: Homepage-TapAutomation
  Given I am on "http://www.tapqa.com/"
  When I click the CI link
  Then I navigate to page "http://www.tapqa.com/solutions/tapautomation/"

@homepage
Scenario: Homepage-TapEnsuring
  Given I am on "http://www.tapqa.com/"
  When I click the ensuring link
  Then I navigate to page "http://www.tapqa.com/solutions/tapconsulting/"

@homepage
Scenario: Homepage-TapSolutions
  Given I am on "http://www.tapqa.com/"
  When I click the solution link
  Then I navigate to page "http://www.tapqa.com/solutions/nearshore/"