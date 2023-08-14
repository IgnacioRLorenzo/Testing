package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By range = By.tagName("input");
    private By number = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterRange(){
        driver.findElement(range).click();
    }
    public void arrowRangeDown(){
        driver.findElement(range).click();
        driver.findElement(range).sendKeys(Keys.ARROW_DOWN);
    }
    public void arrowRangeUp(){
        driver.findElement(range).click();
        driver.findElement(range).sendKeys(Keys.ARROW_UP);
    }
    public String getRange(){
        return driver.findElement(number).getText();
    }

}
