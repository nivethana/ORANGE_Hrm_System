package com.test.qa.test;

import com.test.qa.pageobjects.pages.*;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdminJobPageTest extends TestBase {

//********* add Job Titel *******
    @Test(groups = "REGERESSION",priority = 1)
    public void JobtitelAddTest(){
        softAssert=new SoftAssert();
        PageBase.staticWait(2);
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrJob);
        AdminPage.clickAdminTitle(Constants.Job_Titel_Id);
        AdminJobAddPage.clickJobAdd();
        AdminJobAddPage.setJobtitel(Constants.JobTitel);
        PageBase.staticWait(2);
        AdminJobAddPage.setJobDescribtion(Constants.JobDescribsion);
        PageBase.staticWait(2);
        AdminJobAddPage.fileUpload(Constants.filename);
        PageBase.staticWait(2);
        AdminJobAddPage.setJobNote(Constants.note);
        PageBase.staticWait(2);
        AdminJobAddPage.clickSaveJob();
        PageBase.implicitWait(2);
        softAssert.assertEquals(AdminJobAddPage.getJobTitel(Constants.JobTitel),Constants.JobTitel,"job titel is not equal");
        softAssert.assertAll();
    }

    @Test(groups = "REGRESSION",priority = 2)
    public void testDeleteJobTitlePage() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrJob);
        AdminPage.clickAdminTitle(Constants.Job_Titel_Id);
        AdminJobDeletePage.checkCheckBox();
        softAssert.assertTrue(UserPage.isCheckBoxChecked(),"checkbox is not selected");
        AdminJobDeletePage.clickJobDelete();
        PageBase.implicitWait(2);
        AdminJobDeletePage.clickOkDelete();
        PageBase.implicitWait(2);
        softAssert.assertTrue(AdminJobDeletePage.getDeleteMsg().contains(Constants.Delete_Success_Msg),"Message is not equals");
       // PageBase.navigateBack();
        softAssert.assertAll();

    }

    //*******  Add Work Shift

    @Test(groups = "REGERESSION",priority = 1)
    public void WorkShiftAddTest(){
        softAssert=new SoftAssert();
        PageBase.staticWait(2);
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrJob);
        AdminPage.clickAdminTitle(Constants.Job_Work_Shift_Id);
        PageBase.implicitWait(2);
        WorkShiftPage.clickWorkShiftAdd();
        PageBase.implicitWait(2);
        WorkShiftPage.setShiftName(Constants.JobTitel);
        PageBase.staticWait(2);
        WorkShiftPage.setShiftFrom("09:00");
        PageBase.staticWait(2);
        softAssert.assertEquals(WorkShiftPage.getShiftFrom(),"09:00","not equal");
        PageBase.staticWait(2);
        WorkShiftPage.setShiftTo("12:30");
        PageBase.staticWait(2);
        softAssert.assertEquals(WorkShiftPage.getShiftTo(),"12:30","not equal");
        PageBase.implicitWait(2);
        WorkShiftPage.setShiftAvailEmp("Robert Craig");
        softAssert.assertEquals(WorkShiftPage.getShiftAvailEmp(),"Robert Craig","not equal");
        WorkShiftPage.clickWorkShiftAddArorow();
        softAssert.assertEquals(WorkShiftPage.getShiftAssineeEmp(),"Robert Craig","not equals");
        WorkShiftPage.clickWorkShiftSvae();
        softAssert.assertEquals(WorkShiftPage.getAddShiftName(),Constants.Add_Shift_Name,"Shift name is not equal");
        softAssert.assertAll();
    }
}
