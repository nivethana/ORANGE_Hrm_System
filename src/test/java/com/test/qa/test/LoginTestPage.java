package com.test.qa.test;


import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.LoginDetailsDataProvider;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestPage extends TestBase {

    //** Login Smoke test **//

    @Test(groups = "REGRESSION", priority = 1)
    public void testLogin() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        softAssert.assertAll();
    }

    //** Login verify test **

    @Test(groups = "REGRESSION", priority = 2 , dataProviderClass = LoginDetailsDataProvider.class, dataProvider = "MultipleLoginDetails")
    public void testVerifyLoginPage(String username , String Password , String massege) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LoginPage.setusername(username);
        LoginPage.setPassword(Password);
        LoginPage.clickSubmit();
        softAssert.assertEquals(LoginPage.getmassge(),massege,"Message is not equal");
        softAssert.assertAll();
    }
}
