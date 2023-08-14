package controlPannel;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ControlPannelPage;

public class AddStudentTest extends BaseTests {
    @Test
    public void addStudentTest(){
        ControlPannelPage controlPage = new ControlPannelPage(driver);
        controlPage.clickAddStudent();
    }
}
