package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;

import java.util.List;

public class LoginTest1 {

    PropertyFileReader prop=new PropertyFileReader();
    String chromePath=prop.getProperty("config","chrome.path");
    String url=prop.getProperty("config","url");

    @Test
    public void testLoginSuccess() throws Exception {


        System.setProperty("webdriver.chrome.driver",chromePath );//try with firefox and IE
        WebDriver driver= new ChromeDriver(); // sometime this will not open the browser, hence setproperty use
        driver.get(url);
        driver.manage().window().maximize(); //fit into the screen size
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com"); //sendkeys:typing
        driver.findElement(By.name("password")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.className("ladda-button")).click();*/
        // driver.close();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@href='#ACCOUNTS']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("CUSTOMERS")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        //WebElement firstName=driver.findElement(By.name("fname"));
        //firstName.sendKeys("David");
        /*List<WebElement> txt=driver.findElements(By.xpath("//input[@type='text']"));
        txt.get(1).sendKeys("David");
        txt.get(2).sendKeys("Peter");*/
        driver.findElement(By.name("fname")).sendKeys("David");
        driver.findElement(By.name("lname")).sendKeys("Peter");
        driver.findElement(By.name("email")).sendKeys("david.p.91@malinator.com");
        driver.findElement(By.name("password")).sendKeys("david.p.91@malinator.com");
        driver.findElement(By.name("mobile")).sendKeys("06 55 563 091");
        Select drpcountry=new Select(driver.findElement(By.name("country")));
        drpcountry.selectByIndex(6);
        Thread.sleep(3000);
        drpcountry.selectByValue("EG");
        Thread.sleep(3000);
        drpcountry.selectByVisibleText("Hungary");
        Thread.sleep(3000);
        driver.findElement(By.name("address1")).sendKeys("3965  Jehovah Drive");
        driver.findElement(By.name("address2")).sendKeys("Remington");
        Select drpstatus=new Select(driver.findElement(By.name("status")));
        drpstatus.selectByIndex(1);
        driver.findElement(By.name("newssub")).click();
        driver.findElement(By.name("commission")).sendKeys("5%");
        //driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        List<WebElement> button=driver.findElements(By.xpath("//button"));
        button.get(1).click();
    }
}
