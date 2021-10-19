package com.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;
    @FindBy(xpath = "//h1")
    WebElement Header;
    @FindBy(xpath = "//*[@id='signupModalButton']")
    WebElement getStarted;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    



}
