import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ButtonTest extends BaseTest{

    @Test
    public void testButtons() throws AWTException, InterruptedException {
        driver.get("https://demoqa.com/buttons");

        buttonsPage.clickDoubleBtn().clickRightBtn().clickMe();
    }
}
