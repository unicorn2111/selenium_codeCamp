package part2.com.saucedemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{



    @Test
    public void testLoginErrorMessage()
    {
        loginPage.setUsernameField("standard_user");
        loginPage.setPasswordField("secret_sauce123");
       loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
