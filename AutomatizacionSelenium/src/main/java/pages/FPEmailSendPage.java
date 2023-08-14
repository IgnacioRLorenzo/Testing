package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FPEmailSendPage {
    private WebDriver driver;
    private By emailSent = By.linkText("Your e-mail's been sent!");

    public FPEmailSendPage(WebDriver driver){
        this.driver = driver;
    }
    public String getEmailSentText(){
        return driver.findElement(emailSent).getText();
    }
}
