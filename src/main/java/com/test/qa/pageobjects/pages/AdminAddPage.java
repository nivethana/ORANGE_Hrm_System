package com.test.qa.pageobjects.pages;


import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdminAddPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminAddPage.class);

    public static By txtAddUsername = By.id("systemUser_userName");
    public static By txtAddEmplname = By.id("systemUser_employeeName_empName");
    public static By txtAddUserRole = By.id("systemUser_userType");
    public static By btnAddCancel = By.xpath("//*[@id=\"btnCancel\"]");
    public static By txtAddStatus = By.id("systemUser_status");
    public static By txtAddPassword = By.id("systemUser_password");
    public static By txtAddConformPassword = By.xpath("//*[@id=\"systemUser_confirmPassword\"]");
    public static By btnAddSave = By.xpath("//*[@id=\"btnSave\"]");


    public static boolean isAdminPageDisplayed() {
        return getDriver().findElement(btnAddSave).isDisplayed();
    }

    public static void clickAddSave() {
        getDriver().findElement(btnAddSave).click();
    }

    public static void clickAddCancel() {
        getDriver().findElement(btnAddCancel).click();
    }


    public static void setEmployeename(String Empname) {
        getDriver().findElement(txtAddEmplname).sendKeys(Empname);
    }

    public static void setUsername(String username) {
        getDriver().findElement(txtAddUsername).sendKeys(username);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtAddPassword).sendKeys(password);
    }

    public static void setConformPassword(String Confpassword) {
        getDriver().findElement(txtAddConformPassword).sendKeys(Confpassword);
    }

    public static String getSelectionRole() {
        Select option = new Select(getDriver().findElement(txtAddUserRole));
        return option.getFirstSelectedOption().getText();
    }

    public static void setSelectionRole(String role) {
        Select option = new Select(getDriver().findElement(txtAddUserRole));
        option.selectByVisibleText(role);
    }

    public static String getSelectionStatus() {
        Select option = new Select(getDriver().findElement(txtAddStatus));
        return option.getFirstSelectedOption().getText();
    }

    public static void setSelectionStatus(String status) {
        Select option = new Select(getDriver().findElement(txtAddStatus));
        option.selectByVisibleText(status);
    }


}