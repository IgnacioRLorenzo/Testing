package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressesTests extends BaseTests {
    @Test
    public void textBackspace(){
        var keyPressesPage = homepage.clickKeyPresses();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Wrong message");
    }
}
