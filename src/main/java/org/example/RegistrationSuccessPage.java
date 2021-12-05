package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends RegistrationPage {
    By _Continue=By.xpath("//a[@class='button-1 register-continue-button']");

    public void registrationSuccessful(){
        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedRegisterSuccessMessage = "Your registration completed";
        // Assert.assertEquals(actualRegisterSuccessMessage, "expectedRegisterSuccessMessage");
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage),"Your registration completed");




    }
    public void clickOnContinueOnRegistrationSuccessfulPage(){

        clickOnElement(_Continue);

    }

}
