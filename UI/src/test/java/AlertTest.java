import org.testng.annotations.Test;

import java.awt.*;

public class AlertTest extends BaseTest{
    @Test
    public void testAlert() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/alerts");
        alertsPage.clickAlertBtn()
                .clickTimerAlertBtn()
                .clickConfirmButton()
                .testpromtBtn();
    }
}