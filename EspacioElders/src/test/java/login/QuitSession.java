package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ControlPannelPage;

public class QuitSession extends BaseTests {
    @Test
    public void logOutSession(){
        ControlPannelPage controlPannel = new ControlPannelPage(driver);
        controlPannel.clickUserSession();
        controlPannel.clickQuitSession();
    }
}
