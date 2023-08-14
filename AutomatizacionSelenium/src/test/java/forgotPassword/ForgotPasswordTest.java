package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FPEmailSendPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testFrogotPassword(){
        ForgotPasswordPage forgotPasswordPage = homepage.clickForgotPassword();
        forgotPasswordPage.setEmail("example@gmail.com");
        FPEmailSendPage emailSendPage =  forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSendPage.getEmailSentText().contains("Your e-mail's been sent!"),
                "Text incorrect");
    }
}
