package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs extends AbstractStepDefs{
    @Then("the {string} and {string} are shown")
    public void errorMessageIsShown(String errorMessage1, String errorMessage2){
        assertEquals(errorMessage1, homePage.getLoginError1());
        assertEquals(errorMessage2, homePage.getLoginError2());
    }

    @Then("the {string} text is shown")
    public void theEmailSAccountShown( String accountName) {
        assertEquals(accountName, homePage.getAccountName());
    }
}
