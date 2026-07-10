package com.homeloan.stepdefinitions;


import com.homeloan.utils.DriverManager;
import com.homeloan.utils.LoggerUtil;
import com.homeloan.utils.ScreenshotUtil;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.logging.log4j.Logger;


public class Hooks {


    private static Logger log =
            LoggerUtil.getLogger(Hooks.class);


    @Before
    public void beforeScenario(Scenario scenario){


        log.info(
                "========== Scenario Started : "
                        + scenario.getName()
                        + " =========="
        );


    }



    @After
    public void afterScenario(Scenario scenario){


        if(scenario.isFailed()){


            log.error(
                    "Scenario Failed : "
                            + scenario.getName()
            );


            byte[] screenshot =
                    ScreenshotUtil.takeScreenshot();


            scenario.attach(
                    screenshot,
                    "image/png",
                    scenario.getName()
            );


            Allure.addAttachment(
                    scenario.getName(),
                    new ByteArrayInputStream(screenshot)
            );


            log.info(
                    "Failure screenshot attached"
            );


        }else{


            log.info(
                    "Scenario Passed : "
                            + scenario.getName()
            );

        }


        DriverManager.quitDriver();


        log.info(
                "========== Scenario Completed =========="
        );


    }


}