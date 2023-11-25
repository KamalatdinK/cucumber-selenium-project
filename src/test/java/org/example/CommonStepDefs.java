package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs{
    @Given("the home page is opened")
    public void theHomePageOpened() {homePage.openPage();}

    @Given("the {string} is clicked")
    public void theButtonIsClicked(String button){homePage.clickButton(button);}

    @AfterAll
    public static void cleanup(){homePage.closePage();}
}
