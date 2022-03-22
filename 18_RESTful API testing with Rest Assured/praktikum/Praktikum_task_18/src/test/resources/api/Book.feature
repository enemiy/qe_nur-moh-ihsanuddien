Feature: Book
  As an admin
  I want to see book
  So that I can create new book
  Scenario: GET - As admin I have be able to get detail book
    Given I set GET api Endpoints
    When I send GET HTTP Request
    Then I receive valid HTTP Response Code 200
    And I receive valid data for detail book