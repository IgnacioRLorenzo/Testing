package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homepage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user2", "Title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link not found");
    }

}
