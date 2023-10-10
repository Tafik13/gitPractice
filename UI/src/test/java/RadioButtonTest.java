import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{
    @Test
    void testRadioButton(){
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYesBtn().clickImpressiveBtn().clickNoBtn();

    }
}
