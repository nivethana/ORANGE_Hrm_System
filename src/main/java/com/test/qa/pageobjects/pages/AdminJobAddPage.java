package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class AdminJobAddPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminJobAddPage.class);

    public static By btnJobAdd=By.id("btnAdd");
    public static By btnJobDelete=By.id("btnDelete");
    public static By JobCheckbox=By.id("ohrmList_chkSelectAll");
    public static By JobTitel=By.xpath("//h1");

    public static By txtJobTitel=By.id("jobTitle_jobTitle");
    public static By txtJobDescription=By.id("jobTitle_jobDescription");
    public static By txtJobNote=By.id("jobTitle_note");
    public static By fileUploadJob=By.id("jobTitle_jobSpec");
    public static By btnSave=By.id("btnSave");
    public static By btnCancel=By.id("btnCancel");

    public static String commonAddJobTitel="//a[text()=\"JOB\"]";


    public static boolean isJobTitelDisplayed(){
        return getDriver().findElement(JobTitel).isDisplayed();
    }

    public static void clickJobAdd(){
        getDriver().findElement(btnJobAdd).click();
    }

    public static void clickJobDelete(){
        getDriver().findElement(btnJobDelete).click();
    }

    public static void checkCheckboxJob(){
        WebElement checkbox=getDriver().findElement(JobCheckbox);
        if(!checkbox.isSelected());
        checkbox.click();
    }

    public static void uncheckCheckboxJob(){
        WebElement checkbox=getDriver().findElement(JobCheckbox);
        if(checkbox.isSelected());
        checkbox.click();
    }

    public static boolean isSelectedcheckbox(){
        return getDriver().findElement(JobCheckbox).isSelected();
    }

    ///////////////////////
    public static void setJobtitel(String job){
        getDriver().findElement(txtJobTitel).sendKeys(job);
    }
    public static void setJobDescribtion(String desceib){
        getDriver().findElement(txtJobDescription).sendKeys(desceib);

    }

    public static void fileUpload(String filename){
        getDriver().findElement(fileUploadJob).sendKeys(PageBase.uploadFilepath+ File.separator+ filename);
    }
    public static void setJobNote(String note){
        getDriver().findElement(txtJobNote).sendKeys(note);

    }

    public static String getJobTitel(String job){
       return getDriver().findElement(By.xpath(commonAddJobTitel.replace("JOB",job))).getText();
    }

    public static void clickSaveJob(){
        getDriver().findElement(btnSave).click();
    }

    public static void clickCancelJob(){
        getDriver().findElement(btnCancel).click();
    }

}
