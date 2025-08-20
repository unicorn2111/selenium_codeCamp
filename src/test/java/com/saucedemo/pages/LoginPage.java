package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton =  By.id("login-button");
    private By errorMessage  = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void setUsernameField(String username){
        set(usernameField, username);
    }
    public void setPasswordField(String password){
        set(passwordField, password);
    }
    //acts as a transition method because this function will take us to another page. hence, its return type should not be void, EVER.
    public ProductsPage clickLoginButton(){
        click(loginButton);
        return new ProductsPage();
    }

    //convenience method; because all the methods related to a task is called as required in a single function call
    public ProductsPage loginToApplication(String username, String password){
        setUsernameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }
    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
}
