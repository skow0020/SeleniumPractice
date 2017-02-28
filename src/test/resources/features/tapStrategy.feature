Feature: Homepage

@tapStrategy
Scenario: tapStrategy-header
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  Then I see the strategy header
      """
      tap|STRATEGY
      """

@tapStrategy
Scenario: tapStrategy-LogoClick
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I click the logo
  Then I navigate to page "http://www.tapqa.com/"
  And I see the header
    """
    We test software
    """

@tapStrategy
Scenario: tapStrategy-Solutions_Strategy
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "Solutions" and select "Strategy"
  Then I navigate to page "http://www.tapqa.com/solutions/tapstrategy/"

@tapStrategy
Scenario: tapStrategy-Solutions_Automation
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "Solutions" and select "Automation"
  Then I navigate to page "http://www.tapqa.com/solutions/tapautomation/"

@tapStrategy
Scenario: tapStrategy-Solutions_Consulting
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "Solutions" and select "Consulting"
  Then I navigate to page "http://www.tapqa.com/solutions/tapconsulting/"

@tapStrategy
Scenario: tapStrategy-Solutions_Lakeshore
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "Solutions" and select "Lakeshore"
  Then I navigate to page "http://www.tapqa.com/solutions/nearshore/"

@tapStrategy
Scenario: tapStrategy-About_Leadership
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "About" and select "Leadership"
  Then I navigate to page "http://www.tapqa.com/leadership/"

@tapStrategy
Scenario: tapStrategy-About_NewsEvents
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  When I hover over "About" and select "News"
  Then I navigate to page "http://www.tapqa.com/news-events/"
