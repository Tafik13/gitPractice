import org.testng.annotations.Test;

import static org.example.driver.Driver.driver;

public class DynamicTest extends BaseTest{
    @Test
    public void testDynamic() throws InterruptedException {
        driver.get("https://demoqa.com/dynamic-properties");
        dynamicPage.clickclick().visibleAfter().changeColorRed();

    }
}
