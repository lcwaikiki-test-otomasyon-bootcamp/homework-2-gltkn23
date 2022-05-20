package StepDefinitions;

import Pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPages {
    WebDriver driver=new ChromeDriver();
    CartPage cartPage=new CartPage(driver);

    @Then("Urunun sepete eklendiği kontrol edilir")
    public void urununSepeteEklendiğiKontrolEdilir() {
        cartPage.setGoCart();

    }
    @When("Sepete gidilir")
    public void sepeteGidilir() {
        cartPage.chekifCart();
    }
}
