package org.example.pages;

import org.example.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.driver.Driver.driver;

public class DynamicPage extends BasePage{
    @FindBy(id = "enableAfter")
    public WebElement enableAfter;
    @FindBy(xpath = "//button[@id='colorChange']")
    public WebElement colorChange;
    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;



    public  DynamicPage clickclick() throws InterruptedException {
        elementActions.clickTheButton(enableAfter);
        return this;

    }


    public DynamicPage  visibleAfter() throws InterruptedException {
        elementActions.waitElementToBEVisible(visibleAfter);
        return this;
    }
    public DynamicPage changeColorRed(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='colorChange']")));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.backgroundColor = 'red';", colorChange);
        return this;
    }

}


