package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Locators.*;

public class ProfessionalLoginPage {
    private WebDriver driver;
    private WebElement loginTitle;
    private WebElement loginButton;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement registerButton;

    public ProfessionalLoginPage(WebDriver driver){
        this.driver = driver;
        loginTitle = driver.findElement(By.xpath(loginTitleLocator));
        loginButton = driver.findElement(By.xpath(loginButtonLocator));
        emailField = driver.findElement(By.id(emailFieldProfessionalPageLocator));
        passwordField= driver.findElement(By.id(passwordFieldProfessionalPageLocator));
        registerButton = driver.findElement(By.xpath(registerButtonProfessionalPageLocator));
    }

    public void completeFields(){
        emailField.sendKeys("nacholorenzo28@gmail.com");
        passwordField.sendKeys("39342351n.");
        loginButton.click();
    }
    public void registerClick(){
        registerButton.click();
    }
    public void completeEmail(String email){
        emailField.sendKeys(email);
    }
    public void completePassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public String getLoginTitle(){
        return loginTitle.getText();
    }


}
