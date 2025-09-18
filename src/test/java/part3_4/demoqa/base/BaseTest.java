package part3_4.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;

    private String DEMO_QA_URL = "https://www.demoqa.com";

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication()
    {
        driver.get(DEMO_QA_URL);
        basePage = new BasePage();
        BasePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();

    }

    @AfterClass

    public void tearDown()
    {
        driver.quit();

    }
}
