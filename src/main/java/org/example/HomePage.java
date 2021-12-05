package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _clickOnTheComputerButton = By.xpath("//ul[@class='top-menu notmobile']/li/a[@href=\"/computers\"]");
    By _registerLinkButton = By.xpath("//a[@class=\"ico-register\"]");
    By _clickOnNewsDetailsButton = By.xpath("//div[@class='news-list-homepage']/div[2]/div[2]/div[3]/a");
    By _clickOnBuildYourOwnComputer = By.xpath("//div/a/img[@alt='Picture of Build your own computer']");

    public void ClickOnRegisterButton() {
        // Click on Register Button
        clickOnElement(_registerLinkButton);
    }
    public void clickOnComputerButton(){
        // Click on Computer Button
        clickOnElement(_clickOnTheComputerButton);


    }
    public void clickOnNewsCommentsDetails(){
        // click on News Details Page
        clickOnElement(_clickOnNewsDetailsButton);


    }
    public void clickOnBuildYourOwnComputer(){
        // click on Build Your Own Computer
        clickOnElement(_clickOnBuildYourOwnComputer);

    }
}