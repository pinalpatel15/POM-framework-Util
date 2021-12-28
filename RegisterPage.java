package com.demo.nopcommerce.page;

import com.demo.nopcommerce.utils.Constants;
import com.demo.nopcommerce.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;
    //1.Create your page object/object repository in the form of By locators.

    By Register = By.className("ico-register");
    By Gender = By.xpath("//label[@for='gender']");
    By genderFemale = By.id("gender-female");
    By Firstname = By.id("FirstName");
    By Lastname = By.id("LastName");
    By day = By.cssSelector("select[name='DateOfBirthDay']");
    By month = By.cssSelector("select[name='DateOfBirthMonth']");
    By year = By.cssSelector("select[name='DateOfBirthYear']");
    By emails = By.id("Email");
    By CompanyName = By.id("Company");
    By Newsletter = By.id("Newsletter");
    By Password = By.id("Password");
    By ConfirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By RegisterButton = By.xpath("//button[@name='register-button']");
    By Computers =By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    By Desktops = By.cssSelector("img[title='Show products in category Desktops'] ");
    By LenovoProduct = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img");
    By AddToCart = By.cssSelector("button[id='add-to-cart-button-3']");
    By ShoppingCart = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    By TermTickBox = By.xpath("//*[@id=\"termsofservice\"]");
    By Checkout = By.xpath("//*[@id=\"checkout\"]");

    // 2. Create constructor of page class public than class name
    // Constructor for initialise driver

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    // 3. Page actions/page methods

    public String getRegisterPageTitle() {
        return utils.waitForTitlePresent(Constants.REGISTER_PAGE_TITLE,2);
    }

//        String rpTitle = driver.getTitle();
//        System.out.println("Register Page title is" + rpTitle);
//        return rpTitle;


    // public void verifyRegister() {
    //    driver.findElement(Register).isDisplayed();
    // }

    public void doRegister(String firstname, String lastname, String Day, String Month, String Year,
                          String Emails, String companyName,
                           String password, String confirmPassword) throws InterruptedException {
        utils.doClick(Register);
        utils.doClick(Gender);
        utils.doClick(genderFemale);
        utils.doSendKeys(Firstname, firstname);
        utils.doSendKeys(Lastname, lastname);
        Thread.sleep(1000);
        utils.selectValueFromDropDown(day, Day);
        Thread.sleep(1000);
        utils.selectValueFromDropDown(month, Month);
        Thread.sleep(1000);
        utils.selectValueFromDropDown(year, Year);
       utils.doSendKeys(emails,Emails);
        Thread.sleep(3000);
        utils.doSendKeys(CompanyName, companyName);
        utils.doClick(Newsletter);
        Thread.sleep(4000);
        utils.doSendKeys(Password, password);
        utils.doSendKeys(ConfirmPassword, confirmPassword);
        Thread.sleep(5000);
        utils.doClick(RegisterButton);
        utils.doClick(Computers);
        utils.doClick(Desktops);
        utils.doClick(LenovoProduct);
        utils.doClick(AddToCart);
        utils.doClick(ShoppingCart);
        utils.doClick(TermTickBox);
        utils.doClick(Checkout);
        //  System.out.println("Credentials are:" + firstname + " - "
        // );

    }
}
