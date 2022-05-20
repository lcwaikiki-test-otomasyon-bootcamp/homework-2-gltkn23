package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;

public class DriverFactory {
    public WebDriver GetDriver(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-blink-features");
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);

        return driver;
    }
}
