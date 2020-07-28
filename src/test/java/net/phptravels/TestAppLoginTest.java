package net.phptravels;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class TestAppLoginTest {
    TestAppLoginPage loginPage;
    TestAppMyHomePage homePage;
    TestAppCustomerMgtPage customerMgtPage;
    TestAppCustomerCreationPage customerCreationPage;


    @BeforeMethod
    public void setUp() throws Exception {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        loginPage=new TestAppLoginPage();

    }

    @Test
    public void testLogin() throws Exception {
        loginPage
                .loginSuccess("admin@phptravels.com", "demoadmin")
                .clickOnAccountMenu()
                .clickOnCustomerMenu()
                .addCustomer()
                .setFirstName("Training")
                .setLastName("Partner")
                .setemail("david.p.91@malinator.com")
                .setpassword("david.p.91@malinator.com")
                .setmobile("06 55 563 091")
                .selectCountry("Hungary")
                .setaddress1("3965  Jehovah Drive")
                .setaddress2("Remington")
                .selectStatus("Disabled")
                .clickOnNewsSub()
                .setcommission("5%")
                .clickOnSubmit();

    }
}
