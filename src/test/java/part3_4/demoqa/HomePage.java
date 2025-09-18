package part3_4.demoqa;

import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtilities.scrollToElementJS;

public class HomePage extends BasePage {
    private static By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public void openFormsCard() {
        scrollToElementJS(formsCard);
         click(formsCard);
    }

}
