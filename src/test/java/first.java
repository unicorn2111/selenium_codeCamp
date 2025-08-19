import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {

    WebDriver driver;

   @BeforeTest

    public void setup()
    {
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void login()
    {

    }

    @AfterTest
    void teardown()
    {
        driver.quit();
        driver = null;
    }
}
