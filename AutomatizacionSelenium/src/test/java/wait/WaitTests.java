package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homepage.clickDynamicLoading();
        var example1 = loadingPage.clickExample1();
        example1.clickStart();

        assertEquals(example1.getLoadedText(),"Hello World!","Text not displayed");
    }
}
