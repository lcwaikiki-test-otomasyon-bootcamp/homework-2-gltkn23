package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    By logo=By.id("video_home");
    By Clicklogin= By.id("user_1_");
    By Mail=By.name("email");
    By Password=By.name("password");
    By login=By.cssSelector(".login-form__button");

    By SetSearchebox=By.id("search-form__input-field__search-input");
    By searchButton=By.cssSelector(".search-form__input-field__btn-search");

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;


    }
    public void  setDefaultSettings(int time){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
    }
    public void  checksLogo(){

    driver.findElement(logo);
    }
    public void ClickLogin(){
        driver.findElement(Clicklogin).click();
        driver.findElement(Mail).sendKeys("gltkn116@gmail.com");
        driver.findElement(Password).sendKeys("Gltkn.23");
        driver.findElement(login).click();

    }
    public void setSearchBox(String Text){
        driver.findElement(SetSearchebox).sendKeys(Text);

    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

}
