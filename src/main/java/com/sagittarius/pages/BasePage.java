package com.sagittarius.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.PropertyManager;

public abstract class BasePage
{
    protected WebDriver driver;
    private final String baseURL = PropertyManager.INSTANCE.getBaseURL();

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

   public WebDriver getDriver()
    {
        return driver;
    }

    public abstract String getUrl();
    public String getBaseURL()
    {
        return this.baseURL;
    }

    public Boolean isElementPresent(By by) {
        if (driver.findElements(by).size() > 0) {
            return true;
        } else return false;
    }

    public void quit()
    {
        driver.quit();
    }

    public void close()
    {
        driver.close();
    }
}
