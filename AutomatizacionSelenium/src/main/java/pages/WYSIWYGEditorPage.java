package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By boldButton = By.cssSelector("FIND BETTER LOCATION");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditorArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditorArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void boldText(){
        switchToEditorArea();
        driver.findElement(boldButton).click();
        switchToMainArea();
    }
    public String getTextFromEditor(){
        switchToEditorArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditorArea(){
        driver.switchTo().frame(editorIframeId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
