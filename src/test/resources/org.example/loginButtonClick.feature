Feature: Fill out Form

  Background:
    Given the home page is opened

    Scenario Outline: Login attempts with incorrect input
      When the 'Login' is clicked
      And the 'https://demowebshop.tricentis.com/login' page is opened
      And the 'email' field is filled with '<email>'
      And the 'password' field is filled with '<password>'






    

