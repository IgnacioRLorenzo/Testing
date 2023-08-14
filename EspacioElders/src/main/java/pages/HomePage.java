package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Locators.*;

public class HomePage {
    private WebDriver driver;
    private WebElement professionalLocator;
    private WebElement studentLocator;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        professionalLocator = driver.findElement(By.xpath(professionalHomepageLocator));
        studentLocator = driver.findElement(By.xpath(studentHomepageLocator));
    }

    public ProfessionalLoginPage clickProfessional(){
        professionalLocator.click();
        return new ProfessionalLoginPage(driver);
    }
    public StudentLoginPage clickStudent(){
        studentLocator.click();
        return new StudentLoginPage(driver);
    }
}
