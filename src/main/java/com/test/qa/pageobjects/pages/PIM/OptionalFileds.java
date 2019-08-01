package com.test.qa.pageobjects.pages.PIM;


import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OptionalFileds extends PageBase {

    private static final Logger LOGGER=Logger.getLogger(OptionalFileds.class);

    public static By Editconfigurattion= By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    public static By EditconfigurattionButton= By.id("btnSave");
    public static By Nicknamechk = By.id("configPim_chkDeprecateFields");
    public static By SSNchk = By.id("configPim_chkShowSSN");
    public static By SINchk = By.id("configPim_chkShowSIN");
    public static By USchk = By.id("configPim_chkShowTax");
    public static By Saveconfigurtionpim = By.id("btnSave");
    public static By Savemess = By.xpath("//*[@class=\"message success fadable\"]");




    public static void EditConfigurationButtonClick(){getDriver().findElement(EditconfigurattionButton).click();}
    public static void SaveConfigurationButtonClick(){getDriver().findElement(Saveconfigurtionpim).click();}

    public static boolean isEditconfigurationDisplayed() { return getDriver().findElement(Editconfigurattion).isDisplayed(); }

    public static boolean isconfigPim_chkDeprecateFieldsDisplayed() { return getDriver().findElement(Nicknamechk).isDisplayed(); }


    public static void ClickNickNameChk() {
        WebElement checkbox = getDriver().findElement(Nicknamechk);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void ClickSSNChk() {
        WebElement checkbox = getDriver().findElement(SSNchk);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void ClickSINChk() {
        WebElement checkbox = getDriver().findElement(SINchk);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void ClickUSChk() {
        WebElement checkbox = getDriver().findElement(USchk);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void UnClickNickNameChk() {
        WebElement checkbox = getDriver().findElement(Nicknamechk);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static void UnClickSSNChk() {
        WebElement checkbox = getDriver().findElement(SSNchk);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static void UnClickSINChk() {
        WebElement checkbox = getDriver().findElement(SINchk);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static void UnClickUSChk() {
        WebElement checkbox = getDriver().findElement(USchk);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static boolean isNickNameChecked() {
        return getDriver().findElement(Nicknamechk).isSelected();
    }
    public static boolean isSSNChecked() {
        return getDriver().findElement(SSNchk).isSelected();
    }
    public static boolean isSINChecked() {
        return getDriver().findElement(SINchk).isSelected();
    }
    public static boolean isUSChecked() {
        return getDriver().findElement(USchk).isSelected();
    }
    public static String GetData(){
        implicitWait(5);
        return getDriver().findElement(Savemess).getText();
    }
}
