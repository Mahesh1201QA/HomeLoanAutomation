package com.homeloan.utils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class ScreenshotUtil {


    public static byte[] takeScreenshot(){


        return ((TakesScreenshot) DriverManager.getDriver())
                .getScreenshotAs(OutputType.BYTES);


    }


    public static void saveScreenshot(String scenarioName){


        File screenshot =
                ((TakesScreenshot) DriverManager.getDriver())
                        .getScreenshotAs(OutputType.FILE);


        try {


            Files.copy(
                    screenshot.toPath(),
                    new File(
                            "target/screenshots/"
                                    + scenarioName
                                    + ".png"
                    ).toPath()
            );


        } catch (IOException e) {


            e.printStackTrace();


        }


    }


}