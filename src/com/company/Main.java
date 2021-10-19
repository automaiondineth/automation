package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("chromeDriver", "");
        System.getProperty("");
        driver.manage().window().maximize();
    }
}