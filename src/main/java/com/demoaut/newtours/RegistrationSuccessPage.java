package com.demoaut.newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegistrationSuccessPage {

    @FindBy(xpath = "//b[contains(text(),' Dear Nethmini Senanayake,')]") private WebElement userName_element;
    @FindBy(xpath = "//b[contains(text(),' Note: Your user name is david.p.91@malinator.com.')]") private WebElement note_element;

    public String getSalutationMessage(){
        TestApp.getInstance().waitForElement(By.xpath("//b[contains(text(),' Dear Nethmini Senanayake,')]"),20);
        return userName_element.getText();
    }
    public String getNoteMessage(){
        TestApp.getInstance().waitForElement(By.xpath("//b[contains(text(),' Note: Your user name is david.p.91@malinator.com.')]"),20);

        return note_element.getText();
    }
}
