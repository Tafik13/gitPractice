package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
        //Singleton patter

    }

    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeWebDriver();
                break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                    case "opera":
                    driver = OperaWebDriver.loadOperaWebDriver();
                    break;
                default:
                    throw  new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static  void closeDriver(){
        try{
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.err.println("Error while closing the driver");
        }
    }

}
