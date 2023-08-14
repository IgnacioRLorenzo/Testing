package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void testJSAlert(){
        var alertsJSPage = homepage.clickAlertsJava();
        alertsJSPage.clickJSAlert();
        alertsJSPage.acceptAlert();
        assertEquals(alertsJSPage.getResult(), "You successfully clicked an alert",
                "Result text incorrect");
    }
    @Test
    public void testJSConfirmAccept(){
        var alertsJSPage = homepage.clickAlertsJava();
        alertsJSPage.clickJSConfirm();
        alertsJSPage.acceptConfirm();
        assertEquals(alertsJSPage.getResult(),"You clicked: Ok",
                "Result text incorrect");
    }
    @Test
    public void testJSConfirmDeny(){
        var alertsJSPage = homepage.clickAlertsJava();
        alertsJSPage.clickJSConfirm();
        alertsJSPage.denyConfirm();
        assertEquals(alertsJSPage.getResult(),"You clicked: Cancel",
                "Result text incorrect");
    }
    @Test
    public void testJSPromptAccept(){
        var alertsJSPage = homepage.clickAlertsJava();
        alertsJSPage.clickJSPrompt();
        alertsJSPage.writePrompt();
        alertsJSPage.acceptPrompt();
        assertEquals(alertsJSPage.getResult(),"You entered: Hello World!",
                "Result text incorrect");
    }
    @Test
    public void testJSPromptDeny(){
        var alertsJSPage = homepage.clickAlertsJava();
        alertsJSPage.clickJSPrompt();
        alertsJSPage.writePrompt();
        alertsJSPage.denyPrompt();
        assertEquals(alertsJSPage.getResult(),"You entered: null",
                "Result text incorrect");
    }
}
