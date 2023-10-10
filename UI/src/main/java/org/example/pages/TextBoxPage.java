package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;

public class TextBoxPage extends BasePage {
    //Page Object Model
    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "name")
    public WebElement expectedFullNameInput;
    @FindBy(id = "email")
    public WebElement expectedUserEmailInput;
    @FindBy(id = "currentAddress")
    public WebElement expectedCurrentAddressInput;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement expectedPermanentAddressInput;


    public TextBoxPage fillUpTheFullName(String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;
    }

    public TextBoxPage fillUpTheEmail(String email) {
        elementActions.writeText(userEmailInput, email);
        return this;

    }

    public TextBoxPage fillUpTheCurrentAddress(String currentAddress) {
        elementActions.writeText(currentAddressInput, currentAddress);
        return this;
    }
    public TextBoxPage fillUpThePermanentAddress(String permanentAddress) {
        elementActions.writeText(permanentAddressInput, permanentAddress);
        return this;

    } public TextBoxPage clickTheSubmit() throws InterruptedException, AWTException {
        elementActions .zoomOut().scrollToTheElement(submitButton)
                .waitButtonToBeClickable(submitButton)
                .clickTheButton(submitButton);

        return this;

    }

    public TextBoxPage testTextBoxPage(){
        Assert.assertTrue(expectedFullNameInput.getText().contains(fullNameInput.getText()));
        Assert.assertTrue(expectedUserEmailInput.getText().contains(userEmailInput.getText()));
        Assert.assertTrue(expectedCurrentAddressInput.getText().contains(currentAddressInput.getText()));
        Assert.assertTrue(expectedPermanentAddressInput.getText().contains(permanentAddressInput.getText()));
        return this;
    }

}
