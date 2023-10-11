package org.example;

import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.example.helper.ScreenShotMethods;
import org.example.models.Student;
import org.example.pages.PracticeFormPage;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Main {
   // public static void main(String[] args) {

    //}
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student = new Student();
        student.setFirstName("Jyldyz");
        student.setLastName("Jeenbaeva");
        student.setEmail("Jilduz@gmail.com");
        student.setCurrentAddress("Lenina 268");
        student.setPhoneNumber("9965553570");
        PracticeFormPage practiceFormPages = new PracticeFormPage();
        practiceFormPages.fillUpTheForm(student).checkTheStudentDetails(student);


    }

    @Test
    public  void testAlert() throws InterruptedException, AWTException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        Robot robot = new Robot();
        Thread.sleep(2000);
        System.out.println("About to zoom out");
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        screenShotMethods.takeScreenShot();


        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();

        alert.sendKeys("John");
        alert.accept();

    }
    @Test
    void testAlert2() throws AWTException, InterruptedException {
        driver.get("https://demoqa.com/alerts");
        Robot robot = new Robot();
        Thread.sleep(2000);
        System.out.println("About to zoom out");
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();

        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(2000);
        alertHelper.acceptAlert();

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        alertHelper.dismissAlert();

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("John");


    }
    @Test
    void testFrame(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }
    @Test
    void testNestedFrame(){
        driver.get("https://demoqa.com/nestedframes");
        // first go parent frame
        driver.switchTo().frame("frame1");
        // then go to child frame
        driver.switchTo().frame(0);
        System.out.println((driver.findElement(By.tagName("p")).getText()));
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();

    }
    @Test
    void staleElementReferenceException() {
        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInp = driver.findElement(By.id("twotabsearchtextbox"));
        searchInp.sendKeys("iphone");

        searchInp.sendKeys(Keys.ENTER);
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));
        for (WebElement brand : brands) {
            System.out.println(brand.getText());
            WebElement checkbox = brand.findElement(By.tagName("i"));
            checkbox.click();
        }
        //StaleElementReferenceException: - ссылка на устаревший элемент
    }
}
