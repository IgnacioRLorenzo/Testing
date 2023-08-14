package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTests extends BaseTests {
    @Test
    public void testLeftAndButtonFrames(){
        var framesPage = homepage.clickFrames();
        var nestedFramesPage = framesPage.enterNestedFrames();

        nestedFramesPage.switchToBottomFrame();
        assertEquals(nestedFramesPage.getBody(),"BOTTOM","Different text");
/*
        nestedFramesPage.switchToMainFrame();
        nestedFramesPage.switchToTopFrame();
        nestedFramesPage.switchToLeftFrame();
        assertEquals(nestedFramesPage.getBody(),"LEFT","Incorrect text");
*/

    }
}
