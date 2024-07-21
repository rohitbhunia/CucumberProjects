

Feature: Contact page

  Scenario: Successful cotact form submission
    Given the user is on CloudKaptan HomePage
    And the user clicks on Contact Page
    When user enters <Company> and <Country> and <FirstName> and <LastName> and <Email> and <Mobile> and <lookingFor>
