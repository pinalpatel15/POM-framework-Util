package com.demo.nopcommerce.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils {
    WebDriver driver;
    WebElement element;
    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        element = driver.findElement(locator);
        return element;
    }

    public void doSendKeys(By locator, String value) {
       getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator) {
        getElement(locator).click();
    }

    public String waitForTitlePresent(String titleValue, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.titleIs(titleValue));
        return driver.getTitle();
    }

    public boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

   public String doGetText(By locator) {
       return getElement(locator).getText();
    }

    public void selectValueFromDropDown(By locator,String value) {

        Select select = new Select(getElement(locator));
        select.selectByVisibleText(value);

    }

        }



