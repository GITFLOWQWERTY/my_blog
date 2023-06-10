package TestOne;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.AssertJUnit.assertTrue;

public class SignInCucumber {
    WebDriver driver;
    LogInPage logIn;
    StartPage start;
    HomePage home;
    private String site = "https://rozetka.com.ua";


    @Before
    public void initDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(options);
    }
    @Then("Користувач знаходиться на сторінкі входу")
    public void givenUserOnRegistrationPage() {
        driver.get(site);

    }
    @When("Користувач знаходиться на сторінці входу")
    public void givenUserIsOnRegistrationPage() {
        driver.get(site);
//        start = new StartPage(driver);
//        start.clickOnRegisterButton();
    }
    @Then("Користувач вводить свої дані: {string} та {string}")
    public void enterUserData(String email, String password) {
        logIn = new LogInPage(driver);
        logIn.logIn(email,password);
    }
    @Then("Користувач натискає кнопку 'Ввійти'")
    public void whenUserClicksRegisterButton() {
        logIn = new LogInPage(driver);
        logIn.logInButtonClick();
    }
    @Then("Користувач повинен бачити головну сторінку")
    public void thenUserSeesSuccessfulRegistrationMessage() {
        home = new HomePage(driver);
        assertTrue(home.addPostButtonDisplayed());

    }

    @Then("Користувач повинен бачити повідомлення про невдалий вхід")
    public void thenUserCanLoginWithEnteredData() {
        home = new HomePage(driver);
        assertTrue(logIn.InvalidMassageName());
    }

   
}

