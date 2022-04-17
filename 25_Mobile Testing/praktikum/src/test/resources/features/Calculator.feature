Feature: As an User, I want to use calculator to perform mathematic operations
  Scenario: User perform addition
    Given user on calculator page
    And user click All Clear
    When user click number eight button
    And user click addition
    And user click number four button
    And user click equal
    Then User see result addition is "12"

    Scenario: User perform Subtraction
      Given user click All Clear
      When user click number eight button
      And user click subtraction
      And user click number four button
      And user click equal
      Then User see result Subtraction is "4"