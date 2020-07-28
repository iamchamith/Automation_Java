package com.demoaut.newtours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class RegistrationPage {

    @FindBy(name = "firstName") private WebElement firstName_element;
    @FindBy(name = "lastName") private WebElement lastName_element;
    @FindBy(name = "phone") private WebElement phone_element;
    @FindBy(name = "userName") private WebElement email_element;
    @FindBy(name = "email") private WebElement userName_element;
    @FindBy(name = "password") private WebElement password_element;
    @FindBy(name = "confirmPassword") private WebElement confirmPassword_element;
    @FindBy(name = "register") private WebElement submit_element;

    public RegistrationPage setFirstName(String firstName){
        firstName_element.sendKeys(firstName);

        return this;
    }

    public RegistrationPage setLastName(String lastName){
        lastName_element.sendKeys(lastName);

        return this;//object is declared as this
    }


    public RegistrationPage setPhone(String phone){//take mobile no as a string because int can have only 10 numbers(mob can have 12 numbers with country code)
        phone_element.sendKeys(phone);

        return this;
    }

    public RegistrationPage setuserName(String email){
        email_element.sendKeys(email);

        return this;
    }

    public RegistrationPage setEmail(String userName){
        userName_element.sendKeys(userName);

        return this;
    }


    public RegistrationPage setPassword(String password){
        password_element.sendKeys(password);

        return this;
    }


    public RegistrationPage setConfirmPassword(String confirmPassword){
        confirmPassword_element.sendKeys(confirmPassword);

        return this;//object is declared as this
    }

    public RegistrationSuccessPage clickOnRegister(){
        submit_element.click();

        return PageFactory.initElements(TestApp.getInstance().getDriver(),RegistrationSuccessPage.class);
    }
}
