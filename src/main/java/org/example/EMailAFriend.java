package org.example;

import org.openqa.selenium.By;

public class EMailAFriend extends BuildYourOwnComputerPage {
    By _friendEmail=By.id("FriendEmail");
    By _personalMessage=By.id("PersonalMessage");
    By _sendEmail=By.xpath("//button[@class='button-1 send-email-a-friend-button']");

   public void emailAFriendVimal(){
       typeText((_friendEmail), "xyz12345@gmail.com");
       typeText((_personalMessage), "This is an Extraordinery  product.");
       clickOnElement(_sendEmail);

    }

}
