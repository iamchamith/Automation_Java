package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppCustomerMgtPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String addButtonElement=prop.getProperty("TestAppCustomerMgtPage","add.button.element");

    public TestAppCustomerCreationPage addCustomer(){
        driver.navigate().refresh();
        TestApp.getInstance().waitForElement(By.xpath(addButtonElement),20);
        driver.findElement(By.xpath(addButtonElement)).click();
        return new TestAppCustomerCreationPage();
    }
}
