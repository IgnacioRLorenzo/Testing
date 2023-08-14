package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsJavaScriptPage {
    private WebDriver driver;
    private By triggerJSAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultPrint = By.id("result");

    public AlertsJavaScriptPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickJSAlert(){
        driver.findElement(triggerJSAlert).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickJSConfirm(){
        driver.findElement(triggerJSConfirm).click();
    }
    public void acceptConfirm(){
        driver.switchTo().alert().accept();
    }
    public void denyConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void clickJSPrompt(){
        driver.findElement(triggerJSPrompt).click();
    }
    public void writePrompt(){
        driver.switchTo().alert().sendKeys("Hello World!");
    }
    public void acceptPrompt(){
        driver.switchTo().alert().accept();
    }
    public void denyPrompt(){
        driver.switchTo().alert().dismiss();
    }
    public String getResult(){
        return driver.findElement(resultPrint).getText();
    }

}
