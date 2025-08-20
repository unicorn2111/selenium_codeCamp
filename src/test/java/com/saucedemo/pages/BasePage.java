package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//(abstract classes cannot be instantiated)
public abstract class BasePage {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }
    protected void set(By locator, String value) {

        find(locator).clear();
        find(locator).sendKeys(value);

    }
    protected void click(By locator) {
        find(locator).click();
    }
}
