package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResult extends EMailAFriend {
    public void emailAFriendResultSuccessful(){
        String actualResultSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedResultSuccessMessage = "Your message has been sent.";
        Assert.assertTrue(actualResultSuccessMessage.equals(expectedResultSuccessMessage), "Friend reffered successfully");

    }


}
