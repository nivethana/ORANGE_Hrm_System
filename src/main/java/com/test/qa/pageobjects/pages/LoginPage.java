package com.test.qa.pageobjects.pages;


import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import static com.test.qa.pageobjects.utils.PageBase.getDriver;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public static By hdrLoginPage=By.id("divLogo");
    public static By txtUsername=By.id("txtUsername");
    public static By txtPassword=By.id("txtPassword");
    public static By btnLogin=By.id("btnLogin");
    public static By linkForgetPassword=By.xpath("//*[@href=\"/index.php/auth/requestPasswordResetCode\"]");
    public static By msgInvalid=By.id("spanMessage");
    // login succes
    public static By markplaceDidplay=By.id("MP_link");


    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(hdrLoginPage).isDisplayed();
    }
    public static void setusername(String username) {
        getDriver().findElement(txtUsername).sendKeys(username);
    }

    public static void setPassword(String pwd) {
        getDriver().findElement(txtPassword).sendKeys(pwd);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isAlertDisply(){
        return getDriver().findElement(msgInvalid).isDisplayed();
    }
    // login success
    public static boolean MarkplaceDisply(){
        return getDriver().findElement(markplaceDidplay).isDisplayed();
    }
    public static String getmassge(){
        return getDriver().findElement(msgInvalid).getText();
    }

    public static void clickForgetpwd() {
        getDriver().findElement(linkForgetPassword).click();
    }
}
