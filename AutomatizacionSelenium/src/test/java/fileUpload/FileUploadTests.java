package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testUploadFile(){
        var fileUploadPage = homepage.clickFileUpload();
        fileUploadPage.setSelectFile("C:\\Users\\Nacho\\testautomationu\\webdriver_java" +
                "\\AutomatizacionSelenium\\resources\\chromedriver");
        assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver","Wrong");
    }
}
