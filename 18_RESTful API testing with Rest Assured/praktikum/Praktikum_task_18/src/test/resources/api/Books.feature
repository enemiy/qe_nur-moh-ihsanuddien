Feature: Books
  As an admin
  I want to see list of books
  So that I can create new list of books
  Scenario: GET - As admin I have be able to get detail collection of books
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail books