package StepDefinitions;

import Pages.HomePage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class HomePages {


    DriverFactory driverFactory=new DriverFactory();
    WebDriver driver =driverFactory.GetDriver();

    HomePage homePage=new HomePage(driver);
    @Given("Uygulama açılır")
    public void uygulamaAçılır() {
        homePage.setDefaultSettings(10);
        homePage.checksLogo();

            }

    @When("Giriş yapa tıklanır")
    public void girişYapaTıklanır() {
        homePage.setDefaultSettings(10);
        homePage.ClickLogin();


    }
    @When("Arama cubuguna {string} yazılır")
    public void aramaCubugunaKazakYazılır(String text) {
        homePage.setDefaultSettings(10);
        homePage.setSearchBox(text);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.setDefaultSettings(10);
        homePage.clickSearchButton();

    }





}
