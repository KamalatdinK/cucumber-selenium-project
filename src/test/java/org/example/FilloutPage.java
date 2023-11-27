package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FilloutPage extends AbstractStepDefs {
    @Then("{string} message is shown")
    public void thanksForContactingUsMessageIsShown(String outputMessage)  {

        assertEquals(outputMessage, homePage.getOutputMessage());
    }

    @Given("the {string} is filled with {string}")
    public void theCaptchaContainerIsFilledWithResult() { homePage.fillCaptcha();
    }
}
