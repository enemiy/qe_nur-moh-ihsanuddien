Feature: Search
  As a user
  I want to search keyword feed
  So that I can see linkedin feed with specifics keyword

  Scenario: As user i have be able to search with keyword
    Given I am on the Home page
    When I enter specific keywords
    And I click search
    Then I am on result search page with keywords