package com.demoaut.newtours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class MyHomePage {
    @FindBy(linkText = "REGISTER") private WebElement register_menu_element;

    public RegistrationPage clickOnRegisterMenu(){
        register_menu_element.click();

     return PageFactory.initElements(TestApp.getInstance().getDriver(),RegistrationPage.class);//object is declared as this
    }
}

