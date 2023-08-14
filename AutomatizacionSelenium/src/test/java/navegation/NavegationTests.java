package navegation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavegationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homepage.clickFormAuthentication();
        getWindowMananger().goBack();
        getWindowMananger().refreshPage();
        getWindowMananger().goFoward();
        getWindowMananger().goTo("https://google.com");
    }
    @Test
    public void testSwitchTo(){
        homepage.clickMultipleWindows().clickHere();
        getWindowMananger().swithToTab("New Window");
    }
}
