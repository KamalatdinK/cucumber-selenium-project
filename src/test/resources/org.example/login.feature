Feature: PhpTravels User Login

  Background:
    Given the home page is opened
    And the 'Login' button is clicked
    And 'LoginPage' is opened

    Scenario Outline: Incorrect login details
      Given the 'Username' field is filled with '<email>'
      And the 'Password' field is filled with '<password>'
      And the 'Login' button is clicked
      Then the '<errorMessage>' message is shown21
      Examples:
      | email                             | password           | errorMessage                                     |
      |                                      |                    | Login Details Incorrect. Please try again.       |
      |                                      | incorrect_password | Login Details Incorrect. Please try again.       |
      | user@gmai.com                        |                    | Login Details Incorrect. Please try again.       |
      | kamalatdinqdirniyazov1107@gmail.com  | SoftTest2223       | Login Details Incorrect. Please try again.       |