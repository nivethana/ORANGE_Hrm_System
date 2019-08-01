package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.test.qa.pageobjects.utils.PageBase.waiTillVisible;

public class AdminDeletePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminAddPage.class);

    public static By hdrDelete=By.xpath("//*[text()=\"OrangeHRM - Confirmation Required\"]");
    public static By btnAccept=By.id("dialogDeleteBtn");
    public static By btnCancel = By.xpath("//*[@value=\"Cancel\"]");
    public static By lblRequiredDelete=By.xpath("//*[@id=\"content\"]");


    public static boolean isAlertDisplyed(){
        return getDriver().findElement(hdrDelete).isDisplayed();
    }
    public static void waitTillHeaderLoad() {
        waiTillVisible(btnAccept, 2);
    }

    public static void clickOkDelete() {
        getDriver().findElement(btnAccept).click();
    }

    public static void clickCancelDelete() {
        getDriver().findElement(btnCancel).click();
    }

    public static String getDeleteMsg(){
        return getDriver().findElement(lblRequiredDelete).getText();
    }
}
