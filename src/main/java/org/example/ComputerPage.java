package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends HomePage {
    By _clickOnDesktop=By.xpath("//h2/a[@href='/desktops']");
    public void clickOnTheDesktop(){
        clickOnElement(_clickOnDesktop);

    }

}
