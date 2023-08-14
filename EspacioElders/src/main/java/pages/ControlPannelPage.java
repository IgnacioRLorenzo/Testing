package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constants.Locators.*;
public class ControlPannelPage {

    private WebDriver driver;
    private WebElement backArrowHeader;
    private WebElement usernameHeader;
    private WebElement espacioATADHeader;
    private WebElement quitSessionHeader;
    private WebElement backToMenuHeader;
    private WebElement homeButtonMenu;
    private WebElement sessionButtonMenu;
    private WebElement studentsTitle;
    private WebElement studentsSearchField;
    private WebElement studentsList;
    private WebElement addStudentsList;


    public ControlPannelPage(WebDriver driver){
        this.driver = driver;
        backArrowHeader = driver.findElement(By.xpath(backArrowHeaderLocator));
        usernameHeader = driver.findElement(By.xpath(usernameHeaderLocator));
        espacioATADHeader = driver.findElement(By.xpath(espacioATADHeaderLocator));
        quitSessionHeader = driver.findElement(By.xpath(quitSessionHeaderLocator));
        backToMenuHeader = driver.findElement(By.xpath(backToMenuHeaderLocator));
        homeButtonMenu = driver.findElement(By.xpath(homeButtonMenuLocator));
        sessionButtonMenu = driver.findElement(By.xpath(sessionButtonMenuLocator));
        studentsTitle = driver.findElement(By.xpath(studentsTitleLocator));
        studentsSearchField = driver.findElement(By.xpath(studentsSearchFieldLocator));
        studentsList = driver.findElement(By.xpath(studentsListLocator));
        addStudentsList = driver.findElement(By.xpath(addStudentsListLocator));
    }

    //HEADERS
    public void clickBack(){
        backArrowHeader.click();
    }
    public void clickUserSession(){
        usernameHeader.click();
    }
    public void clickQuitSession(){
        quitSessionHeader.click();
    }
    public void clickBackToMenu(){
        backToMenuHeader.click();
    }
    public String getHeaderTitle(){
        return espacioATADHeader.getText();
    }

    //MENUS
    public void clickHome(){
        homeButtonMenu.click();
    }
    public void clickSessions(){
        sessionButtonMenu.click();
    }

    //LISTS
    public void searchStudent(String StudentName){
        studentsSearchField.click();
        studentsSearchField.sendKeys(StudentName);
    }
    public void clickOneStudent(String StudentName){
        List<WebElement> StudentsNames;
    }
    public void clickAddStudent(){
        addStudentsList.click();
    }
}
