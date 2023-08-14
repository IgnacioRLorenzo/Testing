package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");
    private By iFrames = By.linkText("iFrame");

    public FramesPage (WebDriver driver){
        this.driver = driver;
    }
    public NestedFramesPage enterNestedFrames(){
        driver.findElement(nestedFrames).click();
        return new NestedFramesPage(driver);
    }
}
