package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities extends Utility {

    public static void scrollToElementJS(By locator) {
        WebElement el = driver.findElement(locator);

        String jsScript =  "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(jsScript,el);
    }
}
