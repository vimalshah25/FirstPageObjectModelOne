package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends HomePage{
    By _emailAFriend=By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

    public void emailAFriend(){
        clickOnElement(_emailAFriend);

    }

}
