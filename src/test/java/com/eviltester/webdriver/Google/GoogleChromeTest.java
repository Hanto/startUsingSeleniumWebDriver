package com.eviltester.webdriver.Google;

import com.eviltester.webdriver.Base.AbstractChromeTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by gft08 on 3/22/2017.
 */
public class GoogleChromeTest extends AbstractChromeTest
{
    protected GooglePageObject pageObject;

    private final String ACCOUNT_CREATION = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default";
    private final String USER_NAME = "Pepito";
    private final String USER_SURNAME = "DeLosPalotes";
    private final String LOGINNAME = "SuperPepitoDeLosPalotes";
    private final String LOGINPASSWORD = "pepito1131";
    private final int BIRTH_DAY = 1;
    private final int BIRTH_MONTH = 1;
    private final int BIRTH_YEAR = 2000;
    private final int GENDER = 2;
    private final int TEL_NUMBER = 617456799;
    private final String ACTUAL_EMAIL = "actualEmailPepito@gmail.com";

    @Before
    public void before() throws Exception
    {
        pageObject = PageFactory.initElements(driver, GooglePageObject.class);
        driver.navigate().to(ACCOUNT_CREATION);
        createUserAccount();
    }

    private void createUserAccount() throws Exception
    {
        pageObject.userName.sendKeys(USER_NAME);
        pageObject.userSurname.sendKeys(USER_SURNAME);
        pageObject.loginName.sendKeys(LOGINNAME);
        pageObject.loginPassword.sendKeys(LOGINPASSWORD);
        pageObject.loginConfirmPassword.sendKeys(LOGINPASSWORD);

        pageObject.birthDay.sendKeys(Integer.toString(BIRTH_DAY));

        pageObject.birthMonthMenu.click();
        pageObject.birthMonthSelected.click();

        pageObject.birthYear.sendKeys(Integer.toString(BIRTH_YEAR));

        pageObject.userGenderMenu.click();
        pageObject.userGenderSelected.click();

        pageObject.telephonNumber.sendKeys(Integer.toString(TEL_NUMBER));
        pageObject.actualEmailAdress.sendKeys(ACTUAL_EMAIL);

        pageObject.countryMenu.click();
        pageObject.countrySelected.click();

        pageObject.submitButton.click();

        pageObject.scroll.click();

        TimeUnit.MILLISECONDS.sleep(3000);

        pageObject.agree.click();

    }

    private static void selectByIndex(WebElement webElement, int index)
    {
        webElement.click();
        Select select = new Select(webElement);
        select.selectByIndex(index);
        webElement.submit();
    }

    @Test
    public void whenSignUpIsEntered_SignInNameIsCorrect() throws Exception
    {

    }

    @Override
    public void after()
    {

        //super.after();
    }
}
