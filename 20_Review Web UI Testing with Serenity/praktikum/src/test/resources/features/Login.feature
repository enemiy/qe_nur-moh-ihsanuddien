Feature: Login
  As User
  I Want to see list book
  So that I can buy product

  @Normal-User
  Scenario: As User, I have be able to success login
    Given I am on home page
    And I am on login page
    When I input valid username
    And  i input valid password
    And I click login button
    Then I am on the account page

  @Wrong-User
  Scenario: As User, I input wrong password
    Given I am on home page
    And I am on login page
    When I input valid username
    And I input wrong password
    And I click login button
    Then I can see error message "Invalid username or password!"