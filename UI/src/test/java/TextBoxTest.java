import org.testng.annotations.Test;

import java.awt.*;

public class TextBoxTest extends BaseTest {

    @Test
    void fillUpTheFormTest() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUpTheFullName("John Jones").fillUpTheEmail("red@gmail.com")
                .fillUpTheCurrentAddress("New York").fillUpThePermanentAddress("Las Vegas").clickTheSubmit()
                .testTextBoxPage();
    }
}
