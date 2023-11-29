package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class giftcardStepDefs extends AbstractStepDefs{
    @Then("the {string} and {string} message is popped up")
    public void emailErrorMessageIsPoppedUp(String errorEmailMessage, String errorNameMessage){
        assertEquals(errorEmailMessage, homePage.getEmailErrorMessage());
        assertEquals(errorNameMessage, homePage.getNameErrorMessage());}

    @And("the {string} button is clicked")
    public void theCloseButtonIsClicked(String button) { homePage.clickCloseButton(button);
    }
}
