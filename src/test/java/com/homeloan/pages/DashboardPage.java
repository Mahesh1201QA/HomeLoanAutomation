package com.homeloan.pages;


import com.homeloan.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {


    WebDriver driver;


    @FindBy(css = "[data-testid='dashboard-page']")
    private WebElement dashboardPage;


    @FindBy(css = "[data-testid='dashboard-username']")
    private WebElement dashboardUsername;


    @FindBy(css = "[data-testid='wrong']")
    private WebElement applyLoanButton;



    public DashboardPage(){


        driver = DriverManager.getDriver();


        PageFactory.initElements(driver,this);


    }



    public boolean isDashboardDisplayed(){


        return dashboardPage.isDisplayed();


    }



    public String getLoggedInUser(){


        return dashboardUsername.getText();


    }



    public void clickApplyLoan(){


        applyLoanButton.click();


    }

    public boolean isApplyLoanButtonDisplayed(){


        return applyLoanButton.isDisplayed();


    }

    public String getDashboardUser(){


        return dashboardUsername.getText();


    }


}