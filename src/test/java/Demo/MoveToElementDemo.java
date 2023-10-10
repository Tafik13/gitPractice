package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class MoveToElementDemo extends Demo.BaseTest {

    @Test
            void demo1234(){
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

    Actions actions = new Actions(driver);

    actions.moveToElement(submitBtn);



        submitBtn.click();

}}
