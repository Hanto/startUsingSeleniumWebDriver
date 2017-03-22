package com.eviltester.webdriver.DockerHubTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gft08 on 3/22/2017.
 */
public class DHPageObject
{

    // SIGN-UP
    //********************************************************

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[1]/div/input")
    public WebElement dockerID;

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[2]/div/input")
    public WebElement emailAdress;

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[3]/div/input")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/form/div[4]/button")
    public WebElement signUpButton;

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/div[1]/header/div/div[2]/div/div")
    public WebElement signUpSuccess;

    // LOG-IN:
    //*******************************************************

    @FindBy (xpath = "//*[@id=\"nw_login\"]")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id=\"nw_username\"]")
    public WebElement loginName;

    @FindBy (xpath = "//*[@id=\"nw_password\"]")
    public WebElement loginPassword;

    @FindBy (xpath = "//*[@id=\"nw_submit\"]")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"nw_username\"]")
    public WebElement loginSucess;
}
