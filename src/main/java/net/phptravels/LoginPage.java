package net.phptravels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    public void loginSuccess(WebDriver driver,String userName, String password){
        driver.findElement(By.name("email")).sendKeys(userName); //sendkeys:typing
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
