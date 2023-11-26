Feature: Fillout Form

  Background:
    Given the home page is opened

    Scenario Outline: Testing first Fillout Form with correct input
      When the 'FilloutForms' is clicked
      Then user redirected to 'https://ultimateqa.com/filling-out-forms/'
      Given the 'name1' field is filled with '<name1>'
      And the 'message1' field is filled with '<message1>'
      When the 'submit' is clicked
      Then '<outputMessage>' message is shown
      Examples:
      | name1 | message1 | outputMessage            |
      | Kamal | Test1    | Thanks for contacting us |
      | David | Hello    | Thanks for contacting us |


    Scenario: Testing second FillOut Form with correct input
      When the 'FilloutForms' is clicked
      Then user redirected to 'https://ultimateqa.com/filling-out-forms/'
      Given the 'name2' field is filled with 'Kdirniyazov'
      And the 'message2' field is filled with 'Test2'
      And the 'inputCaptcha' is filled with 'result'
    

