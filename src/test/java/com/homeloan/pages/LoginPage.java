package com.homeloan.pages;


import com.homeloan.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {


    WebDriver driver;


    @FindBy(css = "[data-testid='username-input']")
    private WebElement usernameInput;


    @FindBy(css = "[data-testid='password-input']")
    private WebElement passwordInput;


    @FindBy(css = "[data-testid='login-submit-btn']")
    private WebElement loginButton;


    @FindBy(css = "[data-testid='login-card']")
    private WebElement loginCard;



    public LoginPage(){


        driver = DriverManager.getDriver();


        PageFactory.initElements(driver,this);

    }



    public void enterUsername(String username){


        usernameInput.sendKeys(username);


    }



    public void enterPassword(String password){


        passwordInput.sendKeys(password);


    }



    public void clickLogin(){


        loginButton.click();


    }



    public void login(String username,String password){


        enterUsername(username);


        enterPassword(password);


        clickLogin();


    }



    public boolean isLoginPageDisplayed(){


        return loginCard.isDisplayed();


    }


}