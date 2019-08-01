package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class AdminPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public static String commonAdminHdrTitel="TEXT";


    public static void clickAdminTitle(String id){
        getDriver().findElement(By.id(commonAdminHdrTitel.replace("TEXT",id))).click();
        LOGGER.info("TEXT"+id+"Clicked");
    }








}








