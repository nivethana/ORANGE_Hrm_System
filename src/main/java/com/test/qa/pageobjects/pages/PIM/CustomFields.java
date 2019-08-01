package com.test.qa.pageobjects.pages.PIM;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.Element;


public class CustomFields extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(CustomFields.class);

    //public static By CustomHeading=By.xpath("//*[text()=\"Defined Custom Fields\"]");
    //public static By AddCustom = By.id("buttonAdd");

    public static By AddCustomHeading= By.xpath("//*[text()=\"Add Custom Field\"]");
    public static By FieldNameInBox=By.id("customField_name");
    public static By ScreenInbox =By.id("customField_screen");
    public static By Screen =By.xpath("//*[text()=\"Screen \"]");
    public static By TypeInbox =By.id("customField_type");
    public static By Type =By.xpath("//*[text()=\"Type \"]");
    public static By SaveButton =By.id("btnSave");
    public static By SelectOption =By.xpath("//*[text()=\"Select Options \"]");
    public static By SelectOptionInbox=By.id("customField_extra_data");
//    public static String GetData(){
//        return getDriver().findElement(CustomHeading).getText();
//    }

//    public static void ClickAddCustom(){
//        getDriver().findElement(AddCustom).click();
//    }

    public static String GetData(){
        return getDriver().findElement(AddCustomHeading).getText();
    }
    public static void ClickFieldNameInBox(){
        getDriver().findElement(FieldNameInBox).click();
    }
    public static boolean IsEmptyFieldName(){
        return getDriver().findElement(FieldNameInBox).isDisplayed();
    }
    public static void CleanFieldName(){
        getDriver().findElement(FieldNameInBox).clear();
    }
    public static void SetFieldName(String value){
        getDriver().findElement(FieldNameInBox).sendKeys(value);
    }
    public static boolean IsScreenDisplay(){
        return getDriver().findElement(Screen).isDisplayed();
    }
    public static String GetSelectionScreen(){
        Select selectScreen = new Select(getDriver().findElement(ScreenInbox));
        return selectScreen.getFirstSelectedOption().getText();
    }
    public static void SetSelectScreen(String selection){
        Select selectScreen = new Select(getDriver().findElement(ScreenInbox));
        selectScreen.selectByVisibleText(selection);
    }
    public static boolean IsTypeDisplay(){
        return getDriver().findElement(Type).isDisplayed();
    }
    public static void SetType(String selection){
        Select selectType =new Select(getDriver().findElement(TypeInbox));
        selectType.selectByValue(selection);

    }
    public static String GetType(){

        Select selectType =new Select(getDriver().findElement(TypeInbox));
        return selectType.getFirstSelectedOption().getText();

    }
    public static void ClickSaveButton(){
        getDriver().findElement(SaveButton).click();
    }
    //    public static void selectOptionByValue(WebElement element, String value) {
//	if (element != null) {
//		Select option = new Select(element);
//		if (option != null) {
//			option.selectByValue(value);
//		}
//	}
    public static boolean IsSelectOptionDisplay(){
        return getDriver().findElement(SelectOption).isDisplayed();
    }
    public static void SetSelectOption(String selection){
        Select selectType =new Select(getDriver().findElement(SelectOptionInbox));
        selectType.selectByValue(selection);

    }
    public static String GetSelectOption(){

        Select selectType =new Select(getDriver().findElement(SelectOptionInbox));
        return selectType.getFirstSelectedOption().getText();

    }
}
