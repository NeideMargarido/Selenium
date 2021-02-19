package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ForgotPasswordTest extends BaseTests {

    @Test
    public void retrievePasswordSuccess(){
        var forgotPasswordPage=homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmailField("fakeEmail@aiai.com");
        var emailSentConfirmationPage= forgotPasswordPage.clickRetrievePasswordButton();
        assertEquals(emailSentConfirmationPage.getConfirmationText(),
                "Your e-mail's been sent!",
                "Can's retrieve email!");
    }
}
