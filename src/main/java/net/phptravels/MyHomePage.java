package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyHomePage {
    public void clickOnAccountMenu(WebDriver driver){

        waitUntilNextElementAppears(driver,By.linkText("ACCOUNTS"),20);
        driver.findElement(By.linkText("ACCOUNTS")).click();

    }
    public void clickOnCustomerMenu(WebDriver driver){
        waitUntilNextElementAppears(driver,By.linkText("CUSTOMERS"),10);
        driver.findElement(By.linkText("CUSTOMERS")).click();

    }

    private WebElement waitUntilNextElementAppears(WebDriver driver,By locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(locator));

        return element;
    }
}
