package com.test.qa.pageobjects.pages.PIM;


import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class PIMPage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(PIMPage.class);

    public static By configSub= By.id("menu_pim_Configuration");
    public static By EmployeeListSub= By.id("menu_pim_viewEmployeeList");
    public static By AddEmployeeSub= By.id("menu_pim_addEmployee");
    public static By ReportSub= By.id("menu_core_viewDefinedPredefinedReports");
   // public static By CustomFieldsSubSub=By.id("/index.php/pim/listCustomFields");

    public static void ConfigSubClick(){getDriver().findElement(configSub).click();}
    public static void EmployeeListSubClick(){getDriver().findElement(EmployeeListSub).click();}
    public static void AddEmployeeSubClick(){getDriver().findElement(AddEmployeeSub).click();}
    public static void ReportSubClick(){getDriver().findElement(ReportSub).click();}
}
