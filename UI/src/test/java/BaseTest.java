import org.example.driver.Driver;
import org.example.pages.*;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;

    public TextBoxPage textBoxPage;

    public RegistrationPage registrationPage;

    public PracticeFormPage practiceFormPage;

    public FakeDataProvider fakeDataProvider;

    public RadioButtonPage radioButtonPage;

    public CheckBoxPage checkBoxPage;

    public ButtonsPage buttonsPage;
    public DynamicPage dynamicPage;

    @BeforeClass(alwaysRun = true)
    public void setupBrowser(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
        fakeDataProvider = new FakeDataProvider();
        registrationPage = new RegistrationPage();
        radioButtonPage = new RadioButtonPage();
        checkBoxPage = new CheckBoxPage();
        buttonsPage = new ButtonsPage();
        dynamicPage = new DynamicPage();



    }

    @AfterTest(alwaysRun = true)
    public void  tearDown(){
        Driver.getDriver();
    }
}
