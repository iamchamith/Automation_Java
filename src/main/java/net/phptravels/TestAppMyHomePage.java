package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppMyHomePage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String accountsMenuElement=prop.getProperty("TestAppMyHomePage","accounts.menu.element");
    String customerMenuElement=prop.getProperty("TestAppMyHomePage","customer.menu.element");


    public TestAppMyHomePage clickOnAccountMenu(){
        TestApp.getInstance().waitForElement(By.linkText(accountsMenuElement),20);
        driver.findElement(By.linkText(accountsMenuElement)).click();
        return this;

    }
    public TestAppCustomerMgtPage clickOnCustomerMenu(){
        TestApp.getInstance().waitForElement(By.linkText(customerMenuElement),10);
        driver.findElement(By.linkText(customerMenuElement)).click();
        return new TestAppCustomerMgtPage();

    }
}
