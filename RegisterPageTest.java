package com.demo.nopcommerce.Test;

import com.demo.nopcommerce.base.BasePage;
import com.demo.nopcommerce.page.HomePage;
import com.demo.nopcommerce.page.LoginPage;
import com.demo.nopcommerce.page.RegisterPage;
import com.demo.nopcommerce.utils.Constants;
import com.demo.nopcommerce.utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeTest
    public void openBrowser()throws InterruptedException {
        Thread.sleep(5000);
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("browser");
        driver =  basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);

    }
    @Test(priority = 1)
    public void verifyRegisterPageTitleTest()  {
        String title = registerPage.getRegisterPageTitle();
        Assert.assertEquals(title, Constants.REGISTER_PAGE_TITLE);
    }

//    @DataProvider
//    public Object[][] getRegTestData(){
//    Object[][]data = ExcelUtil.getRegData(Constants.REG_SHEET_NAME);
//    return data;
//    }
    @Test(priority = 2)
    public void registerTest() throws InterruptedException {
        Thread.sleep(3000);
        registerPage.doRegister(prop.getProperty("firstname"), prop.getProperty("lastname"),
                prop.getProperty("Day"), prop.getProperty("Month"), prop.getProperty("Year"),
                prop.getProperty("Emails"), prop.getProperty("companyName"), prop.getProperty("password"),
                prop.getProperty("confirmPassword") );
        Thread.sleep(5000);
    }

  //  @AfterMethod
   // public void tearDown(){
     //   driver.quit();
   // }
}
