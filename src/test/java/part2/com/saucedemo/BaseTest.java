package part2.com.saucedemo;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "http://www.saucedemo.com";

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        BasePage.setDriver(driver);
        loginPage =  new LoginPage();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
