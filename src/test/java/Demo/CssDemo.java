package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CssDemo extends Demo.BaseTest {


    @Test
    void  cssDEmo1(){
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        searchBox.sendKeys("Iphone");
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));

        for(WebElement brand:brands){
            System.out.println(brand.getText());
        }



    }
}
