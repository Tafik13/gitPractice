package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class BrowserWindows extends Demo.BaseTest {

    @Test
    public void windowsTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200  )");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.get(0));
        System.out.println(tabs.get(1));
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(sample.getText(),"This is a sample page");

        Thread.sleep(3000);

    }
    @Test
    public void windowsTest2() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200  )");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("windowButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.get(0));
        System.out.println(tabs.get(1));
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(sample.getText(),"This is a sample page");

        Thread.sleep(3000);

    }
    @Test
    public void windowsTest3() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200  )");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.get(1));
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement sample = driver.findElement(By.xpath("/html/body"));
        System.out.println(sample.getText());
        Assert.assertTrue(sample.getText().contains("Knowledge"));


    }
}
