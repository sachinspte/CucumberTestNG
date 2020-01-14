Feature: Contact Page Details
  Scenario: Adding contact page details
    Given user is on home page
    When user click on conact page
    Then user click on New button and enters users details
    Then user click on save button
    Then verify Success message
    Then close the brouser

  Scenario: Deleting contact page details
    Given user is on home page
    When user click on conact page
    When Select the user that is to be deleted
    Then Click on Delete Item
    Then Validate the delete message and contact page
    Then close the brouser