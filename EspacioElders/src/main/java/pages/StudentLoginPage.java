package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Locators.*;

public class StudentLoginPage {
    private WebDriver driver;
    private WebElement loginTitle;
    private WebElement loginButton;
    private WebElement sessionCodeField;
    private WebElement checkbox;

    public StudentLoginPage(WebDriver driver){
        this.driver = driver;
        loginTitle = driver.findElement(By.xpath(loginTitleLocator));
        loginButton = driver.findElement(By.xpath(loginButtonLocator));
        sessionCodeField = driver.findElement(By.xpath(sessionCodeStudentPageLocator));
        checkbox= driver.findElement(By.xpath(assistantCheckboxStudentPageLocator));
    }

    public void completeCodeSession(){
        sessionCodeField.sendKeys("codigodesesion");
    }
    public void clickCheckbox(){
        checkbox.click();
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public String getLoginTitle(){
        return loginTitle.getText();
    }
}
