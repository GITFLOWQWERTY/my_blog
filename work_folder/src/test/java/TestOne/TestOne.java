package TestOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestOne {
    WebDriver driver;
    RegPage reg;
    LogInPage logIn;
    Screenshots screenshots;
    private String site = "http://localhost:3000";

    @BeforeClass
    public void initDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void RegistrationUser(){
        String firstname = "Test", secondname = "Test", loc= "Test", occupation = "Test", picture = "C:/src/main/resources/Test.png";
        String email = "Test3@gmail.com", password = "Test234A";
        driver.get(site);
        logIn = new LogInPage(driver);
        logIn.redirectReg();
        reg = new RegPage(driver);
        reg.Register(firstname, secondname,loc, occupation,email,password,picture);

    }

    @Test
    public void LogInUser() throws IOException, InterruptedException {
        String email = "Test3@gmail.com", password = "Test234A", screenshotName = "sreenshotmain";
        driver.get(site);
        logIn = new LogInPage(driver);
        logIn.logIn(email,password);
        screenshots = new Screenshots();
        screenshots.screenshotes(driver, screenshotName);
    }

    @AfterClass
    public void endTest(){
        // закрытие браузера
        //driver.quit();
    }
}
