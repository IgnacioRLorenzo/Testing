package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ControlPannelPage;
import pages.HomePage;
import pages.ProfessionalLoginPage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homepage;
    protected ControlPannelPage controlPage;
    protected WebDriverWait wait;
    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://espacio-atad-espacioelders.cloud.okteto.net/");
        homepage = new HomePage(driver);
        driver.manage().window().maximize();
        ProfessionalLoginPage professionalPage = homepage.clickProfessional();
        Thread.sleep(2000);
        professionalPage.completeFields();
        Thread.sleep(3000);
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}
