package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Homework:
//        Нужно зайти на сайт Намба фуд. Выбрать раздел еда.
//        Потом выбрать национальную кухню.
//        Выбрать кафе фаиза.
//        Заказать 3 порции мампар, 3 порции чучвара и 1 литр компота. Дальше нужно оформить заказ.
public class NambaFood extends Demo.BaseTest {


    @Test
    void getFood() {
        driver.get("https://nambafood.kg/");
        WebElement foodButton = driver.findElement(By.xpath("(//a[@href='/food'])[1]"));
        foodButton.click();

//         WebElement nationalFood = driver.findElement(By.xpath("(//a[@href='/cafe/national'])[1]"));
//        nationalFood.click();
//
//        WebElement tashkentFood = driver.findElement(By.xpath("//a[@href='/tashkent-1']"));
//        tashkentFood.click();
//
//        WebElement plusMastava = driver.findElement(By.xpath("(//div[@class='count-button count-up'])[2]"));
//        for (int i = 0; i < 2; i++) {
//            plusMastava.click();
//        }
//        WebElement orderMastava = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[2]"));
//        orderMastava.click();
//        WebElement plusShorpo = driver.findElement(By.xpath("(//div[@class='count-button count-up'])"));
//        for (int i = 0; i < 2; i++) {
//            plusShorpo.click();
//        }
//        WebElement orderShorpo = driver.findElement(By.xpath("(//button[@class='status active bay_item'])"));
//        orderShorpo.click();
//
//        WebElement beveragesBtn = driver.findElement(By.xpath("//a[@class='filter--item tag-188']"));
//        beveragesBtn.click();
//
//        WebElement orderCompote = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[16]"));
//        orderCompote.click();
//
//        WebElement basketBtn = driver.findElement(By.xpath("//div[@id='cart']"));
//        basketBtn.click();
//
//        WebElement orderBtn = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
//        orderBtn.click();
//
//        WebElement name = driver.findElement(By.id("food_order_client_name"));
//        name.sendKeys("Tommy Vercetti");
//
//        WebElement address = driver.findElement(By.id("food_order_address"));
//        address.sendKeys("Baker Street");
//
//        WebElement homeNumber = driver.findElement(By.id("food_order_door_code"));
//        homeNumber.sendKeys("25 - 105");
//
//        WebElement phoneNumber = driver.findElement(By.id("food_order_phone"));
//        phoneNumber.sendKeys("1234567890");
//
//        WebElement additionalInfo= driver.findElement(By.id("food_order_additional_info"));
//        additionalInfo.sendKeys("Don't remember");
//
//        WebElement givenMonney = driver.findElement(By.id("food_order_money_change"));
//        givenMonney.sendKeys("1560");


       // WebElement endOrderBtn = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
       // endOrderBtn.click();

    }
}
