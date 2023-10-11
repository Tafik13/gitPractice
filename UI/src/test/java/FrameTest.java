import org.testng.annotations.Test;

public class FrameTest extends BaseTest {
    @Test
    public void testBrowser() {
        driver.get("https://demoqa.com/frames");
        framesPage.switchToFrame()
                .switchToFrame1();
    }
}