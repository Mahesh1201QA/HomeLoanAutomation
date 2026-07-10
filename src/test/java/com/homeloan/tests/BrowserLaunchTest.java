package com.homeloan.tests;


import com.homeloan.utils.DriverManager;
import org.openqa.selenium.WebDriver;


public class BrowserLaunchTest {


    public static void main(String[] args) {


        WebDriver driver = DriverManager.getDriver();


        driver.get("https://www.google.com");


        System.out.println("Title is : " + driver.getTitle());


        DriverManager.quitDriver();


    }


}