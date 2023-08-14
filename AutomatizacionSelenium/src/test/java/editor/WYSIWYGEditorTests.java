package editor;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WYSIWYGEditorTests extends BaseTests {
    @Test
    public void testEditor(){
        var wysiwygEditorPage = homepage.clickEditor();
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea("hello");
        wysiwygEditorPage.boldText();
        wysiwygEditorPage.setTextArea("world");
        assertEquals(wysiwygEditorPage.getTextFromEditor(),"hello world","Text incorrect");
    }
}
