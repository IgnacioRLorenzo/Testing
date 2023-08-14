package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.Locators.*;

public class SessionsPage{
    private WebDriver driver;

    private WebElement studentTitle;
    private WebElement editButton;
    private WebElement nameField;
    private WebElement birthdateField;
    private WebElement IDField;
    private WebElement institutionField;
    private WebElement occupationField;
    private WebElement neurologicalHistoryField;
    private WebElement neurologicalHistoryTag;
    private WebElement educationalLevel;
    private WebElement educationalLevelList;
    private WebElement referenceField;
    private WebElement contactField;
    private WebElement addContactButton;
    private WebElement referenceName;
    private WebElement contactNumber;
    private WebElement deleteContactBinButton;
    private WebElement cancelButtonAddPanel;
    private WebElement deleteStudentButton;
    private WebElement saveButtonAddPanel;
    private WebElement exercisesTitle;
    private WebElement searchExercises;
    private WebElement importExerciseButton;
    private WebElement addNewExercisesButton;
    private WebElement typeOfExercise;
    private WebElement nameOfExercise;

    public SessionsPage(WebDriver driver){
        this.driver = driver;
        studentTitle = driver.findElement(By.xpath(studentTitleAddPanelLocator));
        editButton = driver.findElement(By.xpath(editButtonAddPanelLocator));
        nameField = driver.findElement(By.xpath(nameFieldAddPanelLocator));
        birthdateField = driver.findElement(By.xpath(birthdateFieldAddPanelLocator));
        IDField = driver.findElement(By.xpath(IDFieldAddPanelLocator));
        institutionField = driver.findElement(By.xpath(institutionFieldAddPanelLocator));
        occupationField = driver.findElement(By.xpath(occupationFieldAddPanelLocator));
        neurologicalHistoryField = driver.findElement(By.xpath(neurologicalHistoryFieldAddPanelLocator));
        neurologicalHistoryTag = driver.findElement(By.xpath(neurologicalHistoryTagAddPanelLocator));
        educationalLevel = driver.findElement(By.xpath(educationalLevelListAddPanelLocator));
        educationalLevelList = driver.findElement(By.xpath(educationalLevelListAddPanelLocator));
        referenceField = driver.findElement(By.xpath(referenceFieldAddPanelLocator));
        contactField = driver.findElement(By.xpath(contactFieldAddPanelLocator));
        addContactButton = driver.findElement(By.xpath(addContactButtonAddPanelLocator));
        referenceName = driver.findElement(By.xpath(referenceNameAddPanelLocator));
        contactNumber = driver.findElement(By.xpath(contactNumberAddPanelLocator));
        deleteContactBinButton = driver.findElement(By.xpath(deleteContactBinButtonAddPanelLocator));
        cancelButtonAddPanel = driver.findElement(By.xpath(cancelButtonAddPanelLocator));
        deleteStudentButton = driver.findElement(By.xpath(deleteStudentButtonAddPanelLocator));
        saveButtonAddPanel = driver.findElement(By.xpath(saveButtonAddPanelLocator));
        exercisesTitle = driver.findElement(By.xpath(exercisesTitleAddPanelLocator));
        searchExercises = driver.findElement(By.xpath(searchExercisesAddPanelLocator));
        importExerciseButton = driver.findElement(By.xpath(importExerciseButtonAddPanelLocator));
        addNewExercisesButton = driver.findElement(By.xpath(addNewExercisesButtonAddPanelLocator));
        typeOfExercise = driver.findElement(By.xpath(typeOfExerciseAddPanelLocator));
        nameOfExercise = driver.findElement(By.xpath(nameOfExerciseAddPanelLocator));
    }


    public String getStudentNameOnPanelSection(){
        return nameField.getText();
    }

    public void clickOnStudentSession(String student) {

    }




}
