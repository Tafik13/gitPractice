import org.example.pages.CheckBoxPage;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
public class CheckBoxTest extends BaseTest{
    @Test
    void fillUpTheCheckBox() throws AWTException, InterruptedException {
        driver.get("https://demoqa.com/checkbox");
//        Robot robot = new Robot();
//        Thread.sleep(2000);
//        System.out.println("About to zoom out");
//        for (int i = 0; i < 5; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }

        checkBoxPage.clickCheckHome().chooseElement();
        checkBoxPage.testAssert();
    }
}
