package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.linkText("Retrieve password");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public FPEmailSendPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new FPEmailSendPage(driver);
    }
}
