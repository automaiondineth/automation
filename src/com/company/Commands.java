package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Commands {
    WebDriver driver;


    //click on the object
    public void click_on_link(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    //click on the butotn
    public void clickOnutton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    //click on the type bar
    public void clickonTypeBar(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    //type command
    public void typeInTextbox(String xpath,String data){
     driver.findElement(By.xpath(xpath)).sendKeys(data);
    }




}
