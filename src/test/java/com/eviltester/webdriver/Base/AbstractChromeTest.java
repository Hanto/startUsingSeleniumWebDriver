package com.eviltester.webdriver.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by gft08 on 3/22/2017.
 */
public abstract class AbstractChromeTest
{
    protected WebDriver driver;

    public AbstractChromeTest(String homePage)
    {
        String currentDir = System.getProperty("user.dir");
        String chromeDriverLocation = currentDir + "/tools/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
        driver = new ChromeDriver();
        driver.navigate().to(homePage);
    }

    public void dispose()
    {
        driver.close();
        driver.quit();
    }
}
