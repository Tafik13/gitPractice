import org.example.helper.AlertHelper;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RegistrationTest extends BaseTest {

    @Test
    public void fillUpTheRegistrationTest() throws AWTException, InterruptedException {
        driver.get("https://demoqa.com/login");
        Robot robot = new Robot();
        Thread.sleep(2000);
        System.out.println("About to zoom out");
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        registrationPage.toBeClickNewUser().fillUpFirstName("John").fillUpLastName("Jones")
                .createUserName("Bones").createPassword("1$JohnJones").toBeClickRecaptcha()
                .toBeClickRegister();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();

    }
}
