package com.eviltester.webdriver.Google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by gft08 on 3/22/2017.
 */
public class GooglePageObject
{

    @FindBy (xpath = "//*[@id=\"FirstName\"]")
    protected WebElement userName;

    @FindBy (xpath = "//*[@id=\"LastName\"]")
    protected WebElement userSurname;

    @FindBy (xpath = "//*[@id=\"GmailAddress\"]")
    protected WebElement loginName;

    @FindBy (xpath = "//*[@id=\"Passwd\"]")
    protected WebElement loginPassword;

    @FindBy (xpath = "//*[@id=\"PasswdAgain\"]")
    protected WebElement loginConfirmPassword;

    @FindBy (xpath = "//*[@id=\"BirthDay\"]")
    protected WebElement birthDay;

    @FindBy (xpath = "//*[@id=\"BirthMonth\"]/div[1]")
    protected WebElement birthMonthMenu;

    @FindBy (xpath = "//*[@id=\":1\"]/div")
    protected WebElement birthMonthSelected;

    @FindBy (xpath = "//*[@id=\"BirthYear\"]")
    protected WebElement birthYear;

    @FindBy (xpath = "//*[@id=\"Gender\"]/div")
    protected WebElement userGenderMenu;

    @FindBy (xpath = "//*[@id=\":f\"]/div")
    protected  WebElement userGenderSelected;

    @FindBy (xpath = "//*[@id=\"RecoveryPhoneNumber\"]")
    protected WebElement telephonNumber;

    @FindBy (xpath = "//*[@id=\"RecoveryEmailAddress\"]")
    protected WebElement actualEmailAdress;

    @FindBy (xpath = "//*[@id=\":i\"]")
    protected WebElement countryMenu;

    @FindBy (xpath ="//*[@id=\":j\"]/div")
    protected WebElement countrySelected;

    @FindBy (xpath = "//*[@id=\"submitbutton\"]")
    protected WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"tos-scroll-button\"]/div/img")
    protected WebElement scroll;

    @FindBy (xpath = "//*[@id=\"iagreebutton\"]")
    protected WebElement agree;
}
