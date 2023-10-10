package Demo;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends Demo.BaseTest {
    @Test
    void demo1() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }
    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectColor);
//        select.selectByVisibleText("Green");
//        Thread.sleep(3000);
//
//        select.selectByValue("4");
//        Thread.sleep(3000);
//
//        select.selectByIndex(7);
//        Thread.sleep(3000);


        List<WebElement> selectedOption = select.getOptions();

//         for (WebElement options : selectedOption){
//             System.out.println(options.getText());
//         }
         selectRandomColor(select,selectedOption);
    }

   public  void selectRandomColor(Select select,List<WebElement> selectedOption) throws InterruptedException {

        Random randomColor = new Random();
        int indexColor = randomColor.nextInt(selectedOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(7000);


//        WebElement selectReact = driver.findElement(By.id("react-select-2-input"));
//        selectReact.sendKeys("Group 1,option 1");
//        selectReact.sendKeys(Keys.ENTER);
       WebElement selectReact = driver.findElement(By.id("withOptGroup"));
       WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
       inputClick.click();
       List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]"));
       WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
       String[] itemsValue = new String[6];
       for (int i = 0; i < menuItem.size(); i++) {
           itemsValue[i] = String.valueOf(menuItem.get(i).getText());
       }
       System.out.println(itemsValue.length);
       Random random = new Random();
       int numberOfItemsToSelect = random.nextInt(itemsValue.length);
       System.out.println(numberOfItemsToSelect);
       System.out.println(itemsValue[5]);
       selectReactInput.sendKeys(itemsValue[numberOfItemsToSelect]);
       selectReactInput.sendKeys(Keys.ENTER);



    }
}
