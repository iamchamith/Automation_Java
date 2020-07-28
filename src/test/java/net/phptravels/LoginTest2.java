package net.phptravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class LoginTest2 {

    PropertyFileReader prop=new PropertyFileReader();
    String chromePath=prop.getProperty("config","chrome.path");
    String url=prop.getProperty("config","url");
    LoginPage loginPage;
    MyHomePage homePage;
    @Test
    public void testLogin() throws Exception {

            System.setProperty("webdriver.chrome.driver",chromePath);
            WebDriver driver= new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            loginPage=new LoginPage();
            loginPage.loginSuccess(driver,"admin@phptravels.com","demoadmin");
            homePage=new MyHomePage();
            homePage.clickOnAccountMenu(driver);
            homePage.clickOnCustomerMenu(driver);
    }
}
