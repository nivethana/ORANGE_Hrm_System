package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class WorkShiftPage extends PageBase {
    public static By titelWorkShift=By.id("workShiftHeading");
    public static By btnWorkShiftSAdd=By.xpath("//*[@id=\"btnAdd\"]");
    public static By btnWorkShiftDelete=By.xpath("//*[@id=\"btnDelete\"]");

    public static By txtWorkShiftName=By.id("workShift_name");
    public static By btnWorkShiftFromDropDown=By.id("workShift_workHours_from");
    public static By btnWorkShiftToDropDown=By.id("workShift_workHours_to");
    public static By AvailableEmp=By.id("workShift_availableEmp");
    public static By AssigneeEmp=By.id("workShift_assignedEmp");
    public static By btnWorkShiftArrowAdd=By.id("btnAssignEmployee");

    public static By btnSave=By.xpath("//*[@id=\"btnSave\"]");

    public static By AddShiftname=By.xpath("//*[text()=\"Robert Craig\"]");




    public static boolean isJobTitelDisplayed(){
        return getDriver().findElement(titelWorkShift).isDisplayed();
    }
    public static void clickWorkShiftAdd(){
        getDriver().findElement(btnWorkShiftSAdd).click();
    }
    public static void clickWorkShiftDelete(){
        getDriver().findElement(btnWorkShiftDelete).click();
    }

    public static void setShiftName(String name){
        getDriver().findElement(txtWorkShiftName).sendKeys(name);
    }

    public static String getShiftFrom(){
        Select option = new Select(getDriver().findElement(btnWorkShiftFromDropDown));
        return option.getFirstSelectedOption().getText();
    }

    public static void setShiftFrom(String time){
        Select option = new Select(getDriver().findElement(btnWorkShiftFromDropDown));
         option.selectByVisibleText(time);
    }


    public static String getShiftTo(){
        Select option = new Select(getDriver().findElement(btnWorkShiftToDropDown));
        return option.getFirstSelectedOption().getText();
    }

    public static void setShiftTo(String time){
        Select option = new Select(getDriver().findElement(btnWorkShiftToDropDown));
        option.selectByVisibleText(time);
    }

    public static void clickWorkShiftAddArorow(){
        getDriver().findElement(btnWorkShiftArrowAdd).click();
    }

    public static void setShiftAvailEmp(String aname){
        Select option = new Select(getDriver().findElement(AvailableEmp));
        option.selectByVisibleText(aname);
    }
    public static String getShiftAvailEmp(){
        Select option = new Select(getDriver().findElement(AvailableEmp));
       return option.getFirstSelectedOption().getText();
    }

    public static String getShiftAssineeEmp(){
        Select option = new Select(getDriver().findElement(AssigneeEmp));
        return option.getFirstSelectedOption().getText();
    }
    public static void setShiftAssineeEmp(String aname){
        Select option = new Select(getDriver().findElement(AssigneeEmp));
        option.selectByVisibleText(aname);
    }

    public static void clickWorkShiftSvae(){
        getDriver().findElement(btnSave).click();
    }

    public static String getAddShiftName(){
        return getDriver().findElement(AddShiftname).getText();
    }
}
