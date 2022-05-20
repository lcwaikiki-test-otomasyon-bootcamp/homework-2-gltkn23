package Pages;

import StepDefinitions.CartPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    By chekif= By.cssSelector(".drop-down-menu__wrapper");
    By goCart=By.id("shopping-cart");
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public void chekifCart(){
        driver.findElement(chekif);
    }
    public void setGoCart(){
        driver.findElement(goCart).click();
    }
}
