package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ControlPannelPage;
import pages.StudentLoginPage;
import pages.ProfessionalLoginPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void testProfesionalLogin(){
        ProfessionalLoginPage professionalPage = homepage.clickProfessional();
        professionalPage.completeFields();
    }

    @Test
    public void testEstudianteLogin(){
        StudentLoginPage estudiantePage = homepage.clickStudent();

    }
}
