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

@homepage
Scenario: Homepage-VideoEmbed
  Given I am on "http://www.tapqa.com/"
  When I click the video link
  Then I can watch it

@homepage
Scenario: Homepage-Solutions_Strategy
  Given I am on "http://www.tapqa.com/"
  When I hover over "Solutions" and select "Strategy"
  Then I navigate to page "http://www.tapqa.com/solutions/tapstrategy/"

@homepage
Scenario: Homepage-Solutions_Automation
  Given I am on "http://www.tapqa.com/"
  When I hover over "Solutions" and select "Automation"
  Then I navigate to page "http://www.tapqa.com/solutions/tapautomation/"

@homepage
Scenario: Homepage-Solutions_Consulting
  Given I am on "http://www.tapqa.com/"
  When I hover over "Solutions" and select "Consulting"
  Then I navigate to page "http://www.tapqa.com/solutions/tapconsulting/"

@homepage
Scenario: Homepage-Solutions_Lakeshore
  Given I am on "http://www.tapqa.com/"
  When I hover over "Solutions" and select "Lakeshore"
  Then I navigate to page "http://www.tapqa.com/solutions/nearshore/"
