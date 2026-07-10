package com.homeloan.stepdefinitions;


import com.homeloan.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class DashboardSteps {


    DashboardPage dashboardPage =
            new DashboardPage();



    @Then("Apply Home Loan option should be displayed")
    public void verifyApplyLoanButton(){


        Assertions.assertTrue(
                dashboardPage.isApplyLoanButtonDisplayed()
        );


    }



    @When("user clicks Apply Home Loan option")
    public void clickApplyLoan(){


        dashboardPage.clickApplyLoan();


        System.out.println(
                "Clicked Apply Home Loan"
        );


    }


}