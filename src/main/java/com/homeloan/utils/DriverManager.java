package com.homeloan.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.apache.logging.log4j.Logger;

import java.time.Duration;


public class DriverManager {


    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static Logger log =
            LoggerUtil.getLogger(DriverManager.class);


    public static WebDriver getDriver() {


        if(driver.get() == null){


            log.info("Starting Edge Browser");


            System.setProperty(
                    "webdriver.edge.driver",
                    "C:\\Program Files\\WinGet\\Links\\msedgedriver.exe"
            );


            EdgeOptions options = new EdgeOptions();


            options.addArguments("--start-maximized");

            options.addArguments("--disable-notifications");


            driver.set(new EdgeDriver(options));


            driver.get()
                    .manage()
                    .timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));


            log.info("Edge Browser launched successfully");


        }


        return driver.get();

    }



    public static void quitDriver(){


        if(driver.get() != null){


            log.info("Closing Browser");


            driver.get().quit();


            driver.remove();


            log.info("Browser closed successfully");

        }


    }


}