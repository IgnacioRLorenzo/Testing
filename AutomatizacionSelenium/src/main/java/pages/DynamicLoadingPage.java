package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By linkXpath_Format =By.xpath("//*[@id=\"content\"]/div/a[1]") ;


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkXpath_Format).click();
        return new DynamicLoadingExample1Page(driver);
    }

}
