package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminJobDeletePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminAddPage.class);

    public static By hdrDelete=By.xpath("//*[text()=\"OrangeHRM - Confirmation Required\"]");
    public static By btnDeleteJobTitle=By.xpath("//*[@class=\"delete\"]");
    public static By JobDeletecheckbox=By.id("ohrmList_chkSelectAll");
    public static By btnAccept=By.id("dialogDeleteBtn");
    public static By btnCancel = By.xpath("//*[@class=\"btn reset\"]");
    public static By msgSuccessDelete=By.xpath("//*[@class=\"message success fadable\"]");


    public static boolean isAlertDisplyed(){
        return getDriver().findElement(hdrDelete).isDisplayed();
    }
    public static void waitTillHeaderLoad() {
        waiTillVisible(btnAccept, 2);
    }

    public static void clickJobDelete(){
        getDriver().findElement(btnDeleteJobTitle).click();
    }

    public static void clickOkDelete() {
        getDriver().findElement(btnAccept).click();
    }

    public static void clickCancelDelete() {
        getDriver().findElement(btnCancel).click();
    }

    public static void checkCheckBox() {
        WebElement Checkbox = getDriver().findElement(JobDeletecheckbox);
        if (!Checkbox.isSelected())
            Checkbox.click();
    }

    public static void unCheckCheckBox() {
        WebElement Checkbox = getDriver().findElement(JobDeletecheckbox);
        if (Checkbox.isSelected())
            Checkbox.click();
    }

    public static boolean isCheckBoxChecked() {
        return getDriver().findElement(JobDeletecheckbox).isSelected();
    }

    public static String getDeleteMsg(){
        return getDriver().findElement(msgSuccessDelete).getText();
    }
}
