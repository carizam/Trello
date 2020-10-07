Feature: As a trello user
  I want to create a board
  So I can track the task from my project

  Scenario: Login in trello and create a new board
    Given The user is logged in trello page
    When The user creates a new board
    Then The new board is created

  Scenario: Login in trello and create a new Team
    Given The user is logged in trello
    When The user creates a new Team
    Then the new Team is created
