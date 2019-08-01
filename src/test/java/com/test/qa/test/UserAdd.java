package com.test.qa.test;

import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.pageobjects.pages.AdminAddPage;
import com.test.qa.pageobjects.pages.AdminPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.UserPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserAdd extends TestBase{
    @Test(groups = "REGRESSION",priority = 5 , dataProvider = "AddUser",dataProviderClass = UserDetailsDataProvider.class)
    public void testAddAdminPage1(String UserRole, String EmployeeName, String Username, String Status, String Password, String Cpassword){
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest("UserAdd");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrUserManagement);
        UserPage.clickUser();
        softAssert.assertTrue(UserPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        UserPage.clickAdd();
        AdminAddPage.setSelectionRole(UserRole);
        // softAssert.assertEquals(AdminAddPage.getSelectionRole(),Constants.Add_Role_Text,"Admin is not visible");
        AdminAddPage.setEmployeename(EmployeeName);
        AdminAddPage.setUsername(Username);
        AdminAddPage.setSelectionStatus(Status);
        // softAssert.assertEquals(AdminAddPage.getSelectionStatus(),Constants.Add_Status_Text1,"Status is not visible");
        AdminAddPage.setPassword(Password);
        AdminAddPage.setConformPassword(Cpassword);
        AdminAddPage.clickAddSave();
        AdminAddPage.clickAddSave();
        PageBase.implicitWait(2);
        // softAssert.assertEquals(UserPage.getAddData(Constants.Add_Username_Text),Constants.Add_Username_Text,"User is not add");
        extentTest.log(LogStatus.PASS, " OrangeHRM User Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
