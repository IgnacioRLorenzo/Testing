package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";
    private By body = By.className("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getBody(){
        return driver.findElement(body).getText();
    }
    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }
    public void switchToTopFrame(){
        driver.switchTo().frame(topFrame);
    }
    public void switchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }
    public void switchToMiddleFrame(){
        driver.switchTo().frame(middleFrame);
    }
    public void switchToRightFrame(){
        driver.switchTo().frame(rightFrame);
    }
    public void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

}
