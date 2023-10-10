package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends BasePage{
    WebDriver driver;
    @FindBy(xpath = "//button[@id='newUser']")
    public WebElement newUserClick;

    @FindBy(id = "firstname")
    public WebElement firstNameInput;
    @FindBy(id = "lastname")
    public WebElement lastNameInput;
    @FindBy(id = "userName")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "//iframe[starts-with(@name, 'a-')")
    public WebElement recaptchaFrame;
    @FindBy(xpath= "//div[@class='recaptcha-checkbox-border']")
    public WebElement recaptchaClick;
    @FindBy(id = "register")
    public WebElement registerClick;

    public RegistrationPage toBeClickNewUser(){
        elementActions.clickTheButton(newUserClick);
        return this;
    }

    public RegistrationPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;

    }

    public RegistrationPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public RegistrationPage createUserName(String txt) {
        elementActions.writeText(userNameInput, txt);
        return this;
    }
    public RegistrationPage createPassword(String txt){
        elementActions.writeText(passwordInput,txt);
        return this;
    }
    public RegistrationPage clickRecaptcha(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(recaptchaFrame));

        elementActions.clickTheButton(recaptchaClick);
        return this;
    }
    public RegistrationPage toBeClickRecaptcha(){
        elementActions.clickTheButton(recaptchaClick);
        return this;
    }
    public RegistrationPage toBeClickRegister(){
        elementActions.clickTheButton(registerClick);
        return this;
    }
}
