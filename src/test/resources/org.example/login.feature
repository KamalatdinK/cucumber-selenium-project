Feature: Fill out Form

  Background:
    Given the home page is opened
    #6 points
    Scenario Outline: Login attempts with incorrect input
      Given the 'Login' is clicked
      And the 'https://demowebshop.tricentis.com/login' page is opened
      And the 'email' field is filled with '<email>'
      And the 'password' field is filled with '<password>'
      When the 'Log in' is clicked
      Then the '<errorMessage1>' and '<errorMessage2>' are shown
      Examples:
      | email                           | password      | errorMessage1                                                    | errorMessage2                          |
      |                                 |               | Login was unsuccessful. Please correct the errors and try again. | No customer account found              |
      | kamalatdinqdirniyazov@gmail.com | SoftTesting   | Login was unsuccessful. Please correct the errors and try again. | The credentials provided are incorrect |
      | kamalatdinqdirniyazov@gmail.com |               | Login was unsuccessful. Please correct the errors and try again. | The credentials provided are incorrect |
      |                                 | SoftTest2023  | Login was unsuccessful. Please correct the errors and try again. | No customer account found              |

    #3 points
    Scenario: Login attempts with correct input
      Given the 'Login' is clicked
      And the 'https://demowebshop.tricentis.com/login' page is opened
      And the 'email' field is filled with 'kamalatdinqdirniyazov@gmail.com'
      And the 'password' field is filled with 'SoftTest2023'
      When the 'Log in' is clicked
      Then the 'https://demowebshop.tricentis.com/' page is opened
















    

