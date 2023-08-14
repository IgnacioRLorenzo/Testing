package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        var contextMenuPage = homepage.clickContextMenu();
        contextMenuPage.rightClickBox();
        contextMenuPage.getText();
        assertEquals(contextMenuPage.getText(),"You selected a context menu", "text incorrect");
        contextMenuPage.acceptAlert();

    }
}
