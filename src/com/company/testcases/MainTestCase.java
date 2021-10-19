package com.company.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class MainTestCase {
    public static void main(String[] args) {

    }

    public void setup() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("chromeDriver", "");
        System.getProperty("");
        driver.manage().window().maximize();

    }
}