package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://demowebshop.tricentis.com/";

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    WebElement outputMessage1;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")
    WebElement outputMessage2;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement accountName;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span")
    WebElement total;

    public static final Map<String, By> navigationButtons = Map.of(
            "Login", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"),
            "Log in", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"),
            "Log out", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"),
            "Register", By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"),
            "Books", By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
    );


    public static final Map<String, By> textFields = Map.of(
            "email", By.id("Email"),
            "password", By.id("Password")
    );
    public static final Map<String, By> items = Map.of(
            "Computing and Internet", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"),
            "Fiction", By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
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
    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }
    public void clickButton(String button){
        driver.findElement(navigationButtons.get(button)).click();}
    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
    public String getOutputMessage1(){
        return outputMessage1.getText();
    }
    public String getOutputMessage2(){
        return outputMessage2.getText();
    }

    public String getAccountName(){ return accountName.getText();}

    public void addItemToCart(String item) {
    }

    public String getTotal() { return total.getText();
    }
}
