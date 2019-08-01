package com.test.qa.test.PIMTests;


import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.PIM.CustomFields;
import com.test.qa.pageobjects.pages.PIM.OptionalFileds;
import com.test.qa.pageobjects.pages.PIM.PIMPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ConfigurationTest extends TestBase {
    @Test(priority = 1)
    public void EditConfigurePMI() {
        softAssert = new SoftAssert();
        HomePage.clickLink(Constants.PMI_SUB_LINK);
        PIMPage.ConfigSubClick();
        HomePage.clickLink(Constants.CONFIG_OPTION_LINK);
        softAssert.assertTrue(OptionalFileds.isEditconfigurationDisplayed(), "Edit Configuration Page is not Displayed");
        softAssert.assertTrue(OptionalFileds.isconfigPim_chkDeprecateFieldsDisplayed(), "Configuration Page is editable");
        OptionalFileds.EditConfigurationButtonClick();
        softAssert.assertTrue(OptionalFileds.isconfigPim_chkDeprecateFieldsDisplayed(), "NickName Check box is editable");
        OptionalFileds.ClickNickNameChk();
        softAssert.assertTrue(OptionalFileds.isNickNameChecked(), "NickNamecheck is not Checked");
        OptionalFileds.UnClickSSNChk();
        softAssert.assertFalse(OptionalFileds.isSSNChecked(), "SSN check is Checked");
        OptionalFileds.SaveConfigurationButtonClick();
        softAssert.assertTrue(OptionalFileds.GetData().contains(Constants.SAVE_SUCCESS_MESSAGE), "invalid message");
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void AddCustomPIM() {
        softAssert = new SoftAssert();
        HomePage.clickLink(Constants.PMI_SUB_LINK);
        PIMPage.ConfigSubClick();
        HomePage.clickLink(Constants.CUSTOM_FIELDS_LINK);
        // softAssert.assertEquals(CustomFields.GetData(),Constants.CUSTOM_HEADING, "invalid text");
        softAssert.assertEquals(CustomFields.GetData(),Constants.ADD_CUSTOM_HEADING, "invalid text");
        softAssert.assertTrue(CustomFields.IsEmptyFieldName(),"Field is Empty");
        CustomFields.ClickFieldNameInBox();
        CustomFields.CleanFieldName();
        CustomFields.SetFieldName(Constants.FIELDNAME);
        softAssert.assertTrue(CustomFields.IsScreenDisplay(),"Selection option invisible");
        CustomFields.SetSelectScreen(Constants.SELECTION);
        softAssert.assertTrue(CustomFields.GetSelectionScreen().contains(Constants.SELECTION));
        softAssert.assertTrue(CustomFields.IsTypeDisplay(),"Type is invisible");

        CustomFields.SetType(Constants.TYPE_SELECTION_1);
        softAssert.assertTrue(CustomFields.GetType().contains(Constants.TYPE_SELECTION_1));
        //CustomFields.ClickSaveButton();

        CustomFields.SetType(Constants.TYPE_SELECTION_2);
        softAssert.assertTrue(CustomFields.GetType().contains(Constants.TYPE_SELECTION_2));

        CustomFields.ClickSaveButton();

        softAssert.assertAll();
    }



}
