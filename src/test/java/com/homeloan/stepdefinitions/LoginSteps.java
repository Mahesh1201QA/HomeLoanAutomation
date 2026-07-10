package com.homeloan.stepdefinitions;


import com.homeloan.pages.DashboardPage;
import com.homeloan.pages.LoginPage;
import com.homeloan.utils.ConfigReader;
import com.homeloan.utils.DriverManager;

import com.homeloan.utils.JsonReader;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;


public class LoginSteps {


    LoginPage loginPage;

    DashboardPage dashboardPage;



    @Given("user opens the home loan application")
    public void user_opens_home_loan_application(){


        DriverManager
                .getDriver()
                .get(ConfigReader.getUrl());


        loginPage = new LoginPage();


        dashboardPage = new DashboardPage();

    }



    @When("user enters login details from JSON")
    public void user_enters_login_details_from_json(){


        String username =
                JsonReader.getUserData(
                        0,
                        "username"
                );


        String password =
                JsonReader.getUserData(
                        0,
                        "password"
                );


        loginPage.enterUsername(username);


        loginPage.enterPassword(password);


    }




    @When("user clicks on login button")
    public void user_clicks_login_button(){


        loginPage.clickLogin();


    }




    @Then("user should navigate to dashboard page")
    public void verify_dashboard_page(){

        Assertions.assertTrue(
                dashboardPage.isDashboardDisplayed()
        );

        Assertions.assertEquals(
                "Admin",
                dashboardPage.getDashboardUser()
        );

        System.out.println(
                "Logged User : " + dashboardPage.getDashboardUser()
        );
    }

}