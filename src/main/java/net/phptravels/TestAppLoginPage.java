package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppLoginPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String userNameElement=prop.getProperty("TestAppLoginPage","user.name.element");
    String passwordElement=prop.getProperty("TestAppLoginPage","password.element");
    String loginButtonElement=prop.getProperty("TestAppLoginPage","login.button.element");

    public TestAppMyHomePage loginSuccess(String userName, String password){
        loginAs(userName,password);
        return new TestAppMyHomePage();
    }

    public TestAppLoginPage loginUnsuccess(String userName, String password){
        loginAs(userName,password);
        return this;
    }

    private void loginAs(String userName, String password){
        TestApp.getInstance().waitForElement(By.name(userNameElement),20);
        driver.findElement(By.name(userNameElement)).sendKeys(userName);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginButtonElement)).click();
    }
}
