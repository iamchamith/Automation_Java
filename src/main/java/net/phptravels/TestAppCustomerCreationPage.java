package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class TestAppCustomerCreationPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String firstNameElement=prop.getProperty("TestAppCustomerCreationPage","first.name.element");
    String lastNameElement=prop.getProperty("TestAppCustomerCreationPage","last.name.element");
    String emailElement=prop.getProperty("TestAppCustomerCreationPage","email.element");
    String passwordElement=prop.getProperty("TestAppCustomerCreationPage","password.element");
    String mobileElement=prop.getProperty("TestAppCustomerCreationPage","mobile.number.element");
    String countryElement=prop.getProperty("TestAppCustomerCreationPage","country.element");
    String address1Element=prop.getProperty("TestAppCustomerCreationPage","address1.element");
    String address2Element=prop.getProperty("TestAppCustomerCreationPage","address2.element");
    String statusElement=prop.getProperty("TestAppCustomerCreationPage","status.element");
    String commisionElement=prop.getProperty("TestAppCustomerCreationPage","commision.element");
    String suscriberElement=prop.getProperty("TestAppCustomerCreationPage","subscriber.element");
    String submitElement=prop.getProperty("TestAppCustomerCreationPage","submit.button.element");





    public TestAppCustomerCreationPage setFirstName(String firstName){
        TestApp.getInstance().waitForElement(By.name(firstNameElement),20);
        driver.findElement(By.name(firstNameElement)).sendKeys(firstName);
        return this;
    }
    public TestAppCustomerCreationPage setLastName(String lastName){
        TestApp.getInstance().waitForElement(By.name(lastNameElement),20);
        driver.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }

    public TestAppCustomerCreationPage setemail(String email){
        TestApp.getInstance().waitForElement(By.name(emailElement),20);
        driver.findElement(By.name(emailElement)).sendKeys(email);
        return this;
    }
    public TestAppCustomerCreationPage setpassword(String password){
        TestApp.getInstance().waitForElement(By.name(passwordElement),20);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        return this;
    }
    public TestAppCustomerCreationPage setmobile(String mobile){
        TestApp.getInstance().waitForElement(By.name(mobileElement),20);
        driver.findElement(By.name(mobileElement)).sendKeys(mobile);
        return this;
    }

    public TestAppCustomerCreationPage selectCountry(String country){
        TestApp.getInstance().waitForElement(By.name(countryElement),20);
        Select drpcountry=new Select(driver.findElement(By.name(countryElement)));
        drpcountry.selectByVisibleText(country);
        return this;
    }
    public TestAppCustomerCreationPage setaddress1(String address1){
        TestApp.getInstance().waitForElement(By.name(address1Element),20);
        driver.findElement(By.name(address1Element)).sendKeys(address1);
        return this;
    }
    public TestAppCustomerCreationPage setaddress2(String address2){
        TestApp.getInstance().waitForElement(By.name(address2Element),20);
        driver.findElement(By.name(address2Element)).sendKeys(address2);
        return this;
    }

    public TestAppCustomerCreationPage selectStatus(String status){
        TestApp.getInstance().waitForElement(By.name(statusElement),20);
        Select drpstatus=new Select(driver.findElement(By.name(statusElement)));
        drpstatus.selectByVisibleText(status);
        return this;
    }

    public TestAppCustomerCreationPage clickOnNewsSub(){
        TestApp.getInstance().waitForElement(By.name(suscriberElement),20);
        driver.findElement(By.name(suscriberElement)).click();
        return this;
    }
    public TestAppCustomerCreationPage setcommission(String commission){
        TestApp.getInstance().waitForElement(By.name(commisionElement),20);
        driver.findElement(By.name(commisionElement)).sendKeys(commission);
        return this;
    }

    public TestAppCustomerMgtPage clickOnSubmit(){
        TestApp.getInstance().waitForElement(By.xpath(submitElement),20);
        driver.findElement(By.xpath(submitElement)).click();
        return new TestAppCustomerMgtPage();
    }


}
