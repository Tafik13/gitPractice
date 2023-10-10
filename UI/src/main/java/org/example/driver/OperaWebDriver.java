package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class OperaWebDriver {
    public static WebDriver loadOperaWebDriver(){
        WebDriverManager.operadriver().setup();
        WebDriver driver = (WebDriver) new OperaWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
