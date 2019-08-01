package com.test.qa.test;


import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.pageobjects.pages.*;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserManagementTestPage extends TestBase {

    //** VerifyHomePage **

    @Test( priority = 1)
    public void testVerifyAdminPage() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        softAssert.assertTrue(UserPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        softAssert.assertAll();

    }

    @Test(groups = "REGRESSION",priority = 2)
    public void testAddAdminPage(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrUserManagement);
        UserPage.clickUser();
        softAssert.assertTrue(UserPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        UserPage.clickAdd();
        AdminAddPage.setSelectionRole(Constants.Add_Role_Text);
        softAssert.assertEquals(AdminAddPage.getSelectionRole(),Constants.Add_Role_Text,"Admin is not visible");
        AdminAddPage.setEmployeename(Constants.Add_Employee_Name_Text);
        AdminAddPage.setUsername(Constants.Add_Username_Text);
        AdminAddPage.setSelectionStatus(Constants.Add_Status_Text1);
        softAssert.assertEquals(AdminAddPage.getSelectionStatus(),Constants.Add_Status_Text1,"Status is not visible");
        AdminAddPage.setPassword(Constants.Add_User_Password);
        AdminAddPage.setConformPassword(Constants.Add_User_Password);
        AdminAddPage.clickAddSave();
        AdminAddPage.clickAddSave();
        PageBase.implicitWait(2);
        softAssert.assertEquals(UserPage.getAddData(),Constants.Add_Username_Text,"User is not add");
        softAssert.assertAll();

    }


    //********* Excelsheet Data **********



    @Test(groups = "REGRESSION",priority = 3 , dataProviderClass = UserDetailsDataProvider.class, dataProvider = "MultipleUserDetailsMsg")
    public void testSearchAdmin(String username,String role,String Employeename , String status , String message){
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");

        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrUserManagement);
       UserPage.clickUser();
        softAssert.assertTrue(UserPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        UserPage.setUsername(username);
        UserPage.setRoleSelection(role);
        softAssert.assertEquals(UserPage.getRoleSelection(),role,"Role is not equal");
        UserPage.setEmplname(Employeename);
        UserPage.setStatusSelection(status);
        softAssert.assertEquals(UserPage.getStatusSelection(),status,"Status is not equal");
        UserPage.clickSearch();

        softAssert.assertEquals(UserPage.getUsername(),message,"not equal");
        softAssert.assertAll();


    }

    @Test(groups = "REGRESSION",priority = 4)
    public void testDeleteAdminPage() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickAdminTitle(Constants.hdrUserManagement);
        UserPage.clickUser();
       UserPage.checkCheckBox();
        softAssert.assertTrue(UserPage.isCheckBoxChecked(),"checkbox is not selected");
        UserPage.clickDelete();
        PageBase.implicitWait(2);
        softAssert.assertTrue(AdminDeletePage.isAlertDisplyed(), "Alert is not Displayed");
        PageBase.implicitWait(2);
        AdminDeletePage.clickOkDelete();
        PageBase.implicitWait(2);
        softAssert.assertEquals(AdminDeletePage.getDeleteMsg(),Constants.All_Delete_MSG,"Message is not equals");
        PageBase.navigateBack();
        softAssert.assertAll();

    }



}
