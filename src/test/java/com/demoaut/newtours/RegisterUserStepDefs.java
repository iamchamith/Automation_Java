package com.demoaut.newtours;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TestApp;

public class RegisterUserStepDefs {
    MyHomePage homePage;
    RegistrationPage registrationPage;
    RegistrationSuccessPage registrationSuccessPage;

    @Given("^User is on Mercury Home Page --> Registration Page$")
    public void setUp(){
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = PageFactory.initElements(TestApp.getInstance().getDriver(), MyHomePage.class);
        registrationPage = homePage.clickOnRegisterMenu();
    }

    @Given("^User Fills First Name as \"([^\"]*)\"$")
    public void setFirstNameAs(String firstName){
        registrationPage.setFirstName(firstName);
    }

    @And("^User Fills Last Name as \"([^\"]*)\"$")
    public void LastNameAs(String lastName){
        registrationPage.setLastName(lastName);
    }

    @And("^User Fills Phone Number as \"([^\"]*)\"$")
    public void setPhoneNumberAs(String phone){
        registrationPage.setPhone(phone);

    }

    @And("^User Fills Email as \"([^\"]*)\"$")
    public void setEmailAs(String email){
        registrationPage.setEmail(email);
    }

    @And("^User Fills User Name as \"([^\"]*)\"$")
    public void setUserNameAs(String userName){
        registrationPage.setuserName(userName);
    }

    @And("^User Fills Passoword as \"([^\"]*)\"$")
    public void setPassowordAs(String password){
        registrationPage.setPassword(password);
    }

    @And("^User Fills Confrim Password as \"([^\"]*)\"$")
    public void setConfrimPasswordAs(String password){
        registrationPage.setConfirmPassword(password);
    }

    @When("^User Clicks on Submit Button$")
    public void clicksOnSubmitButton(){
       registrationSuccessPage=registrationPage.clickOnRegister();
    }

    @Then("^Note should denote your User Name is \"([^\"]*)\"$")
    public void noteShouldDenoteYourUserNameIs(String username){
        String noteMessage=registrationSuccessPage.getNoteMessage();
        Assert.assertEquals(noteMessage, "Note: Your user name is "+username+".");

    }
}
