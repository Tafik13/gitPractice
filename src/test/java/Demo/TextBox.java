package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends Demo.BaseTest {

    @Test
    void  fillUPFormTest() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName =" John Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "WallStreet123";

        permanentAddress.sendKeys(expectedPermanentAdd);


        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

       submitBtn.click();



        Thread.sleep(5000);


        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());

        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdd = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdd.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id= 'permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAdd));




    }
    @Test
    void  fillUPFormTest2() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName =" John Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "WallStreet123";

        permanentAddress.sendKeys(expectedPermanentAdd);


        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        submitBtn.click();



        Thread.sleep(5000);


        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());

       Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdd = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdd.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id= 'permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAdd));




    }
    @Test
    void  fillUPFormTest3() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName =" John Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "WallStreet123";

        permanentAddress.sendKeys(expectedPermanentAdd);


        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        submitBtn.click();



        Thread.sleep(5000);


        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());

        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdd = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdd.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id= 'permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAdd));




    }
    @Test
    void  fillUPFormTest4() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName =" John Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "WallStreet123";

        permanentAddress.sendKeys(expectedPermanentAdd);


        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        submitBtn.click();



        Thread.sleep(5000);


        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());

        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));

        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdd = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdd.getText().contains(expectedCurrentAdd));

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id= 'permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAdd));




    }

}
