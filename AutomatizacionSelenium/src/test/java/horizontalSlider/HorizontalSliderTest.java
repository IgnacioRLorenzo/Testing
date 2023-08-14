package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testHorizontalSliderClick(){
        var horizontalSliderPage = homepage.clickHorizontalSlider();
        horizontalSliderPage.enterRange();
        assertEquals(horizontalSliderPage.getRange(),"2.5","Value entered and showed are not the same");
    }
    @Test
    public void testHorizontalSliderMovementDown(){
        var horizontalSliderPage = homepage.clickHorizontalSlider();
        horizontalSliderPage.arrowRangeDown();
        assertEquals(horizontalSliderPage.getRange(),"2","Value entered and showed are not the same");
    }
    @Test
    public void testHorizontalSliderSliderMovementUp(){
        var horizontalSliderPage = homepage.clickHorizontalSlider();
        horizontalSliderPage.arrowRangeUp();
        assertEquals(horizontalSliderPage.getRange(),"3","Value entered and showed are not the same");
    }
}
