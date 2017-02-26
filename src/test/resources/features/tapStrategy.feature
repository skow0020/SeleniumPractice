Feature: Homepage

@homepage
Scenario: Homepage-header
  Given I am on "http://www.tapqa.com/solutions/tapstrategy/"
  Then I see the strategy header
      """
      tap|STRATEGY
      """
