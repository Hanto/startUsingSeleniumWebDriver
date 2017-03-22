package com.eviltester.webdriver.DockerHubTests;

import com.eviltester.webdriver.Base.AbstractChromeTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by gft08 on 3/22/2017.
 */
public class DHChromeTest extends AbstractChromeTest
{
    protected DHPageObject pageObject;

    private final String LOGIN_USERNAME = "hanto";
    private final String LOGIN_PASSWORD = "i1272del";
    private final String EMAIL_ADRESS = "Jhanto@gmail.com";
    private final String HOMEPAGE = "https://hub.docker.com/";


    @Before
    public void before()
    {
        pageObject = PageFactory.initElements(driver, DHPageObject.class);
        driver.navigate().to(HOMEPAGE);
    }

    @Test public void whenSignInDataIsEntered_SignInNameIsCorrect() throws Exception
    {
        pageObject.signInButton.click();
        pageObject.loginName.sendKeys(LOGIN_USERNAME);
        pageObject.loginPassword.sendKeys(LOGIN_PASSWORD);
        pageObject.loginButton.click();

        TimeUnit.MILLISECONDS.sleep(3000);

        Assert.assertEquals(
                "whenSignInDataIsEntered_SignInNameIsCorrect",
                LOGIN_USERNAME,
                pageObject.loginSucess.getText());

    }
}