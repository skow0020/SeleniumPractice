Feature: ContactUs

@ContactUs
Scenario: ContactUs-header
  Given I am on "http://www.tapqa.com/contact-us/"
  Then I see the contact us header
      """
      Contact Us
      """

@ContactUs
Scenario: ContactUs-LogoClick
  Given I am on "http://www.tapqa.com/contact-us/"
  When I click the logo
  Then I navigate to page "http://www.tapqa.com/"
  And I see the contact us header
    """
    Contact Us
    """

@ContactUs
Scenario: ContactUs-LogoClick
  Given I am on "http://www.tapqa.com/contact-us/"
  When I add "email" "me@email.com"
  And I add "name" "Jeff James"
  And I add "phone" "555-555-5555"
  And I add "how I heard" "Web Search"
  And I add "message" "This is a message"
  Then I can contact tapqa