package com.demoaut.newtours;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest {

    MyHomePage homePage;
    RegistrationPage registrationPage;
    RegistrationSuccessPage registrationSuccessPage;

    @BeforeMethod
    public void setUp() throws Exception {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = PageFactory.initElements(TestApp.getInstance().getDriver(), MyHomePage.class);
        registrationPage = homePage.clickOnRegisterMenu();


    }

    @Test
    public void testRegisterUser() throws Exception {
        String firstName="Nethmini";
        String lastName="Senanayake";
        registrationSuccessPage=registrationPage
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhone("06 55 563 091")
                .setEmail("david.p.91@malinator.com")
                .setuserName("Nethmini")
                .setPassword("123")
                .setConfirmPassword("123")
                .clickOnRegister();
        String messageSalutation=registrationSuccessPage.getSalutationMessage();
        Assert.assertEquals(messageSalutation, "Dear "+firstName+" "+lastName+",","Failed to create new user");
        System.out.println(messageSalutation);
        String noteMessage=registrationSuccessPage.getNoteMessage();
        Assert.assertEquals(registrationSuccessPage.getNoteMessage(), "Note: Your user name is david.p.91@malinator.com.");
        System.out.println(noteMessage);

    }


}
