Feature: Profile
  As a user
  I want to see my profile page
  So that I can update my profile

  Scenario: As user i have be able to see my profile page
    Given I am on home page
    When I click profile picture
    Then I am on the profile page