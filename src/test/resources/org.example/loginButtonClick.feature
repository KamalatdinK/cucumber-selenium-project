Feature: Fill out Form

  Background:
    Given the home page is opened

    Scenario Outline: Testing first Fill out Form with correct input
      Given the 'FillOutForms' is clicked
      And user redirected to 'https://ultimateqa.com/filling-out-forms/'
      And the 'name1' field is filled with '<name1>'
      And the 'message1' field is filled with '<message1>'
      When the 'submit' is clicked
      Then '<outputMessage>' message is shown
      Examples:
      | name1 | message1 | outputMessage            |
      | Kamal | Test1    | Thanks for contacting us |
      | David | Hello    | Thanks for contacting us |


    Scenario Outline: Testing second FillOut Form with correct input
      Given the 'FilloutForms' is clicked
      And user redirected to 'https://ultimateqa.com/filling-out-forms/'
      And the 'name2' field is filled with 'Kdirniyazov'
      And the 'message2' field is filled with 'Test2'
      And the 'inputCaptcha' is filled with 'result'
      When the 'submit2' is clicked
      Then '<outputMessage>' message is shown
      Examples:
        | name1 | message1 | outputMessage            |
        | Kamal | Test1    | Thanks for contacting us |
        | David | Hello    | Thanks for contacting us |
    

