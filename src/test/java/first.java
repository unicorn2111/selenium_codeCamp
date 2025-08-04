import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class first {

    WebDriver driver;

   @BeforeTest

    public void setup()
    {
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
    }
}
