package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://phptravels.com/";

    private final WebDriver driver;



    public static final Map<String, By> navigationButtons = Map.of(
            "Login", By.xpath("/html/body/header/nav/div/div/div/a[1]"),
            "SignUp", By.xpath("/html/body/header/nav/div/div/div/a[2]")
    );
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void closePage(){
        driver.quit();
    }
    public void openPage(){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }
    public void clickButton(String button){driver.findElement(navigationButtons.get(button)).click();}


}
